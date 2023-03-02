import java.util.Arrays;
public class GestorFigures {
    public GestorFigures() {
    }

    public static double suma(Figura[] figura) {
        double aTotal = 0.0;

        for(int i = 0; i < figura.length; ++i) {
            aTotal += figura[i].area();
        }

        return aTotal;
    }

    public static void sort(Figura[] figures) {
        Arrays.sort(figures);
    }
}