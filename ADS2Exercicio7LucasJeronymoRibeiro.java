//Exercicio 7 - AC2
//Desenvolvido por Lucas Jeronymo Ribeiro (210117) - ADS TN2
package ADS2;

import java.util.Scanner;

public class ADS2Exercicio7LucasJeronymoRibeiro {
public static void main(String[] args){
    Scanner ler = new Scanner(System.in);
    System.out.println("Digite o caractére");
    char caracter = ler.next().charAt(0);
    //A
    int num = caracter;
    System.out.println("O número é: " + num);
    //B
    char soma = (char) (caracter + 12);
    System.out.println("O caractére 12 casas a frente da tabela unicode é:" + soma);
    //C, D e E
    if(caracter >= 65 & caracter <= 90 || caracter >= 97 & caracter <= 122){
            if(caracter>=65 & caracter<=90){//C
                System.out.println("Em maiúsculo: " + caracter);
                num = num + 32;
                caracter = (char) num;
                System.out.println("Em minúsculo: " + caracter);
                System.out.println("O oposto do digitado: " + caracter);//E
            }else{//D
                System.out.println("Em minúsculo: " + caracter);
                num = num - 32;
                caracter = (char) num;
                System.out.println("Em maiúsculo: " + caracter);
                System.out.println("O oposto do digitado: " + caracter);//E  
            }
        }

    }
}
    
    
