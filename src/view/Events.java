package view;

import control.Evento;
import java.util.Scanner;
import model.*;
import javax.swing.*;

/**
 *
 * @author elias
 * @UltimaModificação: 10/07/17
 */
public class Events extends JFrame {

    private JMenuBar BarraMenu = null;
    private JMenu mnuArquivo = null;
    private JMenuItem mnuSair = null;
    
    Scanner ler = new Scanner(System.in);

    public void initialize() {
        this.setTitle("Aplicação com menu");
        this.setJMenuBar(getBarraMenu());
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(800, 600);
        this.setVisible(true);
    }

    
    private JMenuBar getBarraMenu() {
        if (BarraMenu == null) {
            BarraMenu = new JMenuBar();
            BarraMenu.add(getMnuArquivo());
        }
        return BarraMenu;
    }

    private JMenu getMnuArquivo() {
        if (mnuArquivo == null) {
            mnuArquivo = new JMenu();
            mnuArquivo.setText("Arquivo");
            mnuArquivo.add(getMnuSair());
        }
        return mnuArquivo;
    }

    private JMenuItem getMnuSair() {
        if (mnuSair == null) {
            mnuSair = new JMenuItem();
            mnuSair.setText("Sair");
        }
        return mnuSair;
    }

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
        int result = 0;
        e.initialize();

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
