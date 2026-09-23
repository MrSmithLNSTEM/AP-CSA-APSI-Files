//THIS CLASS WAS CREATED DURING THE 2026 SUMMER APSI 

public class StringMethods {
    public static void main(String[] args){

        //String(String str)
        String original = "Hello World!";
        String copy = new String(original);
        System.out.println("Original: " + original);
        System.out.println("Copy: " + copy);

        //int(length)
        int len = original.length();
        System.out.println("Length of Original: " + len);

        //Substring(int from, int to)
        String subString = original.substring(0,6);
        System.out.println("Substring " + subString);

        //String substring(int from)
        String subString2 = original.substring(6);
        System.out.println("Substring2 " + subString2);

        //int indexOf(String str)
        String searchHere = "Don't count your chickens before they hatch.";
        int found = searchHere.indexOf("chickens");
        int notFound = searchHere.indexOf("ducks");
        System.out.println(found);
        System.out.println(notFound);

        //boolean equals (Object other)
        String str1 = "Apple";
        String str2 = "Orange";
        System.out.println(str1.equals(str2));

        //int compareTo(String other)
        System.out.println(str1.compareTo(str2));
        System.out.println(str2.compareTo(str1));

        //String[] split(String del)
        String[] words = searchHere.split(" ");
        System.out.println(searchHere);
        for (int i = 0; i < words.length; i++){
            System.out.println(words[i]);
        }
    }
}
