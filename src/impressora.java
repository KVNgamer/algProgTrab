
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
		if(esc==3 ) {
			imprimeOrganizador(evento);
		}
		
	}

	private static void imprimePalestrante(evento evento) {
		evento.mostra();
		int p = console.printInt("qual palestra ?");
		System.out.println("\nData da palestra:"+evento.getDt()+"			instituiçao:"+evento.getInst());
		System.out.println("Sala:"+evento.palestra[p].getSala()+"	Hora:"+evento.palestra[p].getHora()+"\nQuem ira participar da palestra:");
		for(int x=0;x<=9;x++) {
			evento.palestra[p].informacaoDosParticipante(x);
			
		}
		System.out.println("\n---------------------------\n");
	}

	private static void imprimeOrganizador(evento evento) {
		System.out.println("\nOrganizador:"+evento.getOrganizador() +"\nData da palestra:"+evento.getDt()+"			instituiçao:"+evento.getInst());
			for(int p=0;p<=1;p++) {
				System.out.println("Sala:"+evento.palestra[p].getSala()+"	Hora:"+evento.palestra[p].getHora()+"\n As palestrar marcadas para era sala sao:");
				for(int x=0;x<=2;x++) {
					evento.palestra[p].InformacaoEvento(x);					
				}
				for(int part=0;part<=9;part++) {
					if(part==0)System.out.println("\nQuem ira participar da palestra:");
					evento.palestra[p].informacaoDosParticipante(part);					
				}
				System.out.println("\n---------------------------\n");
			}
	}

	private static void imprimeParticipante(evento evento) {
		evento.mostra();
		int p = console.printInt("qual palestra ?");
		System.out.println("\nData da palestra:"+evento.getDt()+"			instituiçao:"+evento.getInst());
		System.out.println("Sala:"+evento.palestra[p].getSala()+"	Hora:"+evento.palestra[p].getHora()+"\n As palestrar marcadas para era sala sao:");
		for(int x=0;x<=2;x++) {
			evento.palestra[p].InformacaoEvento(x);			
		}
		System.out.println("\n---------------------------\n");
	}
}


