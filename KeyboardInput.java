//THIS CLASS WAS CREATED DURING THE 2026 SUMMER APSI 

import java.util.Scanner;

public class KeyboardInput
{
    public static void main (String[] args)
    {
        String inData, longWord;
        int num;
        double decimal;
        //to read from the key board
        Scanner scan = new Scanner( System.in );
        //run this class with the values 5 5.7 john 2.3 5.6 4 7

        //to read an integer
        System.out.println("Enter the data:");
        num = scan.nextInt();
        System.out.println("You entered:" + num );

        //to read a decimal number
        System.out.println("Enter the data:");
        decimal = scan.nextDouble();
        System.out.println("You entered:" + decimal );

        //to read a word
        System.out.println("Enter the data:");
        inData = scan.next();
        System.out.println("You entered:" + inData );

        //to read a sentence that has spaces or tabs
        System.out.println("Enter the data:");
        longWord = scan.nextLine();
        System.out.println("You entered:" + longWord );

        //to read a decimal number
        System.out.println("Enter the data:");
        decimal = scan.nextDouble();
        System.out.println("You entered:" + decimal );

        //to read a word
        System.out.println("Enter the data:");
        inData = scan.next();
        System.out.println("You entered:" + inData );
    }
}

