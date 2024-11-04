package sistema.problemas.veiculo.model.veiculos;

public class Veiculo {
	
	//atributos
	private String marcaVeiculo;
	private String modeloVeiculo;
	private String placaVeiculo;
	private String documentoVeiculo;
	private int anoVeiculo;
	//private ProblemaDoVeiculo problema;
	
	//construtor
	public Veiculo(String marcaVeiculo, String modeloVeiculo, String placaVeiculo, String documentoVeiculo,
			int anoVeiculo) {
		super();
		this.marcaVeiculo = marcaVeiculo;
		this.modeloVeiculo = modeloVeiculo;
		this.placaVeiculo = placaVeiculo;
		this.documentoVeiculo = documentoVeiculo;
		this.anoVeiculo = anoVeiculo;
	}
	
	//getters e setters
	public String getMarcaVeiculo() {
		return marcaVeiculo;
	}
	public void setMarcaVeiculo(String marcaVeiculo) {
		this.marcaVeiculo = marcaVeiculo;
	}
	public String getModeloVeiculo() {
		return modeloVeiculo;
	}
	public void setModeloVeiculo(String modeloVeiculo) {
		this.modeloVeiculo = modeloVeiculo;
	}
	public String getPlacaVeiculo() {
		return placaVeiculo;
	}
	public void setPlacaVeiculo(String placaVeiculo) {
		this.placaVeiculo = placaVeiculo;
	}
	public String getDocumentoVeiculo() {
		return documentoVeiculo;
	}
	public void setDocumentoVeiculo(String documentoVeiculo) {
		this.documentoVeiculo = documentoVeiculo;
	}
	public int getAnoVeiculo() {
		return anoVeiculo;
	}
	public void setAnoVeiculo(int anoVeiculo) {
		this.anoVeiculo = anoVeiculo;
	}

	@Override
	public String toString() {
		return "Veiculo [marcaVeiculo = " + marcaVeiculo + ", modeloVeiculo = " + modeloVeiculo + ", placaVeiculo = "
				+ placaVeiculo + ", documentoVeiculo = " + documentoVeiculo + ", anoVeiculo = " + anoVeiculo + "]";
	}
	
	
	
	
	
	
}
