package View;

import Controle.Controle;
import Model.Emprestimo;
import Model.Estudante;
import Model.Exemplar;
import Model.Livro;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class efetuarDevolucao extends javax.swing.JFrame {

    Controle c = new Controle();
    DefaultTableModel tabela; //cria o objeto 'tabela' da coleção DefaultTableModel
    
    public efetuarDevolucao() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        edtIdExemplar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        edtTitulo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        edtAutor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        edtEditora = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        edtCategoria = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        edtIdEmprestimo = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        edtIdEstudante = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        edtNome = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        edtEndereco = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        edtNum = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        edtCpf = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        edtRg = new javax.swing.JFormattedTextField();
        btnBuscar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do exemplar"));

        jLabel2.setText("ID do exemplar:");

        jLabel3.setText("Titulo:");

        jLabel4.setText("Autor:");

        edtAutor.setEnabled(false);

        jLabel5.setText("Editora:");

        edtEditora.setEnabled(false);

        jLabel6.setText("Categoria:");

        edtCategoria.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(edtIdExemplar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(edtAutor)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(edtEditora, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(edtTitulo))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(edtIdExemplar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(edtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(edtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(edtEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(edtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jLabel1.setText("ID do empréstimo:");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do estudante"));

        jLabel7.setText("ID do estudante:");
        jLabel7.setToolTipText("");

        edtIdEstudante.setEnabled(false);

        jLabel8.setText("Nome:");

        edtNome.setEnabled(false);

        jLabel9.setText("Endereço:");

        edtEndereco.setEnabled(false);

        jLabel10.setText("Nº:");

        edtNum.setEnabled(false);

        jLabel11.setText("CPF:");

        try {
            edtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        edtCpf.setEnabled(false);

        jLabel12.setText("RG:");

        try {
            edtRg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        edtRg.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtIdEstudante, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(edtNome))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(edtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(edtRg, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(edtEndereco)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtNum, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(edtIdEstudante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(edtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(edtNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(edtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(edtRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnBuscar.setText("Procurar empréstimo");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtIdEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscar)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(edtIdEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Henrique\\Desktop\\projetoJava\\img\\salv.png")); // NOI18N
        jMenu4.setText("Efetuar Devolução");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        jMenu2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Henrique\\Desktop\\projetoJava\\img\\+2.png")); // NOI18N
        jMenu2.setText("Novo");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Henrique\\Desktop\\projetoJava\\img\\close_red.png")); // NOI18N
        jMenu3.setText("Cancelar");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        int intIdExemplar = 0; //cria uma variavel para receber o ID do exemplar e inicializa ele com 0
        int auxIdExemplar = 0; //cria uma variavel auxliar para receber o ID do exemplar e inicializa ele com 0
        int auxIdEmprestimo = 0; //cria uma variavel auxliar para receber o ID do empréstimo e inicializa ele com 0
        int auxIdEstudante = 0; //cria um variavel auxiliar para receber o ID do estudante e inicializa ele com 0
        String auxTitulo = null; //cria uma variavel auxliar para receber o titulo do empréstimo e inicializa ele com null
        String nome = null; //cria uma variavel para receber o nome do estudante e inicializa ele com null
        int aux = 0;  //cria uma variavel auxliar e inicializa ele com 0
        String titulo = edtTitulo.getText(); //variave titulo recebe o que estiver no edit
        
        if (edtIdEmprestimo.getText().toString().isEmpty()) { //verifica se o campo edtIdEmprestimo esta vazio
            auxIdEmprestimo = -1; //caso sim, a variavel 'auxIdEmprestimo' receberá -1
        } else{
          auxIdEmprestimo = Integer.parseInt(edtIdEmprestimo.getText()); //caso nao, Integer.parseInt converterá o texto que estiver no campo de texto edtIdEmprestimo para um valor inteiro e armazenará na variavel auxIdEmprestimo
        }
        
        if (edtIdExemplar.getText().toString().isEmpty()) { //verifica se o campo edtIdExemplar esta vazio
            intIdExemplar = -1; //caso sim, a variavel 'intIdExemplar' receberá -1
        } else{
          intIdExemplar = Integer.parseInt(edtIdExemplar.getText()); //caso nao, Integer.parseInt converterá o texto que estiver no campo de texto edtIdExemplar para um valor inteiro e armazenará na variavel intIdExemplar
        }
        
        if (edtTitulo.getText().toString().isEmpty()) { //verifica se o campo intIdExemplar esta vazio
            titulo = "vazio"; //caso sim, a variavel 'titulo' recebera a string "vazio"
            aux = 1; //e a variavel aux recebera o valor 1 ára indicar qual função usar
        }
        
        if(edtIdExemplar.getText().toString().isEmpty() && edtTitulo.getText().toString().isEmpty() 
                && edtIdEmprestimo.getText().toString().isEmpty()){ //verifica se todos os campors edits estão vazios
            JOptionPane.showMessageDialog(null, "Nenhum empréstimo encontrado!"); //caso sim, aparecerá uma mensagem 
        }
        
        for(Emprestimo e: c.procuraEmprestimo(titulo, intIdExemplar, auxIdEmprestimo)){ //laço para percorrer a lista de emprestimos e preencher os campos do formulario
            auxIdEmprestimo = e.getId(); //recebe o id do emprestimo
            edtIdEmprestimo.setText(Integer.toString(auxIdEmprestimo)); //campo edtIdEmprestimo recebera o valor convertido para String
            auxIdExemplar = e.getExemplar(); //recebe o id do exemplar
            edtIdExemplar.setText(Integer.toString(auxIdExemplar)); //campo edtIdExemplar recebera o valor convertido para String
            auxTitulo = e.getTitulo(); //recebe o titulo do exemplar
            edtTitulo.setText(auxTitulo); //campo edtTitulo recebera o valor da variavel auxTitulo
            auxIdEstudante = e.getEstudante(); //recebe o id do estudante
            edtIdEstudante.setText(Integer.toString(auxIdEstudante)); //campo edtIdEstudante recebera o valor convertido para String
            nome = e.getNomeEst(); //recebe o nome do estudante
            edtNome.setText(nome); //campo edtNome recebera o valor da variavel nome
        }

        
        for(Livro e: c.procuraExemplar(auxTitulo, "vazio", "vazio", auxIdExemplar, 1)){ //laço para percorrer a lista de exemplares e preencher os campos do formulario
            String autor = e.getAutor(); //a vaiavel recebe o autor 
            edtAutor.setText(autor); //campo edtAutor recebera o valor da variavel autor
            String editora = e.getEditora(); //a vaiavel  recebe a editora
            edtEditora.setText(editora); //campo edtEditora recebera o valor da variavel editora
            String categoria = e.getCategoria(); // a vaiavel recebe a categoria
            edtCategoria.addItem(categoria); //campo edtCategoria recebera o valor da variavel categoria
        }
        
        for(Estudante e: c.procuraEstudante(auxIdEstudante, nome, 1)){ //laço para percorrer a lista de estudantes e preencher os campos do formulario
            String endereco = e.getEnd(); //a vaiavel recebe o endereço 
            edtEndereco.setText(endereco); //campo edtEndereco recebera o valor da variavel endereco
            String num = e.getNum(); //a vaiavel recebe o numero 
            edtNum.setText(num); //campo edtNum recebera o valor da variavel num
            String cpf = e.getCpf(); //a vaiavel recebe o cpf 
            edtCpf.setText(cpf); //campo edtCpf recebera o valor da variavel cpf
            String rg = e.getRg(); //a vaiavel recebe o rg 
            edtRg.setText(rg); //campo edtRg recebera o valor da variavel rg
        }
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        limparFormulario(); //chama metodo que limpa o formulário  quando a janela for fechada
    }//GEN-LAST:event_formWindowClosed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        limparFormulario(); //chama metodo que limpa o formulário  quando o botao NOVO for clicado
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        if (JOptionPane.showConfirmDialog(null,"Deseja realmente cancelar o cadastro?")==JOptionPane.OK_OPTION){ //abre uma notificação questionando se o usuário realmente quer cancelar a devolução
            limparFormulario(); //caso, sim, limpará o formulario
            this.dispose(); //janela fecha
        }
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        //BOTÃO EFETUAR DEVOLUçÃO
        String idEmp = edtIdEmprestimo.getText(); //variavel idEmp recebe o que estver escrito no campo edtIdEmprestimo
        int idEmprestimo = Integer.parseInt(idEmp); //variavel idEmpidEmprestimo recebe o valor convertido para INT da variavel idEmp
        String idExemplar = edtIdExemplar.getText(); //variavel idExemplar recebe o que estver escrito no campo edtIdExemplar
        int auxidExemplar = Integer.parseInt(idExemplar); //variavel auxidExemplar recebe o valor convertido para INT da variavel idExemplar
        String titulo = edtTitulo.getText(); //variavel titulo recebe o que estver escrito no campo edtTitulo
        
        if(c.efetuarDevolucao(auxidExemplar, idEmprestimo)==true){ //se a efetuação da devolução ocorrer bem
            if(c.verificaData(titulo, auxidExemplar, idEmprestimo)==false){ //verificara se a data de devolução nao esta em atrsado
                JOptionPane.showMessageDialog(null, "Devolução em atraso!"); //caso estiver, apresentara a mensagem
            }
            JOptionPane.showMessageDialog(null, "Exemplar devolvido com sucesso!"); //caso nao esteja, apresentara a mensagem
        } else {
            JOptionPane.showMessageDialog(null, "ERRO!"); //caso apresente algum erro no processo, apresentara a mensagem de erro
        }
    }//GEN-LAST:event_jMenu4MouseClicked

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
            java.util.logging.Logger.getLogger(efetuarDevolucao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(efetuarDevolucao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(efetuarDevolucao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(efetuarDevolucao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new efetuarDevolucao().setVisible(true);
            }
        });
    }
    
    public void limparFormulario(){
        edtIdEmprestimo.setText(""); //limpa o campo edtIdEmprestimo
        edtIdExemplar.setText(""); //limpa o campo edtIdExemplar
        edtTitulo.setText(""); //limpa o campo edtTitulo
        edtAutor.setText(""); //limpa o campo edtAutor
        edtEditora.setText(""); //limpa o campo edtEditora
        edtCategoria.removeAllItems(); //Limpa o campo de texto edtCategoria
        edtIdEstudante.setText(""); //limpa o campo edtIdEstudante
        edtNome.setText(""); //limpa o campo edtNome
        edtEndereco.setText(""); //limpa o campo edtEndereco
        edtNum.setText(""); //limpa o campo edtNum
        edtCpf.setText(""); //limpa o campo edtCpf
        edtRg.setText(""); //limpa o campo edtRg
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JTextField edtAutor;
    private javax.swing.JComboBox<String> edtCategoria;
    private javax.swing.JFormattedTextField edtCpf;
    private javax.swing.JTextField edtEditora;
    private javax.swing.JTextField edtEndereco;
    private javax.swing.JTextField edtIdEmprestimo;
    private javax.swing.JTextField edtIdEstudante;
    private javax.swing.JTextField edtIdExemplar;
    private javax.swing.JTextField edtNome;
    private javax.swing.JTextField edtNum;
    private javax.swing.JFormattedTextField edtRg;
    private javax.swing.JTextField edtTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
