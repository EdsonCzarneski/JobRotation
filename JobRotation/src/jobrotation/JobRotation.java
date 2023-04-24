/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jobrotation;

import java.util.Scanner;

/**
 *
 * @author Edson Ricardo
 */
public class JobRotation {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
    /**
     * Exercício proposto 01
     */ 
        int soma = 0;
        int k = 0;
        int indice = 13;
        
        while (k < indice){
            k++;            
            soma = soma + k;               
        }
    System.out.println(soma);
    
    /**
     * Exercício proposto 02
     */ 
    
    int n1 = 0;
    int n2 = 1;
    int n3 = 0;
    Scanner tec = new Scanner(System.in);
    System.out.print("Digite um número: ");
    int n4 = tec.nextInt();
    
    while(n4 > n3){
        n3 = n1 + n2;
        n1 = n2;
        n2 = n3;
    }
    if(n4 == 0){
        System.out.print("O número zero faz parte da sequência de Fibonacci.");
        
    }else if (n4 ==  n3){
        System.out.println("O número "+ n4 + " faz parte da sequência de Fibonacci");
    }else{
        System.out.println("O número "+ n4 + " NÃO faz parte da sequência de Fibonacci");
    }
    
     /**
     * Exercício proposto 03
     */ 
    int a = 9;
    int b = 128;
    int c = 49;
    int d = 100;
    int e = 13;
    int f = 200;
   
       /**
     * Exercício proposto 04
     
    int caminhao = 80;
    int carro = 110;
    int dist = 100;
    O tempo de viagem do carro seria
    * tempo = 100/110 = 0,9h;
    * O tempo do caminhão, com obstáculo, seria:
    * tempo = 100/80 = 1h25 + 0,17h = 1h42m
    * A velocidade média do caminhão seria:
    * velocidadeMedia = 100/1,42 = 70,6 km/h
    * Ponto de encontro dos veículos:
    * encontro = 110 * 100 / (110 + 70,6) = 60,9 km
    * No momento em que os veículos se cruzarem, ambos estarão a 60,9 km de distância de 
    * Ribeirão Preto.
    **/
    
    /**
     * Exercício 05
     */
    
    Scanner ler = new Scanner(System.in);
    String frase;
    
    System.out.println("Digite uma palavra: ");
    frase = ler.nextLine();
    
    System.out.println(inverter(frase));
       
 
    }
   
   public static String inverter(String frase){
       int i,n;
       String aux = "";
       
       n = frase.length();
       for(i = (n-1);i>=0;i--){
           aux = aux + frase.charAt(i);
       }
       return (aux);
   }
    
    
}
