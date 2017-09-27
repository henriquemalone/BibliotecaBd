
package Model;

import Controle.Controle;
import javax.swing.JOptionPane;

public class Revista extends Exemplar{
    Controle c = new Controle();
    
    public void addRevista(){
        titulo = getTitulo(); //variavel titulo recebe o titulo da revista
        
        c.adicionaExemplar(titulo, "", "", "Revista");
        try{ //tenta realizar
            c.adicionaExemplar(titulo, "", "", "Revista");  //chama o metodo adicionaExemplar da classe Controle
            JOptionPane.showMessageDialog(null, "Exemplar cadastrado com sucesso!"); //abre uma janela informando que o cadastro foi realizado com sucesso
        } catch (Exception ex){ //caso nao consiga realizar
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar o exemplar!\nERRO:"+ex.getMessage()); //abre uma janela informando que ocorreu um erro e qual o erro
        }
    }
}
