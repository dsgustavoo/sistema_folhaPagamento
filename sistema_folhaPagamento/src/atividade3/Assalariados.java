package atividade3;

public class Assalariados extends Funcionarios{
    private double salario, valorAtualizado;
    
    public Assalariados(String nome, String cpf, String endereco, String telefone, String setor, double salario) {
        super(nome, cpf, endereco, telefone, setor);
        this.salario = salario;
    }

    @Override
    public double mostrarSalario() {
        return salario;
    }

    @Override
    public void aplicarAumento(int porcentagem) {
        double aumento = salario * ((double)porcentagem / 100);
        valorAtualizado = salario + aumento;
    }
    
    @Override
    public void mostrarDados(){
        super.mostrarDados();
        System.out.println("Salário mensal: R$" + salario);
    }
    
    @Override
    public void pagamentoAposAumento() {
        System.out.println("Valor atualizado com o aumento: R$" + valorAtualizado);
    }
}
