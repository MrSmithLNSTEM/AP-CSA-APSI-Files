public class Mouse
{
    private String furColor;
    private int age;

    public Mouse(String furColor, int age){
        this.furColor = furColor;
        this.age = age;
    }

    //getter or "accessor"
    public int getAge(){
        return age;
    }
}

/*ran in main:
*
*   Mouse Jerry = new Mouse("brown", 1);
*   System.out.println(Jerry.getAge());
*
*/