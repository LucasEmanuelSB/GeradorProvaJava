/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author 6109896
 */
public class Prova {
    
    private String nomeDisciplina;
    private int peso;
    private String local;
    private String data;
    
    public ArrayList<Questao> questoes = new ArrayList<Questao>();
    
    /*public Discursiva listaDiscursiva[];
    public Objetiva listaObjetiva*/
       
   
    public String getNomeDisciplina(){
        return this.nomeDisciplina;
    }
    
    public void setNomeDisciplina(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
    }
    
    public int getPeso(){
        return this.peso;
    }
    
    public void setPeso(int peso){
        this.peso = peso;
    }
    
    public String getLocal(){
        return this.local;
    }
    
    public void setLocal(String local){
        this.local = local;
    }
    
    public String getData(){
        return this.data;
    }
    
    public void setData(String data){
        this.data = data;
    }
    
    public String obtemDetalhes(){
        String cabecalho = "";
        
        cabecalho +=  "\nNome:____________________________\n";
        cabecalho +=  this.nomeDisciplina + "\t";
        cabecalho +=  this.local+ "\t";
        cabecalho +=  this.peso+ "\t";
        cabecalho +=  this.data;
               
        return cabecalho;
    }
    
    public String obtemImpressao(){
        
        String impressao = "";
        
        impressao += obtemDetalhes();
        impressao += ("\n\n\t\t PROVA M1");
        
        for(int i = 0; i < questoes.size(); i++){
            if(questoes.get(i) instanceof Discursiva)
                impressao += questoes.get(i).retornaQuestao(i);
            if(questoes.get(i) instanceof Objetiva)
                impressao += questoes.get(i).retornaQuestao(i);         
        }
        
        return impressao;
    }

    
}
