import javax.swing.JOptionPane;


public class Menu {
	public static void main(String[] args) {
		main:
		while (true){
			Object[] opcoes = {"TERMINAL", "TRE", "MESARIO"};
			Object obj = JOptionPane.showInputDialog(null,
					"ACESSO", "MENU PRINCIPAL", JOptionPane.QUESTION_MESSAGE,
					null, opcoes, opcoes[0] );
			if (obj == opcoes[0]) {
				Terminal terminal = new Terminal();
				Terminal.main(args);
			}else if (obj == opcoes[1]) {
				TRE tre = new TRE();
				Object[] opc = {"Cadastro candidato", "Cadastro Eleitor",};
				Object o = JOptionPane.showInputDialog(null,
						"Cadastro", "TRE", JOptionPane.QUESTION_MESSAGE,
						null, opc, opc[0] );
				if (o == opc[0]) {
					String nome = JOptionPane.showInputDialog("Nome do candidato");
					String numero = JOptionPane.showInputDialog("numero do candidato");
					String presidente = JOptionPane.showInputDialog("É presidente? \n [1] SIM [2] NAO");
	
					if (presidente == "1") {
						Candidato novo = new Candidato(nome,numero, true);
						tre.cadastrarCandidato(novo);
					}else if (presidente == "2") {
						Candidato novo = new Candidato(nome,numero, false);
						tre.cadastrarCandidato(novo);
					
					}
				}
				if (o == opc[0]) {
					String nome1 = JOptionPane.showInputDialog("Nome do Eleitor");
					String numero1 = JOptionPane.showInputDialog("Titulo do Eleitor");
					String secao1 = JOptionPane.showInputDialog("Seção do Eleitor");
					Eleitor novo = new Eleitor(nome1,secao1,numero1);
					tre.cadastrarEleitor(novo);
				}
			}else if (obj == opcoes[2]) {
				String fechar = JOptionPane.showInputDialog("Codigo de finalizaçao");
				if (fechar == "999999999") {
					break main;
				}
			}
			
			}
	}
}
	

