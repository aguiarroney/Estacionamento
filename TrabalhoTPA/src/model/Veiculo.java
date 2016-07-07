
package model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
    COD
    00 CARRO
    01 MOTO
    
*/
public class Veiculo {
    

    
    private final int tipo;
    private final String placa;
    private  String entrada;
    private int posLinha, posColuna;

    public Veiculo(int t ,String p, String entrada){
        this.tipo = t;
        this.placa = p;
        this.entrada = entrada;
    }
   
    public int getTipo(){
        return tipo;
    }
    public String getPlaca(){
        return placa;
    }
    
    public void setPosLinha(int i){
        this.posLinha = i;
    }
    
    public void setPosColuna(int k){
        this.posColuna = k;
    }
}
