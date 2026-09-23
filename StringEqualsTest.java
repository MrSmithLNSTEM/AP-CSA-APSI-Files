//THIS CLASS WAS CREATED DURING THE 2026 SUMMER APSI 

public class StringEqualsTest
{
    public static void main(String[]args)
    {
        System.out.println("Results for Strings");
        String s1="James";
        String s2="James";
        String s3, s4;
        s3=s1;
        s4=new String("James");

        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s2==s3);
        System.out.println(s2==s4);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s2));
        System.out.println(s4.equals(s2));
    }
}
