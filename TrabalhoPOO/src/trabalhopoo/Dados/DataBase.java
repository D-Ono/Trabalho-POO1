/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo.Dados;

import trabalhopoo.Modelo.Departamento;
import trabalhopoo.Modelo.Efetivo;
import trabalhopoo.Modelo.Funcionario;

/**
 *
 * @author david
 */
public class DataBase {
    private static DataBase instancia;
    private Funcionario funcionarios[];
    private Departamento departamentos[];
    private static final int MAX_FUNCIONARIO = 100;
    private static final int MAX_DEPARTAMENTO = 100;
    private int contadorD; //contador Departamentos
    private int contadorF;  // Contador Funcionarios

    public DataBase() {
        this.funcionarios = new Funcionario[MAX_FUNCIONARIO];
        this.departamentos = new Departamento[MAX_DEPARTAMENTO];
        contadorD = 0;
        contadorF = 0;
    }
    
    public static DataBase getInstance(){
        if (instancia == null){
            instancia = new DataBase();
        }
        return instancia;
    }
    
    public void addDepartamento(Departamento d){
        if (contadorD < MAX_DEPARTAMENTO){
            departamentos[contadorD] = d;
            contadorD++;
        }
    }

    public void addEfetivo(Efetivo e){
        if(contadorF < MAX_FUNCIONARIO){
            funcionarios[contadorF] = e;
            contadorF++;
        }
    }
    
    public static DataBase getInstancia() {
        return instancia;
    }

    public Funcionario[] getFuncionarios() {
        return funcionarios;
    }

    public Departamento[] getDepartamentos() {
        return departamentos;
    }

    public static int getMAX_FUNCIONARIO() {
        return MAX_FUNCIONARIO;
    }

    public static int getMAX_DEPARTAMENTO() {
        return MAX_DEPARTAMENTO;
    }

    public int getContadorD() {
        return contadorD;
    }

    public int getContadorF() {
        return contadorF;
    }
    
}
