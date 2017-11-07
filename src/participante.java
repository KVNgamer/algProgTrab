
public class participante {
	console console=new console();
	
	private String nome ,email;

	
	public void informacaoParticipante() {
		this.email=console.print("qual seu email ?");
		this.nome=console.print("qual seu email ?");
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
