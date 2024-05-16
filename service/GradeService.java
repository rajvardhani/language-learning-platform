public interface GradeService {
    /**
     * Get a grade by ID
     *
     * @param id the grade ID
     * @return the grade DTO
     * @throws NotFoundException if the grade is not found
     */
    GradeDTO getGrade(Long id) throws NotFoundException;

    /**
     * Create a new grade
     *
     * @param gradeCreateDTO the grade create DTO
     * @return the created grade DTO
     * @throws InvalidRequestException if the request is invalid
     */
    GradeDTO createGrade(GradeCreateDTO gradeCreateDTO) throws InvalidRequestException;

    /**
     * Update an existing grade
     *
     * @param id the grade ID
     * @param gradeUpdateDTO the grade update DTO
     * @return the updated grade DTO
     * @throws NotFoundException if the grade is not found
     * @throws InvalidRequestException if the request is invalid
     */
    GradeDTO updateGrade(Long id, GradeUpdateDTO gradeUpdateDTO) throws NotFoundException, InvalidRequestException;

    /**
     * Delete a grade
     *
     * @param id the grade ID
     * @throws NotFoundException if the grade is not found
     */
    void deleteGrade(Long id) throws NotFoundException;
}