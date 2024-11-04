package sistema.problemas.veiculo.model.veiculos;

public class Moto extends Veiculo{

	//atributos
	private String pecasMoto;
	
	//construtor
	public Moto(String marcaVeiculo, String modeloVeiculo, String placaVeiculo, String documentoVeiculo, int anoVeiculo, String pecasMoto) {
		super(marcaVeiculo, modeloVeiculo, placaVeiculo, documentoVeiculo, anoVeiculo);
		this.pecasMoto = pecasMoto;
	}

	//getters e setters
	public String getPecasMoto() {
		return pecasMoto;
	}

	public void setPecasMoto(String pecasMoto) {
		this.pecasMoto = pecasMoto;
	}

	@Override
	public String toString() {
		return "Moto [pecasMoto = " + pecasMoto + ", marcaVeiculo = " + getMarcaVeiculo() + ", modeloVeiculo = "
				+ getModeloVeiculo() + ", placaVeiculo = " + getPlacaVeiculo() + ", documentoVeiculo = "
				+ getDocumentoVeiculo() + ", anoVeiculo = " + getAnoVeiculo() + "]";
	}
	
	
	
}
