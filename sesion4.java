/*public class sesion4 {
    public static void main(String[] args) throws Exception {

        Producto producto1 = new Producto(0001, 50000, 500, 100);
        producto1.detalle(producto1);
        System.out.println(producto1.solicitar_pedido());

    }
}

/*class Producto {
    private int codigo, cantidad_bodega, cantidad_minima;
    private double precio;

    //DEFINO ATRIBUTOS O CONSTRUCTORES
    public Producto(int codigo1, double precio1,int cantidad_bodega1, int cantidad_minima1){
        this.codigo=codigo1;
        this.precio=precio1;
        this.cantidad_bodega=cantidad_bodega1;
        this.cantidad_minima=cantidad_minima1;
    }

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

}*/