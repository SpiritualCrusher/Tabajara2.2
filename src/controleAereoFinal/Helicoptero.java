package controleAereoFinal;

public class Helicoptero extends Aeronave {
	
	private int qtdHelices;
	
	public Helicoptero(){
		
	}

	public Helicoptero(String identificacao, String modelo, int capacPassageiros, 
			           double capacCarga, int qtdHelices) {
		super(identificacao, modelo, capacPassageiros, capacCarga);
		this.qtdHelices = qtdHelices;
	}

	public int getQtdHelices() {
		return qtdHelices;
	}

	public void setQtdHelices(int qtdHelices) {
		this.qtdHelices = qtdHelices;
	}

}
