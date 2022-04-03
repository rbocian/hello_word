import java.sql.Array;

public class trycatch {
    public static void main(String[] args) {
        int[] tab = {12, 2, 6} ;
            try {
                System.out.println(tab[10]);
        } catch (ArrayIndexOutOfBoundsExeption e) {
                System.out.println ("Wykryto błąd tabela ma tylko 3 pola");
            }
    }
}
