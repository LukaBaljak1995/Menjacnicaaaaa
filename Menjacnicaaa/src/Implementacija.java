import java.util.GregorianCalendar;
import java.util.LinkedList;

public class Implementacija implements MenjacnicaInterfejs {

	LinkedList<Valute> valute = new LinkedList<>();

	@Override
	public void dodajKurs(String naziv, String skraceniNaziv, GregorianCalendar datum, double srednjiKurs,
			double prodajniKurs, double kupovniKurs) {
		Valute v = new Valute();
		v.setDatum(datum);
		v.setKupovniKurs(kupovniKurs);
		v.setNaziv(naziv);
		v.setProdajniKurs(prodajniKurs);
		v.setSkraceniNaziv(skraceniNaziv);
		v.setSrednjiKurs(srednjiKurs);
		if (!valute.contains(v)) {
			valute.add(v);
		}

	}

	@Override
	public void obrisiKurs(String naziv, GregorianCalendar datum) {
		for (int i = 0; i < valute.size(); i++) {
			if (valute.get(i).getNaziv().equals(naziv) && valute.get(i).getDatum().equals(datum))
				valute.remove(valute.get(i));
		}

	}

	@Override
	public double pronadjiSrednjiKurs(String naziv, GregorianCalendar datum) {
		for (int i = 0; i < valute.size(); i++) {
			if (valute.get(i).getNaziv().equals(naziv) && valute.get(i).getDatum().equals(datum)) {
				return valute.get(i).getSrednjiKurs();
			}
		}
		return -1;
	}

	@Override
	public double pronadjiKupovniKurs(String naziv, GregorianCalendar datum) {
		for (int i = 0; i < valute.size(); i++) {
			if (valute.get(i).getNaziv().equals(naziv) && valute.get(i).getDatum().equals(datum)) {

				return valute.get(i).getKupovniKurs();
			}
		}
		return -1;
	}

	@Override
	public double pronadjiProdajniKurs(String naziv, GregorianCalendar datum) {
		for (int i = 0; i < valute.size(); i++) {
			if (valute.get(i).getNaziv().equals(naziv) && valute.get(i).getDatum().equals(datum)) {

				return valute.get(i).getProdajniKurs();
			}
		}
		return -1;
	}

}
