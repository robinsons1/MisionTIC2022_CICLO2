import java.util.Scanner;
import java.util.Arrays; 

public class reto1 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el numero de muestras: ");
        int N=teclado.nextInt();
        System.out.println(N);
        
        System.out.println("Ingrese la lista de muestras: ");
        String muestrasin=teclado.nextLine();
        String[] muestras = muestrasin.split(" ");
        System.out.println(Arrays.toString(muestras));

        teclado.close();
    }
}
