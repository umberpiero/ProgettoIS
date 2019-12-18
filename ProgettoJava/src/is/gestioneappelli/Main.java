package is.gestioneappelli;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;

import is.gestioneappelli.control.GestioneAppelliCorsi;
import is.gestioneappelli.entity.Appello;
import is.gestioneappelli.entity.Corso;
import is.gestioneappelli.entity.CreazioneAppello;
import is.gestioneappelli.entity.DataAppello;
import is.gestioneappelli.entity.Docente;
import is.gestioneappelli.entity.PrenotazioneAppello;
import is.gestioneappelli.entity.Studente;
import is.gestioneappelli.entity.TipoProva;

public class Main {

	public static void main(String[] args) {
		GestioneAppelliCorsi gestioneappelli=new GestioneAppelliCorsi();
		Studente s1=new Studente("N46003801", "Umberpiero", "Caturano");
		Studente s2=new Studente("N46000001", "K", "De Simone");
		Studente s3=new Studente("N46000000", "Mario", "Rossi");
		Docente RN=new Docente("Roberto", "Natella");
		Corso is=new Corso("31680", "Ingegneria del Software", RN, 9);
		Corso so=new Corso("31681", "Sistemi Operativi", RN, 9);
		LocalDate app1s=LocalDate.of(2019, Month.DECEMBER, 16);
		LocalDate app1o=LocalDate.of(2019, Month.DECEMBER, 19);
		LocalDate appso=LocalDate.of(2019, Month.DECEMBER, 20);
		DataAppello dicembres=new DataAppello(app1s, "Laboratorio", TipoProva.AL_CALCOLATORE);
		DataAppello dicembreo=new DataAppello(app1o, "Aula SG-II-2, Ed.L1", TipoProva.ORALE);
		DataAppello preapp=new DataAppello(appso, "LaboratorioAgnano", TipoProva.AL_CALCOLATORE);
		ArrayList<DataAppello> date_dicembre=new ArrayList<DataAppello>(
				Arrays.asList(dicembres, dicembreo));
		Appello dicembre=new Appello("IS0", date_dicembre, is.getNome());
		Appello prea=new Appello("SO0", preapp, so.getNome());
		CreazioneAppello a1=new CreazioneAppello(dicembre, is.getId());
		CreazioneAppello a2=new CreazioneAppello(prea, so.getId());
		PrenotazioneAppello p=new PrenotazioneAppello(s1, a1, dicembre.getId());
		PrenotazioneAppello p2=new PrenotazioneAppello(s2, a1, dicembre.getId());
		PrenotazioneAppello p3=new PrenotazioneAppello(s3, a2, prea.getId());
		PrenotazioneAppello p4=new PrenotazioneAppello(s3, a1, dicembre.getId());
		gestioneappelli.creaCorso(is);
		gestioneappelli.creaCorso(so);
		gestioneappelli.creaAppelloCorso(a1);
		gestioneappelli.creaAppelloCorso(a2);
		gestioneappelli.prenotaAppello(p);
		gestioneappelli.prenotaAppello(p2);
		gestioneappelli.prenotaAppello(p3);
		gestioneappelli.prenotaAppello(p4);
		System.out.println("Gli studenti prenotati all'appello di Ingegneria del Software sono:\n");
		gestioneappelli.visualizzaStudentiPrenotati(a1);
		System.out.println("Gli studenti prenotati all'appello di Sistemi Operativi sono:\n");
		gestioneappelli.visualizzaStudentiPrenotati(a2);
	}

}
