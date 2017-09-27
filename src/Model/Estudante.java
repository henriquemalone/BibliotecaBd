/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controle.Controle; //importa classe Controle
import java.sql.SQLException; //importa "biblioteca" do SQL
import javax.swing.JOptionPane; //importa swing do JOptionPane (janela de notificação)

public class Estudante {
    Controle c = new Controle(); //cria objeto 'c' da classe Controle
    
    //variaveis do objeto
    private int id;
    private String nome;
    private String sexo;
    private String dataNasc;
    private String rg;
    private String cpf;
    private String celular;
    private String telefone;
    private String email;
    private String end;
    private String bairro;
    private String cidade;
    private String cep;
    private String uf;
    private String num;

    public int getId() { //retorna o id
        return id;
    }

    public void setId(int id) { //recebe o id
        this.id = id;
    }

    public String getNome() { //retorna o nome
        return nome;
    }

    public void setNome(String nome) { //recebe o nome
        this.nome = nome;
    }

    public String getSexo() { //retorna o sexo
        return sexo;
    }

    public void setSexo(String sexo) { //recebe o sexo
        this.sexo = sexo;
    }

    public String getDataNasc() { //retorna a data de nascimento
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) { //recebe a data de nascimento
        this.dataNasc = dataNasc;
    }

    public String getRg() { //retorna o rg
        return rg;
    }

    public void setRg(String rg) { //recebe o rg
        this.rg = rg;
    }

    public String getCpf() { //retorna o cpf
        return cpf;
    }

    public void setCpf(String cpf) { //recebe o cpf
        this.cpf = cpf;
    }

    public String getCelular() { //retorna o celular
        return celular;
    }

    public void setCelular(String celular) { //recebe o celular
        this.celular = celular;
    }

    public String getTelefone() { //retorna o telefone
        return telefone;
    }

    public void setTelefone(String telefone) { //recebe o telefone
        this.telefone = telefone;
    }

    public String getEmail() { //retorna o email
        return email;
    }

    public void setEmail(String email) { //recebe o email
        this.email = email;
    }

    public String getEnd() { //retorna o endereço
        return end;
    }

    public void setEnd(String end) { //recebe o endereço
        this.end = end;
    }

    public String getBairro() { //retorna o bairro
        return bairro;
    }

    public void setBairro(String bairro) { //recebe o bairro
        this.bairro = bairro;
    }

    public String getCidade() { //retorna a cidade
        return cidade;
    }

    public void setCidade(String cidade) { //recebe a cidade
        this.cidade = cidade;
    }

    public String getCep() { //retorna o cep
        return cep;
    }

    public void setCep(String cep) { //recebe o cep
        this.cep = cep;
    }

    public String getUf() { //retorna o uf
        return uf;
    }

    public void setUf(String uf) { //recebe o uf
        this.uf = uf;
    }

    public String getNum() { //retorna o numero
        return num;
    }

    public void setNum(String num) { //recebe o numero
        this.num = num;
    }
    
    public void addEstudante(){ //método para enviar os valores e adicinar o estudante ao banco
        nome = getNome(); //variavel 'nome' recebe o get
        sexo = getSexo();//variavel 'sexo' recebe o get
        dataNasc = getDataNasc(); //variavel 'dataNasc' recebe o get
        cpf = getCpf(); //variavel 'cpf' recebe o get
        rg = getRg(); //variavel 'rg' recebe o get
        celular = getCelular(); //variavel 'celular' recebe o get
        telefone = getTelefone(); //variavel 'telefone' recebe o get
        email = getEmail(); //variavel 'email' recebe o get
        end = getEnd(); //variavel 'end' recebe o get
        bairro = getBairro(); //variavel 'bairro' recebe o get
        cep = getCep(); //variavel 'cep' recebe o get
        uf = getUf(); //variavel 'uf' recebe o get
        num = getNum(); //variavel 'num' recebe o get
        
        try{ //tenta realizar
            c.adicionaEstudante(nome, sexo, dataNasc, cpf, rg, celular, telefone, email, end, bairro, cep, num, uf, cidade); //chama p metodo adicionaEstudante da classe Controle
            JOptionPane.showMessageDialog(null, "Estudante cadastrado com sucesso!"); //abre uma janela informando que o cadastro foi realizado com sucesso
        }catch (Exception e){ //caso nao consiga realizar
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar o estudante!\nERRO:"+e.getMessage()); //abe uma janela informando que ocorreu um erro e qual o erro
        }
    }
    
}
