
package Controle;

import Model.DAO; //importa a classe DAO
import Model.Emprestimo;
import Model.Estudante; //importa a classe Estudante
import Model.Exemplar;
import Model.Livro;
import java.sql.Connection; //importa a classe de conexões para o banco de dados
import java.sql.PreparedStatement; //classe usada para banco de dados
import java.sql.ResultSet; //classe usada para banco de dados
import java.sql.SQLException; //classe usada para banco de dados
import java.util.ArrayList; //importa a coleção ArrayList
import java.util.Date;
import java.util.List; //importa a classe List
import java.util.logging.Level; //classe de erro do try, catch
import java.util.logging.Logger; //classe de erro do try, catch
import javax.swing.JOptionPane; //importa swing do JOptionPane (janela de notificação)

public class Controle {
    DAO dao = new DAO(); //cria o objeto 'dao' da classe DAO
    Estudante estudante; //objeto da classe Estudante
    Exemplar exemplar; //objeto da classe Exemplar
    Emprestimo emprestimo; //objeto da classe Emprestimo
    Connection con = dao.conectar(); //cria uma conexão 'con'
    PreparedStatement stmt = null;
    ResultSet rs = null;
    
        public boolean adicionaEstudante(String nome, String sexo, String dataNasc, String cpf, String rg, String celular, 
                                         String telefone, String email, String end, String bairro, String cep, String num, 
                                         String uf, String cidade){    
            try{
            String query = " insert into estudantes (nome, sexo, dataNasc, cpf, rg, celular, telefone, email, endereco,cidade,  "
                            + "bairro, cep, uf, numero)"+ " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"; //linha de comando que será usado no mysql para inserir o registro
            PreparedStatement preparedStmt = dao.conectar().prepareStatement(query); //conecta com o banco
            preparedStmt.setString (1, nome); //adiciona a variavel nome no lugar do '?'
            preparedStmt.setString (2, sexo); //adiciona a variavel sexo no lugar do '?'
            preparedStmt.setString (3, dataNasc); //adiciona a variavel dataNasc no lugar do '?'
            preparedStmt.setString (4, cpf); //adiciona a variavel cpf no lugar do '?'
            preparedStmt.setString (5, rg); //adiciona a variavel rg no lugar do '?'
            preparedStmt.setString (6, celular); //adiciona a variavel celular no lugar do '?'
            preparedStmt.setString (7, telefone); //adiciona a variavel telefone no lugar do '?'
            preparedStmt.setString (8, email); //adiciona a variavel email no lugar do '?'
            preparedStmt.setString (9, end); //adiciona a variavel end no lugar do '?'
            preparedStmt.setString (10, cidade); //adiciona a variavel cidade no lugar do '?'
            preparedStmt.setString (11, bairro); //adiciona a variavel bairro no lugar do '?'
            preparedStmt.setString (12, cep); //adiciona a variavel cep no lugar do '?'
            preparedStmt.setString (13, uf); //adiciona a variavel uf no lugar do '?'
            preparedStmt.setString (14, num); //adiciona a variavel num no lugar do '?'
            preparedStmt.execute(); //executa o comando sql
        
            return true; 
            }catch (Exception e) {
                return false;
            }
	}
        
