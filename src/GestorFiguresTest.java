import java.io.PrintStream;
public class GestorFiguresTest {
    public static void main(String[] args) {
        Figura[] v = new Figura[4];

        v[0] = new Rectangle(5, 3);
        v[1] = new Cercle(5);
        v[2] = new Quadrat(5);
        v[3] = new Triangle(12, 8);

        double res = GestorFigures.suma(v);
        GestorFigures.sort(v);

        for(int i = 0; i < v.length; ++i) {
            PrintStream resultat = System.out;
            String resultat1 = v[i].getClass().getName();
            resultat.println("Figura: " + resultat1 + " -> Area: " + v[i].area());
        }
        System.out.println("Area total: " + res);


    }
}
