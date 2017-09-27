package Model;

import Controle.Controle;
import java.sql.Date;

public class Emprestimo {
    private Date dataDevolucao; //variavel do tipo date para receber a data de devolução
    private String dataEmprestimo; //variavel do tipo string para receber a data de emprestimo
    private Date dataPrevisao; //variavel do tipo date para receber a data de previsao
    private String titulo; //variavel do tipo string para receber o titulo
    private String nomeEstudante; //variavel do tipo string para receber o nome do estudante
    private int exemplar; //variavel do tipo int para receber o id do exemplar
    public int estudante; //variavel do tipo int para receber o id do estudante
    private int idEmp; //variavel do tipo int para receber o id do emprestimo
	
    public Emprestimo(){ //construtor

    }
        
    public void setNomeEst(String nomeEstudante){ //recebe nome do estudante
        this.nomeEstudante = nomeEstudante;
    }
	
    public String getNomeEst(){ //retorna nome do estudante
        return this.nomeEstudante;
    }
        
    public void setDataPrevisao(Date dataPrevisao){ //recebe data de previsao
        this.dataPrevisao = dataPrevisao;
    }
    
    public Date getDataPrevisao(){  //retorna data de previsao
        return this.dataPrevisao;
    }
        
    public void setTitulo(String titulo){ //recebe titulo
        this.titulo = titulo;
    }
	
    public String getTitulo(){ //retorna titulo
	return this.titulo;
    }
        
    public void setId(int id){ //recebe id do emprestimo
        this.idEmp = id;
    }
	
    public int getId(){ //retorna id do emprestimo
	return this.idEmp;
    }
	
    public void setEstudante(int id){ //recebe id do estudante
        this.estudante = id;
    }	
	
    public int getEstudante(){  //retorna id do estudante
        return this.estudante;
    }
	
    public int getExemplar(){ //retorna id do exemplar
	return exemplar;
    }
	
    public void setExemplar(int p_exemplar){//recebe id do exemplar
        exemplar = p_exemplar;
    }

    public void setDataDevolucao(Date data){ //recebe data de devolução
        this.dataDevolucao = data;
    }
	
    public Date getDataDevolucao(){ //retorna data de devolução
	return this.dataDevolucao;
    }
        
    public void setDataEmprestimo(String data){ //recebe data de emprestimo
        this.dataEmprestimo = data;
    }
	
    public String getDataEmprestimo(){ //retorna data de emprestimo
        return this.dataEmprestimo;
    }
	
	
    public void addEmprestimo(){ //adiciona emprestimo
        Controle c = new Controle(); //cria objeto 'c' do tipo Controle
        
        titulo = getTitulo(); //variavel recebe o titulo
        exemplar = getExemplar(); //variavel recebe o id do exemplar
        estudante = getEstudante(); //variavel recebe o id do estudante
        nomeEstudante = getNomeEst(); //variavel recebe nome do estudante
        dataPrevisao = getDataPrevisao(); //variavel recebe data de devolução
        
        c.efetuaEmprestimo(titulo, estudante, nomeEstudante, exemplar, dataPrevisao); //chama metodo que efetua o emprestimo
    }

}
