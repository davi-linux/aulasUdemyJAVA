package dados_DTO;

import java.util.Scanner;

/**
 * Exercicio de fixação que simula uma operaçao bancaria
 *
 * @author Mr.Mendes
 * @since 15/07/2022
 */
public class DadosBancarios {

    private String nome;
    private int conta;
    private double deposito;
    
    public DadosBancarios(){
    }
/*
    public DadosBancarios(String nome, int conta, double deposito) {
        this.nome = nome;
        this.conta = conta;
        this.deposito = deposito;
    }
*/
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public void setDeposito (double deposito){
    this.deposito = deposito;
    }
    
    public String getNome() {
        return nome;
    }

    public int getConta() {
        return conta;
    }

    public double getDeposito() {
        return deposito;
    }

    //*******METODOS********\\
   

       
    
}
