/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo.Modelo;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author david
 */
public class Departamento implements Serializable{
    private String codigo;
    private String nome;
    private float gasto;
    private int quantFuncionarios;
    private ArrayList<Funcionario>funcionarios = new ArrayList<Funcionario>();

    public Departamento(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        this.gasto = 0.0f;
        this.quantFuncionarios = 0;
    }

    public Departamento() {
        codigo = "";
        nome = "";
        gasto = 0.0f;
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

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Funcionario funcionarios) {
        this.funcionarios.add(funcionarios);   
    }

    public float getGasto() {
        return gasto;
    }

    public void setGasto(float gasto) {
        this.gasto = gasto;
    }

    
    
    public int getQuantFuncionarios() {
        return quantFuncionarios;
    }

    public void setQuantFuncionarios(int quantFuncionarios) {
        this.quantFuncionarios = quantFuncionarios;
    }
    
    

}
