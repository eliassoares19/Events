package model;

import control.Evento;

/**
 *
 * @author elias.andrade
 * @UltimaModificação: 07/07/17
 */
public class Choppada extends Evento{
    
    public Choppada(String tipo, String local, String data, String horaInicio, String horaTermino){
        super(tipo, local, data, horaInicio, horaTermino);
    }
}
