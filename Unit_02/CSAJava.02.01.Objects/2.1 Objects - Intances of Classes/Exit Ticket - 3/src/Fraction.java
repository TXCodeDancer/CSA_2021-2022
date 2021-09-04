public class Fraction {
    private double numerator;
    private double denominator;


    public Fraction(double numerator, double denominator)
    {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public double getDecimal() {
        return numerator/ denominator;
    }
}