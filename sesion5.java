/*import java.util.*;

public class sesion5 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el numero de prodcutos: ");
        int N = teclado.nextInt();
        int V_productos[] = new int[N*4];
        int n_p=1;

        for (int i=0;i<N*4;i++){
            System.out.println("Ingrese el codigo del producto "+n_p+":");
            V_productos[i]=teclado.nextInt(); i++;
            System.out.println("Ingrese el precio del producto "+n_p+":");
            V_productos[i]=teclado.nextInt(); i++;
            System.out.println("Ingrese el inventario del producto "+n_p+":");
            V_productos[i]=teclado.nextInt(); i++;
            System.out.println("Ingrese el minimo del producto "+n_p+":");
            V_productos[i]=teclado.nextInt(); n_p++;
        }

        Producto producto1 = new Producto();
        int menor=9999999, code=0;
        for (int i=0;i<N*4;i++){
            producto1.setcodigo(V_productos[i]); i++;
            producto1.setprecio(V_productos[i]); i++;
            producto1.setinventario(V_productos[i]); i++;
            producto1.setminima(V_productos[i]);
            if (producto1.solicitar_pedido()==true){
                System.out.println("El producto con codigo "+producto1.getcodigo()+" debe solicitar prodcutos al proveedor.");
            }
            if (producto1.getinventario()<menor){
                menor=producto1.getinventario();
                code=producto1.getcodigo();
            }
        }

        System.out.println("El producto con menor cantidad en inventario es "+code+".");
        
        teclado.close();
    }
}

class Producto {
    //DEFINO ATRIBUTOS 
    private int codigo, cantidad_bodega, cantidad_minima;
    private double precio;

    //DEFINO CONSTRUCTORES
    public Producto(int codigo1, double precio1,int cantidad_bodega1, int cantidad_minima1){
        this.codigo=codigo1;
        this.precio=precio1;
        this.cantidad_bodega=cantidad_bodega1;
        this.cantidad_minima=cantidad_minima1;
    }

    public Producto(){}

    //DEFINO METODOS
    public boolean solicitar_pedido(){
        if (cantidad_bodega>cantidad_minima){
            return false;
        } else {
            return true;
        }
    }

    public void detalle(Producto producto){
        System.out.println("Producto: ");
        System.out.println("Codigo: "+producto.codigo+", Precio: "+producto.precio+", Inventario: "+producto.cantidad_bodega+", Cantidad minima: "+producto.cantidad_minima);
    }

    //DEFINO METODOS GET
    public int getcodigo(){return codigo;}
    public double getprecio(){return precio;} 
    public int getinventario(){return cantidad_bodega;} 
    public int getminima(){return cantidad_minima;} 

    //DEFINO METODOS SET
    public void setcodigo(int codigo){this.codigo=codigo;}
    public void setprecio(double precio){this.precio=precio;}
    public void setinventario(int inventario){this.cantidad_bodega=inventario;}
    public void setminima(int minima){this.cantidad_minima=minima;}

}*/