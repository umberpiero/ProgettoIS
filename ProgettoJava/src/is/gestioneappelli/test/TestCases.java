package is.gestioneappelli.test;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

import is.gestioneappelli.control.GestioneAppelliCorsi;
import is.gestioneappelli.entity.Appello;
import is.gestioneappelli.entity.Corso;
import is.gestioneappelli.entity.CreazioneAppello;
import is.gestioneappelli.entity.DataAppello;
import is.gestioneappelli.entity.Docente;
import is.gestioneappelli.entity.PrenotazioneAppello;
import is.gestioneappelli.entity.Studente;
import is.gestioneappelli.entity.TipoProva;

public class TestCases {
	GestioneAppelliCorsi gestioneappelli=new GestioneAppelliCorsi();
	
	@Test
	public void test1() {
		int prenotati;
		Studente studente=new Studente("N46003801", "Umberpiero", "Caturano");
		Docente docente=new Docente("Roberto", "Natella");
		Corso is=new Corso("31680", "Ingegneria del Software", docente, 9);
		gestioneappelli.creaCorso(is);
		LocalDate data=LocalDate.of(2019, Month.DECEMBER, 20);
		DataAppello dataAppello=new DataAppello(data, "SG-II-2, Ed. L1", TipoProva.ORALE);
		Appello app=new Appello("IS0", dataAppello, is.getNome());
		CreazioneAppello appello=new CreazioneAppello(app, is.getId());
		gestioneappelli.creaAppelloCorso(appello);
		PrenotazioneAppello prenotazione=new PrenotazioneAppello(studente, appello, app.getId());
		gestioneappelli.prenotaAppello(prenotazione);
		prenotati=gestioneappelli.numeroStudentiPrenotati(appello);
		assertEquals(1, prenotati);
	}

	@Test
	public void test2() {
		int prenotati;
		Studente studente1=new Studente("N46003801", "Umberpiero", "Caturano");
		Studente studente2=new Studente("N46000001", "Mario", "Rossi");
		Docente docente=new Docente("Roberto", "Natella");
		Corso is=new Corso("31680", "Ingegneria del Software", docente, 9);
		gestioneappelli.creaCorso(is);
		LocalDate data=LocalDate.of(2019, Month.DECEMBER, 20);
		DataAppello dataAppello=new DataAppello(data, "SG-II-2, Ed. L1", TipoProva.ORALE);
		Appello app=new Appello("IS0", dataAppello, is.getNome());
		CreazioneAppello appello=new CreazioneAppello(app, is.getId());
		gestioneappelli.creaAppelloCorso(appello);
		PrenotazioneAppello prenotazione1=new PrenotazioneAppello(studente1, appello, app.getId());
		PrenotazioneAppello prenotazione2=new PrenotazioneAppello(studente2, appello, app.getId());
		gestioneappelli.prenotaAppello(prenotazione1);
		gestioneappelli.prenotaAppello(prenotazione2);
		prenotati=gestioneappelli.numeroStudentiPrenotati(appello);
		assertEquals(2, prenotati);
	}
	
	@Test
	public void test3() {
		int prenotati1;
		int prenotati2;
		Studente studente=new Studente("N46003801", "Umberpiero", "Caturano");
		Docente docente=new Docente("Roberto", "Natella");
		Corso is=new Corso("31680", "Ingegneria del Software", docente, 9);
		Corso so=new Corso("31681", "Sistemi Operativi", docente, 9);
		gestioneappelli.creaCorso(is);
		gestioneappelli.creaCorso(so);
		LocalDate datais=LocalDate.of(2019, Month.DECEMBER, 20);
		LocalDate dataso=LocalDate.of(2019, Month.DECEMBER, 5);
		DataAppello dataAppelloIs=new DataAppello(datais, "SG-II-2, Ed. L1", TipoProva.ORALE);
		DataAppello dataAppelloSo=new DataAppello(dataso, "Laboratorio", TipoProva.AL_CALCOLATORE);
		Appello appIs=new Appello("IS0", dataAppelloIs, is.getNome());
		Appello appSo=new Appello("SO0", dataAppelloSo, so.getNome());
		CreazioneAppello appelloIs=new CreazioneAppello(appIs, is.getId());
		CreazioneAppello appelloSo=new CreazioneAppello(appSo, so.getId());
		gestioneappelli.creaAppelloCorso(appelloIs);
		gestioneappelli.creaAppelloCorso(appelloSo);
		PrenotazioneAppello prenotazioneIs=new PrenotazioneAppello(studente, appelloIs, appIs.getId());
		PrenotazioneAppello prenotazioneSo=new PrenotazioneAppello(studente, appelloSo, appSo.getId());
		gestioneappelli.prenotaAppello(prenotazioneIs);
		gestioneappelli.prenotaAppello(prenotazioneSo);
		prenotati1=gestioneappelli.numeroStudentiPrenotati(appelloIs);
		prenotati2=gestioneappelli.numeroStudentiPrenotati(appelloSo);
		assertEquals(1, prenotati1);
		assertEquals(1, prenotati2);
	}
	
