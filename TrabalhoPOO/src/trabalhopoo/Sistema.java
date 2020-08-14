/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo;

import java.util.Scanner;
import trabalhopoo.Modelo.Departamento;
import trabalhopoo.Modelo.Efetivo;
import trabalhopoo.Modelo.Funcionario;
import trabalhopoo.Modelo.Substituto;
import trabalhopoo.Modelo.Tecnico;
import trabalhopoo.Modelo.Universidade;

/**
 *
 * @author david
 */
public class Sistema {

    private Universidade u;
    private Departamento departamentos[];
    private Funcionario funcionarios[];
    private int maxDepart = 0;
    private int maxFunc = 0;

    public void executar() {
        u = new Universidade();
        
        departamentos = new Departamento[10];
        funcionarios = new Funcionario[50];
        String nome;

        String menu = "MENU\n\n"
                + "Bem-vindo ao Sistema da Universidade.\n"
                + "Escolha a opção desejada:\n\n"
                + "1. Exibição Geral\n"
                + "2. Resumo de Departamentos\n"
                + "3. Funcionários com Salário Específico\n"
                + "4. Exibição de Funcionários\n"
                + "5. Exibição de Departamento\n"
                + "6. Busca de Funcionário\n"
                + "7. Fechar o Sistema\n";

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o nome da Universidade: ");
        nome = sc.nextLine();
        u.setNome(nome);
        u.exibirNome();
        
        funcionarios[0] = new Tecnico("111", "David", 1000, "T2", "Idiota");
        funcionarios[0].calcularSalario();
        System.out.println("Salario Tecnico David: "+ funcionarios[0].getSalario());
        funcionarios[1] = new Efetivo("112", "Manu", 1000, "D3", "Doido");
        funcionarios[1].calcularSalario();
        System.out.println("Salario Tecnico Manu: "+ funcionarios[1].getSalario());
        funcionarios[2] = new Substituto("113", "Ti", 1000, "S1", 8);
        funcionarios[2].calcularSalario();
        System.out.println("Salario Tecnico Manu: "+ funcionarios[2].getSalario());        
    }

}
