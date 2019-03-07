package liburutegia;
import java.util.ArrayList;

public class Liburutegia {
	private String izena, helbidea;
	private int ikasKop;
	private ArrayList <Liburuak> liburua = new ArrayList<Liburuak>(5);

	//konstruktorea
	public Liburutegia(String izena, String helbidea, int ikasKop, ArrayList<Liburuak> liburua) {
		this.izena = izena;
		this.helbidea = helbidea;
		this.ikasKop = ikasKop;
		this.liburua = liburua;
	}

	//get
	public String getIzena() {
		return izena;
	}
	
	public String getHelbidea() {
		return helbidea;
	}
	public int getIkasKop() {
		return ikasKop;
	}
	public ArrayList<Liburuak> getLiburua() {
		return liburua;
	}
	
	//set
	public void setIzena(String izena) {
		izena = izena;
	}
	public void setHelbidea(String helbidea) {
		this.helbidea = helbidea;
	}
	public void setIkasKop(int ikasKop) {
		this.ikasKop = ikasKop;
	}
	public void setLiburua(ArrayList<Liburuak> liburua) {
		this.liburua = liburua;
	}
	
	//toString
	@Override
	public String toString() {
		return "Liburutegia [izena=" + izena + ", helbidea=" + helbidea + ", ikasKop=" + ikasKop + ", liburua="
				+ liburua + "]";
	}
	
	
	public void liburuakEzabatu(Liburuak liburu) {
		liburua.remove(liburu);
	}

}