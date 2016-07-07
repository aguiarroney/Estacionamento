/*
 * LEO MEXEU
 */


/*
    COISA QUE FALTAM:
    - gerar valor de pagamento(olhar metodo totalPagar)
    - converter hora pra inteiro pra calcular o valor a pagar
    - indicar proxima filial se o estacionamento estiver cheio(olhar metodo indicaVaga)
    - verificair se a vaga é do tipo do veiculo(olhar metodo indicaVaga)
    - reservar vaga em outra filial (talves usando thread)
    - olhar a vaga mais PROXIMA
    - criar metodo de gerar comprovante (bilhete q ganha na entrada e na saida)
*/
package view;

import control.Empresa;
import java.util.Scanner;
import model.Filial;
import model.Funcionarios;

public class Menu {
    
    public void menuPrincipal(Empresa emp){
       int op;
       Scanner s = new Scanner(System.in);
       boolean flag = true;
        do{
            System.out.println("1 - Inserir Filial");
            System.out.println("2 - Inserir Funcionario"); // Mudar para MenuFuncionário (Inserir,Localizar,Remover)?.
            System.out.println("3 - Vendas"); //Chamaria o menuEntrada() Relacionado a entrada e saída de veiculos. 
            System.out.println("4 - Sair");
            
            op = s.nextInt();
            if(op == 1){
                
            }
            if(op == 2){
                menuFuncionario(emp);
            }
            if(op == 3){
                menuEntrada(emp);
            }
            if(op == 4){
                flag = true;
            }
            
        }while(flag);
    }
    public void menuFuncionario(Empresa emp){
        String nome, cpf, senha, dataNascimento;
        int cargo,filial, op;
        boolean flag = true;
 
        Scanner s = new Scanner(System.in);
        
        do{
            System.out.println("Informe o nome");
                nome = s.nextLine();
            System.out.println("Informe o cpf");
                cpf = s.nextLine();
            System.out.println("Informe a senha");
                senha = s.nextLine();
            System.out.println("Informe a data de nascimento dd/mm/aaaa");
                dataNascimento = s.nextLine();
            System.out.println("Informe o cargo");
                cargo = s.nextInt();
            System.out.println("Informe a filial");
                filial = s.nextInt();            
            Funcionarios funcionario = new Funcionarios(nome,cpf,dataNascimento,senha,cargo,filial);
            emp.addFuncionario(funcionario);
           
            System.out.println("Inserir novo funcionario:");
            System.out.println("(1) Sim");
            System.out.println("(2) Não");
                op = s.nextInt();
                 if(op == 2){
                    flag = false;
                 }
            
        }while(flag);
    }
    public void menuEntrada(Empresa emp) {
        int op;
        boolean flag = true;
        Scanner s = new Scanner(System.in);
        
        
        do{
            System.out.println("1 - mostra vagas disponiveis. ");
            System.out.println("2 - Registra a entrada de um novo carro. ");
            System.out.println("3 - Resgistra saida de um carro. ");
            System.out.println("4 - Encerrar o dia. ");
            System.out.print("Escolha uma opção: ");
            op = s.nextInt();
                if(op == 1){
                    
                }
                if(op == 2){
                    
                }
                if(op == 3){
                    
                }
                if(op == 4){
                    flag = false;
                }
            System.out.println();
        }while(flag);
    }
    public static void main(String[] args) {
        //Empresa emp = new Empresa();
        Filial f = new Filial("a","b","c",10,5,5);
        f.setHoraEntradaCarro();
    }
    
}
