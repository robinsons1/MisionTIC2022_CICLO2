import java.util.Scanner;

public class Linea {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int i;
        String linea;
        int V[] = new int[100];
        linea= leer.nextLine();
        String elementos[] = linea.split(" ");
        for (i=0; i<elementos.length; i++) {
            V[i] = Integer.parseInt(elementos[i]);
        }
        for (i=0; i<elementos.length; i++) {
            System.out.print(V[i] + " ");
        }
        leer.close();
    }
   
}