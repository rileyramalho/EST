/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Telas;

import Classes.Cliente;
import DAO.Comandos;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mello
 */
public class TelaCliente extends javax.swing.JDialog {
    Comandos comandos;
    private ArrayList<Cliente> clientes;
    private boolean stateChange = true;
    
    /**
     * Creates new form TelaCliente
     */
    public TelaCliente(java.awt.Frame parent, boolean modal, Comandos comandos) throws SQLException {
        super(parent, modal);
        this.comandos = comandos;
        initComponents();
        
        this.clientes = comandos.getCliente();       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrpCpfCnpj = new javax.swing.ButtonGroup();
        panelPesquisa = new javax.swing.JPanel();
        lblCodigoPesquisa = new javax.swing.JLabel();
        txtCodigoPesquisa = new javax.swing.JTextField();
        lblNomePesquisa = new javax.swing.JLabel();
        txtNomePesquisa = new javax.swing.JTextField();
        lblDocPesquisa = new javax.swing.JLabel();
        txtDocPesquisa = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        panelEdit = new javax.swing.JPanel();
        lblNomeEditar = new javax.swing.JLabel();
        txtNomeEditar = new javax.swing.JTextField();
        lblDocTypeEditar = new javax.swing.JLabel();
        cbDocTypeEditar = new javax.swing.JComboBox<>();
        lblDocNumEditar = new javax.swing.JLabel();
        txtDocNumEditar = new javax.swing.JTextField();
        btnAtualizar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        btnIncluir = new javax.swing.JButton();
        lblCodigoEditar = new javax.swing.JLabel();
        txtCodigoEditar = new javax.swing.JTextField();
        scrollPaneTabela = new javax.swing.JScrollPane();
        tablePesquisa = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        panelPesquisa.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "PESQUISA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        lblCodigoPesquisa.setText("CODIGO.:");

        txtCodigoPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoPesquisaKeyTyped(evt);
            }
        });

        lblNomePesquisa.setText("NOME.:");

        txtNomePesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomePesquisaKeyTyped(evt);
            }
        });

        lblDocPesquisa.setText("DOCUMENTO.:");

        txtDocPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDocPesquisaKeyTyped(evt);
            }
        });

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPesquisaLayout = new javax.swing.GroupLayout(panelPesquisa);
        panelPesquisa.setLayout(panelPesquisaLayout);
        panelPesquisaLayout.setHorizontalGroup(
            panelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPesquisaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPesquisaLayout.createSequentialGroup()
                        .addComponent(lblNomePesquisa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomePesquisa))
                    .addGroup(panelPesquisaLayout.createSequentialGroup()
                        .addComponent(lblDocPesquisa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDocPesquisa))
                    .addGroup(panelPesquisaLayout.createSequentialGroup()
                        .addComponent(lblCodigoPesquisa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigoPesquisa)))
                .addGap(18, 18, 18)
                .addComponent(btnPesquisar)
                .addContainerGap())
        );
        panelPesquisaLayout.setVerticalGroup(
            panelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPesquisaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigoPesquisa)
                    .addComponent(txtCodigoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomePesquisa)
                    .addComponent(txtNomePesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDocPesquisa)
                    .addComponent(txtDocPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelEdit.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "EDITAR", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Ubuntu", 0, 12))); // NOI18N
        panelEdit.setPreferredSize(new java.awt.Dimension(415, 4));

        lblNomeEditar.setText("NOME.:");

        txtNomeEditar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomeEditarKeyTyped(evt);
            }
        });

        lblDocTypeEditar.setText("TIPO DOCUMENTO.:");

        cbDocTypeEditar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CPF", "CNPJ" }));

        lblDocNumEditar.setText("NUM DOCUMENTO.:");

        txtDocNumEditar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDocNumEditarKeyTyped(evt);
            }
        });

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnDeletar.setText("Deletar");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        btnIncluir.setText("Incluir");
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });

        lblCodigoEditar.setText("CÓDIGO.:");

        txtCodigoEditar.setEditable(false);
        txtCodigoEditar.setPreferredSize(new java.awt.Dimension(86, 22));

        javax.swing.GroupLayout panelEditLayout = new javax.swing.GroupLayout(panelEdit);
        panelEdit.setLayout(panelEditLayout);
        panelEditLayout.setHorizontalGroup(
            panelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEditLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEditLayout.createSequentialGroup()
                        .addComponent(lblNomeEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomeEditar))
                    .addGroup(panelEditLayout.createSequentialGroup()
                        .addComponent(lblDocNumEditar)
                        .addGap(3, 3, 3)
                        .addComponent(txtDocNumEditar))
                    .addGroup(panelEditLayout.createSequentialGroup()
                        .addComponent(lblDocTypeEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbDocTypeEditar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEditLayout.createSequentialGroup()
                        .addGap(0, 159, Short.MAX_VALUE)
                        .addComponent(btnIncluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAtualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeletar))
                    .addGroup(panelEditLayout.createSequentialGroup()
                        .addComponent(lblCodigoEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelEditLayout.setVerticalGroup(
            panelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEditLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigoEditar)
                    .addComponent(txtCodigoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeEditar)
                    .addComponent(txtNomeEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDocTypeEditar)
                    .addComponent(cbDocTypeEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDocNumEditar)
                    .addComponent(txtDocNumEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeletar)
                    .addComponent(btnIncluir)
                    .addComponent(btnAtualizar))
                .addContainerGap())
        );

        tablePesquisa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "NOME", "TIPO DOCUMENTO", "NUM DOCUMENTO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablePesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePesquisaMouseClicked(evt);
            }
        });
        scrollPaneTabela.setViewportView(tablePesquisa);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panelPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPaneTabela, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scrollPaneTabela, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        cadastrarCliente();
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        String codigo = txtCodigoPesquisa.getText();
        String nome = txtNomePesquisa.getText();
        String docNum = txtDocPesquisa.getText();
        
        pesquisarClientes(codigo, nome, docNum);
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void tablePesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePesquisaMouseClicked
        int row = tablePesquisa.rowAtPoint(evt.getPoint());
        
        String codigoCliente = tablePesquisa.getValueAt(row, 0).toString();
        String nome = tablePesquisa.getValueAt(row, 1).toString();
        String docType = tablePesquisa.getValueAt(row, 2).toString();
        String docNum = tablePesquisa.getValueAt(row, 3).toString();
        
        txtCodigoEditar.setText(codigoCliente);
        txtNomeEditar.setText(nome);
        cbDocTypeEditar.setSelectedItem(docType);
        txtDocNumEditar.setText(docNum);
    }//GEN-LAST:event_tablePesquisaMouseClicked

    private void txtCodigoPesquisaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoPesquisaKeyTyped
        char letra = evt.getKeyChar();
        if (((letra < '0') || (letra > '9')) && (letra != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
    }//GEN-LAST:event_txtCodigoPesquisaKeyTyped

    private void txtDocPesquisaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDocPesquisaKeyTyped
        char letra = evt.getKeyChar();
        if (((letra < '0') || (letra > '9')) && (letra != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
    }//GEN-LAST:event_txtDocPesquisaKeyTyped

    private void txtNomePesquisaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomePesquisaKeyTyped
        char letra = evt.getKeyChar();
        letra = Character.toLowerCase(letra);
        if (((letra < 'a') || (letra > 'z')) && (letra != KeyEvent.VK_BACK_SPACE) && (letra != KeyEvent.VK_SPACE) && ((letra < '0') || (letra > '9'))){
            evt.consume();
        }
    }//GEN-LAST:event_txtNomePesquisaKeyTyped

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        atualizarCliente();
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        deletarCliente();
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void txtNomeEditarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeEditarKeyTyped
        char letra = evt.getKeyChar();
        letra = Character.toLowerCase(letra);
        if (((letra < 'a') || (letra > 'z')) && (letra != KeyEvent.VK_BACK_SPACE) && (letra != KeyEvent.VK_SPACE) && ((letra < '0') || (letra > '9'))){
            evt.consume();
        }
    }//GEN-LAST:event_txtNomeEditarKeyTyped

    private void txtDocNumEditarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDocNumEditarKeyTyped
        char letra = evt.getKeyChar();
        if (((letra < '0') || (letra > '9')) && (letra != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
    }//GEN-LAST:event_txtDocNumEditarKeyTyped

    private void cadastrarCliente() {
        String nomeCliente = txtNomeEditar.getText().toUpperCase();
        String docType = cbDocTypeEditar.getSelectedItem().toString();
        String docNum = txtDocNumEditar.getText();
        
        if (validaDoc(docNum, docType)){
            Cliente cliente = new Cliente(nomeCliente, docType, docNum);

            try{
                comandos.insertCliente(cliente);
                JOptionPane.showMessageDialog(null, "Cliente " + nomeCliente + " registrado", null, JOptionPane.INFORMATION_MESSAGE);

                clientes = comandos.getCliente();
                btnPesquisar.doClick();
            } catch (SQLException ex){
                JOptionPane.showMessageDialog(null, "Erro.: " + ex, null, JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    private void atualizarCliente() {
        int codigo = Integer.parseInt(txtCodigoEditar.getText());
        String nome = txtNomeEditar.getText().toUpperCase();
        String docType = cbDocTypeEditar.getSelectedItem().toString();
        String docNum = txtDocNumEditar.getText();
        
        if(validaDoc (docNum, docType)){
            Cliente cliente = new Cliente(codigo, nome, docType, docNum);
            
            try {
                comandos.updateCliente(cliente);
                JOptionPane.showMessageDialog(null, "Cliente " + cliente.getNome() + " atualizado", null, JOptionPane.INFORMATION_MESSAGE);
                
                clientes = comandos.getCliente();
                btnPesquisar.doClick();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro.: " + ex, null, JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    private void deletarCliente() {
        int codigo = Integer.parseInt(txtCodigoEditar.getText());
        String nome = txtNomeEditar.getText().toUpperCase();
        
        Cliente cliente = new Cliente(codigo, nome, "", "");
        
        try {
            comandos.deleteCliente(cliente);
            JOptionPane.showMessageDialog(null, "Cliente " + cliente.getNome() + " deletado", null, JOptionPane.INFORMATION_MESSAGE);
            
            clientes = comandos.getCliente();
            btnPesquisar.doClick();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro.: " + ex, null, JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private boolean validaDoc(String docNum, String docType) {
        if (docNum.isEmpty()){
            JOptionPane.showConfirmDialog(null, "O documento não pode ser nulo!", null, JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (!docNum.matches("([0-9]{3}[\\.]?[0-9]{3}[\\.]?[0-9]{3}[-]?[0-9]{2})") && docType.equals("CPF")){
            JOptionPane.showConfirmDialog(null, "O CPF não tem um formato válido!", null, JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (!docNum.matches("([0-9]{2}[\\.]?[0-9]{3}[\\.]?[0-9]{3}[\\/]?[0-9]{4}[\\-]?[0-9]{2})") && docType.equals("CNPJ")){
            JOptionPane.showConfirmDialog(null, "O CNPJ não tem um formato válido!", null, JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        return true;
    }
    
    private void pesquisarClientes(String codigo, String nome, String docNum) {
        DefaultTableModel modelo = (DefaultTableModel) tablePesquisa.getModel();
        modelo.setRowCount(0);
        
        for (Cliente cliente : clientes){
            String codigoAux = String.valueOf(cliente.getCodigo());
            String nomeAux = cliente.getNome();
            String docNumAux = cliente.getDocNum();
            
            if (!codigo.equals("")){
                if(codigoAux.startsWith(codigo)) modelo.addRow(new Object[]{cliente.getCodigo(), cliente.getNome(), cliente.getDocType(), cliente.getDocNum()});
            } else if (!docNum.equals("")) {
                if (docNumAux.startsWith(docNum)) modelo.addRow(new Object[]{cliente.getCodigo(), cliente.getNome(), cliente.getDocType(), cliente.getDocNum()});
            } else if (!nome.equals("")) {
                if (nomeAux.startsWith(nome)) modelo.addRow(new Object[]{cliente.getCodigo(), cliente.getNome(), cliente.getDocType(), cliente.getDocNum()});
            } else {
                modelo.addRow(new Object[]{cliente.getCodigo(), cliente.getNome(), cliente.getDocType(), cliente.getDocNum()});   
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.ButtonGroup btnGrpCpfCnpj;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JComboBox<String> cbDocTypeEditar;
    private javax.swing.JLabel lblCodigoEditar;
    private javax.swing.JLabel lblCodigoPesquisa;
    private javax.swing.JLabel lblDocNumEditar;
    private javax.swing.JLabel lblDocPesquisa;
    private javax.swing.JLabel lblDocTypeEditar;
    private javax.swing.JLabel lblNomeEditar;
    private javax.swing.JLabel lblNomePesquisa;
    private javax.swing.JPanel panelEdit;
    private javax.swing.JPanel panelPesquisa;
    private javax.swing.JScrollPane scrollPaneTabela;
    private javax.swing.JTable tablePesquisa;
    private javax.swing.JTextField txtCodigoEditar;
    private javax.swing.JTextField txtCodigoPesquisa;
    private javax.swing.JTextField txtDocNumEditar;
    private javax.swing.JTextField txtDocPesquisa;
    private javax.swing.JTextField txtNomeEditar;
    private javax.swing.JTextField txtNomePesquisa;
    // End of variables declaration//GEN-END:variables
}
