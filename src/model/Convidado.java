package model;

import control.Evento;
import java.util.ArrayList;

/**
 *
 * @author elias
 * @UltimaModificação: 10/07/17
 */
public class Convidado {
    private String genero;
    private boolean bebidaAlcoolica;
    private String estiloMusical;
    private int idade;
    private String nome;
    private ArrayList<Evento> eventos = new ArrayList<>();
    Lista lista = new Lista();
    
    //Construtor da classe Convidado
    public Convidado(String genero, boolean bebidaAlcoolica, String estiloMusical, int idade, String nome){
        this.genero = genero;
        this.bebidaAlcoolica = bebidaAlcoolica;
        this.estiloMusical = estiloMusical;
        this.idade = idade;
        this.nome = nome;
    }
    
    //Getters-----------------------------------------------------------------------------------------------
    public String getGenero(){
        return this.genero;
    }
    
    public boolean getBebidaAlcoolica(){
        return this.bebidaAlcoolica;
    }
    
    public String getEstiloMusical(){
        return this.estiloMusical;
    }
    
    public int getIdade(){
        return this.idade;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public ArrayList getEventos(){
        return this.eventos;
    }
    
    
    //Setters-----------------------------------------------------------------------------------------------
    public void setGenero(String genero){
        this.genero = genero;
    }
    
    public void setBebidaAlcoolica(boolean bebidaAlcoolica){
        this.bebidaAlcoolica = bebidaAlcoolica;
    }
    
    public void setEstiloMusical(String estiloMusical){
        this.estiloMusical = estiloMusical;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setEventos(ArrayList eventos){
        this.eventos = eventos;
    }
}
