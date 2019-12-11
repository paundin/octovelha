import java.util.ArrayList;

public class TRE extends Terminal{
	public void cadastrarEleitor(Eleitor eleitor) {
		Eleitores.add(eleitor);
		try {
			Serializador.serializar("Arquivos/Eleitor", Eleitores);
			System.out.println("O arquivo foi salvo com sucesso!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void cadastrarCandidato(Candidato candidato) {
		Candidatos.add(candidato);
		try {
			Serializador.serializar("Arquivos/Candidatos", Candidatos);
			System.out.println("O arquivo foi salvo com sucesso!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


