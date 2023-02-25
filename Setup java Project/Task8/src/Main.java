import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input1 = new Scanner(System.in);
        int ionAge = input1.nextInt();

        int a = ionAge - 1;
        int b = ionAge - 2;
        int c = ionAge + 1;
        int d = ionAge + 2;

        System.out.println("Vasile says " + a + " " + b + " " + ionAge + " " + c + " " + d);
    }
}