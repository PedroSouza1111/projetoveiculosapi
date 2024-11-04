package sistema.problemas.veiculo.dto;

import javax.validation.constraints.NotBlank;

public class DiagnosticoDTO {
	@NotBlank
	private String descricaoProblema;

	public String getDescricaoProblema() {
		return descricaoProblema;
	}

	public void setDescricaoProblema(String descricaoProblema) {
		this.descricaoProblema = descricaoProblema;
	}

}
