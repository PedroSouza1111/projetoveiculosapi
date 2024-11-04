package sistema.problemas.veiculo.model.acoesUsuario;

import java.time.LocalDateTime;

public class Diagnostico {

	private int id;
	private String descricaoProblema;
	private LocalDateTime dataDiagnostico;

	public Diagnostico() {

	}

	// getters e setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricaoProblema() {
		return descricaoProblema;
	}

	public void setDescricaoProblema(String descricaoProblema) {
		this.descricaoProblema = descricaoProblema;
	}

	public LocalDateTime getDataDiagnostico() {
		return dataDiagnostico;
	}

	public void setDataDiagnostico(LocalDateTime dataDiagnostico) {
		this.dataDiagnostico = dataDiagnostico;
	}

}
