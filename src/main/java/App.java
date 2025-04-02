package main.java;
import java.util.Scanner;

public class App {
    public static void main(String[] args)throws Exception{

        //Entrada dos dados
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a massa kg: ");
        double massa = scanner.nextDouble();
        System.out.print("Digite a altura m: ");
        double altura = scanner.nextDouble();
        
       //Fechamento do scanner após entrada 
       scanner.close();

        //Criação do objeto e calculo de imc
        CorpoHumano corpo = new CorpoHumano();
        corpo.setmassa(massa);
        corpo.setaltura(altura);
        double imc = corpo.Calcimc();

        //Saída de resultado 
        System.out.print("Seu imc é " +imc);
    }
}
