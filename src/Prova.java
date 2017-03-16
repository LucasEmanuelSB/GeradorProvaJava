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
    
    private Discursiva[] listaDiscursiva = new Discursiva[10];
    private Objetiva[] listaObjetiva = new Objetiva[10];
       
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

    public void setListaDiscursiva(Discursiva questaoNova, int i) {
        this.listaDiscursiva[i] = questaoNova;
    }

    public void setListaObjetiva(Objetiva questaoNova, int i) {
        this.listaObjetiva[i] = questaoNova;
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
    
    public String getDiscursiva(int i,int qntObj){
        String questao = "";
        
        questao += "Questao "+(i+1+qntObj)+"o: "+listaDiscursiva[i].getPergunta();
        questao += "\nResposta: _______________________________\n_________________________________________\n_________________________________________\n";
        questao += "Criterio de avaliacao: "+listaDiscursiva[i].getCriterioDeCorrecao()+"\n\n";
        
        return questao;
    }
    
    public String getObjetiva(int i){
        String questao = "";
        
        questao += "\nQuestao: "+(i+1)+"o: "+listaObjetiva[i].getPergunta()+"";
        questao += "\nA) "+listaObjetiva[i].opcoes[0];
        questao += "\nB) "+listaObjetiva[i].opcoes[1];
        questao += "\nC) "+listaObjetiva[i].opcoes[2];
        questao += "\nD) "+listaObjetiva[i].opcoes[3];
        questao += "\nE) "+listaObjetiva[i].opcoes[4];
        questao += "\n\n";
        
        return questao;
    }
    
    public String obtemImpressao(int qntDisc, int qntObj){
        
        String impressao = "";
        
        impressao += obtemDetalhes();
        impressao += ("\n\n\t\t PROVA M1");
        
        for(int i = 0; i < qntObj; i++)
            impressao += getObjetiva(i);
            
        for(int i = 0; i < qntDisc; i++)
            impressao += getDiscursiva(i,qntObj);
        
        return impressao;
    }

    
}
