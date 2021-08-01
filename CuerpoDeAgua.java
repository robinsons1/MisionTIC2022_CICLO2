public class CuerpoDeAgua extends ObjetoGeografico{
    
    private String lvls;

    public CuerpoDeAgua(){}

    public CuerpoDeAgua(String lvls){
        super();
        this.lvls=lvls;
    }

    public String nivel(ObjetoGeografico objeto){
        String lvl="";
        if(0<=objeto.getirca() && objeto.getirca()<=5){lvl="SIN RIESGO";}
        if(5.1<=objeto.getirca() && objeto.getirca()<=14){lvl="BAJO";}
        if(14.1<=objeto.getirca() && objeto.getirca()<=35){lvl="MEDIO";}
        if(35.1<=objeto.getirca() && objeto.getirca()<=80){lvl="ALTO";}
        if(80.1<=objeto.getirca() && objeto.getirca()<=100){lvl="INVIABLE SANITARIAMENTE";}
        return lvl;
    }

    public String getnivel(){return lvls;}
    public void setnivel(String lvls){this.lvls=lvls;}

}
