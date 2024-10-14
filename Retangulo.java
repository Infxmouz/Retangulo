package retangulo;
import java.util.Scanner;

public class Retangulo {

    public static void main(String[] args) {
        double perim, area;
        
       System.out.println("Digite o valor de um lado: ");

       Scanner leia = new Scanner(System.in);
       float ladoA = leia.nextFloat();
       System.out.println("Digite o valor do outro lado: ");
       float ladoB = leia.nextFloat();
       perim = 2*ladoA + 2*ladoB;
       System.out.println("Perímetro: " + perim + "cm");
       area = ladoA * ladoB;
       System.out.println("Área do retângulo: " + area + "cm²");
    }
    
}
