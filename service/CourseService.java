public interface CourseService {
    /**
     * Get a course by ID
     *
     * @param id the course ID
     * @return the course DTO
     * @throws NotFoundException if the course is not found
     */
    CourseDTO getCourse(Long id) throws NotFoundException;

    /**
     * Create a new course
     *
     * @param courseCreateDTO the course create DTO
     * @return the created course DTO
     * @throws InvalidRequestException if the request is invalid
     */
    CourseDTO createCourse(CourseCreateDTO courseCreateDTO) throws InvalidRequestException;

    /**
     * Update an existing course
     *
     * @param id the course ID
     * @param courseUpdateDTO the course update DTO
     * @return the updated course DTO
     * @throws NotFoundException if the course is not found
     * @throws InvalidRequestException if the request is invalid
     */
    CourseDTO updateCourse(Long id, CourseUpdateDTO courseUpdateDTO) throws NotFoundException, InvalidRequestException;

    /**
     * Delete a course
     *
     * @param id the course ID
     * @throws NotFoundException if the course is not found
     */
    void deleteCourse(Long id) throws NotFoundException;
}