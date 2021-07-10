import java.util.Scanner;
import java.util.Arrays; 

public class sesion3 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);/*
        System.out.println("Ingrese la lista de codigos: ");
        String codigosin=teclado.nextLine();
        String[] codigos = codigosin.split(" ");
        System.out.println(Arrays.toString(codigos));*/

        System.out.println("Ingrese la lista de codigos: ");
        String codigosin=teclado.nextLine();
        String[] codigos = codigosin.split(";");
        String[] matriz=new String[20];
        for (int i=0; i<codigos.length;i++){
            String[] q = codigos[i].split(" ");
            System.out.println(Arrays.toString(q));
            for(int k=0;k<3;k++){
                matriz[k]=q[k];
            }
        }
        System.out.println(Arrays.toString(codigos));
        System.out.println(Arrays.toString(matriz));
        teclado.close();
    }
}
