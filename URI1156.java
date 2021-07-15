import java.io.IOException;

/**
 * Programa que segue o enunciado do problema número 1156 do site URI Online Judge
 *
 * @author Ricardo Fonseca Zabir(ricardofonseca.zabir@hotmail.com)
 * @date 07-13-2021
 */
public class URI1156
{
       public static void main(String[]args)throws IOException{
        double soma=0;
        double cont=1;
        double segcont=1;
        while(cont<=39){soma=soma+(cont/segcont);
        segcont=segcont*2;
        cont=cont+2;  
        }
        System.out.printf("%.2f\n",soma);
    }
}
