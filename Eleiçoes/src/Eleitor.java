import java.io.Serializable;

public class Eleitor implements Serializable{
	private String nome;
	private String secao;
	private String titulo;
	private boolean votou = false;
	
	public Eleitor(String nome, String titulo, String secao) {
		super();
		this.nome = nome;
		this.titulo = titulo;
		this.secao = secao;
	}	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSecao() {
		return secao;
	}

	public void setSecao(String secao) {
		this.secao = secao;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public boolean isVotou() {
		return votou;
	}

	public void setVotou(boolean votou) {
		this.votou = votou;
	}
	
	public String toString() {
		return "Eleitor [ nome= " + nome + ", titulo=" + titulo + " ]";
	}
}
