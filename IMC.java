import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // double peso = input.nextDouble(); // Remover a entrada
        // double altura = input.nextDouble();

        double peso = 65.0; // <-- substitua pelo valor desejado
        double altura = 1.80; // <-- substitua pelo valor desejado

        double imc = peso / (altura * altura);
        System.out.println("Seu IMC é: " + imc);

        if (imc < 17) {
            System.out.println("Muito abaixo do peso");
        } else if (imc < 18.49) {
        	System.out.println("Abaixo do peso");
        } else if (imc < 24.9) {
            System.out.println("Peso normal");
        } else if (imc < 29.9) {
            System.out.println("Acima do peso");
        } else if (imc < 34.9) {
            System.out.println("Obesidade I");
        } else if (imc < 39.9) {
             System.out.println("Obesidade II");
        } else if (imc > 40.0) {
             System.out.println("Obesidade III"); 
        }
        input.close(); //fecha o Scanner
    } //fecha o main
}// fecha a classe
