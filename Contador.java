import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parametro");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo parametro");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
            terminal.close();
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        if(parametroDois >= parametroUm) {
            int contador = parametroDois - parametroUm;
            for (int i = 1; i < contador; i++) {
                System.out.println("Imprimindo o numero " + i);
            }
        }
        else {
            throw new ParametrosInvalidosException("O segundo parametro deve ser maior que o primeiro");
        }
    }
}