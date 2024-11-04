package sistema.problemas.veiculo.model.usuarios;

import sistema.problemas.veiculo.model.veiculos.Veiculo;

public class Cliente extends Usuario {
	
	//atributos
	private boolean planoAtivo;
	private Veiculo veiculo;
	
	//construtor
	public Cliente(String login, String senha, int id, String telefone, String nomeUsuario, String cpf, String endereco,
			String email, boolean planoAtivo, Veiculo veiculo) {
		super(login, senha, id, telefone, nomeUsuario, cpf, endereco, email);
		this.planoAtivo = planoAtivo;
		this.veiculo = veiculo;
	}

	//getters e setters
	public boolean isPlanoAtivo() {
		return planoAtivo;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	@Override
	public String toString() {
		return "Cliente [contaAtiva = " + planoAtivo + ", login = " + getLogin()
				+ ", senha = " + getSenha() + ", id = " + getId() + ", telefone = " + getTelefone() +", nomeUsuario = " + getNomeUsuario() + ", cpf = " + getCpf()
				+ ", endereco = " + getEndereco() + ", email = " + getEmail() + ", veiculo = " + veiculo.toString() + "]";
	}
	
	
}
