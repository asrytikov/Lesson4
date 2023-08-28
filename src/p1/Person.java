package p1;

public class Person {

    String name;
    int age;

    {
        System.out.println("Start");
        name = "Noname";
        age = 100;

    }

    Person(){
    }

    public Person(String n){
        name = n;
        age = 2;
        System.out.println(name + " "+ age);

    }
    Person(String n, int a){
        name = n;
        age = a;
    }

    public void info(){
        System.out.printf("Name: %s \tAge: %d\n", name, age);
    }

}
