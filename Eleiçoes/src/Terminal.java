import java.util.ArrayList;
import java.util.Map;
import javax.swing.JOptionPane;

public class Terminal {
	private Map<String, Eleitor> eleitoresMap;
	private Map<String, Candidato> candidatosMap;
	static ArrayList<Eleitor> Eleitores = new ArrayList();
	static ArrayList<Candidato> Candidatos = new ArrayList();
			public static void main(String[] args) {
				
				Eleitor a = new Eleitor("Claudio", "111", "1");
				Eleitor b = new Eleitor("Maria", "112", "1");
				Eleitor c = new Eleitor("Jorge", "221", "2");
				Eleitor d = new Eleitor("Clarisse", "222", "2");
				Eleitor f = new Eleitor("Fernando", "331", "3");
				Eleitor g = new Eleitor("Rebeca", "332", "1");
				Eleitor[] facil = {a,b,c,d,f,g};
				
				Eleitores.add(a);
				Eleitores.add(b);
				Eleitores.add(c);
				Eleitores.add(d);
				Eleitores.add(f);
				Eleitores.add(g);
				
				try {
					Serializador.serializar("Arquivos/Eleitor", Eleitores);
					System.out.println("O arquivo foi salvo com sucesso!");
				} catch (Exception e) {
					e.printStackTrace();
				}
				Candidato a1 = new Candidato("Claudio", "11", false);
				Candidato b2 = new Candidato("Maria", "12", false);
				Candidato c3 = new Candidato("Jorge", "21", true);
				Candidato d4 = new Candidato("Clarisse", "22", true);
				Candidatos.add(a1);
				Candidatos.add(b2);
				Candidatos.add(c3);
				Candidatos.add(d4);
				try {
					Serializador.serializar("Arquivos/Candidatos", Candidatos);
					System.out.println("O arquivo foi salvo com sucesso!");
				} catch (Exception e) {
					e.printStackTrace();
				}
		
				String secao = JOptionPane.showInputDialog("Seçao:");
				String titulo = JOptionPane.showInputDialog("Titulo:");
				for (int i = 0; i < Eleitores.size(); i++) {
					if (Eleitores.get(i).getTitulo() == titulo) {
						Object[] opces = {"OK","CANCELAR"};
						String a2 = Eleitores.get(i).toString(); 
						JOptionPane.showOptionDialog(null, a2,
								"Eleitor", JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION, null, opces,
								opces);
						Eleitores.get(i).setVotou(true);
						urna();
						
						
					} else {
						JOptionPane.showMessageDialog(null, "Voce nao existe");
						System.exit(0);
					}
				}
				try {
					Serializador.serializar("Arquivos/Eleitor", Eleitores);
					System.out.println("O arquivo foi salvo com sucesso!");
				} catch (Exception e) {
					e.printStackTrace();
				}
			
				}
				
				public static void urna(){
					Object[] opcoes = {Candidatos.get(0).getNome(), Candidatos.get(1).getNome()};
					Object obj = JOptionPane.showInputDialog(null,
							"Governador", "Urna", JOptionPane.QUESTION_MESSAGE,
							null, opcoes, opcoes[0] );
					if (obj == Candidatos.get(0).getNome()){
						Candidatos.get(0).setQtdVotos(Candidatos.get(0).getQtdVotos() + 1);
					}
					if (obj == Candidatos.get(1).getNome()){
						Candidatos.get(1).setQtdVotos(Candidatos.get(1).getQtdVotos() + 1);
					}
					
					Object[] opc = {Candidatos.get(2).getNome(), Candidatos.get(3).getNome()};
					Object pre = JOptionPane.showInputDialog(null, 
							"Presidente", "Urna", JOptionPane.QUESTION_MESSAGE,
							null, opc, opc[0]);
					if (pre == Candidatos.get(2).getNome()){
						Candidatos.get(2).setQtdVotos(Candidatos.get(2).getQtdVotos() + 1);
					}
					if (obj == Candidatos.get(3).getNome()){
						Candidatos.get(3).setQtdVotos(Candidatos.get(3).getQtdVotos() + 1);
					}
					
					try {
						Serializador.serializar("Arquivos/Candidatos", Candidatos);
						System.out.println("O arquivo foi salvo com sucesso!");
					} catch (Exception e) {
						e.printStackTrace();
					}	
					}
				
					
}

