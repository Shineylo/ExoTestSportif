import Calc.Calculatrice;
import Calc.Casio;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalcTest {

    public Casio casio = new Casio();

    @Test
    void addition_normal(){
        int rslt = casio.addition(4,5);

        assertEquals(9,rslt);
    }

    @Test
    void addition_max(){
        int rslt = casio.addition(Integer.MAX_VALUE,5);

        assertEquals(Integer.MAX_VALUE,rslt);
    }

    @Test
    void soustraction_normal(){
        int rslt = casio.soustraction(2,1);

        assertEquals(1,rslt);
    }

    @Test
    void soustraction_min(){
        int rslt = casio.addition(1,Integer.MIN_VALUE);

        assertEquals(Integer.MIN_VALUE,rslt);
    }

    @Test
    void division_normal(){
        double rslt = casio.division(2,2);

        assertEquals(1,rslt);
    }

    @Test
    void division_parZero(){
        assertThrows(
                IllegalArgumentException.class,
                () -> {casio.division(2,0);}
        );
    }

    @Test
    void divisionEntiere_normal(){
        double rslt = casio.division(2,2);

        assertEquals(1,rslt);
    }

    @Test
    void divisionEntiere_normalAvecNombreAVirgule(){
        double rslt = casio.division(3,2);

        assertEquals(1,rslt);
    }

    @Test
    void divisionEntiere_parZero(){
        assertThrows(
                IllegalArgumentException.class,
                () -> {casio.divisionEntiere(2,0);}
        );
    }


    @Test
    void modulo_normal(){
        double rslt = casio.modulo(2,2);

        assertEquals(1,rslt);
    }

    @Test
    void modulo_parZero(){
        assertThrows(
                IllegalArgumentException.class,
                () -> {casio.modulo(2,0);}
        );
    }

}
