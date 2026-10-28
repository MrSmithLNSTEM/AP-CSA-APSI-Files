//explores different ways you can use a boolean expressiong to check for true or false

import java.util.Scanner;
public class Boolean
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Is it raining? enter 'true' or 'false' ");
        boolean isRaining = input.nextBoolean(); input.nextLine();

        
        //ASKS FOR TRUE OR FALSE
        if(isRaining){
            System.out.println("Put on a rainjacket.");
            System.out.println("Open your umbrella");
        } else {
            System.out.println("Put your umbrella away.");
        }

        //CHECKS THE FIRST LETTER
        System.out.println("Is it raining? (but this time it looks for the first character)");
        String hasRain = input.nextLine();
        if ((hasRain.substring(0,1).toUpperCase()).equals("Y")){
            System.out.println("It's a yes!");
        } else {
            System.out.println("nope");
        }

        //ASKS FOR YES 
        System.out.println("Is it raining? But this time it looks for yes");
        String rain = input.nextLine();
        String updatedRain = rain.toUpperCase();
        if ((updatedRain.equals("YES")) || (updatedRain.equals("Y")))
        {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}