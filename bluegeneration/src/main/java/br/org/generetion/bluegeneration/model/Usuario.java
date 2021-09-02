package br.org.generetion.bluegeneration.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull(message = "O atributo nome é obrigatório")
	@Size(min = 3, max = 300, message = "O atributo nome deve ter no mínimo 3 e no máximo 100 caracteres")
	private String nome;
	
	@NotNull(message = "O atributo nome é obrigatório")
	@Size(min = 3, max = 300, message = "O atributo nome deve ter no mínimo 3 e no máximo 100 caracteres")
	private String email;
	
	@NotNull(message = "O atributo nome é obrigatório")
	@Size(min = 6, max = 500, message = "O atributo nome deve ter no mínimo 6 e no máximo 100 caracteres")
	private String senha;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
