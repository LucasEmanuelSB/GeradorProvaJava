
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
 
       boolean loop = true, loop2 = true;
       int opc = 0,opc2 = 0, i = 0;
       int qntDisc = 0;
       int qntObj = 0;
       
       Scanner input = new Scanner(System.in);
       
       System.out.print("Local da prova: ");
       m1.setLocal(input.nextLine());
       System.out.print("Data da aplicacao: ");
       m1.setData(input.nextLine());
       System.out.print("Disciplina: ");
       m1.setNomeDisciplina(input.nextLine());
       System.out.print("Peso total: ");
       m1.setPeso(Integer.parseInt(input.nextLine()));
       
       while(loop2 == true){
       do{
           
           System.out.println("Escolha o tipo da questão, digite: ");
           
           try{
               
               System.out.println("1 para discursiva, 2 para objetiva");
               opc = Integer.parseInt(input.nextLine());
               
               if(opc > 2 || opc < 1){
                   loop = true;
                   System.out.print("Numero invalido. Digite novamente");
               }
               else{
                   loop = false;
               }
           } catch(Exception erro){
               loop = true;
               System.out.print("Erro!");
           }
       }while(loop == true);
       
       if(opc == 1){
           Discursiva questao = new Discursiva();
           System.out.print(i+1+"o questão: ");
           questao.setPergunta(input.nextLine());
           System.out.print("PESO: ");
           questao.setPeso(Double.parseDouble(input.nextLine()));
           System.out.print("Criterio de avaliacao: ");
           questao.setCriterioDeCorrecao(input.nextLine());
           m1.questoes.add(questao);
       } else {
           Objetiva questao = new Objetiva();
           System.out.print(i+1+"o questão: ");
           questao.setPergunta(input.nextLine());
           System.out.print("PESO: ");
           questao.setPeso(Double.parseDouble(input.nextLine()));
           System.out.print("Informe as 5 opcoes da questao:\n");
           for(int j = 0; j < 5; j++){
               System.out.print(j+1+"o OPCAO: ");
              questao.setOpcoes(j,input.nextLine());
           }
           System.out.print("\nIndice da resposta correta: ");
           questao.setRespostaCorreta(Integer.parseInt(input.nextLine()));
           m1.questoes.add(questao);
       }

       do{
            System.out.println("Deseja adicionar mais uma pergunta a prova:");
           
           try{
               
               System.out.println("1 para sim, 2 para nao...");
               opc2 = Integer.parseInt(input.nextLine());
               
               if(opc2 > 2 || opc2 < 1){
                   loop = true;
                   System.out.println("Numero invalido. Digite novamente");
               }
               else{
                   loop = false;
               }
           } catch(Exception erro){
               loop = true;
               System.out.print("Erro!");
           }
       }while(loop == true);
       
       if(opc2 == 1)
           loop2 = true;
       else{
           loop2 = false; 
           System.out.println(m1.obtemImpressao());
       }
       
       i++;
       
       }
  
    }
}