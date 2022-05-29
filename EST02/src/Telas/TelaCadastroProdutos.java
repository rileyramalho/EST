/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Telas;

import Classes.Produto;
import DAO.Comandos;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mello
 */
public class TelaCadastroProdutos extends javax.swing.JDialog {
    Comandos comandos;
    String[] colunas = {"CODIGO", "PRODUTO", "QUANTIDADE", "VALOR"};
    /**
     * Creates new form TelaCadastroProdutosModal
     */
    public TelaCadastroProdutos(java.awt.Frame parent, boolean modal, Comandos comandos) {
        super(parent, modal);
        this.comandos = comandos;
        initComponents();
        
        try {
            populaTabelaProdutos();
        } catch (SQLException ex) {
            Logger.getLogger(TelaCadastroProdutos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new javax.swing.JPanel();
        lblProdutosRegistrados = new javax.swing.JLabel();
        scrollProdutos = new javax.swing.JScrollPane();
        tableProdutos = new javax.swing.JTable();
        panelBorder2 = new javax.swing.JPanel();
        lblNomeProduto = new javax.swing.JLabel();
        txtNomeProduto = new javax.swing.JTextField();
        spinQuantidade = new javax.swing.JSpinner();
        lblDescricao = new javax.swing.JLabel();
        lblValor = new javax.swing.JLabel();
        scrollDescricao = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        lblQuantidade = new javax.swing.JLabel();
        txtValor = new javax.swing.JFormattedTextField();
        panelBorder3 = new javax.swing.JPanel();
        btnRegistro = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(655, 576));
        setResizable(false);

        panelBorder1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblProdutosRegistrados.setText("Produtos registrados");

        tableProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tableProdutos.getTableHeader().setReorderingAllowed(false);
        scrollProdutos.setViewportView(tableProdutos);

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollProdutos)
                    .addComponent(lblProdutosRegistrados))
                .addContainerGap())
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblProdutosRegistrados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelBorder2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblNomeProduto.setText("Nome do Produto:");

        txtNomeProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomeProdutoKeyTyped(evt);
            }
        });

        spinQuantidade.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        lblDescricao.setText("Descrição: ");

        lblValor.setText("Valor:");

        txtDescricao.setColumns(20);
        txtDescricao.setRows(5);
        scrollDescricao.setViewportView(txtDescricao);

        lblQuantidade.setText("Quantidade: ");

        txtValor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtValor.setFocusLostBehavior(javax.swing.JFormattedTextField.COMMIT);
        txtValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValorKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panelBorder2Layout = new javax.swing.GroupLayout(panelBorder2);
        panelBorder2.setLayout(panelBorder2Layout);
        panelBorder2Layout.setHorizontalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addComponent(lblDescricao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(scrollDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE))
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addComponent(lblNomeProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(lblValor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblQuantidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spinQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelBorder2Layout.setVerticalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeProduto)
                    .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblValor)
                    .addComponent(lblQuantidade)
                    .addComponent(spinQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescricao)
                    .addComponent(scrollDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panelBorder3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnRegistro.setText("Registrar produto");
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBorder3Layout = new javax.swing.GroupLayout(panelBorder3);
        panelBorder3.setLayout(panelBorder3Layout);
        panelBorder3Layout.setHorizontalGroup(
            panelBorder3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelBorder3Layout.setVerticalGroup(
            panelBorder3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorder3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistro)
                    .addComponent(btnLimpar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBorder2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBorder3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBorder2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelBorder3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        String nomeProduto = txtNomeProduto.getText().toUpperCase().trim();
        double valor = Double.parseDouble(txtValor.getValue().toString());
        int quantidade = Integer.parseInt(spinQuantidade.getValue().toString());
        String descricao = txtDescricao.getText().toUpperCase().trim();
        
        Produto produto = new Produto(nomeProduto, quantidade, valor, descricao);
        
        try {
            long codigoProduto = comandos.insertProduto(produto);
            produto.setCodigo((int) codigoProduto);
            
            JOptionPane.showMessageDialog(null, produto.getNome() + " INSERIDO COM O CODIGO " + produto.getCodigo(), null, JOptionPane.INFORMATION_MESSAGE);
            
            limpar();
            populaTabelaProdutos();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btnRegistroActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void txtValorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorKeyTyped
        char letra = evt.getKeyChar();
        if (((letra < '0') || (letra > '9')) && (letra != KeyEvent.VK_COMMA) && (letra != KeyEvent.VK_PERIOD) && (letra != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
    }//GEN-LAST:event_txtValorKeyTyped

    private void txtNomeProdutoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeProdutoKeyTyped
        char letra = evt.getKeyChar();
        if (((letra < '0') ||  (letra > '9'))  && ((letra < 'A') || (letra > 'Z')) && ((letra < 'a') || (letra > 'z')) && (letra != KeyEvent.VK_BACK_SPACE) && (letra != KeyEvent.VK_SPACE)) evt.consume();
    }//GEN-LAST:event_txtNomeProdutoKeyTyped
    
    private void populaTabelaProdutos() throws SQLException{
        ArrayList<Produto> produtos = comandos.getProduto();
        DefaultTableModel tabela = (DefaultTableModel) tableProdutos.getModel();
        tabela.setRowCount(0);
        tabela.setColumnIdentifiers(colunas);
        
        for (Produto produto : produtos){
            tabela.addRow(new Object[]{
                produto.getCodigo(),
                produto.getNome(),
                produto.getQuantidade(),
                produto.getValor()
            });
        }
    }
    
    private void limpar(){
        txtNomeProduto.setText(null);
        txtValor.setValue(null);
        spinQuantidade.setValue(1);
        txtDescricao.setText(null);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblNomeProduto;
    private javax.swing.JLabel lblProdutosRegistrados;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JLabel lblValor;
    private javax.swing.JPanel panelBorder1;
    private javax.swing.JPanel panelBorder2;
    private javax.swing.JPanel panelBorder3;
    private javax.swing.JScrollPane scrollDescricao;
    private javax.swing.JScrollPane scrollProdutos;
    private javax.swing.JSpinner spinQuantidade;
    private javax.swing.JTable tableProdutos;
    private javax.swing.JTextArea txtDescricao;
    private javax.swing.JTextField txtNomeProduto;
    private javax.swing.JFormattedTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
