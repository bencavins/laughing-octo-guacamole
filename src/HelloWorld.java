





public class HelloWorld {

    public static String hello_place(String place) {
        System.out.println("Hello " + place);
        return place;
    }

//    public static int add(int x, int y) {
//        return x + y;
//    }

    public static void print(String value) {
        System.out.println(value);
    }

    interface FuncInter {
        void operation(String value);
    }

    public static void main(String[] args) {
//        System.out.println(add(1, 2));  // should print 3
//        HelloWorld.print("hello");
        FuncInter my_func = (n) -> System.out.println(n);

        HelloWorld obj = new HelloWorld();

    }
}
