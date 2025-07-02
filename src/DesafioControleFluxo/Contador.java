package DesafioControleFluxo;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
    Scanner terminal = new Scanner(System.in);

    System.out.println("Digite o primeiro parâmetro");
    int parametroUm = terminal.nextInt();
    terminal.nextLine();

    System.out.println("Digite o segundo parâmetro");
    int parametroDois = terminal.nextInt();
    terminal.nextLine();

    try {
        contar(parametroUm, parametroDois);

    }catch (ParametrosInvalidosException exception) {
        System.out.println("Erro: " + exception.getMessage());
    }

}
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois){
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }

        System.out.println("\nContando de " + parametroUm + " até " + parametroDois + ":");
        for (int i = parametroUm; i <= parametroDois; i++){
            System.out.println(i);
        }

        System.out.println("============================================================");

        System.out.println("\nContando a diferença de " + parametroUm + " até " + parametroDois + ":");
        int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem; i++){
            System.out.println(i);
        }
    }
}
