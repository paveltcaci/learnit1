import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner myobj = new Scanner(System.in);
        int input1 = myobj.nextInt();
        int input2 = myobj.nextInt();

        int addresult = input1 + input2;
        int substractionresult = input1 - input2;
        int multiplyresult = input1 * input2;
        int divisionresult = input1 / input2;
        int moduloresult = input1 % input2;

        System.out.println( input1 + " + " + input2+ " = " + addresult);
        System.out.println( input1 + " - " + input2+ " = " + substractionresult);
        System.out.println( input1 + " x " + input2+ " = " + multiplyresult);
        System.out.println( input1 + " / " + input2+ " = " + divisionresult);
        System.out.println( input1 + " mod " + input2+ " = " + moduloresult);

    }
}