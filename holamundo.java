import java.util.Scanner;

public class holamundo {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in); 
        System.out.println("Ingrese el valor de a: ");
        int a=teclado.nextInt();
        System.out.println("Ingrese el valor de b: ");
        int b=teclado.nextInt();
        if (a>b) {
            System.out.println("El valor de a es mayor que el valor de b");
        } else{
            System.out.println("El valor de a es menor que el valor de b");
        }
        System.out.println("Hello, World!" + a*b);
        System.out.println("Hello, World!" + (a+b));
        teclado.close();
    }
}
