package view;

import control.Evento;
import java.util.Scanner;
import model.*;

/**
 *
 * @author elias
 * @UltimaModificação: 07/07/17
 */
public class Events {

    Scanner ler = new Scanner(System.in);

    public int menu() {
        int op;
        System.out.println("----------------------MENU----------------------");
        System.out.println("Escolha o evento:");
        System.out.println("1- Aniversário");
        System.out.println("2- Casamento");
        System.out.println("3- Choppada");
        System.out.println("4- Churrasco");
        System.out.println("5- Social");
        System.out.println("6- Sair");
        System.out.println("----------------------MENU----------------------");
        System.out.println("Digite a opção desejada: ");
        op = ler.nextInt();
        return op;
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Events e = new Events();
        int result;
        result = e.menu();

        switch (result) {
            case 1: //Aniversario
                Aniversario aniversario = new Aniversario("Aniversario", "Rio das Ostras", "19/06/17", "18:00:00", "23:00:00");

                break;

            case 2: //Casamento
                Casamento casamento = new Casamento("Casamento", "Rio das Ostras", "19/06/17", "18:00:00", "23:00:00");

                break;

            case 3: //Choppada
                Choppada choppada = new Choppada("Choppada", "Rio das Ostras", "19/06/17", "18:00:00", "23:00:00");

                break;

            case 4: //Churrasco
                Churrasco churrasco = new Churrasco("Churrasco", "Rio das Ostras", "19/06/17", "18:00:00", "23:00:00");

                break;

            case 5: //Social
                Social social = new Social("Social", "Rio das Ostras", "19/06/17", "18:00:00", "23:00:00");

                break;

            case 6: //Sair
                break;

            default:
                System.out.println("Opção inválida!");
                e.menu();
                break;
        }
    }
}
