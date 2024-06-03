package projeto;

import java.util.Scanner;

public class Filme extends Video {
	private Float duracao;
	
	Scanner input = new Scanner(System.in);
	String addRemov;
	int pegarIndc;
	int contador;
	
	public Filme(String name, String director, String description, String genres, String tipe, Float duration, Integer year) {
		this.setNome(name);
		this.setDiretor(director);
		this.setDescricao(description);
		this.setGenero(genres);
		this.setTipo(tipe);
		this.setDuracao(duration);
		this.setAno(year);
	}
	public Filme() {
		this.setAssistindo(false);
	}
	
	public Float getDuracao() {
		return duracao;
	}
	public void setDuracao(Float duracao) {
		this.duracao = duracao;
	}
	
	public void status() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("Diretor(es): " + this.getDiretor());
		System.out.println("Descrição: " + this.getDescricao());
		System.out.println("Gênero: " + this.getGenero());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Duração: " + this.getDuracao() + " (hora.Minuto)");
		System.out.println("Ano de lançamento: " + this.getAno());
	}
	
	public void addF() {	
		System.out.println("Gostaria de adicionar um filme?");
		while(true) {
			addRemov = input.next();
			if ((addRemov.equals("Sim")) || (addRemov.equals("sim"))) {
				System.out.print("Digite o nome do filme: ");
				String no = input.next();
				System.out.println("Digite o nome do diretor(es): ");
				String di = input.next();
				System.out.println("Digite a descrição do filme: ");
				String de = input.next();
				System.out.println("Digite os generos do filme: ");
				String ge = input.next();
				System.out.println("Digite qual é o tipo do filme(live-action ou animação): ");
				String ti = input.next();
				System.out.println("Digite a duração do filme(horas.minutos): ");
				Float du = input.nextFloat();
				System.out.println("Digite o ano de lançamento do filme: ");
				Integer ano = input.nextInt();
				ArrayListGlobal.listaFilmes.add(new Filme(no,di,de,ge,ti,du,ano));
				break;
			}else if ((addRemov.equals("Não")) || (addRemov.equals("não"))) {
				break;
			}else {
				System.out.println("ERRO, digite Sim ou Não");
			}
		}
	}
	
	public void removF() {
		System.out.println("Gostaria de Remover algum filme?");
		while (true) {
			addRemov = input.next();
			if ((addRemov.equals("Sim")) || (addRemov.equals("sim"))) {
				contador = 0;
				for (Filme f : ArrayListGlobal.listaFilmes) {
					System.out.print((contador = contador + 1) + "- ");
					f.status();
					System.out.println("");
				}
				System.out.println("Digite o indice: ");
				while (true) {
					pegarIndc = input.nextInt();
					for(int i = 0; i < ArrayListGlobal.listaFilmes.size(); i++) {
						Filme f = ArrayListGlobal.listaFilmes.get(i);
						if (pegarIndc == i+1) {
							ArrayListGlobal.listaFilmes.remove(i);
							System.out.println("O filme "+ f.getNome() +" Foi removido");
						}else if(pegarIndc > ArrayListGlobal.listaFilmes.size()){
							System.out.println("ERRO, digite um indice que esteja no catálogo");
							pegarIndc = input.nextInt();
						}
					}
					break;
				}
			}else if ((addRemov.equals("Não")) || (addRemov.equals("Não"))) {
				break;
			}else {
				System.out.println("ERRO, digite um ídice já existente");
			}
			break;
		}
	}
}
