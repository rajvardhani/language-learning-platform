public interface LearningMaterialService {
    /**
     * Get a learning material by ID
     *
     * @param id the learning material ID
     * @return the learning material DTO
     * @throws NotFoundException if the learning material is not found
     */
    LearningMaterialDTO getLearningMaterial(Long id) throws NotFoundException;

    /**
     * Create a new learning material
     *
     * @param learningMaterialCreateDTO the learning material create DTO
     * @return the created learning material DTO
     * @throws InvalidRequestException if the request is invalid
     */
    LearningMaterialDTO createLearningMaterial(LearningMaterialCreateDTO learningMaterialCreateDTO) throws InvalidRequestException;

    /**
     * Update an existing learning material
     *
     * @param id the learning material ID
     * @param learningMaterialUpdateDTO the learning material update DTO
     * @return the updated learning material DTO
     * @throws NotFoundException if the learning material is not found
     * @throws InvalidRequestException if the request is invalid
     */
    LearningMaterialDTO updateLearningMaterial(Long id, LearningMaterialUpdateDTO learningMaterialUpdateDTO) throws NotFoundException, InvalidRequestException;

    /**
     * Delete a learning material
     *
     * @param id the learning material ID
     * @throws NotFoundException if the learning material is not found
     */
    void deleteLearningMaterial(Long id) throws NotFoundException;
}