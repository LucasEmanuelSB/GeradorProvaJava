/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucas
 */
public class Discursiva extends Questao{
    
     private String criterioDeCorrecao;
     
     public String retornaQuestao(int i, int qnt){
         String questao = "";
        
        questao += "Questao "+(i+1+qnt)+"o: "+this.getPergunta();
        questao += "\nResposta: _______________________________\n_________________________________________\n_________________________________________\n";
        questao += "Criterio de avaliacao: "+this.getCriterioDeCorrecao()+"\n\n";
        
        return questao;
    }

    public String getCriterioDeCorrecao() {
        return criterioDeCorrecao;
    }

    public void setCriterioDeCorrecao(String criterioDeCorrecao) {
        this.criterioDeCorrecao = criterioDeCorrecao;
    }
}

