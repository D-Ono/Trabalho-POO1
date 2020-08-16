/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo.Modelo;

import java.util.Scanner;
import trabalhopoo.Dados.DataBase;


/**
 *
 * @author david
 */
public class Sistema {
    private static Sistema instancia;
    private DataBase db = new DataBase();
    
    public void addDepartamento(String nome, String codigo){
        Departamento d = new Departamento(codigo, nome);
        db.addDepartamento(d);
    }
    
    public String getNomeDepartamento(){
        return db.getNomeDepartamento();
    }

    public String getCodigoDepartamento(){
        return db.getCodigoDepartamento();
    }
    
    public static Sistema getInstance(){
        if(instancia == null)
            instancia = new Sistema();
        return instancia;
    }
    
}
