package Empregado;
public class Programador extends Empregado {
     String nome;
     String matricula;
     float qtdeHoras;
     float valorHora;

    public Programador (String n, String m, float qH, float vH) {
        this.nome = n;
        this.matricula = m;
        this.qtdeHoras = qH;
        this.valorHora = vH;
    }

     String getNome() {
        return nome;
    }

     String getMatricula() {
        return matricula;
    }

     float calculaSalario() {
        return qtdeHoras * valorHora;
    }
}