	@Test
	public void test4() {
		int prenotati1;
		int prenotati2;
		Studente studente1=new Studente("N46003801", "Umberpiero", "Caturano");
		Studente studente2=new Studente("N46000001", "Mario", "Rossi");
		Docente docente=new Docente("Roberto", "Natella");
		Corso is=new Corso("31680", "Ingegneria del Software", docente, 9);
		Corso so=new Corso("31681", "Sistemi Operativi", docente, 9);
		gestioneappelli.creaCorso(is);
		gestioneappelli.creaCorso(so);
		LocalDate datais=LocalDate.of(2019, Month.DECEMBER, 20);
		LocalDate dataso=LocalDate.of(2019, Month.DECEMBER, 5);
		DataAppello dataAppelloIs=new DataAppello(datais, "SG-II-2, Ed. L1", TipoProva.ORALE);
		DataAppello dataAppelloSo=new DataAppello(dataso, "Laboratorio", TipoProva.AL_CALCOLATORE);
		Appello appIs=new Appello("IS0", dataAppelloIs, is.getNome());
		Appello appSo=new Appello("SO0", dataAppelloSo, so.getNome());
		CreazioneAppello appelloIs=new CreazioneAppello(appIs, is.getId());
		CreazioneAppello appelloSo=new CreazioneAppello(appSo, so.getId());
		gestioneappelli.creaAppelloCorso(appelloIs);
		gestioneappelli.creaAppelloCorso(appelloSo);
		PrenotazioneAppello prenotazioneIs=new PrenotazioneAppello(studente1, appelloIs, appIs.getId());
		PrenotazioneAppello prenotazioneSo=new PrenotazioneAppello(studente2, appelloSo, appSo.getId());
		gestioneappelli.prenotaAppello(prenotazioneIs);
		gestioneappelli.prenotaAppello(prenotazioneSo);
		prenotati1=gestioneappelli.numeroStudentiPrenotati(appelloIs);
		prenotati2=gestioneappelli.numeroStudentiPrenotati(appelloSo);
		assertEquals(1, prenotati1);
		assertEquals(1, prenotati2);
	}
	
	@Test
	public void test5() {
		int prenotati;
		Studente studente=new Studente("N46003801", "Umberpiero", "Caturano");
		Docente docente=new Docente("Roberto", "Natella");
		Corso is=new Corso("31680", "Ingegneria del Software", docente, 9);
		gestioneappelli.creaCorso(is);
		LocalDate datascritto=LocalDate.of(2019, Month.NOVEMBER, 29);
		LocalDate dataorale=LocalDate.of(2019, Month.DECEMBER, 20);
		DataAppello dataIntercorso=new DataAppello(datascritto, "SG-I-1", TipoProva.AL_CALCOLATORE);
		DataAppello dataOrale=new DataAppello(dataorale, "SG-II-2, Ed. L1", TipoProva.ORALE);
		ArrayList<DataAppello> dateAppello=new ArrayList<DataAppello>(
				Arrays.asList(dataIntercorso, dataOrale));
		Appello app=new Appello("IS0", dateAppello, is.getNome());
		CreazioneAppello appello=new CreazioneAppello(app, is.getId());
		gestioneappelli.creaAppelloCorso(appello);
		PrenotazioneAppello prenotazione=new PrenotazioneAppello(studente, appello, app.getId());
		gestioneappelli.prenotaAppello(prenotazione);
		prenotati=gestioneappelli.numeroStudentiPrenotati(appello);
		assertEquals(1, prenotati);
	}
	
	@Test
	public void test6() {
		int prenotati;
		Appello app=new Appello();
		CreazioneAppello appello=new CreazioneAppello(app);
		prenotati=gestioneappelli.numeroStudentiPrenotati(appello);		
		assertEquals(0, prenotati);
	}
	
	@Test
	public void test7() {
		int prenotati;
		Docente docente=new Docente("Roberto", "Natella");
		Corso is=new Corso("31680", "Ingegneria del Software", docente, 9);
		gestioneappelli.creaCorso(is);
		LocalDate data=LocalDate.of(2019, Month.DECEMBER, 20);
		DataAppello dataAppello=new DataAppello(data, "SG-II-2, Ed. L1", TipoProva.ORALE);
		Appello app=new Appello("IS0", dataAppello, is.getNome());
		CreazioneAppello appello=new CreazioneAppello(app, is.getId());
		gestioneappelli.creaAppelloCorso(appello);
		prenotati=gestioneappelli.numeroStudentiPrenotati(appello);
		assertEquals(0, prenotati);
	}
	
	@Test
	public void test8() {
		int prenotati;
		Studente studente=new Studente("N46003801", "Umberpiero", "Caturano");
		Docente docente=new Docente("Roberto", "Natella");
		Corso is=new Corso("31680", "Ingegneria del Software", docente, 9);
		gestioneappelli.creaCorso(is);
		Appello app=new Appello();
		CreazioneAppello appello=new CreazioneAppello(app);
		PrenotazioneAppello prenotazione=new PrenotazioneAppello(studente);
		prenotati=gestioneappelli.numeroStudentiPrenotati(appello);
		gestioneappelli.prenotaAppello(prenotazione);
		assertEquals(0, prenotati);
	}
}
