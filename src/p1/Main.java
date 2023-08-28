public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.info();

        person.name = "Ivan";
        person.age = 34;

        person.info();

        Person person1 = new Person("Mary");
        person1.info();

        Person person2 = new Person("Alex", 25);
        person2.info();

    }
}