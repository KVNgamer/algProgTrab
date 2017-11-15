
public class evento {
	int tamanhopalestra=2;
	console console=new console();
	palestra palestra[] =new palestra[tamanhopalestra];
	int contPalestra=0;
	int contSala=0;
	
	
	private String organizador="Kevin Machado Cardoso";//so um organizador do evento
	private String inst="Senac";//instituiçao so vai ser uma.
	private String dt="15/11/2017";//data so vai ser uma
	//====================================
	public void inicializador() {
		for(int x=0;x<=1;x++) {
			palestra[x]=new palestra();
		}
		
	}
	
	public  void mostra() {
		for(int x=0;x<=1;x++) {
			if(contSala!=x) {
				System.out.println("opcçao:"+x+" --- Sala:"+palestra[x].getSala()+" Hora:"+
				palestra[x].getHora());
				}
		}
	}
	
	
	///////==============================
	public String getInst() {
		return inst;
	}
	public void setInst(String inst) {
		this.inst = inst;
	}
	public String getDt() {
		return dt;
	}
	public void setDt(String dt) {
		this.dt = dt;
	}
	
	public void novoSala() {
		if(contSala<=1) {
		palestra[contSala].addSala();
		contSala++;
		System.out.println("***Sala criada com sucesso!\n");
		}else {
			System.out.println("***Numero maximo de salas para evento criadas\n");
		}
	}
	public String getOrganizador() {
		return organizador;
	}

	public void setOrganizador(String organizador) {
		this.organizador = organizador;
	}

	public void novaPalestra() {
		palestra[contPalestra].addPalestra();
	}
	public void chamaParticipante() {
		mostra();
		int x =console.printInt("qual das salas o Participante vai ?");
		palestra[x].addParticipante();
	}
	public void chamaPalestrante() {
		mostra();
		int x =console.printInt("qual das palestra o Palestrante vai ?");
		palestra[x].addPalestrante();
	}
	
}
