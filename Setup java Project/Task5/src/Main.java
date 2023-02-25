public class Main {
    public static void main(String[] args) {

        double a = 4.0;
        int b = 1;
        int c = 3;
        int d = 5;
        int e = 7;
        int f = 9;
        int g = 11;
        double h = 1.0;
        double result = a * (b - (h / c) + (h / d) - (h / e) + (h / f) - (h / g));

        System.out.println(result);
    }
}