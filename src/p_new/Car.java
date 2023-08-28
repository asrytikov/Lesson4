package p_new;

public class Car {

    String marka;
    String model;
    int age;

    public Car(){
        age = 2015;
    }

    public Car(int age){
        this.age = age;

        System.out.println("Car car");

    }

    public void drive(){
        System.out.println("Go go go ...");
    }

    public void stop(){
        System.out.println("STOP");
    }

    public void infoCar(){
        System.out.println("Car: marka=" + marka + " model=" + model + " age=" + age);
    }



}
