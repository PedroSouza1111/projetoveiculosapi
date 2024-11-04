package sistema.problemas.veiculo.model.usuarios;

public class Funcionario extends Usuario {
	
	//atributos
	private String cargoFuncionario;
	
	//construtor
	public Funcionario(String login, String senha, int id, String telefone, String nomeUsuario, String cpf,
			String endereco, String email, String cargoFuncionario) {
		super(login, senha, id, telefone, nomeUsuario, cpf, endereco, email);
		this.cargoFuncionario = cargoFuncionario;
	}

	//getter
	public String getCargoFuncionario() {
		return cargoFuncionario;
	}


	@Override
	public String toString() {
		return "Funcionario [cargoFuncionario = " + cargoFuncionario + ", login = " + getLogin() + ", senha = "
				+ getSenha() + ", nomeUsuario = " + getNomeUsuario() + ", cpf = " + getCpf() + ", endereco = "
				+ getEndereco() + ", email = " + getEmail() + "]";
	}

	
	
}
