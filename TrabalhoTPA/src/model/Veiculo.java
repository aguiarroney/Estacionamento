
package model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
    COD
    01 MOTO
    02 CARRO
*/
public class Veiculo {
    

    
    private final int cod;
    private final String placa;
    private  String entrada;
    private int posLinha, posColuna;

    public Veiculo(int c ,String p, String entrada){
        this.cod = c;
        this.placa = p;
        this.entrada = entrada;
    }
    
    
    public int getCod(){
        return cod;
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
