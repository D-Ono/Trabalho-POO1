/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo.Modelo;

import java.io.Serializable;

/**
 *
 * @author david
 */
public class Departamento implements Serializable{
    private String codigo;
    private String nome;
    private Funcionario funcionarios[];

    public Departamento(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public Departamento() {
        codigo = "";
        nome = "";
    }
    
    public void addFuncionario(String nivel){
        
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Funcionario[] getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Funcionario[] funcionarios) {
        this.funcionarios = funcionarios;
    }
}
