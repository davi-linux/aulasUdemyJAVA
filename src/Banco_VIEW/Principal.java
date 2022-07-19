package Banco_VIEW;

import dados_DTO.DadosBancarios;
import java.util.Locale;
import java.util.Scanner;

/**
 * Classe criada para receber dados dos usuarios
 *
 * @author Mr.Mendes
 */
public class Principal {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        DadosBancarios db = new DadosBancarios();

        Scanner user = new Scanner(System.in);
        System.out.println("Digite o numero da conta");
        int conta = user.nextInt();
        db.setConta(conta);
        System.out.println("Digite seu nome");
        String nome = user.next();
        db.setNome(nome);
        System.out.println("Deseja depositar algum valor");
        System.out.println("S (Sim) or N (Não)");
        char dep = user.next().charAt(0);
        double depositar;

        switch (dep) {
            case 's':

                System.out.println("Digite o valor a depositar");
                depositar = user.nextDouble();
                db.setDeposito(depositar);
                
                break;

            case 'Y':

                System.out.println("Digite o valor a depositar");
                depositar = user.nextDouble();
                db.setDeposito(depositar);

            case 'n':

                break;

            case 'N':

                break;

            default:

                System.out.println("Opção invalida");
                System.out.println("Escolha a opçao desejada");
                System.out.println("S (Sim) or N (Não)");

        }
        
        System.out.println("Dados da conta:");
        System.out.println("Conta: " + db.getConta() 
                + " Nome: " + db.getNome()
                + " Saldo: " + db.getDeposito());
        

        

    }

}
