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

    public Efetivo(String codigo, String nome, double salario, String nivel, String area) {
        super(codigo, nome, salario, nivel);
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
        salario = salarioFinal + adicional;
        
        return salarioFinal;

    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
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
