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

    public String getColor(){
        return furColor;
    }

    public boolean equals(Mouse other){
        boolean flag = (furColor.equals(other.getColor()) && age == (other.getAge()));
        return flag;
    }
}

/*ran in main:
*
*   Mouse Jerry = new Mouse("brown", 1);
*   System.out.println(Jerry.getAge());
*
*/