/*
URI Online Judge | 1118
Várias Notas Com Validação

Escreva um programa para ler as notas da primeira e a segunda avaliação de um aluno. 
Calcule e imprima a média semestral. O programa só deverá aceitar notas válidas 
(uma nota válida deve pertencer ao intervalo [0,10]). Cada nota deve ser validada separadamente.

No final deve ser impressa a mensagem “novo calculo (1-sim 2-nao)”, solicitando ao usuário que 
informe um código (1 ou 2) indicando se ele deseja ou não executar o algoritmo novamente, 
(aceitar apenas os código 1 ou 2). Se for informado o código 1 deve ser repetida a execução de todo 
o programa para permitir um novo cálculo, caso contrário o programa deve ser encerrado.

Entrada
O arquivo de entrada contém vários valores reais, positivos ou negativos. Quando forem lidas 
duas notas válidas, deve ser lido um valor inteiro X . O programa deve parar quando o valor lido 
para este X for igual a 2.

Saída
Se uma nota inválida for lida, deve ser impressa a mensagem “nota invalida”. 
Quando duas notas válidas forem lidas, deve ser impressa a mensagem “media = ” seguido do valor do cálculo.

Antes da leitura de X deve ser impressa a mensagem "novo calculo (1-sim 2-nao)" e esta 
mensagem deve ser apresentada novamente se o valor da entrada padrão para X for menor do que 1 ou maior 
do que 2, conforme o exemplo abaixo.

A média deve ser impressa com dois dígitos após o ponto decimal.

--------------------------------------------------------------------
        Exemplo de Entrada	        Exemplo de Saída
        -3.5                        nota invalida
        3.5                         nota invalida 
        11.0                        media = 6.75
        10.0                        novo calculo (1-sim 2-nao)
        4                           novo calculo (1-sim 2-nao)
        1                           media = 8.50
        8.0                         novo calculo (1-sim 2-nao)
        9.0
        2
--------------------------------------------------------------------
*/
import java.util.Scanner;
public class uri_1118{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double n, s;
        int r, c;

        do{
            c = 0;
            s = 0;

            while(c<2){

                n = entrada.nextDouble();
                if((n >= 0) & (n <=10)){
                    s += n;
                    c++;
                }
                else{
                    System.out.println("nota invalida");
                }
            }
            System.out.printf("media = %.2f\n", s*0.5);

            do{
                System.out.println("novo calculo (1-sim 2-nao)");
                r = entrada.nextInt();
            }
            while((r != 1) & (r !=2));
        }
        while(r != 2);

entrada.close();
    }
}