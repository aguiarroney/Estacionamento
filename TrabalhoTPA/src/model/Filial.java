
package model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


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
        int aux=10000; // usado para 
        int auxLinha = 0;
        int auxColuna = 0;
        
        //System.out.println("As vagas disponiveis sao:");
        // Percorre todo o estacionamento e procura a vaga mais próxima da entrada/saída
        for( int i=0;i< estacionamento.getLinha();i++){
            for( int k = v.getTipo(); k<estacionamento.getColuna();k = k+2){
                if(estacionamento.getVagas(i, k) == false)
                {
                    if((i+k)<aux)//Verifica se a vaga encontrada é mais próxima do que a que já tem
                    {
                        aux = i + k;
                        auxLinha = i;
                        auxColuna = k;
                        flag = true;
                    }
                }
            }
        }
        if(flag == false)// Nao encontrou nenhuma vaga
        {
                System.out.println("Voce deseja ir para alguma outra filial? \n1-Sim.\n2- Nao");
                Scanner s = new Scanner(System.in);
                op = s.nextInt();
                switch(op)
                {
                    case 1:
                        indicaFilial();    
                    case 2:
                        System.out.println("Obrigado pela preferencia!");
                        break;
                }
        }
        else
        {    
            v.setPosColuna(auxColuna);
            v.setPosLinha(auxLinha);
            estacionamento.setVaga(auxLinha, auxColuna); //rever
        }
    }
    
    public void setHoraEntradaCarro(){ // armazena a hora q o carro entrou no estacionamento
        
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");    
        Date e = Calendar.getInstance().getTime(); // Ou qualquer outra forma que tem
        String entrada = sdf.format(e);
        
        Scanner s = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        System.out.println("Digite:\n0 - Carro.\n1 - Moto.");
        int cod = s.nextInt();
        
        System.out.println("Digite a placa do veiculo:");
        String placa = s2.nextLine();
        
        // salva a vaga onde o veiculo vai estacionar
        // adicona o veiculo q chegou no array de veiculos do estacionamento
        
        Veiculo v = new Veiculo(cod, placa,entrada);
        System.out.println("Criei carro");
        indicaVaga(v);
        System.out.println("Indiquei vaga");
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
