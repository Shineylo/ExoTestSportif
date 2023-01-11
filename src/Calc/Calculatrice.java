package Calc;

public interface Calculatrice {
    /**
     * calcule le resultat de l'addition
     * Si le resultat était supérieur à la valeur max de int : 2147483647,
     * le résultat sera la valeur max de int à la place
     *
     * @param a
     * @param b
     * @return le resultat
     */
    int addition(int a, int b);

    /**
     * calcule le resultat de la soustraction
     * Si le resultat était inférieur à la valeur min de int : -2147483648,
     * le résultat sera la valeur min de int à la place
     *
     * @param a
     * @param b
     * @return le resultat
     */
    int soustraction(int a, int b);

    /**
     * calcule le resultat de la multiplication
     * Si le resultat était supérieur à la valeur max de int,
     * le résultat sera la valeur max de int à la place
     *
     * @param a
     * @param b
     * @return le resultat
     */
    int multiplication(int a, int b);

    /**
     * calcule le resultat de la division
     * Si division par 0 une exception sera lancé.
     * @param a
     * @param b
     * @throws IllegalArgumentException si b == 0
     * @return le resultat
     */
    double division(int a, int b);

    /**
     * calcule le resultat de la division entière
     * Si division par 0 une exception sera lancé.
     * Si résultat != nombre entier
     * @param a
     * @param b
     * @throws IllegalArgumentException si b == 0
     * @throws IllegalArgumentException si rslt est double
     * @return le resultat
     */
    int divisionEntiere(int a, int b);

    /**
     * calcule le resultat du modulo
     * Si division par 0 une exception sera lancé.
     * @param a
     * @param b
     * @throws IllegalArgumentException si b == 0
     * @return le resultat
     */
    int modulo(int a, int b);
}
