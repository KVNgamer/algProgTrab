
public class palestra {
		
	private String titulo,descricao;//tiulo e descricao da palestra
	private int sala, hora;//sala e horario da palestra
	
	public void addPalestrante() {
		palestrante palestrante=new palestrante();
		palestrante.informacaoPalestra();
	}
	public void addParticipante() {
		participante participante=new participante();
		participante.informacaoParticipante();
	}
	
public String InformacaoEvento() {
		
		return ("\nSala e Horario:"+getSala()+"		 as 		"+getHora()+""
						+  "\nA palestra marcada sera:"+getTitulo()+ "				sobre:"+getDescricao() );
	}
	
	
	public int getSala() {
		return sala;
	}
	public void setSala(int sala) {
		this.sala = sala;
	}
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
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