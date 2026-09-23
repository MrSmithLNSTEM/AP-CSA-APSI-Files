

public class Cup
{
    //instance variable
    private String color;
    private String material;
    private double volume;


    //constructor
    public Cup(String color, String material, double volume){
        this.color = color;
        this.material = material;
        this.volume = volume;
    }

    //getter
    public String getColor(){
        return color;
    }

    public String getMaterial(){
        return material;
    }

    public double getVolume(){
        return volume;
    }

    //setter
    public void setColor(String tempColor){
        color = tempColor;
    }

    public void setMaterial(String tempMaterial){
        material = tempMaterial;
    }

    public void setVolume(double tempVolume){
        volume = tempVolume;
    }


    //toString method
    public String toString(){
        return "This is a " + color + ", " + material + " cup that holds " + volume + " ounces.";
    }
}