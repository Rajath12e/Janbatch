import java.util.Scanner;

public class Factorialwhileloop {

    public static void main(String[]args){

      int i=1,fact=1;
        int input;
       // int num;

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value");
        input= sc.nextInt();

        while (i<= input)

        {

            fact=fact* i;
            i++;

        }

    System.out.println("Factorial of the value "+"is "+fact);
    }
}
