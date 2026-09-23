//THIS CLASS WAS CREATED DURING THE 2026 SUMMER APSI 
/*
* Cups are objects that are shaped in such a way that they can contain liquid without spilling.
* They do not exist to exclusively contain liquids but are mostly used as such.
* They are usually cylinders with an open top to add and remove said liquid.
*/
public class Cups {
    //instance variable -- these are the attributes that make a cup unique                      [part 1]
    private String material;
    private int capacity;
    private boolean hasHandle;


    //constructors                                                                              [part 2]
    //default values
    public Cups(){
        material = "plastic";
        capacity = 12;
        hasHandle = false;
    }

    public Cups(String material, int capacity, Boolean hasHandle) {
        this.material = material; //this is to resolve naming conflicts by using the same word
        this.capacity = capacity; //this is a way an object refers to itself
        this.hasHandle = hasHandle;
    }



    //methods - what we use the objects for, doing                                               [part 3]
    //GETTERS "accessors" - give access to instance variables           *******************************
    public String getMaterial(){
        return material;
    }

    public int getCapacity(){
        return capacity;
    }

    public Boolean getHasHandle(){
        return hasHandle;
    }

    //SETTERS "mutators" -update values or change them                  *******************************
    public void setMaterial(String mat){
        material = mat;
    }

    public void setCapacity(int cap){
        capacity = cap;
    }

    public void setHasHandle(Boolean handle){
        hasHandle = handle;
    }

    //toString() method is a description of the object [STRING]
    public String toString(){
        String description1 = "This cup is made of " + material + " with a capacity of " + capacity + " fluid ounces and has a handle.";
        String description2 = "This cup is made of " + material + " with a capacity of " + capacity + " fluid ounces and doesn't have a handle.";
        if (hasHandle == true){
            return description1;
        } else {
            return description2;
        }
    }

    //equals to method -- only strings
    public Boolean equals(Cups other){
        Boolean flag = (material.equals(other.getMaterial()));
        return flag;
    }


}
