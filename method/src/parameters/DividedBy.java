package parameters;

public class DividedBy {
    public static void main(String[] args) {

        int[] divider = {2, 3, 4, 5};
        printIfNumberCanByDividedBy(10, divider);
        printIfNumberCanByDividedBy(15, divider);

    }

    public static void printIfNumberCanByDividedBy(int number, int[] divider) {
        System.out.println("Sptawdzam liczbę " + number);
        for (int divide : divider) {
            if (number % divide == 0) {
                System.out.println(number + "jest podzielna przez" + divider + " bez reszty ");
            } else {
                System.out.println(number + " nie jest podzielna przez" + divider + " bez reszty ");
            }
        }
    }
}
