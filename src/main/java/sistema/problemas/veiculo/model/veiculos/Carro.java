package sistema.problemas.veiculo.model.veiculos;

public class Carro extends Veiculo{
	
	//atributos
	private String pecasCarro;
	
	//construtor
	public Carro(String marcaVeiculo, String modeloVeiculo, String placaVeiculo, String documentoVeiculo,
			int anoVeiculo, String pecasCarro) {
		super(marcaVeiculo, modeloVeiculo, placaVeiculo, documentoVeiculo, anoVeiculo);
		this.pecasCarro = pecasCarro;
	}

	//getters e setters
	public String getPecasCarro() {
		return pecasCarro;
	}

	public void setPecasCarro(String pecasCarro) {
		this.pecasCarro = pecasCarro;
	}

	@Override
	public String toString() {
		return "Carro [pecasCarro = " + pecasCarro + ", marcaVeiculo = " + getMarcaVeiculo() + ", modeloVeiculo = "
				+ getModeloVeiculo() + ", placaVeiculo = " + getPlacaVeiculo() + ", documentoVeiculo = "
				+ getDocumentoVeiculo() + ", anoVeiculo = " + getAnoVeiculo() + "]";
	}
	
	
	
}
