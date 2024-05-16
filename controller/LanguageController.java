@RestController
@RequestMapping("/api/languages")
public class LanguageController {
    @Autowired
    private LanguageRepository languageRepository;

    @GetMapping
    public ResponseEntity<List<Language>> getAllLanguages() {
        return ResponseEntity.ok(languageRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Language> getLanguage(@PathVariable Long id) {
        return ResponseEntity.ok(languageRepository.findById(id).orElseThrow());
    }
}