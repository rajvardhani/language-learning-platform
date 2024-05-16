-- Create Users table
CREATE TABLE Users (
  id INT PRIMARY KEY AUTO_INCREMENT,
  username VARCHAR(255) NOT NULL UNIQUE,
  password VARCHAR(255) NOT NULL,
  email VARCHAR(255) NOT NULL UNIQUE,
  language_id INT,
  FOREIGN KEY (language_id) REFERENCES Languages(id)
);

-- Create Languages table
CREATE TABLE Languages (
  id INT PRIMARY KEY AUTO_INCREMENT,
  language_name VARCHAR(255) NOT NULL,
  language_code VARCHAR(10) NOT NULL UNIQUE
);

-- Create Learning Materials table
CREATE TABLE Learning_Materials (
  id INT PRIMARY KEY AUTO_INCREMENT,
  language_id INT NOT NULL,
  material_type VARCHAR(255) NOT NULL,
  content TEXT NOT NULL,
  FOREIGN KEY (language_id) REFERENCES Languages(id)
);

-- Create Assessments table
CREATE TABLE Assessments (
  id INT PRIMARY KEY AUTO_INCREMENT,
  language_id INT NOT NULL,
  assessment_type VARCHAR(255) NOT NULL,
  questions TEXT NOT NULL,
  FOREIGN KEY (language_id) REFERENCES Languages(id)
);

-- Create Progress table
CREATE TABLE Progress (
  id INT PRIMARY KEY AUTO_INCREMENT,
  user_id INT NOT NULL,
  language_id INT NOT NULL,
  progress_data TEXT NOT NULL,
  FOREIGN KEY (user_id) REFERENCES Users(id),
  FOREIGN KEY (language_id) REFERENCES Languages(id)
);
