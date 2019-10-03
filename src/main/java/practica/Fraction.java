package practica;

public class Fraction {

    private int numerator;

    private int denominator;

    private int numerator2;

    private int denominator2;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction() {
        this(1, 1);
    }

    public Fraction(int numerator, int denominator, int numerator2, int denominator2) {
        this.numerator = numerator;
        this.denominator = denominator;
        this.numerator2 = numerator2;
        this.denominator2 = denominator2;
    }

    public double decimal() {
        return (double) numerator / denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public boolean isPropia() {
        return this.numerator < this.denominator;
    }

    public boolean isImpropia() {
        return this.numerator > this.denominator;
    }

    public boolean isEquivalente() {
        int valor = this.numerator * this.denominator2;
        int valor2 = this.numerator2 * this.denominator;
        return valor == valor2;
    }

    public int compararFraction() {
        int valor = this.numerator / this.denominator;
        int valor2 = this.numerator2 / this.denominator2;
        if (valor > valor2) {
            return valor;
        }
        return valor2;
    }

}