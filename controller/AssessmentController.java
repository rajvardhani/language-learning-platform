@RestController
@RequestMapping("/api/assessments")
public class AssessmentController {
    @Autowired
    private AssessmentRepository assessmentRepository;

    @GetMapping
    public ResponseEntity<List<Assessment>> getAllAssessments() {
        return ResponseEntity.ok(assessmentRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Assessment> getAssessment(@PathVariable Long id) {
        return ResponseEntity.ok(assessmentRepository.findById(id).orElseThrow());
    }
}
