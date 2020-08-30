/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo.Modelo;

import trabalhopoo.Dados.Adicionais;

/**
 *
 * @author david
 */
public class Substituto extends Docente{
    private int cargaHoraria;
    private final Adicionais c = new Adicionais();

    public Substituto(String codigo, String nome, double salario, String nivel,String titulacao, int cargaHoraria) {
        super(codigo, nome, salario, nivel, titulacao);
        this.salario = calcularSalario();
        this.cargaHoraria = cargaHoraria;
    }

    
    @Override
    public float calcularSalario() {
        float salarioFinal = (float) salario;
        
        if("S1".equals(nivel)) {
            salarioFinal = (float) (salarioFinal + (salario* c.s1));
        } 
        else { 
            salarioFinal = (float) (salarioFinal + (salario* c.s2));
        } 
        salario = salarioFinal;
        return salarioFinal;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
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
