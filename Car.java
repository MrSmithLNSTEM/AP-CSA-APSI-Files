//DEBUGGING: find the errors in the following class
public class Car
{
    private String make;
    private String model;
    private int year;

    public Car(String carMake, String carModel, int carYear){
        make = carMake;
        model = carModel;
        year = carYear;                                                  //need to add }
    }

    public int getYear(){                                               //change void to int
        return year;
    }

    public void setModel(String tempModel){                                     //add String to parameter
        model = tempModel;
    }

    public String toString(){
        return "the make of this car is: " + make;                       //did not concatenate 'make' with this string
    }
}

