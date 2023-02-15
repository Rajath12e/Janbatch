import java.util.Scanner;

public class FactorialAgmnt {

    public static void main(String[]args){

      /*  Write a program to find the factorial of any number entered by the user
        Factorial of number means :
        Factorial of 5 is : 5x4x3x2x1 = 120 */

        int i,fact=1;
     //   int num=i;
        int input;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number ");
        input = sc.nextInt();

        for (i=1;i<=input;i++){
        fact=fact*i;

        }

        {
            System.out.println("Factorial of the number "+"is:"+fact);
            //System.out.println("Factorial of "+num+" is: "+fact);

        }


    }
}


