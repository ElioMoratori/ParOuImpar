import util.ValoresFixos;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner leitura = new Scanner(System.in);
        ValoresFixos minhaEscolha = null;

        System.out.println("Escolha 'Par' ou 'Ímpar':");
        String parOuImpar = leitura.next();
        int tamanhoString = parOuImpar.length();

        parOuImpar = parOuImpar.toUpperCase();

        minhaEscolha = escolhendoValor(parOuImpar);

        Random rand = new Random();
        int apostaBot = rand.nextInt(0,11);
        System.out.println("Coloque um valor de 0 a 10:");
        int apostaUser = leitura.nextInt();

        System.out.println(resultado(apostaBot, apostaUser, minhaEscolha));

    }

    public static ValoresFixos escolhendoValor(String parOuImpar) throws Exception {
        if (parOuImpar.equals(ValoresFixos.PAR.toString())) {
            System.out.println("Você é Par");
            return ValoresFixos.PAR;
        } else if (parOuImpar.equals(ValoresFixos.IMPAR.toString())) {
            System.out.println("Você é Impar");
            return ValoresFixos.IMPAR;
        }
        throw new Exception ("Erro! Escolha PAR ou IMPAR");
    }

    public static String resultado (int apostaBot, int apostaUser, ValoresFixos minhaEscolha) {
        System.out.println("O bot apostou o número: " + apostaBot);
        if (((apostaBot + apostaUser) % 2 == 0) && minhaEscolha == ValoresFixos.PAR) {
            return "Você venceu!";
        } else if (((apostaBot + apostaUser) % 2 != 0) && minhaEscolha == ValoresFixos.IMPAR) {
            return "Você venceu!";
        }
        return "Você perdeu!";
    }
}