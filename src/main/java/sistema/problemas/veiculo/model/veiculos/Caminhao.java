package sistema.problemas.veiculo.model.veiculos;

public class Caminhao extends Veiculo{

	//atributos
	private String pecasCaminhao;

	public String getPecasCaminhao() {
		return pecasCaminhao;
	}
	
	//construtor
	public Caminhao(String marcaVeiculo, String modeloVeiculo, String placaVeiculo, String documentoVeiculo,
			int anoVeiculo, String pecasCaminhao) {
		super(marcaVeiculo, modeloVeiculo, placaVeiculo, documentoVeiculo, anoVeiculo);
		this.pecasCaminhao = pecasCaminhao;
	}



	//getters e setters
	public void setPecasCaminhao(String pecasCaminhao) {
		this.pecasCaminhao = pecasCaminhao;
	}

	@Override
	public String toString() {
		return "Caminhao [pecasCaminhao = " + pecasCaminhao + ", marcaVeiculo = " + getMarcaVeiculo() + ", modeloVeiculo = "
				+ getModeloVeiculo() + ", placaVeiculo = " + getPlacaVeiculo() + ", documentoVeiculo = "
				+ getDocumentoVeiculo() + ", anoVeiculo = " + getAnoVeiculo() + "]";
	}
	
	
	
}
