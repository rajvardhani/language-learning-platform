public class LanguageAlreadyExistsException extends InvalidRequestException {
    public LanguageAlreadyExistsException(String name) {
        super("Language with name " + name + " already exists");
    }
}