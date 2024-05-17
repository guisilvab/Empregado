package Empregado;

public class Analista extends Empregado {
    String nome;
    String matricula;
    float[] valorPorProjeto;

    public Analista  (String n, String m, float[] vP) {
        this.nome = n;
        this.matricula = m;
        this.valorPorProjeto = vP;
    }

    String getNome() {
        return nome;
    }

    String getMatricula() {
        return matricula;
    }

    float calculaSalario() {
        float salario = 0;
        for (float valor : valorPorProjeto) {
            salario += valor;
        }
        return salario;
    }
}