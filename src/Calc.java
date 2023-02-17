import java.util.Scanner;
/*Please choose the options
M
излен
1. Addition
12. Subtraction
3. multiplication
4. Division
5. Modulus
6. Exit
Press 1 :
Welcome to sum :
Enter your first digit : 20
Enter
Mour eerand dir'*
зп*/
public class Calc {

   /* public static void sum ()

    {
        int num1,num2;

        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE FIRST NUMBER ");
        num1 = sc.nextInt();

        System.out.println("ENTER THE SECOND NUMBER ");
        num2 = sc.nextInt();
        int sum= num1+num2;

        System.out.println("sum of two number is"+sum);

    }/*/

    public static void main(String[] args) {

        //do {
        System.out.println("**************************");
        System.out.println("1.ADDITION");
        System.out.println("2.SUBTRACTION");
        System.out.println("3.MULTIPLICATION");
        System.out.println("4 DIVISION.");
        System.out.println("5 MODULUS");
        System.out.println("6 EXIT");
        System.out.println("**************************");

        System.out.println("PLEASE ENTER YOUR CHOICE");

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        switch (input) {

            case 1:

                System.out.println("Welcome to Addition");
                int num1, num2;
                int s;
                Scanner scanner = new Scanner(System.in);
                System.out.println("ENTER THE FIRST NUMBER ");
                num1 = scanner.nextInt();
                System.out.println("ENTER THE SECOND NUMBER ");
                num2 = scanner.nextInt();
                s = num1 + num2;
                System.out.println("sum of two number is " + s);

                break;

            case 2:
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("Welcome to Subtraction");
                System.out.println("ENTER THE FIRST NUMBER ");
                num1 = scanner1.nextInt();
                System.out.println("ENTER THE SECOND NUMBER ");
                num2 = scanner1.nextInt();
                s = num1 - num2;
                System.out.println("subtraction of two number is " + s);

                break;
            case 3:
                System.out.println("Welcome to multiplication");
                Scanner scanner3 = new Scanner(System.in);
                System.out.println("ENTER THE FIRST NUMBER ");
                num1 = scanner3.nextInt();
                System.out.println("ENTER THE SECOND NUMBER ");
                num2 = scanner3.nextInt();
                s = num1 * num2;
                System.out.println("Product  of two number is " + s);

                break;

            case 4:

                System.out.println("Welcome to Division");
                Scanner scanner4 = new Scanner(System.in);
                System.out.println("ENTER THE FIRST NUMBER ");
                num1 = scanner4.nextInt();
                System.out.println("ENTER THE SECOND NUMBER ");
                num2 = scanner4.nextInt();
                s = num1 * num2;
                System.out.println("Division of two number is " + s);
                break;

            case 5:

                System.out.println("Welcome to Modulus");
                Scanner scanner5 = new Scanner(System.in);
                System.out.println("ENTER THE FIRST NUMBER ");
                num1 = scanner5.nextInt();
                System.out.println("ENTER THE SECOND NUMBER ");
                num2 = scanner5.nextInt();
                s = num1 % num2;
                System.out.println(" Value of two number is Equal " + s);
                break;
            case 6:

                System.out.println("Exit");
                break;

        }
    }
}

       // System.out.println("Do you want  to continue Press -Y for Yes N for No");
    //  in = scanner.nextInt();
       // String s;
    //while (s!="N");
   /* public static void sum()
    {

        Scanner scanner= new Scanner(System.in);
        System.err.println("Subtraction");int sub = num1 - num2;
        System.out.println("ENTER THE FIRST NUMBER ");
        num1 = scanner.nextInt();
        System.out.println("ENTER THE SECOND NUMBER ");
        num2 = scanner.nextInt();
        s=num1+num2;
        System.out.println("sum of two number is" +s);
    }


*/







