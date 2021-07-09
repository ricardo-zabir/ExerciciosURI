import java.util.Scanner;
import java.io.IOException;

/**
 * Programa que segue o enunciado do problema número 1134 do site URI Online Judge
 *
 * @author Ricardo Fonseca Zabir(ricardofonseca.zabir@hotmail.com)
 * @date 07-08-2021
 */
public class URI1134
{
   public static void main(String[] args) throws IOException {
        Scanner input=new Scanner(System.in);
        int num;
        int contal=0;
        int contgas=0;
        int contdie=0;
        boolean fim= false;
        while(fim==false){
        num=input.nextInt();
        if(num==1){contal++;}
        if(num==2){contgas++;}
        if(num==3){contdie++;}
        while(num<1 || num>4){num=input.nextInt();
        if(num==1){contal++;}
        if(num==2){contgas++;}
        if(num==3){contdie++;}}
        fim= num==4;
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: "+contal);
        System.out.println("Gasolina: "+contgas);
        System.out.println("Diesel: "+contdie);
    
        }
}
