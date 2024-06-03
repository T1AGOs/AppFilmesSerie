package projeto;

import java.util.Scanner;

public class Usuario {
	private String email;
	private String senha;
	private String acsCode;
	
	Scanner input = new Scanner(System.in);
	String nEmail;
	String nSenha;
	
	public Usuario(String e, String s) {
		this.setEmail(e);
		this.setSenha(s);
	}
	public Usuario() {
		this.setAcsCode("IDKFA"); 
	}


	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getAcsCode() {
		return acsCode;
	}
	public void setAcsCode(String acsCode) {
		this.acsCode = acsCode;
	}

	public void criarU() {
		boolean criouCon = false;
		System.out.println("Digite o email para criar a conta: ");
		while(true) {
			nEmail = input.next();
			if (!nEmail.contains("@") && !nEmail.contains(".com")){
				System.out.println("Email inválido.");       
			}else {
				this.setEmail(nEmail);
				System.out.println("Email aceito");
				System.out.println("Digite a Senha da sua nova conta(máximo de 5 dígitos): ");
			}while(true) {
					nSenha = input.next();
					if (nSenha.contains(" ") || (nSenha.length()>5)) {
						System.out.println("Senha invalida,tente novamente.");
					}else {
						this.setSenha(nSenha);
						System.out.println("Conta Criada com sucsesso.");
						ArrayListGlobal.assinantes.add(this);
						criouCon = true;
						break;
					}
			}
			if (criouCon == true) {
				System.out.println("Digite o email: ");
				nEmail = input.next();
				break;
			}
		}
	}
	
	public void verifE() {
		boolean emailEnc = false;
		System.out.println("Digite o email: ");
		while(true) {
			nEmail = input.next();
			if( nEmail.equals("0")){
				this.criarU();
				System.out.println("Digite o email: ");
				continue;
			}else {
				for (Usuario A : ArrayListGlobal.assinantes) {
					if (nEmail.equals(A.getEmail())) {
						System.out.println("Email aceito.");
						emailEnc = true;
						break;
					}
				}
			}
			if (emailEnc == true) {
				break;
			}else {
				System.out.println("Email invalido, tente novamente");
			}
		}
	}
	public void verifS() {
		boolean senhaEnc = false;  
		System.out.println("Digite a senha(máximo de 5 dígitos):");
		while(true) {
			nSenha = input.next();
			if (nSenha.length() > 5) {
				System.out.println("Senha tem mais de 5 digitos, tente novamente");
			}
			for (Usuario a : ArrayListGlobal.assinantes) {
				if (nSenha.equals(a.getSenha())) {
					System.out.println("Senha aceita.");
					senhaEnc = true;
					break;
				}
			}
			if (senhaEnc == true) {
				break;
			}else {
				System.out.println("Senha invalida, tente novamente");
			}
		}
	}
}
	


