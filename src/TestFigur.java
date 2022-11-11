import java.util.Arrays;

public class TestFigur {
    private Figura[] tablicaFigur;

    public TestFigur(Figura[] tablicaFigur) {
        this.tablicaFigur = tablicaFigur;
    }

    public void narysujFigury() {
        Arrays.stream(tablicaFigur).forEach(Figura::rysuj);
    }
}
