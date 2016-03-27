import java.util.GregorianCalendar;

public interface MenjacnicaInterfejs {

	public void dodajKurs(GregorianCalendar datum, double srednjiKurs, double prodajniKurs, double kupovniKurs);

	public void obrisiKurs(GregorianCalendar datum);

	public double pronadjiSrednjiKurs(String naziv, GregorianCalendar datum);

	public double pronadjiKupovniKurs(String naziv, GregorianCalendar datum);

	public double pronadjiProdajniKurs(String naziv, GregorianCalendar datum);

}
