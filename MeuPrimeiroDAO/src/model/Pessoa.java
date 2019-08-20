package model;

public class Pessoa {
	private int id;
	private String nome;
	private String contato;

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public Pessoa(int id, String nome, String contato) {
		super();
		this.id = id;
		this.nome = nome;
		this.contato = contato;
	}

	public Pessoa() {
		super();
	}

	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + "]";
	}

}
