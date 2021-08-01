public class ObjetoGeografico {
    
    //DEFINO ATRIBUTOS 
    private String nombre, municipio, tipo_agua, tipo_cuerpo; 
    private int identificador;
    private double irca;

    //DEFINO CONSTRUCTORES
    public ObjetoGeografico(){}

    public ObjetoGeografico(String nombre, int identificador, String municipio, String tipo_agua, String tipo_cuerpo, double irca){
        this.nombre=nombre;
        this.identificador=identificador;
        this.municipio=municipio;
        this.tipo_agua=tipo_agua;
        this.tipo_cuerpo=tipo_cuerpo;
        this.irca=irca;
    }

    //DEFINO METODOS
    public void imprimir(ObjetoGeografico cuerpo){
        System.out.println("Nombre: "+cuerpo.getnombre()+", Identificador: "+cuerpo.getidentificador()+", Municipio: "+cuerpo.getmunicipio()+", Tipo agua: "+cuerpo.gettipoagua()+", Tipo cuerpo: "+cuerpo.gettipocuerpo()+", IRCA: "+cuerpo.getirca());
    }

    public void nombre_irca(ObjetoGeografico cuerpo){
        System.out.println(cuerpo.getnombre()+" "+String.format("%.2f", cuerpo.getirca()));
    }

    //DEFINO METODOS GET - ENCAPSULAMIENTO
    public String getnombre(){return nombre;}
    public int getidentificador(){return identificador;} 
    public String getmunicipio(){return municipio;} 
    public String gettipoagua(){return tipo_agua;}
    public String gettipocuerpo(){return tipo_cuerpo;}
    public double getirca(){return irca;} 

    //DEFINO METODOS SET - ENCAPSULAMIENTO
    public void setnombre(String nombre){this.nombre=nombre;}
    public void setidentificador(int identificador){this.identificador=identificador;}
    public void setmunicipio(String municipio){this.municipio=municipio;}
    public void settipoagua(String tipo_agua){this.tipo_agua=tipo_agua;}
    public void settipocuerpo(String tipo_cuerpo){this.tipo_cuerpo=tipo_cuerpo;}
    public void setirca(double irca){this.irca=irca;}

}
