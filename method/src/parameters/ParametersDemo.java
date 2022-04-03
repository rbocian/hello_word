package parameters;

public class ParametersDemo {
    public static void main(String[] args) {
        printDivisibleNumeber(5);
        printDivisibleNumeber(9);
        printDivisibleNumeber(11);
        printDivisibleNumeber(15);
        printDivisibleNumeber(17);

    }

    public static void printDivisibleNumeber(int number) {
        System.out.println("Sptawdzam liczbę " + number);
        if (number / 3 == 0) {
            System.out.println("Liczba jest podzielna przez 3 ");
        } else {
            System.out.println("Liczba nie jest podzielna przez 3 ");
        }
    }
}
