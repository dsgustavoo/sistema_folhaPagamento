package atividade3;

public class Horistas extends Funcionarios {
    private int horasTrabalhadas; 
    private double valorHora, valorTotal, valorAtualizado;

    public Horistas(String nome, String cpf, String endereco, String telefone, String setor, int horasTrabalhadas, double valorHora) {
        super(nome, cpf, endereco, telefone, setor);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    @Override
    public double mostrarSalario() {
        valorTotal = horasTrabalhadas * valorHora;
        return valorTotal;
    }

    @Override
    public void aplicarAumento(int porcentagem) {
        double aumento = valorTotal * ((double)porcentagem/100);
        valorAtualizado = valorTotal + aumento;
    }
    
    @Override
    public void mostrarDados(){
        super.mostrarDados();
        System.out.println("Horas trabalhadas: " + horasTrabalhadas + ", valor por hora: R$" + valorHora + ". Total a receber: R$" + mostrarSalario());
    }
    
    @Override
    public void pagamentoAposAumento() {
        System.out.println("Valor atualizado com o aumento: R$" + valorAtualizado);
    }
}
