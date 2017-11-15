
public class SistemaAux {
		
	public static void main(String[] args) {
		evento evento=new evento();
		evento.inicializador();
		while(true){
			int i=menu();
			
			if(i==0) {
				System.exit(0);
			}
			if(i==1) {
				evento.novoSala();
				}
			if(i==2 && evento.contSala>0) {
				evento.chamaParticipante();
			}
			if(i==3 && evento.contSala>0) {
				evento.chamaPalestrante();
			}
			if(i==4 && evento.contSala>0) {
				impressora.imprimi(evento);
			}
			if (i!=1 && evento.contSala==0) {
				System.out.println("***ERRO:Nenhuma Sala para palestra criada\n");
			}
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
/*Neste trabalho voc� ir� criar um sistema de aux�lio � organiza��o de eventos onde seja poss�vel:
 * 
 *
Criar um novo evento que ir� ocorrer em uma institui��o de ensino;-------
Cada evento ocorre em uma data espec�fica;-----------
Um evento apresenta uma s�rie de palestras, cada uma em uma sala e hor�rio;-----
Cada palestra deve ter um t�tulo, e um resumo para ser apresentado aos usu�rios;---------
Palestrantes podem submeter palestras para o evento;------------
Palestrantes devem fornecer, al�m dos dados das palestras, um curr�culo, um email, e um telefone;----------
Participantes do evento devem fornecer o seu nome e um email;----------------
O sistema deve emitir um certificado, para palestrantes, organizadores e participantes do evento, de acordo com a sua participa��o no evento.??????
O sistema deve carregar e salvar os dados a partr de arquivos texto, utilizando o formato CSV (Comma Separated Values).???????
Este sistema ser� desenvolvido at� o final do semestre, e para esta primeira vers�o, voc� deve permitir a cria��o de um evento OKEY!, com duas salas de palestras OKEY!, quatros palestras OKEY!, tr�s palestrantes OKEY!, um organizadorOKEY e dez participantesOKEY!.

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