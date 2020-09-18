/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo.Dados;

import java.io.Serializable;
/**
 *
 * @author david
 */
public class ArquivosSalvar implements Serializable{
    private static String arquivoFuncionarios = ".\\funcionarios.dat";
    private static String arquivoDepartamentos = ".\\departamentos.dat";

    public static String getArquivoFuncionarios() {
        return arquivoFuncionarios;
    }

    public static void setArquivoFuncionarios(String arquivoFuncionarios) {
        ArquivosSalvar.arquivoFuncionarios = arquivoFuncionarios;
    }

    public static String getArquivoDepartamentos() {
        return arquivoDepartamentos;
    }

    public static void setArquivoDepartamentos(String arquivoDepartamentos) {
        ArquivosSalvar.arquivoDepartamentos = arquivoDepartamentos;
    }
    
    
    
}
