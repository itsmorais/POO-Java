import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner ler = new Scanner(System.in);
        int vetA[];
        int vetB[];
       
        vetA = new int[10];
        vetB = new int[10];
        int soma = 0;

        // Entrada
        for(int i = 0; i < 10; i++){
            System.out.printf("Insira valores para o vetor A. %dº valor: ",i+1);
            vetA[i] = ler.nextInt();    
            
        }
        for(int i = 0; i < 10; i++){   
            System.out.printf("%d° valor para o Vetor B: ",i+1);
            vetB[i] = ler.nextInt();
        }

        // Calculo do produto escalar + saída
        System.out.print("O produto escalar de A por B é: ");
        for(int i = 0; i<10;i++){
            soma += vetA[i] * vetB[i];
        }

        System.out.println(soma);
      

    }    
        }

