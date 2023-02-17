import java.util.Scanner;

public class FactorialAsgnmtdowhile {

public static void main(String []args){
 int i=1,fact=1;
 int input;

    Scanner scanner= new Scanner (System.in);
    System.out.println("Enter the  input value");

    input= scanner.nextInt();

    do {

        fact = fact * i;
        i++;


    }
    while (i<= input);
    System.out.println("Factorial is "+fact);
}

}




