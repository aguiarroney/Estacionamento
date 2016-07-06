
package model;

import java.util.ArrayList;
/*
    ARMAZENA OS DADOS DOS FUNCIONÁRIOS EM UM ARRAYLIST.
    NOME/CPF/DATA NASCIMENTO/FILIAL REFERENTE/SENHA
    CARGO
    01 - GERENTE
    02 - CAIXA
*/

public class Funcionarios {
    //private static int codigo = 0; // CODIGO PARA CADA FUNCIONARIO?
    private final String nome;
    private final String cpf;
    private final String dataNascimento;
    private String senha;
    private int cargo;
    private int filial;
 
    
    public Funcionarios(String nome, String cpf, String data, String senha, int cargo, int filial){
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = data;
        this.senha = senha;
        this.cargo = cargo;
        this.filial = filial;
        
    }

    
    public void setCodFilial(int codFilial){
        this.filial = codFilial;
    }
    
    public void setSenha(String senha){
        this.senha = senha;
    }
    
    public void setCargo(int cargo){
        this.cargo = cargo;
    }
    
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public int getFilial() {
        return filial;
    }
    
    public String getSenha(){
        return senha;
    }
    
    public int getCargo(){
        return cargo;
    }
}
