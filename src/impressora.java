
public class impressora {
	static console console=new console();
	public static void imprimi(evento evento) {
		int esc=console.printInt("oque vc é no evento ?\n1|participante		\n2|palestrante		\n3|organizador do evento");
	
		if(esc==1) {
			imprimeParticipante(evento);
			}
		if(esc==2) {
			imprimePalestrante(evento);
		}
		if(esc==3) {
			imprimeOrganizador(evento);
		}
		
	}

	private static void imprimePalestrante(evento evento) {
		System.out.println("\nData:"+evento.getDt()+"			instituiçao:"+evento.palestra.getInst()+""+evento.palestra.InformacaoEvento());
		
	}

	private static void imprimeOrganizador(evento evento) {
		// TODO Auto-generated method stub
		
	}

	private static void imprimeParticipante(evento evento) {
		// TODO Auto-generated method stub
		
	}

}
