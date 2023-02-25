import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inputs1 = new Scanner(System.in);

        int years = inputs1.nextInt();

        int months = years * 12;
        int days = years * 365;
        int hours = days * 24;

        System.out.println(months + "months " + days + "days " + hours + "hours2");
    }
}