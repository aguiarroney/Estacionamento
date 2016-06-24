/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;

public class Menu {
    
    public void showMenu() {
        int op;
        Scanner s = new Scanner(System.in);
        
        
        do{
            System.out.println("1 - mostra vagas disponiveis. ");
            System.out.println("2 - Registra a entrada de um novo carro. ");
            System.out.println("3 - Resgistra saida de um carro. ");
            System.out.println("4 - Encerrar o dia. ");
            System.out.print("Escolha uma opção: ");
            op = s.nextInt();
            System.out.println();
        }while(op != 4);
    }
}
