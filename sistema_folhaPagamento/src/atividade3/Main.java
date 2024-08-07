package atividade3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList <Funcionarios> funcionarios = new ArrayList<Funcionarios>();
        
        //instanciando
        while (true) {
            System.out.println("Digite 1 para funcionário assalariado, 2 para horista ou 3 para sair.");
            int tipo = input.nextInt();
            input.nextLine();
            
            if (tipo == 3) {
                break;
            }
            
            System.out.println("Digite o nome do funcionário: ");
            String nome = input.nextLine();
            
            System.out.println("Digite o CPF: ");
            String cpf = input.nextLine();
            
            System.out.println("Digite o endereço: ");
            String endereco = input.nextLine();
            
            System.out.println("Digite o telefone: ");
            String telefone = input.nextLine();
            
            System.out.println("Informe o setor: ");
            String setor = input.nextLine();
            
            switch (tipo) {
                case 1:
                    System.out.println("Informe o salário mensal (R$): ");
                    double salario = input.nextDouble();
                    funcionarios.add(new Assalariados (nome, cpf, endereco, telefone, setor, salario));
                    break;
                case 2:
                    System.out.println("Informe a quantidade de horas trabalhadas: ");
                    int horasTrabalhadas = input.nextInt();
                    System.out.println("Informe o valor da hora (R$): ");
                    double valorHora = input.nextDouble();
                    funcionarios.add(new Horistas (nome, cpf, endereco, telefone, setor, horasTrabalhadas, valorHora));
                    break;
                default:
                    System.out.println("Tipo inválido, digite 1 para assalariado ou 2 para horista.");
                    break;
            }
        }
        
        //mostrando os dados antes do aumento
        System.out.println("\nDados dos funcionários: ");
        for (int i = 0; i < funcionarios.size(); i++) {
            funcionarios.get(i).mostrarDados();
            System.out.println("\n");
        }
        
        //solicitando o aumento
        System.out.println("Digite o percentual de aumento para todos os funcionários (somente número) ");
        int porcentagem = input.nextInt();
        
        for (int i = 0; i < funcionarios.size(); i++) {
            funcionarios.get(i).aplicarAumento(porcentagem);
        }
        
        //mostrando os dados após o aumento
        for (int i = 0; i < funcionarios.size(); i++) {
            funcionarios.get(i).mostrarDados();
            funcionarios.get(i).pagamentoAposAumento();
            System.out.println("\n");
        } 
    }
}
