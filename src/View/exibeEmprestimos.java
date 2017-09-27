
package View;

import Controle.Controle;
import Model.DAO;
import Model.Emprestimo;
import Model.Estudante;
import Model.Livro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class exibeEmprestimos extends javax.swing.JFrame {
    
    DAO dao = new DAO(); //cria o objeto 'dao' da classe DAO
    Controle c = new Controle(); //cria o objeto 'c' da classe Controle
    DefaultTableModel tabela; //cria o objeto 'tabela' da coleção DefaultTableModel
    Connection con = dao.conectar(); //cria uma conexão 'con'
    PreparedStatement stmt = null; //query do banco de dados
    efetuarDevolucao devolucao = new efetuarDevolucao();
    
    public exibeEmprestimos() {
        initComponents();
        dao.conectar(); //conecta com o banco de dados
        preencherTabela(); //chama metodo que preenche a tabela sempre que ativa o formulario
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        edtId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        edtTitulo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnPesquisar = new javax.swing.JButton();
        df = new javax.swing.JLabel();
        edtIdEmprestimo = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setExtendedState(6);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowDeactivated(java.awt.event.WindowEvent evt) {
                formWindowDeactivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("ID do título:");

        jLabel2.setText("Título:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID do emprésimo", "Título", "ID do título", "Nome do estudante", "ID do estudante", "Data do empréstimo", "Previsão de devolução", "Data da devolução"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btnPesquisar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Henrique\\Desktop\\projetoJava\\img\\lupa.png")); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPesquisarMouseClicked(evt);
            }
        });
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        df.setText("ID do empréstimo:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(df)
                            .addComponent(edtIdEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edtId, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(edtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnPesquisar)))
                        .addGap(0, 104, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(df))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar)
                    .addComponent(edtIdEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
        );

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        //quando a tela é ativa
        limparTabela(); //limpa a tabela 
        preencherTabela(); //chama função para preencher a tabela
    }//GEN-LAST:event_formWindowActivated

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        dao.desconectar(); //desconecta com o banco de dados
    }//GEN-LAST:event_formWindowClosed

    private void formWindowDeactivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowDeactivated
        limparTabela(); //limpa a tabela
        preencherTabela(); //chama função para preencher a tabela
    }//GEN-LAST:event_formWindowDeactivated

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        //botão PESQUISAR
        String titulo = edtTitulo.getText(); //variavel 'nome' recebe o que estiver no campo texto Edit.
        int id; //variavel que irá receber o valor do campo de texto Edit convertido para int
        int idEmprestimo; //variavel que recebe o ID do emprestimo
        int qtdLinhas; //variavel que receberá a quantidade de linhas existente na tabela
          
        if (edtId.getText().toString().isEmpty()) { //verifica se o campo teto Edit esta vazio
            id = -1; //caso sim, a variavel 'id' receberá -1
        } else{
          id = Integer.parseInt(edtId.getText()); //caso nao, Integer.parseInt converterá o texto que estiver no campo de texto Edit para um valor inteiro e armazenará na variavel id
        }
        
        if (edtIdEmprestimo.getText().toString().isEmpty()) { //verifica se o campo teto Edit esta vazio
            idEmprestimo = -1; //caso sim, a variavel 'idEmprestimo' receberá -1
        } else{
          idEmprestimo = Integer.parseInt(edtIdEmprestimo.getText()); //caso nao, Integer.parseInt converterá o texto que estiver no campo de texto Edit para um valor inteiro e armazenará na variavel idEmprestimo
        }
        
        if (edtTitulo.getText().toString().isEmpty()) { //verifica se o campo teto Edit esta vazio
            titulo = "vazio"; //caso sim, a variavel 'titulo' recebera a string "vazio"
        }
        
        //caso os campos ID e NOME estajam vazios, ao clicar em pesquisar, irá apenas preencher a tabela novamente
        if(id == -1 && titulo == "vazio" && idEmprestimo == -1){ //verifica se a váriavel 'id' é igual à -1, se a variavel 'titulo' é igua a "vazio", se a variavel idEmprestimo é igual  a -1
            limparTabela(); //chama função para limpar todos os elementos da tabela
            preencherTabela(); //chama função para preencher a tabela
        } else {
            c.procuraEmprestimo(titulo, id, idEmprestimo); //caso algum dos 3 campos estejam preenchido, irá chamar a função de procuraEmprestimo usando o campo como parametro
            qtdLinhas = tabela.getRowCount(); //variavel 'qtdLinhas' recebe a quantidade de linhas da tabela após realizar a busca
            if(qtdLinhas == 0){ //verifica se a qtdLinhas é igual a zero
                JOptionPane.showMessageDialog(null,"Nenhum empréstimo encontrado!"); //caso seja, esta entendido que nenhum emprestimo foi encontrado na pesquisa, logo, mostrará uma janela de notificação
                limparTabela(); //limpa a tabela
            }
        } 
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnPesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPesquisarMouseClicked
        //botão PESQUISAR
        String titulo = edtTitulo.getText(); //variavel 'nome' recebe o que estiver no campo texto Edit.
        int id; //variavel que irá receber o valor do campo de texto Edit convertido para int
        int idEmprestimo; //variavel que recebe o ID do emprestimo
        int qtdLinhas; //variavel que receberá a quantidade de linhas existente na tabela
          
        if (edtId.getText().toString().isEmpty()) { //verifica se o campo teto Edit esta vazio
            id = -1; //caso sim, a variavel 'id' receberá -1
        } else{
          id = Integer.parseInt(edtId.getText()); //caso nao, Integer.parseInt converterá o texto que estiver no campo de texto Edit para um valor inteiro e armazenará na variavel id
        }
        
        if (edtIdEmprestimo.getText().toString().isEmpty()) { //verifica se o campo teto Edit esta vazio
            idEmprestimo = -1; //caso sim, a variavel 'intId' receberá -1
        } else{
          idEmprestimo = Integer.parseInt(edtIdEmprestimo.getText()); //caso nao, Integer.parseInt converterá o texto que estiver no campo de texto Edit para um valor inteiro e armazenará na variavel idEmprestimo
        }
        
        if (edtTitulo.getText().toString().isEmpty()) { //verifica se o campo teto Edit esta vazio
            titulo = "vazio"; //caso sim, a variavel 'titulo' recebera a string "vazio"
        }
        
        //caso os campos ID, TITULO e idEmprestimo estajam vazios, ao clicar em pesquisar, irá apenas preencher a tabela novamente
        if(id == -1 && titulo == "vazio" && idEmprestimo == -1){ //verifica se a váriavel 'id' é igual à -1, se a variavel 'titulo' é igua a "vazio" e se a variavel idEmprestimo for igual a -1
            limparTabela(); //chama função para limpar todos os elementos da tabela
            preencherTabela(); //chama função para preencher a tabela
        } else {
            procuraEmprestimo(titulo, id, idEmprestimo); //caso algum dos 3 campos estejam preenchido, irá chamar a função de procuraEmprestimo usando o campo como parametro
            qtdLinhas = tabela.getRowCount(); //variavel 'qtdLinhas' recebe a quantidade de linhas da tabela após realizar a busca
            if(qtdLinhas == 0){ //verifica se a qtdLinhas é igual a zero
                JOptionPane.showMessageDialog(null,"Nenhum empréstimo encontrado!"); //caso seja, esta entendido que nenhum emprestimo foi encontrado na pesquisa, logo, mostrará uma janela de notificação
                limparTabela(); //limpa a tabela
            }
        } 
    }//GEN-LAST:event_btnPesquisarMouseClicked

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
            java.util.logging.Logger.getLogger(exibeEmprestimos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(exibeEmprestimos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(exibeEmprestimos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(exibeEmprestimos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new exibeEmprestimos().setVisible(true);
            }
        });
    }
    
    public void preencherTabela(){ //metodo que preenche a tabela
        tabela = (DefaultTableModel) jTable1.getModel(); //cria o objeto 'tabela'
        for(Emprestimo  e: c.exibeEmprestimo()){ //laço que preenche a tabela com cada elemento da lista vinda do médoto exibeEmprestimo da classe Controle
            tabela.addRow(new Object[]{ //adiciona linha na tabela
                e.getId(), //preenche coluna ID
                e.getTitulo(), //preenche coluna titulo
                e.getExemplar(), //preenche coluna id do exemplar
                e.getNomeEst(), //preenhce coluna nome do estudante
                e.getEstudante(), //preenche coluna id do estudante
                e.getDataEmprestimo(), //preenche coluna data de emprestimo
                e.getDataPrevisao(), //preenche coluna pevisao de devolução
                e.getDataDevolucao(), //preenche coluna data de devolução
            });
       }
    }
    
    public void limparTabela(){ //método para limpar a tabela
        tabela.setNumRows(0); //faz a coluna ficar com zero linhas (limpa tabela)
        
        edtId.setText(""); //apaga o campo de texto Edit
        edtTitulo.setText(""); //apaga o campo de texto Edit
    }
    
    public void procuraEmprestimo(String titulo, int idExemplar, int idEmprestimo){
        tabela.setRowCount(0); //limpa tabela
        
        for(Emprestimo e: c.procuraEmprestimo(titulo, idExemplar, idEmprestimo)){
            tabela.addRow(new Object[]{ //adiciona linha na tabela
                e.getId(), //preenche coluna ID
                e.getTitulo(), //preenche coluna titulo
                e.getExemplar(), //preenche coluna id do exemplar
                e.getNomeEst(), //preenhce coluna nome do estudante
                e.getEstudante(), //preenche coluna id do etudante
                e.getDataEmprestimo(), //preenche coluna data de emprestimo
                e.getDataPrevisao(), //preenche coluna previsao de devolução
                e.getDataDevolucao(), //preenche coluna data de devolução    
            });
       }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JLabel df;
    private javax.swing.JTextField edtId;
    private javax.swing.JTextField edtIdEmprestimo;
    private javax.swing.JTextField edtTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
