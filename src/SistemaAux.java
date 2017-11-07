
public class SistemaAux {
		
	public static void main(String[] args) {
		evento evento=new evento();
		while(true){
			int i=menu();
			
			if(i==0) {
				System.exit(0);
			}
			if(i==1) {
				evento.novoEvento();
				}
			if(i==2) {
				evento.palestra.addParticipante();
			}
			if(i==3) {
				evento.palestra.addPalestrante();
			}
			if(i==4) {
				impressora.imprimi(evento);
			}
			System.out.println("\nData:"+evento.getDt()+"			instituiçao:"+evento.getInst()+""+evento.InformacaoEvento());
		}
		
		
	}

	private static int menu() {
		console console=new console();
		int esc=console.menu();
		if(esc>=0&&esc<=4)
			return esc;
		return 0;
	}

}
/*Neste trabalho você irá criar um sistema de auxílio à organização de eventos onde seja possível:
 * 
 *
Criar um novo evento que irá ocorrer em uma instituição de ensino;-------
Cada evento ocorre em uma data específica;-----------
Um evento apresenta uma série de palestras, cada uma em uma sala e horário;-----
Cada palestra deve ter um título, e um resumo para ser apresentado aos usuários;---------
Palestrantes podem submeter palestras para o evento;------------
Palestrantes devem fornecer, além dos dados das palestras, um currículo, um email, e um telefone;----------
Participantes do evento devem fornecer o seu nome e um email;----------------
	O sistema deve emitir um certificado, para palestrantes, organizadores e participantes do evento, de acordo com a sua participação no evento.
O sistema deve carregar e salvar os dados a partr de arquivos texto, utilizando o formato CSV (Comma Separated Values).
Este sistema será desenvolvido até o final do semestre, e para esta primeira versão, você deve permitir a criação de um evento, com duas salas de palestras, quatros palestras, três palestrantes, um organizador e dez participantes.

*
*
*
*
*
*
*
*
*
*/