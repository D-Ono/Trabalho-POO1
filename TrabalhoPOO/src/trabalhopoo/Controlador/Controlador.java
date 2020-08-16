/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo.Controlador;

import trabalhopoo.Modelo.Departamento;
import trabalhopoo.Modelo.Sistema;

/**
 *
 * @author david
 */
public class Controlador {
    private Sistema s = Sistema.getInstance();
    
    public void addDepartamento(String nome, String codigo){
        s.addDepartamento(nome, codigo);
    }

    public String getNomeD(){
        return s.getNomeDepartamento();
    }
    
    public String getCodigoD(){
        return s.getCodigoDepartamento();
    }
    
}
