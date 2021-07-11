
public class poo {
    public static void main(String[] args) throws Exception {

        Celular celular1 = new Celular("LG","Rojo"); //Declaracion de celular 1
        celular1.llamar();

        Celular celular2 = new Celular("MOTOROLA","VERDE"); //Declaracion de celular 2
        celular2.llamar();

        Celular detalleCelular = new Celular(); //Mostrando detalle de objeto celular creado

        detalleCelular.detalleCelular(celular2);
    }
    
}

/////CLASE 
class Celular {

    private String nombre,color;
    
    public Celular(String nombre,String color){
        this.nombre = nombre;
        this.color = color;
    }

    public Celular(){}

    public void llamar(){
        System.out.println("Llamando de "+nombre+" Color: "+color);
    }

    public void detalleCelular(Celular celular){
        System.out.println("-----------------------------------------------------------");
        System.out.println("Nombre: " + celular.nombre + "\nColor:  " + celular.color );
        System.out.println("-----------------------------------------------------------");
    }
    
}