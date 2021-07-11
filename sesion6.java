import java.util.*;

public class sesion6 {
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
        int menor=9999999, code_me=0, code_ma=0, mayor=0;
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
                code_me=producto1.getcodigo();
            }
            if (producto1.getinventario()>mayor){
                mayor=producto1.getinventario();
                code_ma=producto1.getcodigo();
            }
        }

        System.out.println("El producto con menor cantidad en inventario es "+code_me+".");
        System.out.println("El producto con mayor cantidad en inventario es "+code_ma+".");

        System.out.println("Ingrese el codigo del producto a comprar: ");
        int codigocompra = teclado.nextInt();
        System.out.println("Ingrese la cantidad de productos a comprar: ");
        int cantidadcompra = teclado.nextInt();

        boolean encontrado = false;
        int pos=0;
        while (pos<N*4 && encontrado==false) {
            if (V_productos[pos]==codigocompra) {
                encontrado= true;
                producto1.setcodigo(V_productos[pos]);
                producto1.setprecio(V_productos[pos+1]);
                producto1.setinventario(V_productos[pos+2]);
                producto1.setminima(V_productos[pos+3]);
            }  else {
                pos++;
            }
        }

        producto1.detalle(producto1);
        System.out.println("El total a pagar por el pedido es: "+producto1.total_compra(cantidadcompra));

        teclado.close();
    }
}

class Producto {
    //DEFINO ATRIBUTOS 
    private int codigo, cantidad_bodega, cantidad_minima;
    private double precio;
    private static double descuento=0.01;

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
        System.out.println("Codigo: "+producto.codigo+", Precio: "+producto.precio+", Inventario: "+producto.cantidad_bodega+", Cantidad minima: "+producto.cantidad_minima+", Descuento: "+descuento);
    }

    public double total_compra(int cantidad){
        return precio*cantidad*(1-descuento);
    }

    public static double p_descuento(){return descuento;} // ES NECESARIO?

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

}