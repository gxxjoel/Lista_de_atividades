package exerciciospag33.exercicio1;

public class exercicio1_pag33{
  public static void main(String[]args){

    Integer n1, soma=0;
    long par=1;
    
    for (n1 = 0; n1 <= 30; n1++){
        if (n1 % 2 == 1){
        soma += n1;                                                                                                                                                                                                                                     
        } else{
            if (n1 > 0 )
            par *= n1;
    }   
} 
System.out.println("=============================================");
System.out.println("- Soma dos ímpares: "+soma);
System.out.println("=============================================");
System.out.println("- Multiplicação dos pares: "+par); 
System.out.println("=============================================");
    }
}