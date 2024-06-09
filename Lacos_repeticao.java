import java.util.Scanner;


public class Lacos_repeticao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*Solicite ao usuário um número inteiro positivo n. O programa deve exibir a tabuada de 1 a 10 para o número n  */

        System.out.println("Digite um número inteiro positivo: ");
        int num1= scanner.nextInt();
        int multiplicacao=0;
        if(num1<=0){
            System.out.println("Digite um número maior que zero");
        }else{
            for( int i=0; i<=10; i++){
                multiplicacao= i*num1;
                System.out.println(num1+ "x"+i+" = "+multiplicacao);
            }
        }
        
        /*Solicite ao usuário um número inteiro positivo n. O programa deve calcular e exibir o fatorial de n utilizando um laço de repetição while. */
        System.out.println("Digite um número inteiro positivo: ");
        int n = scanner.nextInt();

        int fatorial = 1;
        int i = n;
        while (i > 0) {
            fatorial *= i;
            i--;
        }

        System.out.println("O fatorial de " + n + " é: " + fatorial);
    }
}
