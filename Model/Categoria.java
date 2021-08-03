package com.example.demo.Model;

import java.util.Date;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity //classe do JPA
@Table (name = "Categoria") //Dentro do banco de dados isso será uma tabela, com o nome Categoria
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //será a Primary Key da tabela
	private long Id;
	
	@NotNull
	@Size (min = 5, max = 30)
	private String Produto;
	
	@NotNull
	@Size (min = 5, max = 100)
	private String Descrição;
	
	@Temporal(TemporalType.TIMESTAMP) // Parametro do tipo de tempo 
	private Date date = new java.sql.Date(System.currentTimeMillis()); //captura a data/hor/seg/mil que o dado passou pelo Id

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getProduto() {
		return Produto;
	}

	public void setProduto(String produto) {
		Produto = produto;
	}

	public String getDescrição() {
		return Descrição;
	}

	public void setDescrição(String descrição) {
		Descrição = descrição;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}



}
