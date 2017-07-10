package control;

import java.util.ArrayList;
import model.Convidado;


/**
 *
 * @author elias.andrade
 * @UltimaModificação: 10/07/17
 */
public class Evento {
    private int id;
    private String tipo;
    private int numConvidados;
    private int tempoDuracao;
    private String local;
    private String data;
    private String descricao;
    private String horaInicio;
    private String horaTermino;
    private ArrayList<Convidado> convidados = new ArrayList<>();
    
    //Construtor da classe Evento
    public Evento(String tipo, String local, String data, String horaInicio, String horaTermino){
        this.tipo = tipo;
        this.local = local;
        this.data = data;
        this.horaInicio = horaInicio;
        this.horaTermino = horaTermino;
        //this.tempoDuracao = horaTermino - horaInicio;
    }
    
    //Getters-----------------------------------------------------------------------------------------------
    public int getId(){
        return this.id;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    public int getNumConvidados(){
        return this.numConvidados;
    }
    
    public int getTempoDuracao(){
        return this.tempoDuracao;
    }
    
    public String getLocal(){
        return this.local;
    }
    
    public String getData(){
        return this.data;
    }
    
    public String getDescricao(){
        return this.descricao;
    }
    
    public String getHoraInicio(){
        return this.horaInicio;
    }
    
    public String getHoraTermino(){
        return this.horaTermino;
    }
    
    //Setters-----------------------------------------------------------------------------------------------
    public void setId(int id){
        this.id= id;
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    public void setNumConvidados(int numConvidados){
        this.numConvidados = numConvidados;
    }
    
    public void setTempoDuracao(int tempoDuracao){
        this.tempoDuracao = tempoDuracao;
    }
    
    public void setLocal(String local){
        this.local = local;
    }
    
    public void setData(String data){
        this.data = data;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    public void setHoraInicio(String horaInicio){
        this.horaInicio = horaInicio;
    }
    
    public void setHoraTermino(String horaTermino){
        this.horaTermino = horaTermino;
    }
    
    public void verEvento(){
        System.out.println("Informações do Evento");
        System.out.println(getTipo());
        System.out.println(getLocal());
        System.out.println(getData());
        System.out.println(getHoraInicio());
        System.out.println(getHoraTermino());
    }
}
