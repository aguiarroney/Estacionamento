/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class Filial {

    private final String nome;
    private final String cnpj;
    private int distSede; // distancia dessa filial até a sede
    private String endereco;
    Estacionamento estacionamento;
    
    public Filial(String nome, String cnpj, String endereco, int distSede, int linha, int coluna) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.distSede = distSede;
        estacionamento = new Estacionamento(linha,coluna);   
    }
    private void indicaFilial() {
         
    }
    public void indicaVaga(Veiculo v){
        boolean flag = false;
        int op=0;
        //System.out.println("As vagas disponiveis sao:");
        for(int i=0;i< estacionamento.getLinha();i++){
            for(int k=0; k<estacionamento.getColuna();k++){
                if(estacionamento.getVagas(i, k) == false){
                    //System.out.print(" ["+i+"]["+k+"] |");
                    v.setPosColuna(k);
                    v.setPosLinha(i);
                    flag = estacionamento.setVaga(i, k);
                    break;
                }
                
            }
            if(flag == true){
                    break;
            }else{
                indicaFilial();
                System.out.println("voce deseja ir para alguma outra filial? \n1-sim.\n2- nao");
                Scanner s = new Scanner(System.in);
                op = s.nextInt();
                switch(op){
                    case 1:
                        //rezervaVaga()
                    
                    case 2:
                        System.out.println("Obrigado pela preferencia!");
                        break;
                }
            } 
        }
    }
    
    public void setHoraEntradaCarro(){ // armazena a hora q o carro entrou no estacionamento
        
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");    
        Date e = Calendar.getInstance().getTime(); // Ou qualquer outra forma que tem
        String entrada = sdf.format(e);
        
        Scanner s = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        System.out.println("Digite:\n1 - moto.\n2 - carro.");
        int cod = s.nextInt();
        
        System.out.println("Digite a placa do veiculo:");
        String placa = s2.nextLine();
        
        // salva a vaga onde o veiculo vai estacionar
        // adicona o veiculo q chegou no array de veiculos do estacionamento
        
        Veiculo v = new Veiculo(cod, placa,entrada);
        System.out.println("criei carro");
        indicaVaga(v);
        System.out.println("indiquei vaga");
        estacionamento.adicionaVeiculo(v);
        System.out.println("Adicionei no array");
        //estacionamento.imprimeVagas();
        
    }
    
    public void setHoraSaidaCarro(){
        // pega a hora q o carro saiu do estacionamento 
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");    
        Date e = Calendar.getInstance().getTime(); // Ou qualquer outra forma que tem
        String saida = sdf.format(e);
        
        
    }
    
    public void totalPagamento(){
        System.out.println("Digite a placa do veiculo que solicita pagamento:");
        Scanner s = new Scanner(System.in);
        String placa = s.nextLine();
        
    }
    
    public int getDistSede(){
        return distSede;
    }
    
    public String getNomeFilial(){
        return this.nome;
    }
    
    public String getEndereço(){
        return this.endereco;
    }
}
