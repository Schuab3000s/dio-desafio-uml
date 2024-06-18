/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package iphone;

import SistemaIphone.Sistema;
import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class IPhone {

    public static void main(String[] args) {

        Sistema sistema = new Sistema();
        Scanner scan = new Scanner(System.in);
        int opcao;

        while (true) {

            System.out.println("-----------------------------------");
            System.out.println("Selecione uma função do IPhone:");
            System.out.println(" 1 - Ligar");
            System.out.println(" 2 - Desligar");
            System.out.println(" 3 - Atender ligação");
            System.out.println(" 4 - Correio eletrônico");
            System.out.println(" 5 - Tocar música");
            System.out.println(" 6 - Pausar música");
            System.out.println(" 7 - Selecionar música");
            System.out.println(" 8 - Adcionar nova aba");
            System.out.println(" 9 - Exibir aba");
            System.out.println(" 10 - Atualizar aba");
            System.out.println("-----------------------------------");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    sistema.Liga();
                    break;
                case 2:
                    sistema.Desligar();
                    break;
                case 3:
                    sistema.Atender();
                    break;
                case 4:
                    sistema.IniciarCorreioVoz();
                    break;
                case 5:
                    sistema.Tocar();
                    break;
                case 6:
                    sistema.Pausar();
                    break;
                case 7:
                    System.out.println("Digite o nome da música: ");
                    String nome = scan.next();
                    sistema.SelecionarMusica(nome);
                    break;
                case 8:
                    sistema.AdicionarNovaAba();
                    break;
                case 9:
                    sistema.ExibirPagina();
                    break;
                case 10:
                    sistema.AtualizarPagina();
                    break;
            }
            if (opcao == 2) {
                break;
            }

        }
    }

}
