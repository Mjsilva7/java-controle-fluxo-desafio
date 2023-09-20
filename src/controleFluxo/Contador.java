package controleFluxo;

import java.util.Scanner;

import exceptions.ParametrosInvalidosException;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

            System.out.println("Digite o primeiro valor:");
        int parametroUm = terminal.nextInt();

            System.out.println("Digite o segundo valor:");
        int parametroDois = terminal.nextInt();

        try{
            contar(parametroUm, parametroDois);
        } catch(Exception e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }
        int contagem = parametroDois - parametroUm;
        for(int i = 0; i < contagem; i++) {
            System.out.println(i + 1 );
        }
    }

}
