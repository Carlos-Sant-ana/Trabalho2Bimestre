/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.pkg2.bimestre;

import java.util.Scanner;

/**
 *
 * @author Cliente
 */
abstract class ContaBancaria 
{

    Scanner Ler = new Scanner(System.in);
    int NumeroConta, tipo;
    double saldo, taxaDeOperacao = 0.1,operacaoCC, limite;

    public int getNumeroConta() {
        return NumeroConta;
    }

    public void setNumeroConta(int NumeroConta) {
        this.NumeroConta = NumeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
      
    public abstract double getSacar();
    {
        System.out.println("1 para sacar da conta corrente 2 para sacar da contra poupança");
         Ler.nextInt(tipo);   
        switch (tipo)
                
    {
        case 1:
        {
         System.out.println("Digete o deposito desejado");
         Ler.nextInt((int) operacaoCC);
         if (saldo > operacaoCC)
         {
         saldo = (taxaDeOperacao * operacaoCC) + this.saldo;
         System.out.println("Operaçao Concluida"); 
        }
         else
         System.out.println("Saldo insuficiente");
        }
        case 2:
        {
         System.out.println("Digete o deposito desejado");
         Ler.nextInt((int) operacaoCC);
         if ((saldo+limite) > operacaoCC)
         {
             saldo = saldo - operacaoCC;
         System.out.println("Operaçao Concluida"); 
         }
         else 
             System.out.println("Saldo Insuficiente");
         }
        }
    }
  

    public abstract double getDepositar();
    {
        System.out.println("1 para depositar da conta corrente 2 para depositar da contra poupança");
         Ler.nextInt(tipo);   
        switch (tipo)
                
    {
        case 1:
        {
         System.out.println("Digete o deposito desejado");
         Ler.nextInt((int) operacaoCC);
         saldo = operacaoCC + saldo;
         System.out.println("Operaçao Concluida"); 
         
        }
        case 2:
        {
         System.out.println("Digete o deposito desejado");
         Ler.nextInt((int) operacaoCC);
             saldo = saldo + operacaoCC;
          System.out.println("Operaçao Concluida");   
        }
        }
    }
        

}
