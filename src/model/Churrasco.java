package model;

import control.Evento;
import java.util.ArrayList;

/**
 *
 * @author elias.andrade
 * @UltimaModificação: 10/07/17
 */
public class Churrasco extends Evento{
    private ArrayList<Lista> listaChurrasco = new ArrayList<>();
    
    public Churrasco(String tipo, String local, String data, String horaInicio, String horaTermino){
        super(tipo, local, data, horaInicio, horaTermino);
    }
   
    public ArrayList getListaChurrasco(){
        return this.listaChurrasco;
    }
    
    public void setListaChurrasco(ArrayList listaChurrasco){
        this.listaChurrasco = listaChurrasco;
    }
}
