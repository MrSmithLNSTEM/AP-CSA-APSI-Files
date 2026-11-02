public class myClass
{
    public static void main(String[] args)
    {
        //Multiple Data Types
        Mouse Jerry = new Mouse("brown", 1);
        Mouse Brian = new Mouse("brown", 1);
        System.out.println(Jerry.equals(Brian));
        System.out.println(Jerry == Brian);

        //Only Integers
        Rectangle rect1 = new Rectangle(3, 8);
        Rectangle rect2 = new Rectangle(3, 8);
        boolean rect1SameAsRect2 = rect1 == rect2;
        System.out.println("Rect1 has the same reference as rect2: " + rect1SameAsRect2);
        boolean rect1Rect2Equivalence = rect1.equals(rect2);
        System.out.println("Rect1 is equivalent to rect2: " + rect1Rect2Equivalence);
    }
}

