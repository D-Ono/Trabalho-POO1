/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo.Modelo;

import java.io.Serializable;
import trabalhopoo.Dados.Adicionais;

/**
 *
 * @author david
 */
public class Tecnico extends Funcionario implements Serializable {
    private String funcao;
    private final Adicionais c = new Adicionais();

    public Tecnico(String codigo, String nome, double salario, String nivel, String funcao) {
        super(codigo, nome, salario, nivel);
        this.funcao = funcao;
    }  
        
    @Override
    public float calcularSalario(){
        float salarioFinal = (float) salario;
        
        if("T1".equals(nivel)) {
            salarioFinal = (float) (salarioFinal + (salario* c.t1));
        } 
        else { 
            salarioFinal = (float) (salarioFinal + (salario* c.t2));
        } 
        salario = salarioFinal;
        return salarioFinal;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
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

    @Override
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    
    
}
