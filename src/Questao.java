/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucas
 */
public abstract class Questao {
    private String pergunta;
    private double peso;

    abstract String retornaQuestao(int i);
        
    public String getPergunta() {
        return pergunta;
    }


    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public double getPeso() {
        return peso;
    }

 
    public void setPeso(double peso) {
        this.peso = peso;
    }
}
