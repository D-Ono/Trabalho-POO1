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
public class Efetivo extends Docente implements Serializable {
    private String area;
    private final Adicionais c = new Adicionais();

    Efetivo(String codigo, String nome, double salario, String nivel,String titulacao, String area) {
        super(codigo, nome, salario, nivel, titulacao);
        this.salario = calcularSalario();
        this.area = area;
    }

    
    @Override
    public float calcularSalario() {
        float salarioFinal = (float) salario, adicional = 0;
        
        adicional = (float) (salario * c.adicionalEfetivo);
        if("D1".equals(nivel)){
            salarioFinal = (float) (salarioFinal + (salario* c.d1));
        }
        else if("D2".equals(nivel)){
            salarioFinal = (float) (salarioFinal + (salario* c.d2));
        }
        else{
            salarioFinal = (float) (salarioFinal + (salario* c.d3));
        }
        salarioFinal = salarioFinal + adicional;
        
        return salarioFinal;

    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String getTitulacao() {
        return titulacao;
    }

    @Override
    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    @Override
    public String getCodigo() {
        return codigo;
    }

    @Override
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public double getSalario() {
        return salario;
    }

    @Override
    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String getNivel() {
        return nivel;
    }

    @Override
    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

}
