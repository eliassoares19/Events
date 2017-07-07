package model;

import control.Evento;

/**
 *
 * @author elias.andrade
 * @UltimaModificação: 07/07/17
 */
public class Churrasco extends Evento{
    
    public Churrasco(String tipo, String local, String data, String horaInicio, String horaTermino){
        super(tipo, local, data, horaInicio, horaTermino);
    }
}
