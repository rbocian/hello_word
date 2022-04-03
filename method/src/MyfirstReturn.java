public class MyfirstReturn {
    public static void main(String[] args) {
        int x = getnumber();
        System.out.println("Dostałem wartość " + x);
        System.out.println("Zwraca wartość " + reply());
        System.out.println("Zwraca wartość " + getText());
    }

    public static int getnumber() {
        System.out.println("Dostałem warość 7");
        return 7;
    }

    public static boolean reply() {
        System.out.println("Zwraca true");
        return true;
    }

    public static String getText() {
        System.out.println("Będę zwracał tekst Grzegorz ");
        String name = "Grzegorz ";
        return name;
    }

}

