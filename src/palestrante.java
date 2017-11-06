
public class palestrante {
	palestra palestra=new palestra();
	console console=new console();
	
	private String email,curriculo;
	private int fone;
	
	public void informacaoPalestra() {
	this.email="sdasdas@gmail.com";
	this.curriculo="locurada total";
	this.fone=516696364;
	palestra.setTitulo(console.print("qual o titulo da sua palestra ?"));
	palestra.setDescricao(console.print("qual a descriicao da sua palestra?"));
	palestra.setSala(console.printInt("qual sala sera usada ?"));
	palestra.setHora(console.printInt("qual o horario que comecara a palestra ?"));
	}
}
