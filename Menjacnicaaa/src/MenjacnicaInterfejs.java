import java.util.GregorianCalendar;

public interface MenjacnicaInterfejs {

	public void dodajKurs(String naziv, String skraceniNaziv, GregorianCalendar datum, double srednjiKurs, double prodajniKurs, double kupovniKurs);

	public void obrisiKurs(String naziv, GregorianCalendar datum);

	public double pronadjiSrednjiKurs(String naziv, GregorianCalendar datum);

	public double pronadjiKupovniKurs(String naziv, GregorianCalendar datum);

	public double pronadjiProdajniKurs(String naziv, GregorianCalendar datum);

}