        public List<Estudante> exibeEstudantes(){
            List<Estudante> listaEstudantes = new ArrayList<Estudante>(); //cria uma lista de estudantes

            try{
            stmt = con.prepareStatement("SELECT * FROM estudantes"); //linha de comando que será usado no mysql para selecionar todos os registros
            rs  = stmt.executeQuery(); //executa o comando sql
            
            while(rs.next()){ //laço para 
                estudante = new Estudante(); //instancia o objeto estudante
                estudante.setId(rs.getInt("idestudante")); //envia para o respectivo set o valor da coluna 'idestudante' do banco de dados
                estudante.setNome(rs.getString("nome")); //envia para o respectivo set o valor da coluna 'nome' do banco de dados
                estudante.setDataNasc(rs.getString("dataNasc")); //envia para o respectivo set o valor da coluna 'dataNasc' do banco de dados
                estudante.setCpf(rs.getString("cpf")); //envia para o respectivo set o valor da coluna 'cpf' do banco de dados
                estudante.setRg(rs.getString("rg")); //envia para o respectivo set o valor da coluna 'rg' do banco de dados
                estudante.setCelular(rs.getString("celular")); //envia para o respectivo set o valor da coluna 'celular' do banco de dados
                estudante.setTelefone(rs.getString("telefone")); //envia para o respectivo set o valor da coluna 'telefone' do banco de dados
                estudante.setEmail(rs.getString("email")); //envia para o respectivo set o valor da coluna 'email' do banco de dados
                estudante.setEnd(rs.getString("endereco")); //envia para o respectivo set o valor da coluna 'endereco' do banco de dados
                estudante.setCidade(rs.getString("cidade")); //envia para o respectivo set o valor da coluna 'cidade' do banco de dados
                estudante.setBairro(rs.getString("bairro")); //envia para o respectivo set o valor da coluna 'bairro' do banco de dados
                estudante.setUf(rs.getString("uf")); //envia para o respectivo set o valor da coluna 'uf' do banco de dados
                estudante.setNum(rs.getString("numero")); //envia para o respectivo set o valor da coluna 'numero' do banco de dados
                  
                listaEstudantes.add(estudante); //adiciona o objeto 'estudante' na lista 'listaEstudantes'
            }
            } catch(SQLException ex){
               Logger.getLogger(Controle.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            return listaEstudantes;
        }
        
        public List<Estudante> procuraEstudante(int id, String nome, int aux) {       
            List<Estudante> procuraEstudante = new ArrayList<Estudante>(); //cria uma lista procuraEstudante
            
            try{
                stmt = con.prepareStatement("SELECT * FROM estudantes WHERE idestudante LIKE "+id+" OR nome LIKE ?"); //linha de comando que será usado no mysql para pesquisar todos os registros com o id ou nome passados por parametro
                stmt.setString(1, "%"+nome+"%"); //adiciona a variavel nome no lugar do '?'
                rs  = stmt.executeQuery(); //executa o comando no mysql
            
                while(rs.next()){
                    estudante = new Estudante();
                    estudante.setId(rs.getInt("idestudante")); //envia para o respectivo set o valor da coluna 'idestudante' do banco de dados
                    estudante.setNome(rs.getString("nome")); //envia para o respectivo set o valor da coluna 'nome' do banco de dados
                    estudante.setDataNasc(rs.getString("dataNasc")); //envia para o respectivo set o valor da coluna 'dataNasc' do banco de dados
                    estudante.setCpf(rs.getString("cpf")); //envia para o respectivo set o valor da coluna 'cpf' do banco de dados
                    estudante.setSexo(rs.getString("sexo")); //envia para o respectivo set o valor da coluna 'sexo' do banco de dados
                    estudante.setRg(rs.getString("rg")); //envia para o respectivo set o valor da coluna 'rg' do banco de dados
                    estudante.setCelular(rs.getString("celular")); //envia para o respectivo set o valor da coluna 'celular' do banco de dados
                    estudante.setTelefone(rs.getString("telefone")); //envia para o respectivo set o valor da coluna 'telefone' do banco de dados
                    estudante.setEmail(rs.getString("email")); //envia para o respectivo set o valor da coluna 'email' do banco de dados
                    estudante.setEnd(rs.getString("endereco")); //envia para o respectivo set o valor da coluna 'endereco' do banco de dados
                    estudante.setCep(rs.getString("cep")); //envia para o respectivo set o valor da coluna 'endereco' do banco de dados
                    estudante.setCidade(rs.getString("cidade")); //envia para o respectivo set o valor da coluna 'cidade' do banco de dados
                    estudante.setBairro(rs.getString("bairro")); //envia para o respectivo set o valor da coluna 'bairro' do banco de dados
                    estudante.setUf(rs.getString("uf")); //envia para o respectivo set o valor da coluna 'uf' do banco de dados
                    estudante.setNum(rs.getString("numero")); //envia para o respectivo set o valor da coluna 'numero' do banco de dados
                 
                    procuraEstudante.add(estudante); //adiciona os estudantes encontrados na lista 'procuraEstudante'
                }
            } catch(SQLException ex){
                Logger.getLogger(Controle.class.getName()).log(Level.SEVERE, null, ex); //caso ocorra algum erro abrirá uma janela informando o erro
                }

            return procuraEstudante;
        }
        
        public boolean deletaEstudante(int id){
            try{
                String query = " DELETE FROM estudantes WHERE idestudante LIKE "+id; //linha de comando que será usado no mysql
                PreparedStatement preparedStmt = dao.conectar().prepareStatement(query); //conecta com o banco de dados
                preparedStmt.execute(); //executa o comando
                
                return true;
            } catch (Exception e){     
                return false;
            }
        }
        
        public boolean editaEstudante(int id, String nome, String sexo, String dataNasc, String cpf, String rg, String celular, 
                                      String telefone, String email, String end, String bairro, String cep, String num, String uf,
                                      String cidade){
            try{
                String query = " UPDATE estudantes SET nome = ?, sexo = ?, dataNasc = ?, cpf = ?, rg = ?, celular = ?, telefone = ?,"
                               + " email = ?, endereco = ?, cidade = ?,  bairro = ?, cep = ?, uf = ?, numero = ? "
                               + "WHERE idestudante LIKE "+id; //linha de comando que será usado no mysql para alterar o registro
                
                PreparedStatement preparedStmt = dao.conectar().prepareStatement(query); //conecta com o banco
                preparedStmt.setString (1, nome); //adiciona a variavel nome no lugar do '?'
                preparedStmt.setString (2, sexo); //adiciona a variavel sexo no lugar do '?'
                preparedStmt.setString (3, dataNasc); //adiciona a variavel dataNasc no lugar do '?'
                preparedStmt.setString (4, cpf); //adiciona a variavel cpf no lugar do '?'
                preparedStmt.setString (5, rg); //adiciona a variavel rg no lugar do '?'
                preparedStmt.setString (6, celular); //adiciona a variavel celular no lugar do '?'
                preparedStmt.setString (7, telefone); //adiciona a variavel telefone no lugar do '?'
                preparedStmt.setString (8, email); //adiciona a variavel email no lugar do '?'
                preparedStmt.setString (9, end); //adiciona a variavel end no lugar do '?'
                preparedStmt.setString (10, cidade); //adiciona a variavel cidade no lugar do '?'
                preparedStmt.setString (11, bairro); //adiciona a variavel bairro no lugar do '?'
                preparedStmt.setString (12, cep); //adiciona a variavel cep no lugar do '?'
                preparedStmt.setString (13, uf); //adiciona a variavel uf no lugar do '?'
                preparedStmt.setString (14, num); //adiciona a variavel num no lugar do '?'
                preparedStmt.execute(); //executa o comando sql
                
                return true;
            } catch (Exception e) {
                return false;
            }
        }
        
        public boolean adicionaExemplar(String titulo, String autor, String editora, String categoria) { //metodo para adicionar exemplar no banco de dados
            try{
            String query = " insert into exemplares (titulo, autor, editora, categoria, emprestado)"+ " values (?, ?, ?, ?, 0)"; //linha de comando do myseql
            PreparedStatement preparedStmt = dao.conectar().prepareStatement(query); //conexão com o banco de dados
            preparedStmt.setString (1, titulo); //variavel que substituira os '?' a linha de comando do mysql
            preparedStmt.setString (2, autor);  //variavel que substituira os '?' a linha de comando do mysql
            preparedStmt.setString (3, editora);  //variavel que substituira os '?' a linha de comando do mysql
            preparedStmt.setString (4, categoria);  //variavel que substituira os '?' a linha de comando do mysql
            preparedStmt.execute(); //executa os comandos mysql
        
            return true; 
            }catch (Exception e) {
                return false;
            }
	}
        
        public List<Livro> procuraExemplar(String titulo, String autor, String editora, int id, int aux) { //metodo para procurar exemplares
            List<Livro> procuraexemplar = new ArrayList<Livro>(); //lista de exemplares encontrados
            
            if(aux == 1){ //caso seja passado o valor ' do parameto aux
                try{
                stmt = con.prepareStatement("SELECT * FROM exemplares WHERE idexemplar = "+id+" OR titulo LIKE ? AND autor LIKE ? AND editora LIKE ?"); //linha de comando do mysql
                stmt.setString(1, "%"+titulo+"%"); //variavel que substituira os '?' a linha de comando do mysql
                stmt.setString(2, "%"+autor+"%"); //variavel que substituira os '?' a linha de comando do mysql
                stmt.setString(3, "%"+editora+"%"); //variavel que substituira os '?' a linha de comando do mysql
                rs  = stmt.executeQuery(); //executa os comando no mysql
            
                while(rs.next()){ //laço para receber os valores do banco de dados e inserir na lista
                    Livro livro = new Livro(); //cria o objeto livro da classe Livro
                    livro.setId(rs.getInt("idexemplar")); //recebe o valor da coluna idexemplar do banco de dados
                    livro.setTitulo(rs.getString("titulo")); //recebe o valor da coluna titulo do banco de dados
                    livro.setAutor(rs.getString("autor")); //recebe o valor da coluna autor do banco de dados
                    livro.setEditora(rs.getString("editora")); //recebe o valor da coluna editora do banco de dados
                    livro.setCategoria(rs.getString("categoria")); //recebe o valor da coluna categoria do banco de dados
                    
                    procuraexemplar.add(livro);//adiciona na lista
                }
            } catch(SQLException ex){
                Logger.getLogger(Controle.class.getName()).log(Level.SEVERE, null, ex); //caso de erro
            }
                
            return procuraexemplar; //retorna a lista preenchida
            
            } else {
                try{ //caso o valor da variavel aux seja diferente de 1
                    stmt = con.prepareStatement("SELECT * FROM exemplares WHERE titulo LIKE ?"); //linah de comando do mysql
                    stmt.setString(1, "%"+titulo+"%"); //variavel que substituira os '?' a linha de comando do mysql
                    rs  = stmt.executeQuery(); //executa os comando no mysql
            
                    while(rs.next()){ //laço para receber os valores do banco de dados e inserir na lista
                        Livro livro = new Livro(); //cria o objeto livro da classe Livro
                        livro.setId(rs.getInt("idexemplar")); //recebe o valor da coluna idexemplar do banco de dados
                        livro.setTitulo(rs.getString("titulo")); //recebe o valor da coluna titulo do banco de dados
                        livro.setAutor(rs.getString("autor")); //recebe o valor da coluna autor do banco de dados
                        livro.setEditora(rs.getString("editora")); //recebe o valor da coluna editora do banco de dados
                        livro.setCategoria(rs.getString("categoria")); //recebe o valor da coluna categoria do banco de dados
                    
                     procuraexemplar.add(livro);//adiciona na lista
                    }
                } catch(SQLException ex){
                    Logger.getLogger(Controle.class.getName()).log(Level.SEVERE, null, ex); //caso de erro
                }
                
                return procuraexemplar; //retorna a lista preenchida
            }
        }
        
        public List<Livro> exibeExemplares(){
            List<Livro> listaExemplares = new ArrayList<Livro>(); //cria uma lista de estudantes
            
            try{
                stmt = con.prepareStatement("SELECT * FROM exemplares"); //linha de comando do mysql
                rs  = stmt.executeQuery(); //executa o comando do mysql
            
                while(rs.next()){ //laço para receber os valores do banco de dados e inserir na lista
                    Livro livro = new Livro(); //cria o objeto livro da classe Livro
                    livro.setId(rs.getInt("idexemplar")); //recebe o valor da coluna idexemplar do banco de dados
                    livro.setTitulo(rs.getString("titulo"));//recebe o valor da coluna titulo do banco de dados
                    livro.setAutor(rs.getString("autor")); //recebe o valor da coluna autor do banco de dados
                    livro.setEditora(rs.getString("editora")); //recebe o valor da coluna editora do banco de dados
                    livro.setCategoria(rs.getString("categoria")); //recebe o valor da coluna categoria do banco de dados
                    
                    listaExemplares.add(livro); //adiciona na lista
                }
            } catch(SQLException ex){
                Logger.getLogger(Controle.class.getName()).log(Level.SEVERE, null, ex); //caso de erro
            }
            
            return listaExemplares; //retorna lista de exemplares
        }
        
        public boolean deletaExemplar(int id){
            try{
                String query = " DELETE FROM exemplares WHERE idexemplar LIKE "+id; //linha de comando que será usado no mysql
                PreparedStatement preparedStmt = dao.conectar().prepareStatement(query); //conecta com o banco de dados
                preparedStmt.execute(); //executa o comando
                
                return true;
            } catch (Exception e){     
                return false;
            }
        }
        
        public void efetuaEmprestimo(String titulo, int idEst, String nome, int idEx, Date DataDevol){ //metodo para efetuar emprestimo
            int verificaEmprestado = 0; //variavel para verificar se o exempar ja esta emprestado

            try{
                stmt = con.prepareStatement("SELECT emprestado FROM exemplares WHERE idexemplar LIKE ?"); //linha de comando do mysql
                stmt.setInt(1, idEx); //substitu a variavel o '?' pela variavel idEx
                rs  = stmt.executeQuery(); //executa linha de comando no mysql
                if(rs != null && rs.next()){ //verifica se a coluna "emprestado" esta preenchida
                    verificaEmprestado = rs.getInt("emprestado");  //variavel recebe o valor que estiver na coluna "emprestado"
                }
            }catch (Exception e) {
                JOptionPane.showMessageDialog(null, "ERRO:"+e.getMessage()); //msg de erro caso houver
            }
            
            if(verificaEmprestado == 1){ //verifica se a variavel é igual a 1, 
                JOptionPane.showMessageDialog(null, "Exemplar já emprestado!"); //caso seja, significa que o exemplar ja esta emprestado
            } else{ // se nao             
                int aux = 0; //variavel auxiliar
                try{
                    String query = " insert into emprestimo (titulo, idestudante, nomeEstudante, idTitulo, dataPrevisao)"+ " values (?, ?, ?, ?, ?)"; //inha de comando do mysql
                    PreparedStatement preparedStmt = dao.conectar().prepareStatement(query); //conecta com o banco de dados
                    preparedStmt.setString (1, titulo); //variavel que vai subistitui o '?' na linha de comando mysql
                    preparedStmt.setInt (2, idEst); //variavel que vai subistitui o '?' na linha de comando mysql
                    preparedStmt.setString (3, nome); //variavel que vai subistitui o '?' na linha de comando mysql
                    preparedStmt.setInt (4, idEx); //variavel que vai subistitui o '?' na linha de comando mysql
                    preparedStmt.setDate (5, (java.sql.Date) DataDevol); //variavel que vai subistitui o '?' na linha de comando mysql
                    preparedStmt.execute(); //executa o comando mysql
        
                    JOptionPane.showMessageDialog(null, "Empréstimo realizado com sucesso!");
                    aux++;
                }catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Erro ao efetuar o empréstimo!\nERRO:"+e.getMessage());
                }
            
            if(aux>0){
                try{
                    String query = " UPDATE exemplares SET emprestado = 1 WHERE idexemplar LIKE "+idEx; 
                    PreparedStatement preparedStmt = dao.conectar().prepareStatement(query);
                    preparedStmt.execute();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Erro ao realizar o empréstimo!\nERRO:"+e.getMessage());
                }
            }		
            }
        }
    
    public List<Emprestimo> procuraEmprestimo(String titulo, int idExemplar, int idEmprestimo) { //metodo para procurar emprestimo
        List<Emprestimo> listaemprestimos = new ArrayList<Emprestimo>(); //cria uma lista de estudantes
        
        try{
            stmt = con.prepareStatement("SELECT * FROM emprestimo WHERE idemprestimo = "+idEmprestimo+" OR idTitulo = "+idExemplar+" OR titulo LIKE ?"); //linha de comando do mysql
            stmt.setString(1, "%"+titulo+"%"); //subatitui o '?' pela variavel titulo
            rs  = stmt.executeQuery(); //executa comando mysql
            
            while(rs.next()){ 
                emprestimo = new Emprestimo(); //cria objeto da classe Emprestimo
                emprestimo.setId(rs.getInt("idemprestimo")); //recebe o valor da coluna idemprestimo do banco de dados
                emprestimo.setExemplar(rs.getInt("idTitulo")); //recebe o valor da coluna idTitulo do banco de dados
                emprestimo.setTitulo(rs.getString("titulo")); //recebe o valor da coluna titulo do banco de dados
                emprestimo.setNomeEst(rs.getString("nomeEstudante")); //recebe o valor da coluna nomeEstudante do banco de dados
                emprestimo.setEstudante(rs.getInt("idestudante")); //recebe o valor da coluna idestudante do banco de dados
                emprestimo.setDataDevolucao(rs.getDate("dataDevolucao")); //recebe o valor da coluna dataDevolucao do banco de dados
                emprestimo.setDataPrevisao(rs.getDate("dataPrevisao")); //recebe o valor da coluna dataPrevisao do banco de dados
                emprestimo.setDataEmprestimo(rs.getString("dataEmprestimo")); //recebe o valor da coluna dataEmprestimo do banco de dados
                    
                listaemprestimos.add(emprestimo); //adiciona na lista
            }
        } catch(SQLException ex){
            Logger.getLogger(Controle.class.getName()).log(Level.SEVERE, null, ex); //erro
        }       
        
        return listaemprestimos; //retorna a lista
    }
    
    public boolean efetuarDevolucao(int id, int idEmp){	//metodo para devolução de exemplar	
        try{
            String query = " UPDATE exemplares SET emprestado = 0 WHERE idexemplar LIKE "+id; //linha de comando do mysql
            PreparedStatement preparedStmt = dao.conectar().prepareStatement(query); //conexão com o banco de dados
            preparedStmt.execute(); //eecuta o comando mysql
                
            String query2 = " UPDATE emprestimo SET dataDevolucao = NOW() WHERE idemprestimo LIKE "+idEmp;  //linha de comando do mysql
            PreparedStatement preparedStmt2 = dao.conectar().prepareStatement(query2); //conexão com o banco de dados
            preparedStmt2.execute(); //eecuta o comando mysql

            return true;
        } catch (Exception e) {
                
            return false;
        }
    };
    
    public boolean verificaData(String titulo, int intIdExemplar, int auxIdEmprestimo){ //metodo para verificar a data de devolução
        Date dataDevolucao = null; //variavel data devolução
        Date dataPrevisao = null; //variavel data devolução
        
        for(Emprestimo e: procuraEmprestimo(titulo, intIdExemplar, auxIdEmprestimo)){ //laço para receber as datas da devolução e de previsão
            dataDevolucao = e.getDataDevolucao(); //variavel receberá a data de devolução
            dataPrevisao = e.getDataPrevisao(); //variavel receberá a data de previsão
        }
        
        if (dataDevolucao.before(dataPrevisao)){ //verifica se a data de devolução é posterior a data da previsao de devolução
            return true;
	} else {
            return false;
        }
    }
    
    public List<Emprestimo> exibeEmprestimo(){
            List<Emprestimo> listaEmprestimos = new ArrayList<Emprestimo>(); //cria uma lista de estudantes
            
            try{
                stmt = con.prepareStatement("SELECT * FROM emprestimo"); //linha de comando do mysql
                rs  = stmt.executeQuery(); //executa a linah de comando
             
                while(rs.next()){  //laço para receber os valores do banco de dados e inserir na lista
                    Emprestimo emprestimo = new Emprestimo(); //cria o objeto emprestimo da classe Emprestimo
                    emprestimo.setId(rs.getInt("idemprestimo")); //recebe do banco de dados a coluna idemprestimo
                    emprestimo.setTitulo(rs.getString("titulo")); //recebe do banco de dados a coluna titulo
                    emprestimo.setNomeEst(rs.getString("nomeEstudante")); //recebe do banco de dados a coluna nomeEstudante
                    emprestimo.setDataPrevisao(rs.getDate("dataPrevisao")); //recebe do banco de dados a coluna dataPrevisao
                    emprestimo.setEstudante(rs.getInt("idestudante"));   //recebe do banco de dados a coluna idestudante
                    emprestimo.setExemplar(rs.getInt("idTitulo"));   //recebe do banco de dados a coluna idTitulo
                    emprestimo.setDataDevolucao(rs.getDate("dataDevolucao")); //recebe do banco de dados a coluna dataDevolucao
                    emprestimo.setDataEmprestimo(rs.getString("dataEmprestimo")); //recebe do banco de dados a coluna dataEmprestimo
                    
                    listaEmprestimos.add(emprestimo); //adiciona na lista
                }
            } catch(SQLException ex){
                Logger.getLogger(Controle.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            return listaEmprestimos; //retorna a lista
        }
    
    
        
    
}
