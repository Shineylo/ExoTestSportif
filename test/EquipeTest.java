import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class EquipeTest {
    @Test
    public void ajouter_quandSportif_null(){

        Equipe<Basketteur> equipe = new Equipe<>(5);

        assertThrows(
                IllegalArgumentException.class,
                () -> {equipe.ajouter(null);}
        );
    }
}
