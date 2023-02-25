import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inputs = new Scanner(System.in);

        int input1 = inputs.nextInt();
        int input2 = inputs.nextInt();

        if(input1 == input2){
            System.out.println(input1 + " = " + input2);
        }
        else{
            System.out.println(input1 + " != " + input2);
        }

        if(input1 > input2){
            System.out.println(input1 + " > " + input2);
        }
        else{
            System.out.println(input1 + " < " + input2);
        }

        if(input1 <= input2){
            System.out.println(input1 + " <= " + input2);
        }
        else{
            System.out.println(input1 + " >= " + input2);
        }
    }
}