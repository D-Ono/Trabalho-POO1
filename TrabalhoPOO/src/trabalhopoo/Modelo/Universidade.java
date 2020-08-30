/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo.Modelo;

import java.util.ArrayList;
import trabalhopoo.Dados.DataBase;

/**
 *
 * @author david
 */
public class Universidade {
    private String nome;
    private static Universidade instancia;
    private DataBase db = DataBase.getInstance();   
    private ArrayList<Departamento>departamentos = new ArrayList<Departamento>();
    private ArrayList<Funcionario>funcionarios = new ArrayList<Funcionario>();
    
    public Universidade(){
        departamentos = new ArrayList<>();
        funcionarios = new ArrayList<>();
        nome = null;
    }
    
    public void addDepartamento(String nome, String codigo){
        Departamento d = new Departamento(codigo, nome);
        departamentos.add(d);
        db.addDepartamento(d);
    }    
    
    public void addEfetivo(String nomeDepartamento, String codigo, String nome, double salario, String nivel,String titulacao, String area){
        Efetivo e = new Efetivo(codigo, nome, salario, nivel, titulacao, area);
        funcionarios.add(e);
        for (Departamento d: departamentos){
            if(d.getNome().equals(nomeDepartamento)){
                d.setFuncionarios(e);
            }
        }
        db.addEfetivo(e);
    }
    
    public void addSubstituto(String nomeDepartamento, String codigo, String nome, float salario, String nivel,String titulacao, int cargaHoraria) {
        Substituto s = new Substituto(codigo, nome, salario, nivel, titulacao, cargaHoraria);
        funcionarios.add(s);
        for(Departamento d: departamentos){
            if(d.getNome().equals(nomeDepartamento)){
                d.setFuncionarios(s);
            }
        }
    }

    public void addTecnico(String nomeDepartamento, String codigo, String nome, float salario, String nivel, String funcao) {
        Tecnico t = new Tecnico(codigo, nome, salario, nivel, funcao);
        funcionarios.add(t);
        for(Departamento d: departamentos){
            if(d.getNome().equals(nomeDepartamento)){
                d.setFuncionarios(t);
            }
        }
    }
    
    public boolean existeDepartamento(String nome){
        for (Departamento d: departamentos){
            if(d.getNome().equals(nome))
                return true;
        }
        return false;
    }
    
    public static Universidade getInstance(){
        if(instancia == null)
            instancia = new Universidade();
        return instancia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Departamento> getDepartamentos() {
        return departamentos;
    }


    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }    
    
}
