package Empregado;


public class Empregado {
    String nome;
    String matricula;

    public Empregado() {
        this.nome = "";
        this.matricula = "";
    }

    public Empregado(String n, String m) {
        this.nome = n;
        this.matricula = m;
    }

    
    String getNome() {
    return nome;
    }
    
    String getMatricula() {
        return matricula;
    }
    float calculaSalario() {
        
        return 0;
    }
}
