
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
       
       m1.listaDiscursiva = new Discursiva[qntDisc];
       
       for(int i = 0; i < qntDisc; i++){
           m1.listaDiscursiva[i] = new Discursiva();
           System.out.print(i+1+"o questão: ");
           m1.listaDiscursiva[i].setPergunta(input.nextLine());
           System.out.print("PESO: ");
           m1.listaDiscursiva[i].setPeso(Double.parseDouble(input.nextLine()));
           System.out.print("Criterio de avaliacao: ");
           m1.listaDiscursiva[i].setCriterioDeCorrecao(input.nextLine());
           m1.setListaDiscursiva(m1.listaDiscursiva[i], i);
       }
       
       System.out.print("Quantidade de perguntas objetivas: ");
       qntObj = Integer.parseInt(input.nextLine());
       
       m1.listaObjetiva = new Objetiva[qntObj];
       
       for(int i = 0; i < qntObj; i++){
           m1.listaObjetiva[i] = new Objetiva();
           System.out.print(i+1+"o questão: ");
           m1.listaObjetiva[i].setPergunta(input.nextLine());
           System.out.print("PESO: ");
           m1.listaObjetiva[i].setPeso(Double.parseDouble(input.nextLine()));
           System.out.print("Informe as 5 opcoes da questao:\n");
           for(int j = 0; j < 5; j++){
               System.out.print(j+1+"o OPCAO: ");
              m1.listaObjetiva[i].setOpcoes(j,input.nextLine());
           }
           System.out.print("\nIndice da resposta correta: ");
           m1.listaObjetiva[i].setRespostaCorreta(Integer.parseInt(input.nextLine()));
           m1.setListaObjetiva(m1.listaObjetiva[i], i);
       }
       
       System.out.println(m1.obtemImpressao(qntDisc, qntObj));
       
}
}