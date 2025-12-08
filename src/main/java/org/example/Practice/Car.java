package org.example.Practice;

public class Car {
    static String name="Mercedes";
    int modelYear;

     Car(int make){
        this.modelYear=make;
    }
    public void details(){
        System.out.println(this);
    }
    @Override
    public String toString(){
        return "Car{name="+name+" modelYear "+modelYear+"}";
    }
}
