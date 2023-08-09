import java.util.Scanner;

public class ProgramaCalculadora {

    private static Scanner entrada = new Scanner(System.in);

    public static Scanner getEntrada() {
        return entrada;
    }

    public static double getValor() {
        double numero = getEntrada().nextDouble();
        return numero;
    }

    public static void operacao() {
        System.out.println("Digite o primeiro número que deseja fazer a operação: ");
        double numero1 = getValor();

        System.out.println("Digite o segundo número que deseja fazer a operação: ");
        double numero2 = getValor();

        System.out.println("Insira a opção que deseja realizar: \n 1 - SOMA; \n 2 - SUBTRAÇÃO; \n 3 - MULTIPLICAÇÃO; \n 4 - DIVISÃO ");
        int escolha = entrada.nextInt();

        switch (escolha) {

            case 1:
                System.out.printf("O resultado da soma é: " + numero1, numero2, Calcular.somar(numero1, numero2));
                break;
            case 2:
                System.out.printf("O resultado da subtração é: " + numero1, numero2, Calcular.subtrair(numero1, numero2));
                break;
            case 3:
                System.out.printf("O resultado da multiplicação é: " + numero1, numero2, Calcular.multiplicar(numero1, numero2));
                break;
            case 4:
                System.out.printf("O resultado da divisão é: " + numero1, numero2, Calcular.dividir(numero1, numero2));
                break;
            default:
                System.out.println("Escolha uma opção!!");
        }
    }

    public static void main(String[] args) {

        ProgramaCalculadora.operacao();

    }
}
