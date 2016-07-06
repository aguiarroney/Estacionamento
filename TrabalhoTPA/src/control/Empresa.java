
package control;

import java.util.ArrayList;
import model.Filial;
import model.Funcionarios;

/*
    EMPRESA MATRIZ
    LISTA DE FILIAIS EXISTENTES
    LISTA DE FUNCIONÁRIOS DA EMPRESA (TODAS AS FILIAIS)


*/

public class Empresa {
    //ARRAY DE FILIAIS DA EMPRESA
    public ArrayList<Filial> filial; 
    //ARRAY DE FUNCIONARIOS DA EMPRESA
    public ArrayList<Funcionarios> funcionarios;
    String razaoSocial; // nome para o governo
    String cnpj;
    String endereco;
    
    public Empresa(){
        filial = new ArrayList<>();
        funcionarios = new ArrayList<>();
    }
   
    /*
    TRETA:
        O FUNCIONARIO PERTENCE A EMPRESA... MAS UMA FILIAL NAO PODE SAIR 
        REMOVENDO FUNCIONÁRIOS DE OUTRAS FILIAIS.
        NÃO PODERIA ACESSAR O ARRAYLIST DE FUNCIONÁRIOS NA CLASSE EMPRESA
        MAS TERIA QUE ADICIONAR E REMOVER FUNCIONÁRIOS
    
        QUANDO FOR BUSCAR UM FUNCIONÁRIO DE UMA FILIAL TER QUE PERCORRER 
        TODO O ARRAY DA EMPRESA
    */
    
    
    //ADICIONAR UM FUNCIONARIO
    public void addFuncionario(Funcionarios funcionario){
        this.funcionarios.add(funcionario);
        System.out.println("Funcionario adicionado com sucesso!");
    }
    
    //REMOVER UM FUNCIONARIO
    public void removeFuncionario(Funcionarios funcionario){
        this.funcionarios.remove(funcionario);
        System.out.println("Funcinario removido com sucesso!");
    }
    
    
    //ADICIONAR NOVA FILIAL
    public void addLoja(Filial filial){
        this.filial.add(filial);
        System.out.println("Loja cadastrada com Sucesso!");
    }
    
    //REMOVE UMA FILIAL
    public void removeLoja(Filial filial){
        this.filial.remove(filial);
        System.out.println("Loja removida com sucesso!");
    }

    public Funcionarios localizarFuncionario(String nome, int codFilial){
        for(Funcionarios f: funcionarios){
            if(f.getNome().equals(nome) && f.getFilial() == codFilial){
                return f;
            }
        }
        return null;
    }
    
    public void getListaFilial(){
        int menor=90000000;
        for(Filial f: filial){
            if(menor > f.getDistSede()){
                menor = f.getDistSede();
            }
        }
        for(Filial f:filial){
            if(f.getDistSede() == menor){
                System.out.println("Filial mais proxima: "+ f.getNomeFilial());
                System.out.println("Endereço: "+ f.getEndereço());
                System.out.println("A distancia daqui até la é: " + f.getDistSede());
            }
        }
    }
}