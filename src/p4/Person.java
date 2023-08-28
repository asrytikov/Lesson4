package p4;

public class Person {

    private String name;
    private int age;
    private int id;
    private static int counter = 1;

    static{
        counter = 105;
        System.out.println("Static init");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    Person(){
        id = counter++;
    }

    public static void getCounter(){
        System.out.printf("Counter: %d \n", counter);
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>0 && age<110){
            this.age = age;
        }else{
            System.out.println("Again");
        }
    }
}
