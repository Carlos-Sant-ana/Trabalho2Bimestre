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
public class ContaCorrente extends ContaBancaria implements Imprimivel
{
   
    double taxaDeOperacao = 0.1;
    double operacaoCC;
   
public void main(String[] args) 
{
    Scanner Ler; 
        Ler = new Scanner(System.in);
    System.out.println("Digete a operação");
    System.out.println("1 Para deposito conta corrente");
    System.out.println("2 Para saque conta corrente");

    int operacao = 0;
    switch (operacao)
    {
        case 1:
        {
            getDepositar();
        }
        case 2:
        {
            getSacar();
        }
    }

}

    @Override
    public double getDepositar() 
    {
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getSacar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void MostrarDados() 
    {
         
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
