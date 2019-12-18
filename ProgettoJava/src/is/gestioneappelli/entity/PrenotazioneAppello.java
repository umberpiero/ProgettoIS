package is.gestioneappelli.entity;

public class PrenotazioneAppello {
	private Studente studente;
	private CreazioneAppello appello;
	private String id_appello;
	
	public PrenotazioneAppello(Studente s) {
		studente=s;
	}
	
	public PrenotazioneAppello(Studente s, CreazioneAppello a, String id) {
		studente=s;
		appello=a;
		id_appello=id;
	}
	
	public Studente getStudente() {
		return studente;
	}

	public void setStudente(Studente s) {
		studente=s;
	}
	
	public CreazioneAppello getAppello() {
		return appello;
	}
	
	public void setAppello(CreazioneAppello a) {
		appello=a;
	}
	
	public String getId() {
		return id_appello;
	}
	
	public void setId(String id) {
		id_appello=id;
	}
	
}
