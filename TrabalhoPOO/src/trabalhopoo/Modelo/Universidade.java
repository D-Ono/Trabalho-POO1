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
                d.setGasto((float) salario);
                d.setFuncionarios(e);
                d.setQuantFuncionarios(d.getQuantFuncionarios()+1);
                d.setGasto((float)salario);
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
                d.setQuantFuncionarios(d.getQuantFuncionarios()+1);
                d.setGasto((float)salario);
            }
        }
    }

    public void addTecnico(String nomeDepartamento, String codigo, String nome, float salario, String nivel, String funcao) {
        Tecnico t = new Tecnico(codigo, nome, salario, nivel, funcao);
        funcionarios.add(t);
        for(Departamento d: departamentos){
            if(d.getNome().equals(nomeDepartamento)){
                d.setFuncionarios(t);
                d.setQuantFuncionarios(d.getQuantFuncionarios()+1);
                d.setGasto((float) t.getSalario());
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

    public String relatorioGeral(){
        String dados = "";
        
        for(Departamento d: departamentos){
            dados = dados + " \t Nome do Departamento: " + d.getNome() +
                        "\n Codigo do Departamento " + d.getCodigo() +
                        "\n Gasto Total com Funcionários: " + d.getGasto()
                         + "\n\t Funcionarios ";
            for(Funcionario f: d.getFuncionarios()){
                dados = dados + "\n Nome: " + f.getNome()
                              +"\n Salario: " + f.getSalario()
                              +"\n Código: " + f.getCodigo()
                              + "\n Nivel: " + f.getNivel()
                              +"\n";
                        
            }
            dados = dados + "\n\n";
        }    
        
        return dados;
    }
    
    public String relatorioDepartamentos(){
         String dados = "\t Departamentos \n";
        
        for(Departamento d: departamentos){
            dados = dados + " \n Nome do Departamento: " + d.getNome() +
                        "\n Codigo do Departamento " + d.getCodigo() +
                        "\n Gasto Total com Funcionários: " + d.getGasto()
                         + "\n Número de Funcionarios: " + d.getQuantFuncionarios();

            dados = dados + "\n\n";
        }    
        
        return dados;       
        
    }
    
    public String relatorioFuncionario(){
        String dados = "\t Funcionários \n";
        Tecnico t;
        Efetivo e;
        Substituto s;
        
        for(Funcionario f: funcionarios){
            dados = dados + "\n Nome: " + f.getNome()
                            +"\n Salario: " + f.getSalario()
                            +"\n Código: " + f.getCodigo()
                            + "\n Nivel: " + f.getNivel();
            if(f instanceof Efetivo){
                e = (Efetivo)f;
                dados = dados + "\n Titulação: " + e.getTitulacao()
                              + "\n Area: " + e.getArea();
            }
            if(f instanceof Substituto){
                s = (Substituto)f;
                dados = dados + "\n Titulação: " + s.getTitulacao()
                              + "\n Carga Horaria: " + s.getCargaHoraria();
            }
            if(f instanceof Tecnico){
                t = (Tecnico)f;
                dados = dados + "\n Função: " + t.getFuncao();
            }
            dados = dados + "\n\n";
        }    
        
        return dados;
    }
    
    public String relatorioDocentes(){
        String dados = "\t Funcionários Docentes";
        Efetivo e;
        Substituto s;
        
        for(Funcionario f: funcionarios){
            if(f instanceof Docente){
                dados = dados + "\n Nome: " + f.getNome()
                                +"\n Salario: " + f.getSalario()
                                +"\n Código: " + f.getCodigo()
                                + "\n Nivel: " + f.getNivel();
                if(f instanceof Efetivo){
                    e = (Efetivo)f;
                    dados = dados + "\n Titulação: " + e.getTitulacao()
                                  + "\n Area: " + e.getArea();
                }
                if(f instanceof Substituto){
                    s = (Substituto)f;
                    dados = dados + "\n Titulação: " + s.getTitulacao()
                                  + "\n Carga Horaria: " + s.getCargaHoraria();
                }
                dados = dados + "\n\n";
            }

            
        }    
        
        return dados;
    }
    
    public String relatorioTecnico(){
        String dados = "\t Funcionários Técnicos \n";
        Tecnico t;
        
        for(Funcionario f: funcionarios){
            if(f instanceof Tecnico){
                t = (Tecnico)f;
                dados = dados + "\n Nome: " + f.getNome()
                            +"\n Salario: " + f.getSalario()
                            +"\n Código: " + f.getCodigo()
                            + "\n Nivel: " + f.getNivel()                
                            + "\n Função: " + t.getFuncao();
                dados = dados + "\n\n";
            }
            
        }    
        
        return dados;        
    }
 
    public String relatorioEfetivo(){
        String dados = "\t Funcionários Efetivos \n";
        Efetivo e;
        
        for(Funcionario f: funcionarios){
            if(f instanceof Efetivo){
                e = (Efetivo)f;
                dados = dados + "\n Nome: " + f.getNome()
                            +"\n Salario: " + f.getSalario()
                            +"\n Código: " + f.getCodigo()
                            + "\n Nivel: " + f.getNivel()
                            + "\n Titulação: " + e.getTitulacao()
                            + "\n Area: " + e.getArea();
                dados = dados + "\n\n";
            }
        
        }    
        
        return dados;        
    }
    
    public String relatorioSubstituto(){
        String dados = "\t Funcionários Substitutos \n";
        Substituto s;
        
        for(Funcionario f: funcionarios){
            if(f instanceof Substituto){
                s = (Substituto)f;
                dados = dados + "\n Nome: " + f.getNome()
                            +"\n Salario: " + f.getSalario()
                            +"\n Código: " + f.getCodigo()
                            + "\n Nivel: " + f.getNivel()
                            + "\n Titulação: " + s.getTitulacao()
                             + "\n Carga Horaria: " + s.getCargaHoraria();
                dados = dados + "\n\n";
            }
            
        }    
        
        return dados;        
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
