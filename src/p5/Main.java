package p5;

public class Main {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int v = sum(10, 20);
        int z = sum(v, a);
        System.out.println(z);

        test(a);
    }

    public static void test(int a){
        System.out.printf("Test %d", a);
    }

    public static int sum(int a, int b){
        return a+b;
    }

}
