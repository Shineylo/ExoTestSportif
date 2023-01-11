import Calc.Calculatrice;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalcTest {

    public Calculatrice calculatrice;

    @Test
    void addition_normal(){
        int rslt = calculatrice.addition(4,5);

        assertEquals(9,rslt);
    }

    @Test
    void addition_max(){
        int rslt = calculatrice.addition(Integer.MAX_VALUE,5);

        assertEquals(Integer.MAX_VALUE,rslt);
    }

    @Test
    void soustraction_normal(){
        int rslt = calculatrice.soustraction(2,1);

        assertEquals(1,rslt);
    }

    @Test
    void soustraction_min(){
        int rslt = calculatrice.addition(1,Integer.MIN_VALUE);

        assertEquals(Integer.MIN_VALUE,rslt);
    }

    @Test
    void division_normal(){
        double rslt = calculatrice.division(2,2);

        assertEquals(1,rslt);
    }

    @Test
    void division_parZero(){
        assertThrows(
                IllegalArgumentException.class,
                () -> {calculatrice.division(2,0);}
        );
    }

    @Test
    void divisionEntiere_normal(){
        double rslt = calculatrice.division(2,2);

        assertEquals(1,rslt);
    }

    @Test
    void divisionEntiere_normalAvecNombreAVirgule(){
        double rslt = calculatrice.division(3,2);

        assertEquals(1,rslt);
    }

    @Test
    void divisionEntiere_parZero(){
        assertThrows(
                IllegalArgumentException.class,
                () -> {calculatrice.divisionEntiere(2,0);}
        );
    }


    @Test
    void modulo_normal(){
        double rslt = calculatrice.modulo(2,2);

        assertEquals(1,rslt);
    }

    @Test
    void modulo_parZero(){
        assertThrows(
                IllegalArgumentException.class,
                () -> {calculatrice.modulo(2,0);}
        );
    }

}
