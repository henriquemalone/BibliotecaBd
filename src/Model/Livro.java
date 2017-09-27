
package Model;

import Controle.Controle;
import javax.swing.JOptionPane;

public class Livro extends Exemplar{ //classe herda da classe Exemplar
    public String autor; //variavel que ira receber o autor do exemplar
    public String editora; //variavel que ira receber a editora do exemplar
    Controle c = new Controle(); //cria o objeto 'c' da calsse Controle

    public String getEditora() { //retorna a editora do exemplar
        return editora;
    }

    public void setEditora(String editora) { //recebe a editora do exemplar
        this.editora = editora;
    }
	
    public String getAutor(){ //retorna o autor do exemplar
		
	return autor;
    }
	
    public void setAutor(String p_autor){ //recebe o autor do exemplar
	this.autor=p_autor;
    }
     
    public void addLivro(){ //metodo para adicionar o Livro no banco de dados
        titulo = getTitulo(); //variavel titulo recebe o titulo
        autor = getAutor(); //variavel autor recebe o autor
        editora = getEditora();//variavel editora recebe o editora
       
        try{ //tenta realizar
            c.adicionaExemplar(titulo, autor, editora, "Livro");  //chama o metodo adicionaExemplar da classe Controle
            JOptionPane.showMessageDialog(null, "Exemplar cadastrado com sucesso!"); //abre uma janela informando que o cadastro foi realizado com sucesso
        } catch (Exception ex){ //caso nao consiga realizar
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar o exemplar!\nERRO:"+ex.getMessage()); //abre uma janela informando que ocorreu um erro e qual o erro
        }
    }
}
