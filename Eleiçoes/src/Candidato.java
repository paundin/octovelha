import java.io.Serializable;

public class Candidato implements Serializable{
	private String nome;
	private String numero;
	private boolean isPresident;
	private int qtdVotos = 0;
	
	public int getQtdVotos() {
		return qtdVotos;
	}

	public void setQtdVotos(int qtdVotos) {
		this.qtdVotos = qtdVotos;
	}

	public Candidato(String nome, String numero, boolean isPresident) {
		super();
		this.nome = nome;
		this.numero = numero;
		this.isPresident = isPresident;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public boolean isPresident() {
		return isPresident;
	}

	public void setPresident(boolean isPresident) {
		this.isPresident = isPresident;
	}
	
	public String toString() {
		if (isPresident == true) {
			return "Presidente [ nome= " + nome + ", numero=" + numero + " ]";
		}else {
			return "Governador [ nome= " + nome + ", numero=" + numero + " ]";
		}
	}
}
