package projeto;

import java.util.Scanner;

public class Netflix2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String escolha;
		String escolha2;
		int escolhaFilme;
		int escolhaSerie;
		int contador;
		String code;
		Filme filme = new Filme(null,null,null,null,null,null,null);
		Serie serie = new Serie(null,null,null,null,null,null,null);
		Usuario a = new Usuario(null, null);
		Usuario adm = new Usuario("adm@gmail.com", "ADM1N");
		ArrayListGlobal.assinantes.add(adm);
		Filme f1 = new Filme("Velozes & Furiosos", "Rob Cohen", "Brian O'Conner, um policial de Los Angeles, "
				+ "deve decidir onde realmente reside sua lealdade quando ele se apaixona pelo "
				+ "mundo das corridas de rua "
				+ "que foi enviado disfarçado para acabar.", "|Ação| |Policial| |Suspense|", "Live-Action", 1.46f, 2001);
		Filme f2 = new Filme("Mad Max", "George Miller", "Em um mundo autodestrutivo, "
				+ "um vingativo policial australiano se "
				+ "propõe a deter uma violenta gangue de motociclistas.", "|Ação| |Aventura| |Ficção Científica|", "Live-Action", 1.28f, 1979);
		Filme f3 = new Filme("Deadpool", "Tim Miller", "O mercenário brincalhão Wade Wilson, após se "
				+ "tornar imortal e ficar desfigurado devido um experimento, "
				+ "caça o homem que quase lhe destruiu a vida", "|Ação| |Comédia|", "Live-Action", 1.48f, 2016);
		Filme f4 = new Filme("Homen-Aranha: no Aranhaverso", "Bob Persichetti, Peter Ramsey e Rodney Rothman", "O adolescente Miles Morales se "
				+ "torna o Homem-Aranha de seu universo e deve se juntar a cinco indivíduos "
				+ "com poderes de aranha de outras dimensões para impedir "
				+ "uma ameaça para todas as realidades.", "|Ação| |Aventura|", "Animação", 1.57f, 2018);
		ArrayListGlobal.listaFilmes.add(f1);
		ArrayListGlobal.listaFilmes.add(f2);
		ArrayListGlobal.listaFilmes.add(f3);
		ArrayListGlobal.listaFilmes.add(f4);
		
		
		Serie s1 = new Serie("Supernatural", "Eric Kripke", "Dois irmãos seguem os passos do pai como caçadores, "
				+ "lutando contra aterradores seres sobrenaturais que vagam pela terra.", ""
				+ "|Drama| |Fantasia| |Terror|", "Live-Action", 327, 2005);
		Serie s2 = new Serie("Round 6", "Lee Jung-jae, Park Hae-soo e Dylan Besseau", "Centenas de apostadores "
				+ "com dinheiro em caixa aceitam um convite bizarro para competir em jogos infantis. "
				+ "Por dentro, um prêmio tentador espera com um jogo de sobrevivência de alto risco "
				+ "que tem um prêmio de 40 milhões de dólares em jogo.", "|Ação| |Drama| |Mistério|", "Live-Action", 9, 2021);
		Serie s3 = new Serie("X-Men 97'", "Beau DeMayo, Stan Lee, Jack Kirby", "Um grupo de mutantes usa seus "
				+ "fabulosos dons para proteger um mundo que os teme e os odeia.", "|Ação| |Aventura|", "Animação", 10, 2024);
		ArrayListGlobal.listaSeries.add(s1);
		ArrayListGlobal.listaSeries.add(s2);
		ArrayListGlobal.listaSeries.add(s3);
		
		System.out.println("			|---MAX-CINE---|");
		System.out.println("Bem vindo ao MAX-CINE, o melhor local para assistir suas series e filmes.");
		System.out.println("Informe seu email e senha para efetuar o login.");
		System.out.println("Digite 0 se quiser criar uma nova conta");
		a.verifE();
		a.verifS();
		System.out.println("		|---LISTA-DE-SERVIÇOS---|");
		System.out.println("[1] Filmes");
		System.out.println("[2] Séries");
		System.out.println("[3] Sair do programa");
		while(true) {
			escolha = input.next();
			if (escolha.equals("1")) { 
				contador = 0;
				System.out.println("		|---LISTA-DE-FILMES---|");
				for (Filme filmes : ArrayListGlobal.listaFilmes) {
					System.out.print( (contador = 1 + contador) + " - ");
					filmes.status();
					System.out.println("");
				}System.out.println("Caso queira voltar para a tela inicial digite 999.");
					while(true) {
						escolhaFilme = input.nextInt();
						for (int i = 0; i < ArrayListGlobal.listaFilmes.size(); i++) {
							ArrayListGlobal.listaFilmes.get(i);
							Filme f = ArrayListGlobal.listaFilmes.get(i);
							if (escolhaFilme == i+1) {
								f.assistir();
								f.parar();
								break;
							}else if(escolhaFilme == 999) {
								System.out.println("Saindo do Aplictivo.");
								break;
							}else if(escolhaFilme > ArrayListGlobal.listaFilmes.size()) {
								System.out.println("Erro, Selecione uma das opções dadas.");
								escolhaFilme = input.nextInt();
							}
						}break;
					}
			System.out.println("		|---LISTA-DE-SERVIÇOS---|");
			System.out.println("[1] Filmes");
			System.out.println("[2] Séries");
				System.out.println("[3] Sair do programa");
			}else if (escolha.equals("2")) {
				contador = 0;
				System.out.println("		|---LISTA-DE-SÉRIES---|");
				for (Serie series : ArrayListGlobal.listaSeries) {
					System.out.print( (contador = 1 + contador) + " - ");
					series.status();
					System.out.println("");
				}System.out.println("Caso queira voltar para a tela incial digite 999.");
					while(true) {
						escolhaSerie = input.nextInt();
						for (int i = 0; i < ArrayListGlobal.listaSeries.size(); i++) {
							ArrayListGlobal.listaFilmes.get(i);
							Serie s = ArrayListGlobal.listaSeries.get(i);
							if (escolhaSerie == i+1) {
								s.assistir();
								s.parar();
								break;
							}else if(escolhaSerie == 999) {
								System.out.println("Saindo do Aplictivo");
								break;
							}else if(escolhaSerie > ArrayListGlobal.listaSeries.size()) {
								System.out.println("Erro, Selecione uma das opções dadas");
								escolhaSerie = input.nextInt();
							}
						}break;
					}
			System.out.println("		|---LISTA-DE-SERVIÇOS---|");
			System.out.println("[1] Filmes");
			System.out.println("[2] Séries");
			System.out.println("[3] Sair do programa");
			}else if (escolha.equals("3")){
				System.out.println("Saindo do aplicativo");
				break;
			}else if (escolha.equals(adm.getSenha())){
				System.out.println("Digite o codigo de acesso: ");
				while(true) {
					code = input.next();
					if (code.equals(adm.getAcsCode())) {
						System.out.println("			|--PAINEL-DO-ADMIN---|");
						System.out.println("[1] Adicionar/remover Filme");
						System.out.println("[2] Adcionar/remover Série");
						System.out.println("[3] Sair do painel do Admin");
						escolha2 = input.next();
						if (escolha2.equals("1")){
							filme.addF();
							filme.removF();
							System.out.println("Adicionado com sucesso");
							break;
						}else if (escolha2.equals("2")) {
							serie.addS();
							serie.removS();
							break;
						}else if (escolha2.equals("3")) {
							break;
						}else {
							System.out.println("ERRO, digite uma das opções dadas");
						}
					}else {
						System.out.println("Incorreto, tente novamente");
					}
				}
				System.out.println("		|---LISTA-DE-SERVIÇOS---|");
				System.out.println("[1] Filmes");
				System.out.println("[2] Séries");
				System.out.println("[3] Sair do programa");
			}
			
			else {
				System.out.println("Erro, digite uma das opções dadas");
				System.out.println("[1] Filmes");
				System.out.println("[2] Séries");
				System.out.println("[3] Sair do programa");
			}
		}
		input.close();
	}
}
