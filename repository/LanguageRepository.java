public interface LanguageRepository extends JpaRepository<Language, Long> {
    List<Language> findAll();
}