import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inputs1 = new Scanner(System.in);

        System.out.println("Enter Nicolae's age");
        int nicolaeAge = inputs1.nextInt();

        System.out.println("Enter Mihai's age");
        int mihaiAge = inputs1.nextInt();

        double averageAge = (nicolaeAge + mihaiAge) / 2;
        int differenceAge;

        if(nicolaeAge > mihaiAge){
            differenceAge = nicolaeAge - mihaiAge;
        }
        else{
            differenceAge = mihaiAge - nicolaeAge;
        }

        System.out.println("Average age is: " + averageAge + "\n");
        System.out.println("Difference is: " + differenceAge + " age\n");
    }
}