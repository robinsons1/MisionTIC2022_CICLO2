import java.util.Scanner;
import java.util.Arrays; 

public class sesion2 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Tamaño de las listas: ");
        int N=teclado.nextInt();
        int[] codigos = new int[N];
        int[] inventario = new int[N];
        int[] minimo = new int[N];
        System.out.println("Lista de codigos: ");
        for (int i=0;i<N;i++){
            System.out.print("Codigo "+(i+1)+" = ");
            codigos[i]=teclado.nextInt();
        }
        System.out.println("Lista de inventarios: ");
        for (int i=0;i<N;i++){
            System.out.print("Codigo "+(i+1)+" = ");
            inventario[i]=teclado.nextInt();
        }
        System.out.println("Lista de minimos: ");
        for (int i=0;i<N;i++){
            System.out.print("Codigo "+(i+1)+" = ");
            minimo[i]=teclado.nextInt();
        }
        System.out.println("Codigos: "+Arrays.toString(codigos));
        System.out.println("En inventario: "+Arrays.toString(inventario));
        System.out.println("Minima requerida: "+Arrays.toString(minimo));
        int mayor=0;
        int menor=99999;
        int posmayor=0;
        int posmenor=0;
        System.out.println("Codigos de productos que son necesario pedir: ");
        for (int i=0; i<N;i++){
            if (inventario[i]>mayor){
                mayor=inventario[i];
                posmayor=i;
            }
            if (inventario[i]<menor){
                menor=inventario[i];
                posmenor=i;
            }
            if (inventario[i]<minimo[i]){
                System.out.println(codigos[i]);
            }
        }
        System.out.println("Codigo con mayor numero de unidades: "+codigos[posmayor]);
        System.out.println("Codigo con menor numero de unidades: "+codigos[posmenor]);
        teclado.close();
    }
}
