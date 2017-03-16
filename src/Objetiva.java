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
