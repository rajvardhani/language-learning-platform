@RestController
@RequestMapping("/api/learning-materials")
public class LearningMaterialController {
    @Autowired
    private LearningMaterialRepository learningMaterialRepository;

    @GetMapping
    public ResponseEntity<List<LearningMaterial>> getAllLearningMaterials() {
        return ResponseEntity.ok(learningMaterialRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<LearningMaterial> getLearningMaterial(@PathVariable Long id) {
        return ResponseEntity.ok(learningMaterialRepository.findById(id).orElseThrow());
    }
}