import java.util.Scanner;
import java.io.IOException;

/**
 * Programa que segue o enunciado do problema número 1172 do site URI Online Judge
 *
 * @author Ricardo Fonseca Zabir(ricardofonseca.zabir@hotmail.com)
 * @date 07-08-2021
 */
public class URI1172
{
    public static void main(String[] args) throws IOException {
        int[] f= new int[10];
        int cont=0;
        Scanner input= new Scanner(System.in);
        while(cont<10){
        f[cont]=input.nextInt();
        if(f[cont] <=0){
        f[cont]=1;}
        System.out.println("X["+cont+"] = "+f[cont]);
        cont=cont+1;
        }
    
    }
}

