//RETO 1
//ROBINSON SEGURA APONTE

import java.util.*;

public class reto1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
    
        //System.out.println("Ingrese el numero de muestras: ");
        int N=Integer.parseInt(leer.nextLine());
        //System.out.println("N = "+N);

        //System.out.println("Ingrese las muestras: ");
        String linea= leer.nextLine();
        String elementos[] = linea.split(" ");
        int muestras[] = new int[N];

        for (int i=0; i<elementos.length; i++) {
            muestras[i] = Integer.parseInt(elementos[i]);
        }

        int suma=0, cuenta=0;
        boolean continuarvig=false;
        for (int i=0; i<elementos.length; i++) {
            suma=muestras[i]+suma;
            if (0<=muestras[i] && muestras[i]<=14){cuenta++;}
            if (muestras[i]<=5){continuarvig=true;}
            //System.out.print(muestras[i] + " ");
        }

        double promedio=(double) suma/elementos.length;
        //System.out.println("Promedio="+suma+"/"+elementos.length+"="+promedio);

        if(0<=promedio && promedio<=5){System.out.println("SIN RIESGO");}
        else if (5.1<=promedio && promedio<=14){System.out.println("BAJO");}
        else if (14.1<=promedio && promedio<=35){System.out.println("MEDIO");}
        else if (35.1<=promedio && promedio<=80){System.out.println("ALTO");}
        else if (80.1<=promedio && promedio<=100){System.out.println("INVIABLE SANITARIAMENTE");}

        //System.out.println((double) (100*cuenta)/N);
        double porcentaje=(double) (100*cuenta)/N;
        System.out.println(String.format("%.2f", porcentaje));

        if (continuarvig==true){System.out.println("SI");}
        else {System.out.println("NO");}


        leer.close();
    }
   
}
