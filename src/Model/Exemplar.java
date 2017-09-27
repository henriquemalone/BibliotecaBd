
package Model;

public class Exemplar {
    private int id; //variavel para receber o id do exemplar
    String titulo; //variavel para receber o titulo do exemplar
    String categoria; //variavel para receber a categoria do exemplar
	
    public Exemplar(){ //construtor

    }
	
    public int getId(){ //retorna o id do exemplar
		
	return id; 
    }
        
    public void setId(int id){ //recebe id do exemplar
	this.id=id;
    }
	
	
    public String getTitulo(){ //retorna titulo do exemplar
		
	return titulo;
    }
	
    public void setTitulo(String p_titulo){ //recebe titulo do exemplar
	this.titulo=p_titulo;
    }
        
    public String getCategoria(){ //retorna categoria do exemplar
		
	return categoria;
    }
	
    public void setCategoria(String categoria){ //recebe categoria do exemplar
	this.categoria=categoria;
    }
}
