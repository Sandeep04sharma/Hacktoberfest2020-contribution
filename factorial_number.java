import java.util.Scanner;

public class Exp1           // factorial program
{
    public static void main(String[] args)
    {
        int i, number,fact=1;

        Scanner kb=new Scanner(System.in);
        System.out.println("Enter a number to find factorial :");
        number=kb.nextInt();
        for (i=2;i<=number;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial: "+fact);
    }

}
