package sistema.problemas.veiculo.model.usuarios;

public class Usuario {
	
	//atributos
	private String login;
	private String senha;
	private int id;
	private String telefone;
	private String nomeUsuario;
	private String cpf;
	private String endereco;
	private String email;
	
	//construtor
	public Usuario(String login, String senha, int id, String telefone, String nomeUsuario, String cpf, String endereco,
			String email) {
		this.login = login;
		this.senha = senha;
		this.id = id;
		this.telefone = telefone;
		this.nomeUsuario = nomeUsuario;
		this.cpf = cpf;
		this.endereco = endereco;
		this.email = email;
	}
	
	public Usuario() {
		
	}

	
	//métodos operacionais
	public void cadastrarUsuario() {
		
	}

	public void logarUsuario() {
		
	}

	//getters e setters
	
	
	public String getLogin() {
		return login;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
