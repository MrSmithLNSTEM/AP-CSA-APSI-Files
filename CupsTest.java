//THIS CLASS WAS CREATED DURING THE 2026 SUMMER APSI 

public class CupsTest {
    public static void main(String[] args){
        Cups cup1 = new Cups();
        Cups cup2 = new Cups("Metal", 128, false);

            //use getter
        System.out.println(cup2.getMaterial());
        System.out.println(cup1.getMaterial());

            //use setter
        System.out.println(cup2.getCapacity());
        cup2.setCapacity(112);
        System.out.println(cup2.getCapacity());

        //create alias
        Cups cup3 = cup2;
        cup3.setCapacity(18);
        System.out.println(cup2.getCapacity());
        System.out.println(cup3.getCapacity());
        //when you change an alias's attributes, you change the parent's attributes!!!
        //the memory location is the same!

        //print memory location -- OR when you use toString() method prints description
        System.out.println(cup2);

        //equals method
        System.out.println(cup2.equals(cup1));
    }
}