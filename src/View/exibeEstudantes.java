
package View;

import Controle.Controle; //importa a classe Controle
import Model.DAO;
import Model.Estudante; //importa a classe Estudante
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList; //importa "biblioteca" para utilização de ArrayList
import java.util.List; //importa "biblioteca" para utilização de List
import javax.swing.JOptionPane; //importa swing do JOptionPane (janela de notificação)
import javax.swing.table.DefaultTableModel; //importa a classe DefaultTableModel para criação da tabela

public class exibeEstudantes extends javax.swing.JFrame {
    
    DAO dao = new DAO(); //cria o objeto 'dao' da classe DAO
    Controle c = new Controle(); //cria o objeto 'c' da classe Controle
    Connection con = dao.conectar(); //cria uma conexão 'con'
    PreparedStatement stmt = null; //query do banco de dados
    Estudante estudante = new Estudante(); // cria objeto 'estudante' da classe Estudante
    cadEstudante cadestudante = new cadEstudante(); //cria o objeto 'cadestudante' da classe cadEstudante
    DefaultTableModel tabela; //cria o objeto 'tabela' da coleção DefaultTableModel
    
    public exibeEstudantes() { //construtor
        initComponents();
        dao.conectar(); //conecta com o banco de dados
        preencherTabela(); //preenche a tabela quando a tela é aberta
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        edtId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        edtNome = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Exibe Estudantes");
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

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Data de Nascimento", "CPF", "RG", "Celular", "Telefone", "Email", "Endereço", "Nº", "Bairro", "Cidade", "Estado"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("ID do estudante:");

        jLabel2.setText("Nome do estudante:");

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Henrique\\Desktop\\projetoJava\\img\\lupa.png")); // NOI18N
        jButton1.setText("Pesquisar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(edtId))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)))
                        .addGap(0, 224, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        jMenu1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Henrique\\Desktop\\projetoJava\\img\\edtt.png")); // NOI18N
        jMenu1.setText("Editar");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Henrique\\Desktop\\projetoJava\\img\\minus-4-xxl.png")); // NOI18N
        jMenu2.setText("Excluir");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        //quando a tela é ativa
        limparTabela(); //limpa a tabela 
        preencherTabela(); //chama função para preencher a tabela
    }//GEN-LAST:event_formWindowActivated

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //botão PESQUISAR
        String nome = edtNome.getText(); //variavel 'nome' recebe o que estiver no campo texto Edit.
        int id; //variavel que irá receber o valor do campo de texto Edit convertido para int
        int qtdLinhas; //variavel que receberá a quantidade de linhas existente na tabela
          
        if (edtId.getText().toString().isEmpty()) { //verifica se o campo teto Edit esta vazio
            id = -1; //caso sim, a variavel 'intId' receberá -1
        } else{
          id = Integer.parseInt(edtId.getText()); //caso nao, Integer.parseInt converterá o texto que estiver no campo de texto Edit para um valor inteiro e armazenará na variavel id
        }
        
        if (edtNome.getText().toString().isEmpty()) { //verifica se o campo teto Edit esta vazio
            nome = "vazio"; //caso sim, a variavel 'nome' recebera a string "vazio"
        }
        
        //caso os campos ID e NOME estajam vazios, ao clicar em pesquisar, irá apenas preencher a tabela novamente
        if(id == -1 && nome == "vazio"){ //verifica se a váriavel 'id' é igual à -1 e se a variavel 'nome' é igua a "vazio"
            limparTabela(); //chama função para limpar todos os elementos da tabela
            preencherTabela(); //chama função para preencher a tabela
        } else {
            procuraEstudante(id, nome); //caso algum dos 2 campos estejam preenchido, irá chamar a função de procuraEstudante usando o campo como parametro
            qtdLinhas = tabela.getRowCount(); //variavel 'qtdLinhas' recebe a quantidade de linhas da tabela após realizar a busca
            if(qtdLinhas == 0){ //verifica se a qtdLinhas é igual a zero
                JOptionPane.showMessageDialog(null,"Nenhum estudante encontrado!"); //caso seja, esta entendido que nenhum estudante foi encontrado na pesquisa, logo, mostrará uma janela de notificação
                limparTabela(); //limpa a tabela
            }
        } 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        //botão DELETAR
        int linhaSel; //variavel que recebera a linha(estudante) da tabela selecionada
        int id; //variavel que recebera o id do estudante selecionado

        try{
            linhaSel = jTable1.getSelectedRow();  //variavel 'linhaSel' recebera a linha da tabela selecionada 
            id = (int) tabela.getValueAt(linhaSel,0); //variavel 'id' recebera o valor das coordenadas selecionada(linhaSel e coluna zero para receber o id do estudante) 
           
            if (JOptionPane.showConfirmDialog(null,"Deseja realmente apagar o registro desse estudante?")==JOptionPane.OK_OPTION){ //notificação que pergunta se o usuario realmente quer excluir o estudante selecionado
                try{
                    if(c.deletaEstudante(id)==true){ //envia a variavel 'id' para o metodo deletaEstudante na classe Controle)
                        c.deletaEstudante(id); //envia a variavel 'id' para o metodo deletaEstudante na classe Controle
                        JOptionPane.showMessageDialog(null,"Estudante deletado com sucesso!"); //abrirá uma janela informando que o estudate foi deletado com sucesso
                    }
                } catch (Exception e){
                    JOptionPane.showMessageDialog(null, "Erro ao deletar o estudante!\nERRO:"+e.getMessage()); //caso ocorra algum erro, abrirá uma janela informando que aconteceu algo de errado e o erro que ocorreu  
                }    
            }
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,"Nenhum estudante selecionado!"); //caso nao seja selecionada nenhuma linha da tabela, abrira uma tela de notificação infromando que o usuário não selecionou nenhum estudante (linha)
        }
    }//GEN-LAST:event_jMenu2MouseClicked

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        dao.desconectar(); //fecha conexão com banco de dados
    }//GEN-LAST:event_formWindowClosed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    private void formWindowDeactivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowDeactivated
        limparTabela(); //limpa a tabela
        preencherTabela(); //chama função para preencher a tabela
    }//GEN-LAST:event_formWindowDeactivated

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        //botão EDITAR
        int linhaSel; //variavel que recebera a linha(estudante) da tabela selecionada
        
        linhaSel = jTable1.getSelectedRow();  //variavel 'linhaSel' recebera o numedo da linha da tabela selecionada 
        int id = (int) tabela.getValueAt(linhaSel,0); //variavel 'id' recebera o valor das coordenadas selecionada(linhaSel e coluna zero para receber o id do estudante) 
        
        cadestudante.setTitle("Editar Estudante"); //muda o titulo do formulario
        cadestudante.preencheFormulario(1, id); //chama o metodo 'preencheFormulario' passando o numero um como parametro e o id do estudante selecionado
        cadestudante.setLocationRelativeTo(null); //centraliza tela de cadastro de estudante
        cadestudante.setVisible(true); //abre tela de cadastro de estudante
    }//GEN-LAST:event_jMenu1MouseClicked

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
            java.util.logging.Logger.getLogger(exibeEstudantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(exibeEstudantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(exibeEstudantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(exibeEstudantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new exibeEstudantes().setVisible(true);
            }
        });
    }
    
    public void preencherTabela(){ //metodo que preenche a tabela
        tabela = (DefaultTableModel) jTable1.getModel(); //cria o objeto 'tabela'
        for(Estudante e: c.exibeEstudantes()){ //laço que preenche a tabela com cada elemento da lista vinda do médoto exibeEstudante da classe Controle
            tabela.addRow(new Object[]{ //adiciona linha na tabela
                e.getId(), //preenche coluna ID
                e.getNome(), //preenche coluna nome
                e.getDataNasc(), //preenche coluna data de nascimento
                e.getCpf(), //preenhce coluna cpf
                e.getRg(), //preenche coluna rg
                e.getCelular(), //preenche coluna celular
                e.getTelefone(), //preenche coluna telefone
                e.getEmail(), //preenche coluna email
                e.getEnd(), //preenche coluna endereço
                e.getNum(), //preenhce coluna numero
                e.getBairro(), //preenche coluna bairro
                e.getCidade(), //preenche coluna cidade
                e.getUf(), //preenche coluna uf
        });
       }
    }
    
    public void limparTabela(){ //método para limpar a tabela
        tabela.setNumRows(0); //faz a coluna ficar com zero linhas (limpa tabela)
        
        edtId.setText(""); //apaga o campo de texto Edit
        edtNome.setText(""); //apaga o campo de texto Edit
    }
    
    public void procuraEstudante(int id, String nome){ //método para procurar estudantes
        tabela.setRowCount(0); //faz a coluna ficar com zero linhas (limpa tabela)
        
        for(Estudante e: c.procuraEstudante(id, nome, 1)){ //laço que preenche a tabela com cada elemento da lista vinda do médoto procuraEstudante da classe Controle
            tabela.addRow(new Object[]{ //adiciona linha na tabela
                e.getId(), //preenche coluna ID
                e.getNome(), //preenche coluna nome
                e.getDataNasc(), //preenche coluna data de nascimento
                e.getCpf(), //preenhce coluna cpf
                e.getRg(), //preenche coluna rg
                e.getCelular(), //preenche coluna celular
                e.getTelefone(), //preenche coluna telefone
                e.getEmail(), //preenche coluna email
                e.getEnd(), //preenche coluna endereço
                e.getNum(), //preenhce coluna numero
                e.getBairro(), //preenche coluna bairro
                e.getCidade(), //preenche coluna cidade
                e.getUf(), //preenche coluna uf   
        });
       } 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField edtId;
    private javax.swing.JTextField edtNome;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
