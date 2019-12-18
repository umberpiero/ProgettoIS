package is.gestioneappelli.entity;

import java.time.LocalDate;

public class DataAppello {
	private LocalDate data_prova;
	private String luogo_prova;
	private TipoProva tipo_prova;

	public DataAppello() {

	}
	
	public DataAppello(LocalDate dataProva, String luogoProva, TipoProva tipoProva) {
		data_prova=dataProva;
		luogo_prova=luogoProva;
		tipo_prova=tipoProva;
	}

	public LocalDate getData() {
		return data_prova;
	}
	
	public void setData(LocalDate dataProva) {
		data_prova=dataProva;
	}
	
	public String getLuogo() {
		return luogo_prova;
	}
	
	public void setLuogo(String luogoProva) {
		luogo_prova=luogoProva;
	}
	
	public TipoProva getTipo() {
		return tipo_prova;
	}
	
	public void setTipo(TipoProva tipoProva) {
		tipo_prova=tipoProva;
	}
	
}
