
public class evento {
	palestrante palestrante =new palestrante();
	
	private String inst= null;//instituiçao
	private int dt;//data
	
	public void addPalestrante() {
		palestrante.informacaoPalestra();
	}
	
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
	
}
