public interface AssessmentService {
/**
 * Get an assessment by ID
 *
 * @param id the assessment ID
 * @return the assessment DTO
 * @throws NotFoundException if the assessment is not found
 */
    AssessmentDTO getAssessment(Long id) throws NotFoundException;

            /**
             * Create a new assessment
             *
             * @param assessmentCreateDTO the assessment create DTO
             * @return the created assessment DTO
             * @throws InvalidRequestException if the request is invalid
             */
            AssessmentDTO createAssessment(AssessmentCreateDTO assessmentCreateDTO) throws InvalidRequestException;

            /**
             * Update an existing assessment
             *
             * @param id the assessment ID
             * @param assessmentUpdateDTO the assessment update DTO
             * @return the updated assessment DTO
             * @throws NotFoundException if the assessment is not found
             * @throws InvalidRequestException if the request is invalid
             */
            AssessmentDTO updateAssessment(Long id, AssessmentUpdateDTO assessmentUpdateDTO) throws NotFoundException, InvalidRequestException;

            /**
             * Delete an assessment
             *
             * @param id the assessment ID
             * @throws NotFoundException if the assessment is not found
             */
            void deleteAssessment(Long id) throws NotFoundException;
            }