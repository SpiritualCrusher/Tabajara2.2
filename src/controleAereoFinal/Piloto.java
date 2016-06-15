package controleAereoFinal;

public class Piloto {
	private String identidade;
	private String cpf;
	private String numeroBreve;
	private String logradouro;
	private String numero;
	private Cidade cidade;
	private String telefone;
	
	public Piloto(){
		
	}

	public Piloto(String identidade, String cpf, String numeroBreve, String logradouro, String numero, 
			      Cidade cidade, String telefone) {
		this.identidade = identidade;
		this.cpf = cpf;
		this.numeroBreve = numeroBreve;
		this.logradouro = logradouro;
		this.numero = numero;
		this.cidade = cidade;
		this.telefone = telefone;
	}

	public String getIdentidade() {
		return identidade;
	}

	public void setIdentidade(String identidade) {
		this.identidade = identidade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNumeroBreve() {
		return numeroBreve;
	}

	public void setNumeroBreve(String numeroBreve) {
		this.numeroBreve = numeroBreve;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
		
}
