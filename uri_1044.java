/*
URI Online Judge | 1044
Múltiplos

Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou 
"Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si.

Entrada
A entrada contém valores inteiros.

Saída
A saída deve conter uma das mensagens conforme descrito acima.

------------------------------------------------------------
||||||  Exemplo de Entrada	 |   Exemplo de Saída     ||||||
||||||      6 24             |     Sao Multiplos      ||||||
------------------------------------------------------------
||||||      6 25             |    Nao sao Multiplos   ||||||
------------------------------------------------------------

*/
import java.util.Scanner;
public class uri_1044{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int A, B;

        A = entrada.nextInt();
        B = entrada.nextInt();

        if((A % B == 0) || (B % A == 0)){
            System.out.println("Sao Multiplos");
        }
        else{
            System.out.println("Nao sao Multiplos");
        }

        entrada.close();
    }
}