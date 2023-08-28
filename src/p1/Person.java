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

    Person(String n){
        name = n;
        age = 2;
    }
    Person(String n, int a){
        name = n;
        age = a;
    }

    void info(){
        System.out.printf("Name: %s \tAge: %d\n", name, age);
    }

}
