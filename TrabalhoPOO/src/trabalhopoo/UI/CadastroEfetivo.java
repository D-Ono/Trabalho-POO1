/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo.UI;

import javax.swing.JOptionPane;
import trabalhopoo.Controlador.Controlador;

/**
 *
 * @author david
 */
public class CadastroEfetivo extends javax.swing.JFrame {

    /**
     * Creates new form CadastroEfetivo
     */
    public CadastroEfetivo() {
        initComponents();
        jCombo.removeAllItems();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel4 = new javax.swing.JLabel();
        txtSalario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        botaoGraduacao = new javax.swing.JRadioButton();
        botaoD3 = new javax.swing.JRadioButton();
        botaoMestrado = new javax.swing.JRadioButton();
        botaoD2 = new javax.swing.JRadioButton();
        botaoDoutorado = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        botaoD1 = new javax.swing.JRadioButton();
        botaoTitular = new javax.swing.JRadioButton();
        botaoLivre = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        botaoExatas = new javax.swing.JRadioButton();
        botaoSaude = new javax.swing.JRadioButton();
        botaoHumanas = new javax.swing.JRadioButton();
        botaoBiologicas = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jCombo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setText("Salário do Docente:");

        jLabel1.setText("Titulação Do Docente:");

        jLabel5.setText("Nível do Docente:");

        buttonGroup2.add(botaoGraduacao);
        botaoGraduacao.setText("Graduação");

        buttonGroup1.add(botaoD3);
        botaoD3.setText("D3");

        buttonGroup2.add(botaoMestrado);
        botaoMestrado.setText("Mestrado");

        buttonGroup1.add(botaoD2);
        botaoD2.setText("D2");
        botaoD2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoD2ActionPerformed(evt);
            }
        });

        buttonGroup2.add(botaoDoutorado);
        botaoDoutorado.setText("Doutorado");

        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome do Docente:");

        jLabel3.setText("Código do Docente:");

        buttonGroup1.add(botaoD1);
        botaoD1.setText("D1");
        botaoD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoD1ActionPerformed(evt);
            }
        });

        buttonGroup2.add(botaoTitular);
        botaoTitular.setText("Titular");

        buttonGroup2.add(botaoLivre);
        botaoLivre.setText("Livre Docente");

        jLabel6.setText("Area Do Docente:");

        buttonGroup3.add(botaoExatas);
        botaoExatas.setText("Exatas");
        botaoExatas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExatasActionPerformed(evt);
            }
        });

        buttonGroup3.add(botaoSaude);
        botaoSaude.setText("Saúde");

        buttonGroup3.add(botaoHumanas);
        botaoHumanas.setText("Humanas");

        buttonGroup3.add(botaoBiologicas);
        botaoBiologicas.setText("Biologicas");

        jLabel7.setText("Departamento do Docente:");

        jCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoHumanas)
                    .addComponent(botaoExatas))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoSaude)
                    .addComponent(botaoBiologicas))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(botaoMestrado)
                                        .addComponent(botaoGraduacao)
                                        .addComponent(botaoDoutorado))
                                    .addComponent(jLabel1))
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botaoTitular)
                                    .addComponent(botaoLivre)))
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4))
                                        .addGap(54, 54, 54))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtSalario, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(141, 141, 141)
                                .addComponent(botaoD1)
                                .addGap(18, 18, 18)
                                .addComponent(botaoD2)
                                .addGap(18, 18, 18)
                                .addComponent(botaoD3)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoD1)
                    .addComponent(botaoD2)
                    .addComponent(botaoD3)
                    .addComponent(jLabel5))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botaoGraduacao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botaoMestrado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botaoDoutorado))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botaoLivre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botaoTitular)
                                .addGap(26, 26, 26)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(botaoExatas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botaoHumanas))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botaoBiologicas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botaoSaude)))
                        .addContainerGap(36, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoD2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoD2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoD2ActionPerformed

    private void botaoD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoD1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoD1ActionPerformed

    private void botaoExatasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExatasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoExatasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        boolean podeCadastrar = true;
        String nivel = null, titulacao = null, area = null;
        Controlador control = new Controlador();
        
        if(txtNome.getText().trim().equals("")){
            JOptionPane.showMessageDialog(this, "Insira o Nome do Docente!");
            txtNome.requestFocus();
            podeCadastrar = false;
        }
        if(txtCodigo.getText().trim().equals("")){
            JOptionPane.showMessageDialog(this, "Insira o Código do Docente!");
            txtCodigo.requestFocus();
            podeCadastrar = false;
        }
        if(txtSalario.getText().trim().equals("")){
            JOptionPane.showMessageDialog(this, "Insira o Salario do Docente!");
            txtSalario.requestFocus();
            podeCadastrar = false;
        }
        
        if(jCombo.isEnabled()){
            JOptionPane.showMessageDialog(this, "Insira o Departamento do Docente!");
            podeCadastrar = false;
        }
        if(botaoD1.isSelected()){
            nivel = "D1";
        }else if(botaoD2.isSelected()){
            nivel = "D2";
        }else if(botaoD3.isSelected()){
            nivel = "D3";
        }else{
            JOptionPane.showMessageDialog(this, "Insira o Nivel do Docente!");
            podeCadastrar = false;
        }
        
        if(botaoGraduacao.isSelected()){
            titulacao = "Graduação";
        }else if(botaoMestrado.isSelected()){
            titulacao = "Mestrado";
        }else if(botaoDoutorado.isSelected()){
            titulacao = "Doutorado";
        }else if(botaoLivre.isSelected()){
            titulacao = "Livre Docência";
        }else if(botaoTitular.isSelected()){
            titulacao = "Titular";
        }else{
            JOptionPane.showMessageDialog(this, "Insira a Titulação do Docente!");
            podeCadastrar = false;  
        }
        
        if(botaoExatas.isSelected()){
            area = "Exatas";
        }else if(botaoHumanas.isSelected()){
            area = "Humanas";
        }else if(botaoBiologicas.isSelected()){
            area = "Biologicas";
        }else if(botaoSaude.isSelected()){
            area = "Saude";
        }else{
            JOptionPane.showMessageDialog(this, "Insira a Area do Docente!");
            podeCadastrar = false;
        }
        
        if(podeCadastrar==true && control.existeDepartamento((String) jCombo.getSelectedItem())){
            control.addEfetivo((String) jCombo.getSelectedItem(), txtCodigo.getText(), txtNome.getText(), Float.parseFloat(txtSalario.getText()), nivel,titulacao, area);
            txtNome.setText("");
            txtCodigo.setText("");
            txtSalario.setText("");
            jCombo.setEnabled(true);
            JOptionPane.showMessageDialog(this, "Cadastro do Docente realizado com Sucesso!");
        }
        else{
            JOptionPane.showMessageDialog(this, "Departamento Inexistente!");
        }        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroEfetivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroEfetivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroEfetivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroEfetivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroEfetivo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton botaoBiologicas;
    private javax.swing.JRadioButton botaoD1;
    private javax.swing.JRadioButton botaoD2;
    private javax.swing.JRadioButton botaoD3;
    private javax.swing.JRadioButton botaoDoutorado;
    private javax.swing.JRadioButton botaoExatas;
    private javax.swing.JRadioButton botaoGraduacao;
    private javax.swing.JRadioButton botaoHumanas;
    private javax.swing.JRadioButton botaoLivre;
    private javax.swing.JRadioButton botaoMestrado;
    private javax.swing.JRadioButton botaoSaude;
    private javax.swing.JRadioButton botaoTitular;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jCombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSalario;
    // End of variables declaration//GEN-END:variables
}
