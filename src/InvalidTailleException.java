public class InvalidTailleException extends RuntimeException {

    public InvalidTailleException() {
        super("La taille voulue par le sportif ne correspond pas à l'equipe");
    }
}
