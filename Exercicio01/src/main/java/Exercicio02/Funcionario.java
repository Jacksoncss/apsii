package Exercicio02;

public class Funcionario {

    protected String nome;
    protected String matricula;
    protected String dataAdmissao;
    protected double salarioBase;

    public Funcionario(String nome, String matricula, double salarioBase,
                       String dataAdmissao) {
        this.nome = nome;
        this.matricula = matricula;
        this.salarioBase = salarioBase;
        this.dataAdmissao = dataAdmissao;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double calcularSalario() {
        return salarioBase;
    }

    public double calcularDesconto() {
        return salarioBase * 0.08;
    }

    @Override
    public String toString() { double
            liquido = calcularSalario() - calcularDesconto();
        return String.format( "%s [%s] - Salário: R$ %.2f | Desconto: R$ %.2f | Líquido: R$ %.2f", nome, matricula,
        calcularSalario(), calcularDesconto(), liquido );
    }
}