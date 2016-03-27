import java.util.GregorianCalendar;

public class Valute {

	private String naziv;
	private String skraceniNaziv;
	private GregorianCalendar datum;
	private double prodajniKurs;
	private double srednjiKurs;
	private double kupovniKurs;

	public String getNaziv() {
		return naziv;
	}

	public String getSkraceniNaziv() {
		return skraceniNaziv;
	}

	public GregorianCalendar getDatum() {
		return datum;
	}

	public double getProdajniKurs() {
		return prodajniKurs;
	}

	public double getSrednjiKurs() {
		return srednjiKurs;
	}

	public double getKupovniKurs() {
		return kupovniKurs;
	}

	public void setNaziv(String naziv) {
			this.naziv = naziv;
	}

	public void setSkraceniNaziv(String skraceniNaziv) {
			this.skraceniNaziv = skraceniNaziv;
	}

	public void setDatum(GregorianCalendar datum) {
			this.datum = datum;
	}

	public void setProdajniKurs(double prodajniKurs) {
			this.prodajniKurs = prodajniKurs;
	}

	public void setSrednjiKurs(double srednjiKurs) {
			this.srednjiKurs = srednjiKurs;
	}

	public void setKupovniKurs(double kupovniKurs) {
			this.kupovniKurs = kupovniKurs;
	}
}




