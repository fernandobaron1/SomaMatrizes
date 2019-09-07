
package somamatrizes;

import java.util.Scanner;


public class SomaMatrizes {

    
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in); 
       
       
        int quantidadeLinhas = 0;
        int quantidadeColunas = 0;
       
        System.out.println("Informe a quantidade de LINHAS que você deseja em sua matriz:");
        quantidadeLinhas = leia.nextInt();
        
        System.out.println ("Informe a quantidade de COLUNAS que você deseja em sua matriz:");
        quantidadeColunas = leia.nextInt();
        
        int [][] matrizA = new int [quantidadeLinhas][quantidadeColunas];
        int [][] matrizB = new int [quantidadeLinhas][quantidadeColunas];
        int [][] matrizC = new int [quantidadeLinhas][quantidadeColunas];        
                
        //Preencher
        for (int linha = 0; linha < matrizA.length; linha++) {
            for (int coluna = 0; coluna < matrizA[linha].length; coluna++) {
                System.out.println("Preencha a Matriz A["+linha+"]"+"["+coluna+"]");  
                matrizA [linha][coluna] = leia.nextInt();     
            }
        }
        for (int linha = 0; linha < matrizB.length; linha++) {
            for (int coluna = 0; coluna < matrizB[linha].length; coluna++) {
                System.out.println("Preencha a Matriz B["+linha+"]"+"["+coluna+"]");  
                matrizB [linha][coluna] = leia.nextInt();
            }
        }
    
        //Percorrer        
        for (int linha = 0; linha < matrizC.length; linha++) {
            for (int coluna = 0; coluna < matrizC[linha].length; coluna++) {
               // for (int linha = 0; linha < matrizB.length; linha++) {
            //for (int coluna = 0; coluna < matrizB[linha].length; coluna++)
            
                matrizC [linha][coluna] = (matrizA[linha][coluna] + matrizB[linha][coluna]);
                System.out.print("["+linha+"]"+"["+coluna+"] => "+matrizC [linha][coluna]+"\t"); //\n
            }
            System.out.println("");
        }
    }
    
}
