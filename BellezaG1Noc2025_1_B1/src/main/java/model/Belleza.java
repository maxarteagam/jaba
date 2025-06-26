
package model;

public class Belleza {
    
    //Atributos de la clase
    private String ideCli;
    private String apeCli;
    private String nomCli;
    private int tipCli;
    private int antCli;
    private float valCom;
    
    //Constructores

    public Belleza() {
    }

    public Belleza(String ideCli, String apeCli, String nomCli, int tipCli, int antCli, float valCom) {
        this.ideCli = ideCli;
        this.apeCli = apeCli;
        this.nomCli = nomCli;
        this.tipCli = tipCli;
        this.antCli = antCli;
        this.valCom = valCom;
    }
    
    //Métodos getters y setters

    public String getIdeCli() {
        return ideCli;
    }

    public void setIdeCli(String ideCli) {
        this.ideCli = ideCli;
    }

    public String getApeCli() {
        return apeCli;
    }

    public void setApeCli(String apeCli) {
        this.apeCli = apeCli;
    }

    public String getNomCli() {
        return nomCli;
    }

    public void setNomCli(String nomCli) {
        this.nomCli = nomCli;
    }

    public int getTipCli() {
        return tipCli;
    }

    public void setTipCli(int tipCli) {
        this.tipCli = tipCli;
    }

    public int getAntCli() {
        return antCli;
    }

    public void setAntCli(int antCli) {
        this.antCli = antCli;
    }

    public float getValCom() {
        return valCom;
    }

    public void setValCom(float valCom) {
        this.valCom = valCom;
    }
    
    //Métodos adicionales
    
    public float determinarPorcentaje(int tipCli, int antCli, float valCom){
        float porDes;
        if((tipCli == 1)&& (antCli >= 5))
            porDes = 30;
        else if((tipCli == 1)&& (antCli >= 2)&& (antCli < 5))
            porDes = 20;
        else if((tipCli == 1)&& (antCli < 2))
            porDes = 10;
        else if((tipCli == 2)&& (antCli >= 5))
            porDes = 25;
        else if((tipCli == 2)&& (antCli >= 2)&& (antCli < 5))
            porDes = 15;
        else if((tipCli == 2)&& (antCli < 2))
            porDes = 5;
        else if((tipCli == 3)&& (valCom >= 5000000))
            porDes = 15;
        else if((tipCli == 3)&& (valCom >= 2500000) && (valCom < 5000000))
            porDes = 10;
        else if((tipCli == 3)&& (valCom >= 1000000) && (valCom < 2500000))
            porDes = 5;
        else
            porDes = 0;
        
        return porDes;
    }
    
    public float valorDescuento(float valCom, float porDes){
        return (valCom * porDes)/100;
    }
    
    public float valorPagar(float valCom, float valDes){
        return valCom - valDes;
    }
    
    public int contar(int val){
        return val+=1;
    }
    
    public float acumular(float val1, float val2){
        return val1 + val2;
    }
    
    public float sumar3Valores(float val1, float val2, float val3){
        return val1 + val2 + val3;
    }
    
    public int sumar3Valores(int val1, int val2, int val3){
        return val1 + val2 + val3;
    }
    
    public float calcularPorcentaje(float valPar, float valTot){
        return (valPar * 100)/valTot;
    }
}
