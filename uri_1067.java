/*
URI Online Judge | 1067
Números Ímpares

Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, 
inclusive o X, se for o caso.

Entrada
O arquivo de entrada contém 1 valor inteiro qualquer.

Saída
Imprima todos os valores ímpares de 1 até X, inclusive X, se for o caso.

----------------------------------------------------------------
||||    Exemplo de Entrada    || 	Exemplo de Saída        ||||
||||    8                     ||        1                   ||||
||||                          ||        3                   ||||
||||                          ||        5                   ||||
||||                          ||        7                   ||||
----------------------------------------------------------------
*/
import java.util.Scanner;
public class uri_1067{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int numero;

        numero = entrada.nextInt();


        for(int i=1; i<=numero; i+=2){

            System.out.println(i);

            }

entrada.close();
    }
}