/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;


public class Estacionamento {
    
    private int numVagas; 
    private int linha, coluna;
    private boolean[][] vagas; // mapa do estacionamento
    private ArrayList<Veiculo> veiculos;
    
    // colunas impares sao vagas de motos
    // colunas pares sao vagas de carros
    // true se a vaga estiver ocupada e false se a vaga estiver vazia
    // a entrada do estacionamento é a posição [0][0]
    
    public Estacionamento( int linha, int coluna){
        this.linha = linha;
        this.coluna = coluna;
        this.numVagas = linha* coluna;
        this.vagas = new boolean[linha][coluna]; // as vagas ja sao inicializadas com false
        veiculos = new ArrayList<Veiculo>();
        
    }
    
    public void adicionaVeiculo(Veiculo v){
        veiculos.add(v);
        //System.out.println(veiculos.size());
    }
    
    public boolean removeVeiculo(Veiculo v){
        return true;
    }
    
    public int getLinha(){
        return linha;
    }
    
    public int getColuna(){
        return coluna;
    }
    
    public boolean getVagas(int i, int k){
        return vagas[i][k];
    }
    
    public boolean setVaga(int i, int k){
        vagas[i][k]= true;
        
        return true;
    }
    
    public void imprimeVagas(){
        for(int i =0;i<linha;i++){
            for(int k=0;k<coluna;k++){
                System.out.println(vagas[i][k]);
            }
        }
    }
    
}
