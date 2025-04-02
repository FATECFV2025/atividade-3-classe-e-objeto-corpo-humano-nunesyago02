package main.java;

public class CorpoHumano {
    private double massa;
    private double altura;

    public CorpoHumano(){}
    public CorpoHumano(double massa, double altura){
        this.massa = massa;
        this.altura = altura;
    }
    public void setaltura(double altura){
        this.altura = altura;
    }
    public void setmassa(double massa){
        this.massa = massa;
    }
    public double Calcimc(){
        if(altura <=0 ){
            return 0;
        }
        return massa/(altura*altura);
    }
}
