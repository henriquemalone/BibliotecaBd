
package View;

import Controle.Controle;
import Model.DAO;
import Model.Estudante;
import Model.Livro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class exibeExemplares extends javax.swing.JFrame {
    
    DAO dao = new DAO(); //cria o objeto 'dao' da classe DAO
    Controle c = new Controle(); //cria o objeto 'c' da classe Controle
    Connection con = dao.conectar(); //cria uma conexão 'con'
    PreparedStatement stmt = null; //query do banco de dados
    DefaultTableModel tabela; //cria o objeto 'tabela' da coleção DefaultTableModel
    
    public exibeExemplares() {
        initComponents();
        conecta();
        preencherTabela(); //chama função para preencher a tabela
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        edtTitulo = new javax.swing.JTextField();
        edtAutor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        edtEditora = new javax.swing.JTextField();
        btnProcurar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Exibe Exemplares");
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
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Tiítulo:");

        jLabel2.setText("Autor:");

        edtAutor.setToolTipText("");

        jLabel3.setText("Editora:");

        btnProcurar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Henrique\\Desktop\\projetoJava\\img\\lupa.png")); // NOI18N
        btnProcurar.setText("Pesquisar");
        btnProcurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcurarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID do exemplar", "Título", "Autor", "Editora", "Categoria"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(edtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(edtEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnProcurar)))
                        .addGap(0, 63, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProcurar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE))
        );

        jMenu1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Henrique\\Desktop\\projetoJava\\img\\minus-4-xxl.png")); // NOI18N
        jMenu1.setText("Excluir");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarActionPerformed
        String titulo = edtTitulo.getText(); //variavel 'titulo' recebe o que estiver escrito no campo edtTitulo
        String autor = edtAutor.getText(); //variavel 'autor' recebe o que estiver escrito no campo edtAutor
        String editora = edtEditora.getText(); //variavel 'editora' recebe o que estiver escrito no campo edtEditora
        
        if(titulo == ""){ //verifica se a variavel titulo é igual à ""
            titulo = "vazio"; //caso seja, variavel titulo vai receber a string "vazio"
        }
        
        if(autor == ""){ //verifica se a variavel autor é igual à ""
            autor = "vazio"; //caso seja, variavel titulo vai receber a string "vazio"
        }
        
        if(editora == ""){ //verifica se a variavel editora é igual à ""
            editora = "vazio"; //caso seja, variavel titulo vai receber a string "vazio"
        }
        
        procuraExemplar(titulo, autor, editora); //chama o metodo que procura exemplar
    }//GEN-LAST:event_btnProcurarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        //quando a tela é ativa
        limparTabela(); //limpa a tabela 
        preencherTabela(); //chama função para preencher a tabela
    }//GEN-LAST:event_formWindowActivated

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        desconecta();
    }//GEN-LAST:event_formWindowClosed

    private void formWindowDeactivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowDeactivated
        limparTabela(); //limpa a tabela
        preencherTabela(); //chama função para preencher a tabela
    }//GEN-LAST:event_formWindowDeactivated

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        //botão DELETAR
        int linhaSel; //variavel que recebera a linha(exemplar) da tabela selecionada
        int id; //variavel que recebera o id do exemplar selecionado

        try{
            linhaSel = jTable1.getSelectedRow();  //variavel 'linhaSel' recebera a linha da tabela selecionada 
            id = (int) tabela.getValueAt(linhaSel,0); //variavel 'id' recebera o valor das coordenadas selecionada(linhaSel e coluna zero para receber o id do estudante) 
           
            if (JOptionPane.showConfirmDialog(null,"Deseja realmente apagar o registro desse exemplar?")==JOptionPane.OK_OPTION){ //notificação que pergunta se o usuario realmente quer excluir o estudante selecionado
                try{
                    if(c.deletaExemplar(id)==true){ //envia a variavel 'id' para o metodo deletaEstudante na classe Controle)
                        JOptionPane.showMessageDialog(null,"Exemplar deletado com sucesso!"); //abrirá uma janela informando que o estudate foi deletado com sucesso
                    }
                } catch (Exception e){
                    JOptionPane.showMessageDialog(null, "Erro ao deletar o exemplar!\nERRO:"+e.getMessage()); //caso ocorra algum erro, abrirá uma janela informando que aconteceu algo de errado e o erro que ocorreu  
                }    
            }  
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,"Nenhum exemplar selecionado!"); //caso nao seja selecionada nenhuma linha da tabela, abrira uma tela de notificação infromando que o usuário não selecionou nenhum estudante (linha)
        }
    }//GEN-LAST:event_jMenu1MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(exibeExemplares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(exibeExemplares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(exibeExemplares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(exibeExemplares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new exibeExemplares().setVisible(true);
            }
        });
    }
    
    public void conecta(){
        dao.conectar();
    }
    
    public void desconecta(){
        dao.desconectar();
    }
    
    public void limparTabela(){ //método para limpar a tabela
        tabela.setNumRows(0); //faz a coluna ficar com zero linhas (limpa tabela)
        
        edtTitulo.setText(""); //apaga o campo de texto Edit
        edtAutor.setText(""); //apaga o campo de texto Edit
        edtEditora.setText(""); //apaga o campo de texto Edit
    }
    
    public void preencherTabela(){ //metodo para preencher a tabela com todos os dados ja salvos no banco de dados
        tabela = (DefaultTableModel) jTable1.getModel(); //cria o objeto 'tabela'
        for(Livro l: c.exibeExemplares()){ //laço para adicionar elementos da lista exibeExemplares na tabela
            tabela.addRow(new Object[]{ //adiciona uma linha na tabela
            l.getId(), //recebe o id do exemplar
            l.getTitulo(), //recebe o titulo do exemplar
            l.getAutor(), //recebe o autor do exemplar
            l.getEditora(), //recebe a editora do exemplar
            l.getCategoria(), //recebe a categoria do exemplar
        });
       }
    }
    
    public void procuraExemplar(String titulo, String autor, String editora){ //meotdo para procurar um exemplar no banco de daodos
        tabela.setRowCount(0); //limpa  atabela
        
        for(Livro e: c.procuraExemplar(titulo, autor, editora, 0, 1)){ //laço para adicionar elementos da lista procuraExemplar na tabela
            tabela.addRow(new Object[]{ //adiciona linha na tabela
                e.getId(), //recebe o id do exemplar
                e.getTitulo(), //recebe o titulo do exemplar
                e.getAutor(), //recebe o autor do exemplar
                e.getEditora(), //recebe a editora do exemplar
                e.getCategoria(), //recebe a categoria do exemplar     
            });
       }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProcurar;
    private javax.swing.JTextField edtAutor;
    private javax.swing.JTextField edtEditora;
    private javax.swing.JTextField edtTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
