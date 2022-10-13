
public class Cliente {

	private String nome;
	private String nascimento;
	private String cpf; //id
	private String senha;
	private int senhaNumerica;
	private String email;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getSenhaNumerica() {
		return senhaNumerica;
	}

	public void setSenhaNumerica(int senhaNumerica) {
		this.senhaNumerica = senhaNumerica;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
