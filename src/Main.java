public class Main {
    public static void main(String[] args) {
        Prostokat prostokat = new Prostokat();
        Kwadrat kwadrat = new Kwadrat();
        Trojkat trojkat = new Trojkat();

        TestFigur testFigur = new TestFigur(new Figura[]{prostokat,kwadrat,trojkat});
        testFigur.narysujFigury();
    }
}