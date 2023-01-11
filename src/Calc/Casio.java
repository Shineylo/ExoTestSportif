package Calc;

public class Casio implements Calculatrice{
    @Override
    public int addition(int a, int b) {
        return a+b;
    }

    @Override
    public int soustraction(int a, int b) {
        return a-b;
    }

    @Override
    public int multiplication(int a, int b) {
        if(b==0){
            throw new IllegalArgumentException("Ne peux multiplier par 0");
        }
        return a*b;
    }

    @Override
    public double division(int a, int b) {
        if(b==0){
            throw new IllegalArgumentException("Ne peux diviser par 0");
        }
        return a/b;
    }

    @Override
    public int divisionEntiere(int a, int b) {
        if(b==0){
            throw new IllegalArgumentException("Ne peux diviser par 0");
        }
        return a/b;
    }

    @Override
    public int modulo(int a, int b) {
        if(b==0){
            throw new IllegalArgumentException("Ne peux diviser par 0");
        }
        return a%b;
    }
}
