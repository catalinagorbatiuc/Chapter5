//aplicație care citește cinci numere între 1 și 30.
// Pentru fiecare număr citit, programul ar trebui să afișeze același număr de asteriscuri adiacente.

import java.util.Scanner;
public class ex16
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int i = 1;

        System.out.println("Enter a number between 1 and 30 ");
        n1 = input.nextInt();

        System.out.println("Enter a number between 1 and 30 ");
        n2 = input.nextInt();

        System.out.println("Enter a number between 1 and 30 ");
        n3 = input.nextInt();

        System.out.println("Enter a number between 1 and 30 ");
        n4 = input.nextInt();

        System.out.println("Enter a number between 1 and 30 ");
        n5 = input.nextInt();

        for(i = 1; i <= n1; i++) {
            System.out.print("*");
        }
        System.out.println();

        for(i = 1; i <= n2; i++) {
            System.out.print("*");
        }
        System.out.println();

        for(i = 1; i <= n3; i++) {
            System.out.print("*");
        }
        System.out.println();

        for(i = 1; i <= n4; i++) {
            System.out.print("*");
        }
        System.out.println();

        for(i = 1; i <= n5; i++) {
            System.out.print("*");
        }
        System.out.println();

        input.close();
    }
}