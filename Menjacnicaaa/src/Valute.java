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
		if (naziv != null && !naziv.isEmpty())
			throw new RuntimeException("Greska");
		else
			this.naziv = naziv;
	}

	public void setSkraceniNaziv(String skraceniNaziv) {
		if (skraceniNaziv != null && !skraceniNaziv.isEmpty())
			throw new RuntimeException("Greska");
		else
			this.skraceniNaziv = skraceniNaziv;
	}

	public void setDatum(GregorianCalendar datum) {
		if (datum != null)
			throw new RuntimeException("Greska");
		else
			this.datum = datum;
	}

	public void setProdajniKurs(double prodajniKurs) {
		if (prodajniKurs < 0)
			throw new RuntimeException("Greska");
		else
			this.prodajniKurs = prodajniKurs;
	}

	public void setSrednjiKurs(double srednjiKurs) {
		if (srednjiKurs < 0)
			throw new RuntimeException("Greska");
		else
			this.srednjiKurs = srednjiKurs;
	}

	public void setKupovniKurs(double kupovniKurs) {
		if (kupovniKurs < 0)
			throw new RuntimeException("Greska");
		else
			this.kupovniKurs = kupovniKurs;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datum == null) ? 0 : datum.hashCode());
		long temp;
		temp = Double.doubleToLongBits(kupovniKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		temp = Double.doubleToLongBits(prodajniKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((skraceniNaziv == null) ? 0 : skraceniNaziv.hashCode());
		temp = Double.doubleToLongBits(srednjiKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Valute))
			return false;
		Valute other = (Valute) obj;
		if (datum == null) {
			if (other.datum != null)
				return false;
		} else if (!datum.equals(other.datum))
			return false;
		if (Double.doubleToLongBits(kupovniKurs) != Double.doubleToLongBits(other.kupovniKurs))
			return false;
		if (naziv == null) {
			if (other.naziv != null)
				return false;
		} else if (!naziv.equals(other.naziv))
			return false;
		if (Double.doubleToLongBits(prodajniKurs) != Double.doubleToLongBits(other.prodajniKurs))
			return false;
		if (skraceniNaziv == null) {
			if (other.skraceniNaziv != null)
				return false;
		} else if (!skraceniNaziv.equals(other.skraceniNaziv))
			return false;
		if (Double.doubleToLongBits(srednjiKurs) != Double.doubleToLongBits(other.srednjiKurs))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Valute [naziv=" + naziv + ", skraceniNaziv=" + skraceniNaziv + ", datum=" + datum + ", prodajniKurs="
				+ prodajniKurs + ", srednjiKurs=" + srednjiKurs + ", kupovniKurs=" + kupovniKurs + "]";
	}


}




