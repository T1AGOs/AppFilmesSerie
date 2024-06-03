package projeto;

import java.util.Scanner;

public class Video {
	private String nome;
	private String diretor;
	private String descricao;
	private String genero;
	private String tipo;
	private Integer ano;
	private boolean assistindo;
	
	Scanner input = new Scanner(System.in);
	String escolha;
	
	public Video() {
		setAssistindo(false);
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDiretor() {
		return diretor;
	}
	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public boolean getAssistindo() {
		return assistindo;
	}
	public void setAssistindo(boolean assistindo) {
		this.assistindo = assistindo;
	}
	
	public int getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public void assistir() {
		System.out.println("Gostaria de assistir a " + this.getNome() + "?");
		while(true) {
			escolha = input.next();
			if ((escolha.equals("Sim")) || (escolha.equals("sim"))) {
				this.setAssistindo(true);
				System.out.println("Assistindo.");
				break;
			}else if((escolha.equals("Não")) || (escolha.equals("não"))) {
				System.out.println("Ok");
				break;
			}else {
				System.out.println("Por favor, digite sim ou não.");
			}
		}
	}
		
	public void parar() {
		if (this.getAssistindo() == true) {
			while(true) {
				System.out.println("Você esta assistindo "+ this.getNome() +", gostaria de parar?");
				escolha = input.next();
				if ((escolha.equals("Sim")) || (escolha.equals("sim"))) {
					this.setAssistindo(false);
					System.out.println("O filme/série foi parado.");
					break;
				}else {
					this.setAssistindo(true);
					System.out.println("Filme/Série continua.");
				}
			}
		}else {
			System.out.println("Nenhum filme/série foi selecionada.");
		}
	}
}


