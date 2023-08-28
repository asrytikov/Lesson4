package p4;

public class Main {
    public static void main(String[] args) {


        Person person = new Person();

        System.out.println(person.getId());

        Person person1 = new Person();
        System.out.println(person1.getId());

        person.setName("Ivan");
        person.setAge(10);

        Person.getCounter();
        //Person.counter = 8;
        Person person2 = new Person();
        System.out.println(person2.getId());

        System.out.println("Area " + Math.PI*3);

        //System.out.println(person.getName() + " " + person.getAge());
    }
}
