package is.gestioneappelli.entity;

public class CreazioneAppello {
	private Appello appello;
	private String id_corso;
	
	public CreazioneAppello(Appello a) {
		appello=a;
	}
	
	public CreazioneAppello(Appello a, String id) {
		appello=a;
		id_corso=id;
	}
	
	public Appello getAppello() {
		return appello;
	}

	public void setAppello(Appello a) {
		appello=a;
	}
	
	public String getId() {
		return id_corso;
	}
	
	public void setId(String id) {
		id_corso=id;
	}
}
