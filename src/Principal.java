
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 6109896
 */
public class Principal {
    public static void main(String args[]){
       
       Prova m1 = new Prova();
       
       Discursiva questaoD = new Discursiva();
       Objetiva questaoO = new Objetiva();
       
       Scanner input = new Scanner(System.in);
       int qntDisc, qntObj;
       
       System.out.print("Local da prova: ");
       m1.setLocal(input.nextLine());
       System.out.print("Data da aplicacao: ");
       m1.setData(input.nextLine());
       System.out.print("Disciplina: ");
       m1.setNomeDisciplina(input.nextLine());
       System.out.print("Peso total: ");
       m1.setPeso(Integer.parseInt(input.nextLine()));
  
       System.out.print("Quantidade de perguntas discursivas: ");
       qntDisc = Integer.parseInt(input.nextLine());
       
       for(int i = 0; i < qntDisc; i++){
           System.out.print(i+1+"o questão: ");
           questaoD.setPergunta(input.nextLine());
           System.out.print("PESO: ");
           questaoD.setPeso(Double.parseDouble(input.nextLine()));
           System.out.print("Criterio de avaliacao: ");
           questaoD.setCriterioDeCorrecao(input.nextLine());
           m1.setListaDiscursiva(questaoD, i);
       }
       
       System.out.print("Quantidade de perguntas objetivas: ");
       qntObj = Integer.parseInt(input.nextLine());
       
       for(int i = 0; i < qntObj; i++){
           System.out.print(i+1+"o questão: ");
           questaoO.setPergunta(input.nextLine());
           System.out.print("PESO: ");
           questaoO.setPeso(Double.parseDouble(input.nextLine()));
           System.out.print("Informe as 5 opcoes da questao:\n");
           for(int j = 0; j < 5; j++){
               System.out.print(j+1+"o OPCAO: ");
              questaoO.setOpcoes(j,input.nextLine());
           }
           System.out.print("\nIndice da resposta correta: ");
           questaoO.setRespostaCorreta(Integer.parseInt(input.nextLine()));
           m1.setListaObjetiva(questaoO, i);
       }
       
       System.out.println(m1.obtemImpressao(qntDisc, qntObj));
       
}
}