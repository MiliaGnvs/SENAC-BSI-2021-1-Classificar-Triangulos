/******************************************************************************

Escreva um algoritmo em Java que solicite ao usuário a entrada de 3 números. Considere que estes números são os lados de um triângulo.

Seu algoritmo deverá:

Indicar se "realmente" são lados de um triângulo
Se os lados compõem um triângulo, identifique qual sua classificação:
Equilátero
Isósceles
Escaleno

Milia P. Gonçalves 

*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	    int ordenador;
	    Scanner leitor = new Scanner(System.in);
	    
	    System.out.print("Digite a número A: ");
        int a = leitor.nextInt();
        
        System.out.print("Digite a número B: ");
        int b = leitor.nextInt();
        
        System.out.print("Digite a número C: ");
        int c = leitor.nextInt();

	    if(a >= (b+c))
	    {
	        System.out.print("\n\nNÃO FORMA TRIÂNGULO.");
	    }
	    else 
	    {
	        if(a == b && a == c && b == c)
            {
                System.out.print("\n\nTRIÂNGULO EQUILÁTERO");
            }
        
    	    if(a == b || a == c || b == c)
    	    {
    	        System.out.print("\n\nTRIÂNGULO ISOSCELES");
    	    }
    	    
            if(a != b && a != c && b != c)
            {
                System.out.print("\n\nTRIÂNGULO ESCALENO");
            }
            
	    }
	}
}
