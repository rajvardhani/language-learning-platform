public class LanguageNotFoundException extends NotFoundException {
    public LanguageNotFoundException(Long id) {
        super("Language with id " + id + " not found");
    }
}