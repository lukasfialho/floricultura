/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojafloricultura.view;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import lojafloricultura.controller.ProdutoController;

/**
 *
 * @author Ítalo
 */
public class ProdutoView extends javax.swing.JFrame {
    ProdutoController produtoController = new ProdutoController();
    private int ideditar;
    private boolean editar;

    /**
     * Creates new form ProdutoView
     */
    public ProdutoView() {
        initComponents();
        Recarregar();
        setExtendedState(MAXIMIZED_BOTH);
    }
    
    /**
     * 
     * Essa função é utilizada para buscar todos os produtos e adicionar na tabela
     * Também aproveita e limpa o formulario e desabilita ele
     * 
     * @author lukas.fialho
     * @version 1.0
     * @since 18 de Novembro (Javadoc)
    */
    public void Recarregar(){
        ArrayList<String[]> linhasProdutos = produtoController.getProdutos();
        
        System.out.println(linhasProdutos);
        
        DefaultTableModel tmProdutos = new DefaultTableModel();
        tmProdutos.addColumn("ID");
        tmProdutos.addColumn("Nome");
        tmProdutos.addColumn("Quantidade");
        tmProdutos.addColumn("Valor");
        tmProdutos.addColumn("Descricao");
        TabelaProdutos.setModel(tmProdutos);
        
        for(String[] p:linhasProdutos){
            tmProdutos.addRow(p);
        }
        
        LimpaForm();
        FuncaoFormulario(false);
       
    }
    
    /**
     * Essa funcao é utilizada para habilitar ou desabilitar o formulario
     * A opcao (se será desabilitado ou habilitado) é passada via parametro
     * 
     * @author lukas.fialho
     * @param opcao - Desabilitar (false) ou Habilitar(true)
     * @version 1.0
     * @since 18 de Novembro (Javadoc)
    */
    public void FuncaoFormulario(boolean opcao){
        txtNomeProduto.setEnabled(opcao);
        txtDescriptionProduto.setEnabled(opcao);
        txtQuantidadeProduto.setEnabled(opcao);
        txtValueProduto.setEnabled(opcao);
        btnSaveProduto.setVisible(opcao);
    }
   
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlProduto = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNomeProduto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnSaveProduto = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescriptionProduto = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        txtValueProduto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtQuantidadeProduto = new javax.swing.JTextField();
        btnNewProduto = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabelaProdutos = new javax.swing.JTable();
        btnEditProduto = new javax.swing.JButton();
        btnDeleteProduto = new javax.swing.JButton();
        pnlCliente1 = new javax.swing.JPanel();
        lblNome1 = new javax.swing.JLabel();
        txtPesquisarNome = new javax.swing.JTextField();
        btnSave1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlProduto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do produto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel1.setText("Nome:");

        txtNomeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeProdutoActionPerformed(evt);
            }
        });

        jLabel2.setText("Descrição:");

        btnSaveProduto.setText("Salvar");
        btnSaveProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveProdutoActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancelar");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        txtDescriptionProduto.setColumns(20);
        txtDescriptionProduto.setRows(5);
        jScrollPane1.setViewportView(txtDescriptionProduto);

        jLabel4.setText("Valor:");

        jLabel3.setText("Quantidade:");

        javax.swing.GroupLayout pnlProdutoLayout = new javax.swing.GroupLayout(pnlProduto);
        pnlProduto.setLayout(pnlProdutoLayout);
        pnlProdutoLayout.setHorizontalGroup(
            pnlProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProdutoLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(pnlProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlProdutoLayout.createSequentialGroup()
                        .addComponent(btnSaveProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancel))
                    .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQuantidadeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValueProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(280, Short.MAX_VALUE))
        );
        pnlProdutoLayout.setVerticalGroup(
            pnlProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValueProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(pnlProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtQuantidadeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(pnlProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSaveProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        btnNewProduto.setText("Novo");
        btnNewProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewProdutoActionPerformed(evt);
            }
        });

        TabelaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Descrição", "Valor", "Quantidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TabelaProdutos);

        btnEditProduto.setText("Editar");
        btnEditProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditProdutoActionPerformed(evt);
            }
        });

        btnDeleteProduto.setText("Excluir");
        btnDeleteProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteProdutoActionPerformed(evt);
            }
        });

        pnlCliente1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar Produto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        lblNome1.setText("Nome:");

        txtPesquisarNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisarNomeActionPerformed(evt);
            }
        });

        btnSave1.setText("Buscar");
        btnSave1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSave1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCliente1Layout = new javax.swing.GroupLayout(pnlCliente1);
        pnlCliente1.setLayout(pnlCliente1Layout);
        pnlCliente1Layout.setHorizontalGroup(
            pnlCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCliente1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblNome1)
                .addGap(18, 18, 18)
                .addComponent(txtPesquisarNome, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnSave1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        pnlCliente1Layout.setVerticalGroup(
            pnlCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCliente1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome1)
                    .addComponent(txtPesquisarNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnEditProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnDeleteProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(pnlProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnNewProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(pnlCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 697, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(btnNewProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnlCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeleteProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Este metodo verifica se é uma edição ou criação de um novo Produto
     * Tambem, nao importando qual seja o tipo de operacao, faz validacao do formulario
     * Dava pra fazer essa funcao de forma mais simples
     * 
     * @author lukas.fialho
     * @param evt - Evento do Botao Salvar
     * @return void
     * @version 1.0
     * @since 18 de Novembro (Javadoc)
    */
    private void btnSaveProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveProdutoActionPerformed
        // TODO add your handling code here:
        if(editar && ValidarFormulario()){
            if(
                    produtoController.atualizar(
                            ideditar,
                            txtNomeProduto.getText(),
                            Integer.parseInt(txtQuantidadeProduto.getText()),
                            Double.parseDouble(txtValueProduto.getText()),
                            txtDescriptionProduto.getText()
                    )
                    ){
                this.Recarregar();
                JOptionPane.showMessageDialog(null, "Produto Editado com Sucesso!");
                LimpaForm();
            } else {
                JOptionPane.showMessageDialog(null, "Falha ao ediar o Produto!");
            }            
        } else if(!editar && ValidarFormulario()) {
            if(
                    produtoController.salvar(
                            txtNomeProduto.getText(),
                            Integer.parseInt(txtQuantidadeProduto.getText()),
                            Double.parseDouble(txtValueProduto.getText()),
                            txtDescriptionProduto.getText()
                    )
                    ){
                this.Recarregar();
                JOptionPane.showMessageDialog(null, "Produto Cadastrado com Sucesso!");
                LimpaForm();
            } else {
                JOptionPane.showMessageDialog(null, "Falha ao cadastrar Produto!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Falha na operação de Produto!");
        }
        
    }//GEN-LAST:event_btnSaveProdutoActionPerformed

    /**
     * Função inativa
     * 
     * @deprecated Função inativa
     * @author
     * @param evt - Evento
     * @return void
     * @version 1.0
     * @since 18 de Novembro (Javadoc)
    */
    private void txtNomeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeProdutoActionPerformed

    /**
     * Função inativa
     * 
     * @deprecated Função inativa
     * @author
     * @param evt - Evento
     * @return void
     * @version 1.0
     * @since 18 de Novembro (Javadoc)
    */
    private void txtPesquisarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisarNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisarNomeActionPerformed

    /**
     * 
     * Por mais que o nome da funcao esteja errado, esta funcao faz a pesquisa do Produto com base no nome do mesmo
     * 
     * @author lukas.fialho
     * @param evt - Evento do Botão
     * @return void
     * @version 1.0
     * @since 18 de Novembro (Javadoc)
    */
    private void btnSave1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSave1ActionPerformed
        try {
            // TODO add your handling code here:
            ArrayList<String[]> linhasProdutos = produtoController.getProdutoByName(txtPesquisarNome.getText());
            
            System.out.println(linhasProdutos);
        
            DefaultTableModel tmProdutos = new DefaultTableModel();
            tmProdutos.addColumn("ID");
            tmProdutos.addColumn("Nome");
            tmProdutos.addColumn("Quantidade");
            tmProdutos.addColumn("Valor");
            tmProdutos.addColumn("Descricao");
            TabelaProdutos.setModel(tmProdutos);

            for(String[] p:linhasProdutos){
                tmProdutos.addRow(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProdutoView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSave1ActionPerformed

    /**
     * Quando clicado no botão Editar, esta função busca qual é a linha que estava selecionada (erro se nenhuma selecionada) e envia para o formulario de edição
     * 
     * @author lukas.fialho
     * @param evt - Evento de Edit
     * @return void
     * @version 1.0
     * @since 18 de Novembro (Javadoc)
    */
    private void btnEditProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditProdutoActionPerformed
        // TODO add your handling code here:
        if(TabelaProdutos.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(this, "Selecione um item para editar!");
        } else {
            editar = true;
            ideditar = Integer.parseInt((String) TabelaProdutos.getValueAt(TabelaProdutos.getSelectedRow(), 0));
            txtNomeProduto.setText((String) TabelaProdutos.getValueAt(TabelaProdutos.getSelectedRow(), 1));
            txtQuantidadeProduto.setText((String) TabelaProdutos.getValueAt(TabelaProdutos.getSelectedRow(), 2));
            txtValueProduto.setText((String) TabelaProdutos.getValueAt(TabelaProdutos.getSelectedRow(), 3));
            txtDescriptionProduto.setText((String) TabelaProdutos.getValueAt(TabelaProdutos.getSelectedRow(), 4));
            FuncaoFormulario(true);
        }
    }//GEN-LAST:event_btnEditProdutoActionPerformed

    /**
     * 
     * Essa funcao inicia o formulario para criacao de um novo Produto
     * 
     * @author lukas.fialho
     * @param evt - Evento de Novo Produto
     * @return void
     * @version 1.0
     * @since 18 de Novembro (Javadoc)
    */
    private void btnNewProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewProdutoActionPerformed
        // TODO add your handling code here:
        editar = false;
        btnSaveProduto.setVisible(true);
        FuncaoFormulario(true);
        
        //habilitar o formulário
    }//GEN-LAST:event_btnNewProdutoActionPerformed

    /**
     * 
     * Essa funcao deleta o Produto que estava selecionado na tabela
     * 
     * @author lukas.fialho
     * @param evt - Evento de Delete
     * @return void
     * @version 1.0
     * @since 18 de Novembro (Javadoc)
    */
    private void btnDeleteProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteProdutoActionPerformed
        // TODO add your handling code here:
        if(TabelaProdutos.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(this, "Selecione um produto para deletar");
        } else {
            int selectedRowIndex = TabelaProdutos.getSelectedRow();
            if(produtoController.excluir(Integer.parseInt((String) TabelaProdutos.getValueAt(selectedRowIndex, 0)))) {
                JOptionPane.showMessageDialog(this, "Produto excluído com sucesso!");
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao excluir o produto");
            }
            Recarregar();
        }
    }//GEN-LAST:event_btnDeleteProdutoActionPerformed

    /**
     * 
     * Essa funcao cancela a cricao de um novo Produto e Recarrega
     * 
     * @author lukas.fialho
     * @param evt - Evento de Cancelamento
     * @return void
     * @version 1.0
     * @since 18 de Novembro (Javadoc)
    */
    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        Recarregar();
    }//GEN-LAST:event_btnCancelActionPerformed

    /**
     * 
     * Essa funcao limpa os campos do formulario
     * 
     * @author lukas.fialho
     * @return void
     * @version 1.0
     * @since 18 de Novembro (Javadoc)
    */
    private void LimpaForm(){
        txtNomeProduto.setText("");
        txtQuantidadeProduto.setText("");
        txtValueProduto.setText("");
        txtDescriptionProduto.setText("");
    }
    
    /**
     * 
     * Essa funcao valida cada um dos campos do formulario quando o evento Salvar é ativado
     * 
     * @author lukas.fialho
     * @return void
     * @version 1.0
     * @since 18 de Novembro (Javadoc)
    */
    private boolean ValidarFormulario() {
        
        if(this.txtNomeProduto.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this,"Defina um Nome para o Produto!");
            return false;
        }
        
        if(this.txtDescriptionProduto.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this,"Defina uma descrição para o Produto!");
            return false;
        }
        
        //Trata quantidade
        try {

            int valorConvertido = Integer.parseInt(this.txtQuantidadeProduto.getText());
            System.out.println(valorConvertido);
            if(valorConvertido < 0){
                JOptionPane.showMessageDialog(this,"Quantidade deve ser um numero maior que zero!!");
                return false;
            }
        
        } catch(NumberFormatException e){
            
            JOptionPane.showMessageDialog(this,"Quantidade deve ser um numero inteiro!!");
            return false;
        
        }catch(IllegalArgumentException e){
            
            JOptionPane.showMessageDialog(this,"Digite um valor para Quantidade");  
            return false;
        
        }
        //Trata Valor
        try {

            double valorConvertido = Double.parseDouble(this.txtValueProduto.getText());
            if(valorConvertido < 0){
                JOptionPane.showMessageDialog(this,"Valor deve ser um numero maior que zero!!");
                return false;
            }
        
        } catch(NumberFormatException e){
            
            JOptionPane.showMessageDialog(this,"Valor deve ser um numero");
            return false;
        
        } catch(IllegalArgumentException e){
            
            JOptionPane.showMessageDialog(this,"Digite um valor!");  
            return false;
        
        }
        
        
        return true;
        
    }
    
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
            java.util.logging.Logger.getLogger(ProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProdutoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelaProdutos;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDeleteProduto;
    private javax.swing.JButton btnEditProduto;
    private javax.swing.JButton btnNewProduto;
    private javax.swing.JButton btnSave1;
    private javax.swing.JButton btnSaveProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblNome1;
    private javax.swing.JPanel pnlCliente1;
    private javax.swing.JPanel pnlProduto;
    private javax.swing.JTextArea txtDescriptionProduto;
    private javax.swing.JTextField txtNomeProduto;
    private javax.swing.JTextField txtPesquisarNome;
    private javax.swing.JTextField txtQuantidadeProduto;
    private javax.swing.JTextField txtValueProduto;
    // End of variables declaration//GEN-END:variables
}
