
public class palestrante {	
	private String email,curriculo;
	private int fone;
	
	public void informacaoPalestra() {
	palestra palestra=new palestra();
	console console=new console();
	
	email="sdasdas@gmail.com";
	curriculo="locurada total";
	fone=999023764;
	palestra.setTitulo(console.print("qual o titulo da sua palestra ?"));
	palestra.setDescricao(console.print("qual a descriicao da sua palestra?"));
	palestra.setSala(console.printInt("qual sala sera usada ?"));
	palestra.setHora(console.printInt("qual o horario que comecara a palestra ?"));
	}
}
