package pl.mikolaj.generics;

public class GenericsExample {

    public static void main(String[] args) {
        GenericPrinter<Integer> integerPrinter = new GenericPrinter<>(33);
        integerPrinter.print();
    }
}
