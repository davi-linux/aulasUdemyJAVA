package Pessoa;

/**
 *
 * @author Mr-mendes
 */
public class Pessoas {

    String name;
    int idade;
    double altura;

    public Pessoas(String name, int idade, double altura) {

        this.name = name;
        this.idade = idade;
        this.altura = altura;

    }

    public void setName(String name) {
        this.name = name;

    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAltura(double altura) {
        this.altura = altura;

    }

    public String getName() {
        return name;

    }
    
    

}
