
public class palestra {
	console console=new console();
	participante participante[]=new participante[10];
	palestrante palestrante[]=new palestrante[3];
	int contpales=0;
	int contparticipante=0;
	private int sala, hora;//sala e horario da palestra
	
	
	//============================
	public void inicializadorPalest() {
		for(int x=0;x<=2;x++) {
			palestrante[x]=new palestrante();
		}
	}
	public void inicializadorPart() {
		for(int x=0;x<=9;x++) {
			participante[x]=new participante();
		}
	}
	//============================
	public void addPalestra() {
		inicializadorPalest();
		inicializadorPart();
	}
	
	public void addSala() {//posso ter 2
		setSala(console.printInt("qual sala sera usada ?"));
		setHora(console.printInt("qual o horario que comecara a palestra ?"));
		addPalestra();
	}
	
	
	public void addPalestrante() {//Posso ter 3
		if(contpales<=2) {
		palestrante[contpales].informacaoPalestrante();
		contpales++;
		System.out.println("***Palestrante adicionado!\n");
		}else {
			System.out.println("***ERRO:numero maximo de palestrantes adicionado para essa palestra,tente em outra palestra.\n");
			}
	}
	public void addParticipante() {//posso ter maximo 10
		if(contparticipante<=9) {
		participante[contparticipante].informacaoParticipante();
		contparticipante++;
		System.out.println("***Participante adicionado!\n");
		}else {
			System.out.println("***ERRO:numero maximo de participantes adicionado para essa palestra,tente em outra palestra.\n");
			}
	}
	
	
	
	
	public void InformacaoEvento(int x) {
		if(palestrante[x].getTitulo()!=null)
			System.out.print("\n"+(x+1)+"° Palestra"+palestrante[x].getTitulo()+ "		sobre: "+palestrante[x].getDescricao());
			}
	public void informacaoDosParticipante(int x) {
		if(participante[x].getNome()!=null)
		System.out.println("\nNome: "+participante[x].getNome() + " Email: "+participante[x].getEmail());
	
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


	
}