/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo.Controlador;

import java.util.ArrayList;
import trabalhopoo.Modelo.Departamento;
import trabalhopoo.Modelo.Funcionario;
import trabalhopoo.Modelo.Universidade;

/**
 *
 * @author david
 */
public class Controlador {
    private Universidade s = Universidade.getInstance();
    
    public void addDepartamento(String nome, String codigo){
        s.addDepartamento(nome, codigo);
    }

    public ArrayList<Departamento> buscaDepartamento(){
        return s.getDepartamentos();
    }
    
    public void addEfetivo(String nomeDepartamento, String codigo, String nome, double salario, String nivel,String titulacao, String area){
        s.addEfetivo(nomeDepartamento, codigo, nome, salario, nivel,titulacao, area);
    }
    
    public boolean existeDepartamento(String nome){
        return s.existeDepartamento(nome);
    }
    
    public ArrayList<Funcionario> buscaFuncionario(){
        return s.getFuncionarios();
    }

    public void addSubstituto(String nomeDepartamento, String codigo, String nome, float salario, String nivel, String titulacao, int cargaHoraria) {
        s.addSubstituto(nomeDepartamento, codigo, nome, salario, nivel,titulacao, cargaHoraria);
    }

    public void addTecnico(String nomeDepartamento, String codigo, String nome, float salario, String nivel, String funcao) {
        s.addTecnico(nomeDepartamento, codigo, nome, salario, nivel, funcao);
    }
    
    public String relatorioGeral(){
        return s.relatorioGeral();
    }
    
    public String relatorioDepartamento(){
        return s.relatorioDepartamentos();
    }
    
    public String relatorioFuncionarios(){
        return s.relatorioFuncionario();
    }
    
    public String relatorioDocente(){
        return s.relatorioDocentes();
    }
    
    public String relatorioTecnico(){
        return s.relatorioTecnico();
    }
    
    public String relatorioEfetivo(){
        return s.relatorioEfetivo();
    }
    
    public String relatorioSubstituto(){
        return s.relatorioSubstituto();
    }
    
    public void setNomeUniversidade(String nome){
        s.setNome(nome);
    }
    
    public String getNomeUniversidade(){
        return s.getNome();
    }
}
