public class Triangle extends Figura{
    private double b;
    private double a;
    public Triangle(double base, double altura) {
        this.b = base;
        this.a = altura;
    }

    public double area() {
        return this.b * this.a / 2.0;
    }

    public int compareTo(Figura figura) {
        return super.compareTo(figura);
    }
}
