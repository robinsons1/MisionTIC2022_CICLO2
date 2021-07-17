//RETO 2
//ROBINSON SEGURA APONTE

import java.util.*;

public class reto2 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        //System.out.println("Ingrese la cantidad de elementos a analizar: ");
        int N=Integer.parseInt(teclado.nextLine());

        CuerpoDeAgua cuerpos[] = new CuerpoDeAgua[N];
        CuerpoDeAgua cuerpo = new CuerpoDeAgua();
        String linea;

        for(int i=0;i<N;i++){
            //System.out.println("Ingrese el elemento "+i+": ");
            linea= teclado.nextLine();
            String elementos[] = linea.split(" ");
            cuerpos[i] = new CuerpoDeAgua(elementos[0],Integer.parseInt(elementos[1]),elementos[2],Double.parseDouble(elementos[3]));
        }

        int supc=0;
        for(int i=0;i<N;i++){
            cuerpo.nombre_irca(cuerpos[i]);
            if(cuerpos[i].getirca()<=50){supc++;}
        }

        System.out.println(String.format("%.2f", Double.valueOf(supc)));

        int cuenta=0;
        double menor=cuerpos[0].getirca();
        for(int i=0;i<N;i++){
            if(cuerpo.nivel(cuerpos[i])=="SIN RIESGO"){
                System.out.print(cuerpos[i].getnombre()+" ");
                cuenta++;
            }
            if(cuerpos[i].getirca()<menor){
                menor=cuerpos[i].getirca();
            }
        }

        if(cuenta==0){
            System.out.println("NA");
        } else {System.out.println();}

        System.out.println(String.format("%.2f", menor));

        //cuerpo.imprimir(cuerpos[0]);
        //cuerpo.imprimir(cuerpos[1]);

        teclado.close();
    }
    
}
