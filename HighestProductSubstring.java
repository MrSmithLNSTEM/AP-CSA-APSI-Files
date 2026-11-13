public class HighestProductSubstring
{
    public static void main(String[] args) {
        
        //----------find the highest product of two adjacent numbers
        String number = "19283123479879";
        int tempProduct = 0;
        for (int i = 0; i < number.length()-1; i++){
            if (Integer.parseInt(number.substring(i, i+1)) * Integer.parseInt(number.substring(i+1, i+2))>tempProduct){
                tempProduct = Integer.parseInt(number.substring(i, i+1)) * Integer.parseInt(number.substring(i+1, i+2));
                System.out.println("We found the highest product at " + i + ": which is " + number.charAt(i) + " x " + number.charAt(i+1));
            }
            
        }
        System.out.println(tempProduct);
    }
}