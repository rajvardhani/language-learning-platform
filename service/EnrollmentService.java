public interface EnrollmentService {
    /**
     * Get an enrollment by ID
     *
     * @param id the enrollment ID
     * @return the enrollment DTO
     * @throws NotFoundException if the enrollment is not found
     */
    EnrollmentDTO getEnrollment(Long id) throws NotFoundException;

    /**
     * Create a new enrollment
     *
     * @param enrollmentCreateDTO the enrollment create DTO
     * @return the created enrollment DTO
     * @throws InvalidRequestException if the request is invalid
     */
    EnrollmentDTO createEnrollment(EnrollmentCreateDTO enrollmentCreateDTO) throws InvalidRequestException;

    /**
     * Update an existing enrollment
     *
     * @param id the enrollment ID
     * @param enrollmentUpdateDTO the enrollment update DTO
     * @return the updated enrollment DTO
     * @throws NotFoundException if the enrollment is not found
     * @throws InvalidRequestException if the request is invalid
     */
    EnrollmentDTO updateEnrollment(Long id, EnrollmentUpdateDTO enrollmentUpdateDTO) throws NotFoundException, InvalidRequestException;

    /**
     * Delete an enrollment
     *
     * @param id the enrollment ID
     * @throws NotFoundException if the enrollment is not found
     */
    void deleteEnrollment(Long id) throws NotFoundException;
}