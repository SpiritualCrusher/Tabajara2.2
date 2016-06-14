package controleAereoFinal;

public class Aviao {
	private String identificacao;
	private String modelo;
	private int qtdTurbinas;
	private int capacPassageiros;
	private double capacCarga;

	public Aviao(String identificacao, String modelo, int qtdTurbinas, int capacPassageiros, double capacCarga) {

		this.identificacao = identificacao;
		this.modelo = modelo;
		this.qtdTurbinas = qtdTurbinas;
		this.capacPassageiros = capacPassageiros;
		this.capacCarga = capacCarga;
	}

	public String getIdentificacao() {
		return identificacao;
	}

	public void setIdentificacao(String identificacao) {
		this.identificacao = identificacao;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getQtdTurbinas() {
		return qtdTurbinas;
	}

	public void setQtdTurbinas(int qtdTurbinas) {
		this.qtdTurbinas = qtdTurbinas;
	}

	public int getCapacPassageiros() {
		return capacPassageiros;
	}

	public void setCapacPassageiros(int capacPassageiros) {
		this.capacPassageiros = capacPassageiros;
	}

	public double getCapacCarga() {
		return capacCarga;
	}

	public void setCapacCarga(double capacCarga) {
		this.capacCarga = capacCarga;
	}

	public void imprimir() {
		System.out.println("********************************************");
		System.out.println("Identificação             : " + identificacao);
		System.out.println("Modelo                    : " + modelo);
		System.out.println("Quantidade de Turbinas    : " + qtdTurbinas);
		System.out.println("Capacidade de Passageiros : " + capacPassageiros);
		System.out.println("Capacidade de Carga       : " + capacCarga);

	}
}