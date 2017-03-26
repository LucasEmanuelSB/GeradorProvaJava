/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucas
 */
public class Objetiva extends Questao{
    public String[] opcoes = new String[5];
    private int respostaCorreta; 
    
    public String retornaQuestao(int i){
     String questao = "";
        
        questao += "\nQuestao: "+(i+1)+"o: "+this.getPergunta()+"";
        questao += "\nA) "+this.opcoes[0];
        questao += "\nB) "+this.opcoes[1];
        questao += "\nC) "+this.opcoes[2];
        questao += "\nD) "+this.opcoes[3];
        questao += "\nE) "+this.opcoes[4];
        questao += "\n";
        
        return questao;
    }
    
    public void setOpcoes(int i,String opcoes) {
        this.opcoes[i] = opcoes;
    }


    public int getRespostaCorreta() {
        return respostaCorreta;
    }

    public void setRespostaCorreta(int respostaCorreta) {
        this.respostaCorreta = respostaCorreta;
    }
}
