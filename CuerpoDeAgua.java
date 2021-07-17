public class CuerpoDeAgua {
    //DEFINO ATRIBUTOS 
    private String nombre, municipio; 
    private int identificador;
    private double irca;

    //DEFINO CONSTRUCTORES
    public CuerpoDeAgua(){}

    public CuerpoDeAgua(String nombre, int identificador, String municipio, double irca){
        this.nombre=nombre;
        this.identificador=identificador;
        this.municipio=municipio;
        this.irca=irca;
    }

    //DEFINO METODOS
    public void imprimir(CuerpoDeAgua cuerpo){
        System.out.println("Nombre: "+cuerpo.nombre+", Identificador: "+cuerpo.identificador+", Municipio: "+cuerpo.municipio+", IRCA: "+cuerpo.irca);
    }

    public void nombre_irca(CuerpoDeAgua cuerpo){
        System.out.println(cuerpo.nombre+" "+String.format("%.2f", cuerpo.irca));
    }

    public String nivel(CuerpoDeAgua cuerpo){
        String lvl="";
        if(0<=cuerpo.irca && cuerpo.irca<=5){lvl="SIN RIESGO";}
        if(5.1<=cuerpo.irca && cuerpo.irca<=14){lvl="BAJO";}
        if(14.1<=cuerpo.irca && cuerpo.irca<=35){lvl="MEDIO";}
        if(35.1<=cuerpo.irca && cuerpo.irca<=80){lvl="ALTO";}
        if(80.1<=cuerpo.irca && cuerpo.irca<=100){lvl="INVIABLE SANITARIAMENTE";}
        return lvl;
    }

    //DEFINO METODOS GET - ENCAPSULAMIENTO
    public String getnombre(){return nombre;}
    public int getidentificador(){return identificador;} 
    public String getmunicipio(){return municipio;} 
    public double getirca(){return irca;} 

    //DEFINO METODOS SET - ENCAPSULAMIENTO
    public void setnombre(String nombre){this.nombre=nombre;}
    public void setidentificador(int identificador){this.identificador=identificador;}
    public void setmunicipio(String municipio){this.municipio=municipio;}
    public void setirca(double irca){this.irca=irca;}

}
