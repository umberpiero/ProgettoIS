package is.gestioneappelli.entity;

public class Corso {
	private String id;
	private String nome;
	private Docente docente;
	private int numeroCFU;
		
	public Corso() {
		
	}
	
	public Corso(String id, String nome, Docente docente, int CFU) {
		this.id=id;
		this.nome=nome;
		this.docente=docente;
		numeroCFU=CFU;
	}

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id=id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome=nome;
	}
	
	public Docente getDocente() {
		return docente;
	}
	
	public void setDocente(Docente docente) {
		this.docente=docente;
	}
	
	public int getCFU() {
		return numeroCFU;
	}
	
	public void setCFU(int CFU) {
		numeroCFU=CFU;
	}
	
}
