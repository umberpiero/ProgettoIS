package is.gestioneappelli.control;

import java.util.ArrayList;

import is.gestioneappelli.entity.Corso;
import is.gestioneappelli.entity.CreazioneAppello;
import is.gestioneappelli.entity.PrenotazioneAppello;

public class GestioneAppelliCorsi {
	ArrayList<Corso> lista_corsi=new ArrayList<Corso>();
	ArrayList<CreazioneAppello> lista_appelli=new ArrayList<CreazioneAppello>();
	ArrayList<PrenotazioneAppello> lista_studenti_prenotati=new ArrayList<PrenotazioneAppello>();
	
	public GestioneAppelliCorsi() {

	}

	public void creaCorso(Corso c) {
		lista_corsi.add(c);
	}
	
	public void creaAppelloCorso(CreazioneAppello a) {
		lista_appelli.add(a);
	}
	
	public void prenotaAppello(PrenotazioneAppello p) {
		lista_studenti_prenotati.add(p);
	}
	
	public void visualizzaStudentiPrenotati(CreazioneAppello a) {
		String id_appello=a.getId();
		for(int i=0; i<lista_studenti_prenotati.size(); i++) {
			PrenotazioneAppello temp=lista_studenti_prenotati.get(i);
			if(temp.getAppello().getId()==id_appello) {
				String matricola=temp.getStudente().getMatricola();
				String cognome=temp.getStudente().getCognome();
				String nome=temp.getStudente().getNome();
				System.out.println(matricola+" "+cognome+" "+nome+"\n");
			}
		}
	}
	
	public int numeroStudentiPrenotati(CreazioneAppello a) {
		int prenotati=0;
		String id_appello=a.getId();
		for(int i=0; i<lista_studenti_prenotati.size(); i++) {
			PrenotazioneAppello temp=lista_studenti_prenotati.get(i);
			if(temp.getAppello().getId()==id_appello) {
				prenotati++;
			}
		}
		return prenotati;
	}
	
}
