/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

import Classes.*;
import DAO.Comandos;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Imagens.Imagem;

/**
 *
 * @author mello
 */
public class TelaLogin extends javax.swing.JFrame {
    Comandos comandos;
    /**
     * Creates new form Tela_login
     * @param comandos
     * @throws java.sql.SQLException
     */
    public TelaLogin(Comandos comandos) throws SQLException{
        initComponents();
        this.setIconImage(new Imagem().getImage("icon.png"));
        
        this.comandos = comandos;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLogin = new javax.swing.JLabel();
        lblCPF = new javax.swing.JLabel();
        txtCPF = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("EST 1.0");
        setResizable(false);

        lblLogin.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogin.setText("Login");

        lblCPF.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        lblCPF.setText("CPF.:");

        txtCPF.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        txtCPF.setActionCommand("<Not Set>");
        txtCPF.setMaximumSize(new java.awt.Dimension(7, 20));
        txtCPF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCPFKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCPFKeyTyped(evt);
            }
        });

        lblSenha.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        lblSenha.setText("Senha.:");

        txtSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSenhaKeyPressed(evt);
            }
        });

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(lblLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLogin)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblCPF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCPF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblSenha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lblLogin)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCPF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSenha)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnLogin)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        btnLogin.setActionCommand("Login");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // coleta os valores dos campos cpf e senha
        String senha = String.valueOf(txtSenha.getPassword());
        String cpf = String.valueOf(txtCPF.getText()).trim().replace(".", "").replace("-", "");
        
        // valida o cpf
        boolean isCpfValid;
        isCpfValid = validaCpf(cpf);
        
        // hasheia no padrao SHA512 a senha e o cpf para checagem posterior no banco
        SHA512 hash = new SHA512();
        try {
            senha = hash.toHexStr(hash.obtainSHA(senha));
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(TelaLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // se o cpf for valido tenta logar
        if (isCpfValid) {
            try {
                // coleta os dados do usuario com base na senha + cpf
                Funcionario funcionario = comandos.login(cpf, senha);
                if (funcionario != null) {
                    if (funcionario.getCargo().equals("GERENTE") || funcionario.getCargo().equals("VENDEDOR")){
                        new TelaPrincipal(comandos, funcionario).setVisible(true);
                        dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "Cargo não registrado no sistema!\nFavor comunicar o gerente.", "Falha ao logar", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "CPF ou senha inválido(a)!", "Falha ao logar", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex, null, JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaKeyPressed
        // se 'ENTER' for pressionado, executa a acao do botao de login
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            btnLogin.doClick();
        }
    }//GEN-LAST:event_txtSenhaKeyPressed

    private void txtCPFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCPFKeyPressed
        // se 'ENTER' for pressionado, executa a acao do botao de login
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            btnLogin.doClick();
        }
    }//GEN-LAST:event_txtCPFKeyPressed

    private void txtCPFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCPFKeyTyped
        char letra = evt.getKeyChar();
        if ((((letra < '0') || (letra > '9')) && (letra != KeyEvent.VK_BACK_SPACE)) || txtCPF.getText().length() >= 11){
            evt.consume();
        }
    }//GEN-LAST:event_txtCPFKeyTyped

    // metodo para validar o cpf, so retorna true se o valor nao for nulo e atender ao RegEx
    private boolean validaCpf(String cpf) {
        if (cpf.isEmpty()){
            JOptionPane.showConfirmDialog(null, "O CPF não pode ser nulo!", null, JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (!cpf.matches("([0-9]{3}[\\.]?[0-9]{3}[\\.]?[0-9]{3}[-]?[0-9]{2})")){
            JOptionPane.showConfirmDialog(null, "O CPF não tem um formato válido!", null, JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        return true;
    }
    
    public static void main(String args[]) throws SQLException, IOException {
        Comandos comandos = new Comandos();
        
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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TelaLogin(comandos).setVisible(true);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex, "ERRO", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
