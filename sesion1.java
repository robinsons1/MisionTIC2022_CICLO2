import java.util.Scanner;

public class sesion1 {
    public static void main(String[] args) throws Exception {

        /*
        // Ejemplo 1: Estructura condicional simple
        Scanner teclado = new Scanner(System.in); 
        System.out.println("Ingrese la cantidad en bodega: ");
        int inventario=teclado.nextInt();
        System.out.println("Ingrese la cantidad minima: ");
        int minima=teclado.nextInt();
        if (inventario>minima){
            System.out.println("No es necesario realizar pedido a proveedor. ");
        } 
        if (inventario<minima){
            System.out.println("Es necesario realizar pedido a proveedor. ");
        }
        teclado.close(); 
        */

        /*
        // Ejemplo 2: Estructura condicional doble
        Scanner teclado = new Scanner(System.in); 
        System.out.println("Ingrese la cantidad en bodega: ");
        int inventario=teclado.nextInt();
        System.out.println("Ingrese la cantidad minima: ");
        int minima=teclado.nextInt();
        if (inventario>minima){
            System.out.println("No es necesario realizar pedido a proveedor. ");
        } else {
            System.out.println("Es necesario realizar pedido a proveedor. ");
        }
        teclado.close(); 
        */

        /*
        // Ejemplo 3: Estructura condicional múltiple.
        Scanner teclado = new Scanner(System.in); 
        System.out.println("Ingrese la cantidad en bodega: ");
        int inventario=teclado.nextInt();
        System.out.println("Ingrese la cantidad minima: ");
        int minima=teclado.nextInt();
        if ((inventario>minima) && ((inventario-minima)>10)){
            System.out.println("No es necesario realizar pedido a proveedor. Unidades restantes para vender: "+(inventario-minima));
        } else if ((inventario>minima) && ((inventario-minima)<10)) {
            System.out.println("No es necesario realizar pedido a proveedor. Unidades restantes para vender: "+(inventario-minima)+". Alerta Generada.");
        }
        if (inventario<minima){
            System.out.println("Es necesario realizar pedido a proveedor. ");
        }
        teclado.close(); 
        */

        /*
        //Ejemplo 4: Estructura condicional anidado
        Scanner teclado = new Scanner(System.in); 
        System.out.println("Ingrese la cantidad en bodega: ");
        int inventario=teclado.nextInt();
        System.out.println("Ingrese la cantidad minima: ");
        int minima=teclado.nextInt();
        if ((inventario>minima) && ((inventario-minima)>10)){
            System.out.println("No es necesario realizar pedido a proveedor. Unidades restantes para vender: "+(inventario-minima));
        } else if ((inventario>minima) && ((inventario-minima)<10)) {
            System.out.println("No es necesario realizar pedido a proveedor. Unidades restantes para vender: "+(inventario-minima)+". Alerta Generada.");
        }
        if (inventario<minima){
            System.out.println("Ingrese las unidades de compra deseada: ");
            int unidades=teclado.nextInt();
            System.out.println("Ingrese el valor de compra: ");
            int valor=teclado.nextInt();
            System.out.println("Ingrese el dinero en caja: ");
            int caja=teclado.nextInt();
            if ((unidades*valor)<caja) {
                System.out.println("Es necesario realizar pedido a proveedor. "+"Cantidades de compra deseada: "+unidades+". Valor de compra: "+valor+". Valor en caja: "+caja+". Si es posible realizar el pedido.");
            } else {
                System.out.println("Es necesario realizar pedido a proveedor. "+"Cantidades de compra deseada: "+unidades+". Valor de compra: "+valor+". Valor en caja: "+caja+". No es posible realizar el pedido.");
            }
        }
        teclado.close(); 
        */

        /*
        //  Ejemplo 5: Estructura dependiendo de o Según
        Scanner teclado = new Scanner(System.in); 
        System.out.println("Ingrese el dia: ");
        int dia=teclado.nextInt();
        System.out.println("Ingrese el valor de la compra: ");
        double valor=teclado.nextInt();
        double pfinal=0;
        switch(dia){
            case 1: 
                pfinal=valor-valor*0.05;
                break;
            case 2: 
                pfinal=valor-valor*0.03;
                break;
            case 3: 
                pfinal=valor-valor*0.1;
                break;
            case 4: 
                pfinal=valor-valor*0.04;
                break;
            case 5: 
                pfinal=valor-valor*0.06;
                break;
            case 6: 
                pfinal=valor-valor*0.02;
                break;
            case 7: 
                pfinal=valor-valor*0.01;
                break;
            default:
                break;
        }
        System.out.println("Precio incial: "+valor+". Precio final: "+pfinal+". El descuento fue "+(valor-pfinal));
        teclado.close(); 
        */

        /*
        //Ejemplo 6: Estructura cíclica
        Scanner teclado = new Scanner(System.in); 
        System.out.println("Ingrese la cantidad de productos: ");
        int cantidad=teclado.nextInt();
        double total=0;
        for (int i=1; i<=cantidad;i++){
            System.out.print("Cantidad de productos "+i+": ");
            double cantidad1 = teclado.nextDouble();
            System.out.print("Valor del producto "+i+": ");
            double valor = teclado.nextDouble();
            total=total+cantidad1*valor;
        }
        System.out.println("Total de la factura: "+total);
        teclado.close(); 
        */

        /*
        //Ejemplo 7: Integración estructuras condicionales y cíclicas (while if-else) (for if-else)
        Scanner teclado = new Scanner(System.in); 
        boolean continuar=true;
        double totalparcial=0;
        double total=0;
        int cuentacliente=1;
        while(continuar==true){
            System.out.println("Cliente "+cuentacliente);
            System.out.print("Cantidad de tipo de productos: ");
            int cantidad=teclado.nextInt();
            for (int i=1; i<=cantidad;i++){
                System.out.print("Cantidad de productos "+i+": ");
                double cantidad1 = teclado.nextDouble();
                System.out.print("Valor del producto "+i+": ");
                double valor = teclado.nextDouble();
                totalparcial=totalparcial+cantidad1*valor;
            }
            if (totalparcial>=100000){
                System.out.println("Total de la factura: "+(totalparcial-totalparcial*0.1));
            } else {
                System.out.println("Total de la factura: "+totalparcial);
            }
            total=total+totalparcial;
            System.out.println("¿Desea continuar? true/false: ");
            continuar=teclado.nextBoolean();
            cuentacliente++;
            totalparcial=0;
        }
        System.out.println("Total vendido: "+total);
        teclado.close(); 
        */

    }
}
