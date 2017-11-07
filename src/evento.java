
public class evento {
	console console=new console();
	
	private String inst= null;//instituiçao
	private int dt;//data
	
	public String getInst() {
		return inst;
	}
	public void setInst(String inst) {
		this.inst = inst;
	}
	public int getDt() {
		return dt;
	}
	public void setDt(int dt) {
		this.dt = dt;
	}
	
	public void novoEvento() {
		palestra palestra =new palestra();
		palestra.addPalestrante();
		inst=console.print("qual sera a instituiçao onde ocorera o Evento ?");
		dt=console.printInt("qual sera a data desse evento ?");
		
	}
	
}
