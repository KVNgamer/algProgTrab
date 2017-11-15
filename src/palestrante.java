
public class palestrante {	
	console console=new console();
	private String email,curriculo;
	private int fone;
	
	
	private String titulo,descricao;//tiulo e descricao da palestra
	
	public void informacaoPalestrante() {
	this.titulo=console.print("qual o titulo da palestra ??");
	this.descricao=console.print("qual qual a descriçao da palestra?");
	this.email=console.print("qual seu email ?");
	this.curriculo=console.print("curriculo ?");
	this.fone=console.printInt("telefone para contato ?");
	
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCurriculo() {
		return curriculo;
	}

	public void setCurriculo(String curriculo) {
		this.curriculo = curriculo;
	}

	public int getFone() {
		return fone;
	}

	public void setFone(int fone) {
		this.fone = fone;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
