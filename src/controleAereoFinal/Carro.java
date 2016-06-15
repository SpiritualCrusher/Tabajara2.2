package controleAereoFinal;

public class Carro extends Aeronave {
	private Piloto piloto;
	private Cidade cidadeOrigem;
	private Cidade cidadeDestino;
	private float autonomia;
	
	public Carro(){
		
	}

	public Carro(String identificacao, String modelo, int capacPassageiros, double capacCarga,
			     Piloto piloto, Cidade cidadeOrigem, Cidade cidadeDestino, float autonomia) {
		super(identificacao, modelo, capacPassageiros, capacCarga);
		this.piloto = piloto;
		this.cidadeOrigem = cidadeOrigem;
		this.cidadeDestino = cidadeDestino;
		this.autonomia = autonomia;
	}

	public Piloto getPiloto() {
		return piloto;
	}

	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;
	}

	public Cidade getCidadeOrigem() {
		return cidadeOrigem;
	}

	public void setCidadeOrigem(Cidade cidadeOrigem) {
		this.cidadeOrigem = cidadeOrigem;
	}

	public Cidade getCidadeDestino() {
		return cidadeDestino;
	}

	public void setCidadeDestino(Cidade cidadeDestino) {
		this.cidadeDestino = cidadeDestino;
	}

	public float getAutonomia() {
		return autonomia;
	}

	public void setAutonomia(float autonomia) {
		this.autonomia = autonomia;
	}
	
}
