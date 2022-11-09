import java.util.*;

// Functional interface
// contains only one abstract method
@FunctionalInterface  // this annotation ensures there is only one abstract method (but it's not required)
interface Printable {
    void print(String text);
}

/*
Some build in Functional Interfaces:
Runnable -> only contains run()
Comparable -> only contains compareTo()
Callable -> only contains call()
 */

public class LambdaDemo {
    public static void main_without_lambda(String[] args) {
        String shape = "square";

        // we need to implement the interface if we want to use it
        // Requires a lot of boilerplate code
        Printable printable = new Printable() {
            @Override
            public void print(String text) {
                System.out.println(text);
            }
        };
        printable.print("Hello");
    }

    public static void main_with_lambda(String[] args) {
        String shape = "square";

        // with lambda, code is more concise
        Printable printable = (text) -> System.out.println(text);
        printable.print("Hello lambda");
    }

    public static void filter_example() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.stream().filter(number -> number % 2 == 0).forEach(value -> System.out.println(value));
    }

    public static void map_example() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.stream().map(number -> number*number).forEach(value -> System.out.println(value));
    }

    public static void main(String[] args) {
//        main_without_lambda(args);
//        main_with_lambda(args);
//        filter_example();
        map_example();
    }

}
