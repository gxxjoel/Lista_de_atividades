package exercicio2;

import java.util.Scanner;

public class exercicio2{
    public static void main(String[]args){
        
        Scanner input = new Scanner(System.in);
        double h, b, B;
        Double a;
        
        System.out.print("Digite a altura: ");
        h = input.nextDouble();
        
        System.out.print("Digite a base menor: ");
        b = input.nextDouble();
        
        System.out.print("Digite a base maior: ");
        B = input.nextDouble();
        
        a = (h * (b + B)) /2;  

        System.out.println("=================================");
        System.out.println("A area exata do trapézio é: "+a);
        System.out.println("=================================");
        System.out.println("O valor arredondado é igual a " +a.intValue());
        System.out.println("=================================");    
    }
}