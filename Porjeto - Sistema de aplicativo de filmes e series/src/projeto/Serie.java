package projeto;

import java.util.Scanner;

public class Serie extends Video{
	private Integer qEpisodios;
	
	Scanner input = new Scanner(System.in);
	String addRemov;
	int pegarIndc;
	int contador;
	
	public Serie(String name, String director, String description, String genres, String tipe, Integer qEps, Integer year) {
		this.setNome(name);
		this.setDiretor(director);
		this.setDescricao(description);
		this.setGenero(genres);
		this.setTipo(tipe);
		this.setQEpisodios(qEps);
		this.setAno(year);
	}
	public Serie() {
		this.setAssistindo(false);
	}
	
	public int getQEpisodios() {
		return qEpisodios;
	}

	public void setQEpisodios(Integer qEpisodios) {
		this.qEpisodios = qEpisodios;
	}
	
	public void status() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("Diretor(es)/Criador(es): " + this.getDiretor());
		System.out.println("Descrição: " + this.getDescricao());
		System.out.println("Gênero: " + this.getGenero());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Assistindo: " + this.getAssistindo());
		System.out.println("Duração: " + this.getQEpisodios());
		System.out.println("Ano de lançamento: " + this.getAno());
	}
	
	public void addS() {	
		System.out.println("Gostaria de adicionar uma Série?");
		while(true) {
			addRemov = input.next();
			if ((addRemov.equals("Sim")) || (addRemov.equals("sim"))) {
				System.out.print("Digite o nome da Série: ");
				String no = input.next();
				System.out.print("Digite o nome do diretor(es): ");
				String di = input.next();
				System.out.print("Digite a descrição da Série: ");
				String de = input.next();
				System.out.print("Digite os generos da Série: ");
				String ge = input.next();
				System.out.print("Digite qual é o tipo da Série(live-action ou animação): ");
				String ti = input.next();
				System.out.print("Digite a quantidade de episodios da Série: ");
				Integer du = input.nextInt();
				System.out.print("Digite o ano de lançamento da Série: ");
				Integer ano = input.nextInt();
				ArrayListGlobal.listaSeries.add(new Serie(no,di,de,ge,ti,du,ano));
				break;
			}else if ((addRemov.equals("Não")) || (addRemov.equals("não"))) {
				break;
			}else {
				System.out.println("ERRO, digite Sim ou Não");
			}
		}
	}
	
	public void removS() {
		System.out.println("Gostaria de Remover alguma série?");
		while (true) {
			addRemov = input.next();
			if ((addRemov.equals("Sim")) || (addRemov.equals("sim"))) {
				contador = 0;
				for (Serie s : ArrayListGlobal.listaSeries) {
					System.out.print((contador = contador + 1) + "- ");
					s.status();
					System.out.println("");
				}
				System.out.println("Digite o indice: ");
				while (true) {
					pegarIndc = input.nextInt();
					for(int i = 0; i < ArrayListGlobal.listaSeries.size(); i++) {
						Serie s = ArrayListGlobal.listaSeries.get(i);
						if (pegarIndc == i+1) {
							ArrayListGlobal.listaSeries.remove(i);
							System.out.println("A série "+ s.getNome() +" Foi removida");
						}else if(pegarIndc > ArrayListGlobal.listaSeries.size()){
							System.out.println("ERRO, digite um indice que esteja no catálogo");
							pegarIndc = input.nextInt();
						}
					}
					break;
				}
			}else if ((addRemov.equals("Não") || (addRemov.equals("Não")))) {
				break;
			}else {
				System.out.println("ERRO, digite um ídice já existente");
			}
			break;
		}
	}
}

