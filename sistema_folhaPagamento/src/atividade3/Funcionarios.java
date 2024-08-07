package atividade3;

public abstract class Funcionarios {
    //atributos
    private String nome, cpf, endereco, telefone, setor;
    
    //construtor
    public Funcionarios(String nome, String cpf, String endereco, String telefone, String setor) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.setor = setor;
    }
    
    //métodos
    public abstract double mostrarSalario();
    
    public abstract void aplicarAumento(int porcentagem);
    
    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + telefone);
        System.out.println("Setor: " + setor);
    }
    
    public abstract void pagamentoAposAumento();
    
    //getters
    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public String getEndereco() {
        return endereco;
    }
    public String getTelefone() {
        return telefone;
    }
    public String getSetor() {
        return setor;
    }
    
}
