package is.gestioneappelli.entity;

import java.util.ArrayList;

public class Appello {
	private String id;
	private DataAppello data;
	private ArrayList<DataAppello> lista_date=new ArrayList<DataAppello>();
	private String corso;
	
	public Appello() {
		
	}
	
	public Appello(String id, DataAppello data, String corso) {
		this.id=id;
		this.data=data;
		this.corso=corso;
	}
	
	public Appello(String id, ArrayList<DataAppello> lista_date, String corso) {
		this.id=id;
		this.lista_date=lista_date;
		this.corso=corso;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id=id;
	}
	
	public DataAppello getData() {
		return data;
	}
	
	public void setData(DataAppello data) {
		this.data=data;
	}
	
	public ArrayList<DataAppello> getDate() {
		return lista_date;
	}
	
	public void addDate(DataAppello d) {
		lista_date.add(d);
	}
	
	public String getCorso() {
		return corso;
	}
	
	public void setCorso(String corso) {
		this.corso=corso;
	}
	
}
