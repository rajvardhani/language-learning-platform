public interface AssessmentRepository extends JpaRepository<Assessment, Long> {
    List<Assessment> findByLanguage(Language language);
}