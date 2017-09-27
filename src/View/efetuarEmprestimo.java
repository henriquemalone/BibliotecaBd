package View;

import Controle.Controle;
import Model.Emprestimo;
import Model.Estudante;
import Model.Livro;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class efetuarEmprestimo extends javax.swing.JFrame {

    Controle c = new Controle(); //cria o objeto 'c' da classe Controle
    
    public efetuarEmprestimo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        edtAutor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        edtEditora = new javax.swing.JTextField();
        edtCategoria = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        btnBuscarExemplar = new javax.swing.JButton();
        edtIdExemplar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        edtTitulo = new javax.swing.JTextField();
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
        btnBuscarEstudante = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        edtDataDevolucao = new javax.swing.JFormattedTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("EFETUAR EMPRÉSTIMO");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Exemplar"));

        jLabel2.setText("ID do exemplar:");

        jLabel4.setText("Autor:");

        edtAutor.setEnabled(false);

        jLabel5.setText("Editora:");

        edtEditora.setEnabled(false);

        edtCategoria.setEnabled(false);

        jLabel6.setText("Categoria:");

        btnBuscarExemplar.setText("Buscar");
        btnBuscarExemplar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarExemplarActionPerformed(evt);
            }
        });

        jLabel3.setText("Título:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtEditora))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtIdExemplar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtTitulo))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscarExemplar)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(edtIdExemplar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(edtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(edtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(edtEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(btnBuscarExemplar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Estudante"));

        jLabel7.setText("ID do estudante:");

        jLabel8.setText("Nome:");

        edtNome.setEnabled(false);

        jLabel9.setText("Endereço:");

        edtEndereco.setEnabled(false);

        jLabel10.setText("Nº:");

        edtNum.setEnabled(false);

        jLabel11.setText("CPF:");
        jLabel11.setToolTipText("");

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

        btnBuscarEstudante.setText("Buscar");
        btnBuscarEstudante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarEstudanteActionPerformed(evt);
            }
        });

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
                        .addComponent(edtIdEstudante, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtNome))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtEndereco)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtNum, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtRg, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscarEstudante)))
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
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(edtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(edtNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(edtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(edtRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBuscarEstudante))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Emprestar"));

        jLabel13.setText("Data de devolução:");

        try {
            edtDataDevolucao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edtDataDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(291, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(edtDataDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(125, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(83, 83, 83))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Henrique\\Desktop\\projetoJava\\img\\salv.png")); // NOI18N
        jMenu1.setText("Efetuar empréstimo");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Henrique\\Desktop\\projetoJava\\img\\+2.png")); // NOI18N
        jMenu2.setText("Novo");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenu2MouseEntered(evt);
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        edtTitulo.setText(""); //Limpa o campo de texto Edit
        edtAutor.setText(""); //Limpa o campo de texto Edit
        edtEditora.setText(""); //Limpa o campo de texto Edit
        edtIdEstudante.setText(""); //Limpa o campo de texto Edit
        edtIdExemplar.setText(""); //Limpa o campo de texto Edit
        edtNome.setText(""); //Limpa o campo de texto Edit
        edtEndereco.setText(""); //Limpa o campo de texto Edit
        edtNum.setText(""); //Limpa o campo de texto Edit
        edtCpf.setText(""); //Limpa o campo de texto Edit
        edtRg.setText(""); //Limpa o campo de texto Edit
        edtDataDevolucao.setText(""); //Limpa o campo de texto Edit
        edtCategoria.removeAllItems(); //Limpa o campo de texto Edit
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        if (JOptionPane.showConfirmDialog(null,"Deseja realmente cancelar o cadastro?")==JOptionPane.OK_OPTION){ //abre uma notificação questionando se o usuário realmente quer cancelar o cadastro
            edtTitulo.setText(""); //Limpa o campo de texto Edit
            edtAutor.setText(""); //Limpa o campo de texto Edit
            edtEditora.setText(""); //Limpa o campo de texto Edit
            edtIdEstudante.setText(""); //Limpa o campo de texto Edit
            edtIdExemplar.setText(""); //Limpa o campo de texto Edit
            edtNome.setText(""); //Limpa o campo de texto Edit
            edtEndereco.setText(""); //Limpa o campo de texto Edit
            edtNum.setText(""); //Limpa o campo de texto Edit
            edtCpf.setText(""); //Limpa o campo de texto Edit
            edtRg.setText(""); //Limpa o campo de texto Edit
            edtDataDevolucao.setText(""); //Limpa o campo de texto Edit
            edtCategoria.setSelectedItem(""); //Limpa o campo de texto Edit   
            this.dispose(); //fecha a janela
        } 
    }//GEN-LAST:event_jMenu3MouseClicked

    private void btnBuscarExemplarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarExemplarActionPerformed
        // BOTÃO PESQUISAR, PAINEL EXEMPLAR
        int intId; //variavel que recebera o ID do tipo int
        int aux = 0; //variavel auxiliar
        String titulo = edtTitulo.getText(); //variavel titulo recebera o que estiver no campo edtTitulo
        
        if (edtIdExemplar.getText().toString().isEmpty()) { //verifica se o campo teto Edit esta vazio
            intId = -1; //caso sim, a variavel 'intId' receberá -1
        } else{
          intId = Integer.parseInt(edtIdExemplar.getText()); //caso nao, Integer.parseInt converterá o texto que estiver no campo de texto Edit para um valor inteiro e armazenará na variavel intId
        }
        
        if (edtTitulo.getText().toString().isEmpty()) { //verifica se o campo teto Edit esta vazio
            titulo = "vazio"; //caso sim, a variavel titulonome' recebera a string "vazio"
            aux = 1; //variavel auxiliar recebera 1 para determinar qual função usar posteriormente
        }
        
        if(edtIdExemplar.getText().toString().isEmpty() && edtTitulo.getText().toString().isEmpty()){ //verifica se todos os campos estão vazios
            JOptionPane.showMessageDialog(null, "Nenhum exemplar encontrado!"); //caso sim, a mensagem será apresentada
        }
        
        if(c.procuraExemplar(titulo,"vazio","vazio",intId, aux).isEmpty()){ //verifica se nenhum exemplar foi encontrado
            JOptionPane.showMessageDialog(null, "Nenhum exemplar encontrado!"); //caso sim, a mensagem será apresentada
        } else {
            for(Livro e: c.procuraExemplar(titulo,"vazio","vazio",intId, aux)){ //laço para percorrer a lista de exemplares e preencher os campos do formulario
                int auxId = e.getId(); //variavel auxId recebera o ID do exemplar
                edtIdExemplar.setText(Integer.toString(auxId)); //campo edtIdExemplar é preenchido com o valor da variavel auxId apos ser convertida para um tipo String
                String auxTitulo = e.getTitulo(); //variavel auxTitulo recebera o titulo
                edtTitulo.setText(auxTitulo); //campo edtTitulo é preenchido com o valor da variavel auxTitulo
                String autor = e.getAutor(); //variavel autor recebera o autor
                edtAutor.setText(autor); //campo edtAutor é preenchido com o valor da variavel autor
                String editora = e.getEditora(); //variavel editora recebera a editora
                edtEditora.setText(editora); //campo edtEditora é preenchido com o valor da variavel editora
                String categoria = e.getCategoria(); //variavel categoria recebera a categoria
                edtCategoria.addItem(categoria); //campo edtCategoria é preenchido com o valor da variavel categoria
            }
        }
    }//GEN-LAST:event_btnBuscarExemplarActionPerformed

    private void jMenu2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2MouseEntered

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        limparFormulario(); //limpa o formuláro quando a janela é fechada
    }//GEN-LAST:event_formWindowClosed

    private void btnBuscarEstudanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarEstudanteActionPerformed
        //BOTÃO BUSCAR ESTUDANTE
        int intId; //variavel recebera o ID do estudante do tipo int
        int aux = 0; //variavel auxiliar
        String nome = edtNome.getText(); //variavel nome receber o que estiver escrito no campo edtNome
        
        if (edtIdEstudante.getText().toString().isEmpty()) { //verifica se o campo teto Edit esta vazio
            intId = -1; //caso sim, a variavel 'intId' receberá -1
        } else{
          intId = Integer.parseInt(edtIdEstudante.getText()); //caso nao, Integer.parseInt converterá o texto que estiver no campo de texto Edit para um valor inteiro e armazenará na variavel intId
        }
        
        if (edtNome.getText().toString().isEmpty()) { //verifica se o campo teto Edit esta vazio
            nome = "vazio"; //caso sim, a variavel 'nome' recebera a string "vazio"
            aux = 1; //variavel auxiliar recebera 1 para eterminar o tipo de busca posteriormente
        }
        
        if(edtIdEstudante.getText().toString().isEmpty() && edtNome.getText().toString().isEmpty()){ //verifica se todos os campos estão vazios
            JOptionPane.showMessageDialog(null, "Nenhum estudante encontrado!"); //caso sim, a mensagem sera exibida
        }
        
        if(c.procuraEstudante(intId, nome, 1).isEmpty()){ //verifica se nenhum estudante foi encontrado
            JOptionPane.showMessageDialog(null, "Nenhum estudante encontrado!"); //caso sim, a mensagem será apresentada
        } else {
            for(Estudante e: c.procuraEstudante(intId, nome, 1)){ //laço para percorrer a lista de estudantes e preencher os campos do formulario
                int auxId = e.getId(); //variavel auxId recebera o ID do estudante
                edtIdEstudante.setText(Integer.toString(auxId)); //campo edtIdEstudante sera preenchido com a variavel auxId após convertido para uma variavel do tipo String
                String auxNome = e.getNome(); //variavel auxNome recebera o nome do estudante
                edtNome.setText(auxNome); //campo edtNome sera preenchido com a variavel auxNome
                String endereco = e.getEnd(); //variavel endereco recebera o endereço do estudante
                edtEndereco.setText(endereco);//campo edtEndereco sera preenchido com a variavel endereco
                String num = e.getNum(); //variavel num recebera o numero do estudante
                edtNum.setText(num);//campo edtNum sera preenchido com a variavel num
                String cpf = e.getCpf(); //variavel cpf recebera o cpf do estudante
                edtCpf.setText(cpf);//campo edtCpf sera preenchido com a variavel cpf
                String rg = e.getRg(); //variavel rg recebera o rg do estudante
                edtRg.setText(rg);//campo edtRg sera preenchido com a variavel rg
            }
        }
    }//GEN-LAST:event_btnBuscarEstudanteActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy"); //cria um objeto 'dataFormat' do tipo Data
        
        if(edtIdEstudante.getText().toString().isEmpty() && edtNome.getText().toString().isEmpty() && 
                edtIdExemplar.getText().toString().isEmpty() && edtTitulo.getText().toString().isEmpty() &&
                edtDataDevolucao.getText().toString().isEmpty()){ //verifica se todos os campos estão vazios
            JOptionPane.showMessageDialog(null, "Verifique se todos os campos estão preenchidos!"); //caso sim, a mensagem é mostrada e o sistema nao progride
        } else {
            try {
                Emprestimo emprestimo = new Emprestimo(); //cria objeto 'emprestimo' da classe Emprestimo
                String idExemplar = edtIdExemplar.getText(); //variavel idExemplar recebe o que estiver no campo edtIdExemplar
                int auxIdExemplar = Integer.parseInt(idExemplar); //variavel auxIdExemplar receber o valor da variavel idExemplar convertida para um tipo Int
                String idEstudante = edtIdEstudante.getText(); //variavel idEstudante recebe o que estiver no campo edtIdEstudante
                int auxIdEstudante = Integer.parseInt(idEstudante); //variavel auxIdEstudante receber o valor da variavel idEstudante convertida para um tipo Int
                String titulo = edtTitulo.getText(); //variavel titulo recebe o que estiver no campo edtTitulo
                String nome = edtNome.getText(); //variavel nome recebe o que estiver no campo edtNome
                String dataDevolucao = edtDataDevolucao.getText(); //variavel dataDevolucao recebe o que estiver no campo edtDataDevolucao
                Date dataf = dateFormat.parse(dataDevolucao); //converte a variavel dataDevolucao para o tipo data aceitavel pelo Mysql
                java.sql.Date dataSql = new java.sql.Date(dataf.getTime()); //código da net, nao lembor o que faz x.x
            
                emprestimo.setEstudante(auxIdEstudante); //envia o valor da variavel auxIdEstudante para seu respectivo set na classe Emprestimo
                emprestimo.setExemplar(auxIdExemplar); //envia o valor da variavel auxIdExemplar para seu respectivo set na classe Emprestimo
                emprestimo.setTitulo(titulo); //envia o valor da variavel titulo para seu respectivo set na classe Emprestimo
                emprestimo.setNomeEst(nome); //envia o valor da variavel nome para seu respectivo set na classe Emprestimo
                emprestimo.setDataPrevisao(dataSql); //envia o valor da variavel setDataPrevisao para seu respectivo set na classe Emprestimo
            
                emprestimo.addEmprestimo(); //adiciona o empréstimo
            } catch (ParseException ex) {
                Logger.getLogger(efetuarEmprestimo.class.getName()).log(Level.SEVERE, null, ex); //se houver erro, retorna erro
            }
        }
    }//GEN-LAST:event_jMenu1MouseClicked

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
            java.util.logging.Logger.getLogger(efetuarEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(efetuarEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(efetuarEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(efetuarEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new efetuarEmprestimo().setVisible(true);
            }
        });
    }
    
    public void limparFormulario(){
        edtIdExemplar.setText(""); //Limpa o campo de texto Edit
        edtTitulo.setText(""); //Limpa o campo de texto Edit
        edtAutor.setText(""); //Limpa o campo de texto Edit
        edtEditora.setText(""); //Limpa o campo de texto Edit
        edtCategoria.removeAllItems(); //Limpa o campo de texto Edit
        edtIdEstudante.setText(""); //Limpa o campo de texto Edit
        edtNome.setText(""); //Limpa o campo de texto Edit
        edtEndereco.setText(""); //Limpa o campo de texto Edit
        edtNum.setText(""); //Limpa o campo de texto Edit
        edtCpf.setText(""); //Limpa o campo de texto Edit
        edtRg.setText(""); //Limpa o campo de texto Edit
        edtDataDevolucao.setText("");   //Limpa o campo de texto Edit
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarEstudante;
    private javax.swing.JButton btnBuscarExemplar;
    private javax.swing.JTextField edtAutor;
    private javax.swing.JComboBox<String> edtCategoria;
    private javax.swing.JFormattedTextField edtCpf;
    private javax.swing.JFormattedTextField edtDataDevolucao;
    private javax.swing.JTextField edtEditora;
    private javax.swing.JTextField edtEndereco;
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
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
