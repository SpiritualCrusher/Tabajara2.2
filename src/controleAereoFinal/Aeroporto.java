package controleAereoFinal;

public class Aeroporto {
	private String identificacao;
	private String nome;
	private Cidade cidade;
	private String estado;
	private String pais;

	public Aeroporto(String identificacao, String nome, Cidade cidade, String estado, String pais) {

		this.identificacao = identificacao;
		this.nome = nome;
		this.cidade = cidade;
		this.estado = estado;
		this.pais = pais;
	}

	public String getIdentificacao() {
		return identificacao;
	}

	public void setIdentificacao(String identificacao) {
		this.identificacao = identificacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public void imprimir() {
		System.out.println("***********************************");
		System.out.println("Identificação    : " + identificacao);
		System.out.println("Nome             : " + nome);
		System.out.println("Cidade           : " + cidade);
		System.out.println("Estado           : " + estado);
		System.out.println("País             : " + pais);

	}

}
