package liburutegia;
import java.util.ArrayList;

public class Liburutegia {
	private String izena, helbidea;
	private int ikasKop;
	private ArrayList <Liburuak> liburutegi = new ArrayList<Liburuak>(5);

	//konstruktorea
	public Liburutegia(String izena, String helbidea, int ikasKop, ArrayList<Liburuak> liburutegi) {
		this.izena = izena;
		this.helbidea = helbidea;
		this.ikasKop = ikasKop;
		this.liburutegi = liburutegi;
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
	public ArrayList<Liburuak> getLiburutegi() {
		return liburutegi;
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
		this.liburutegi = liburua;
	}
	 
	//toString
	@Override
	public String toString() {
		return "Liburutegia [izena=" + izena + ", helbidea=" + helbidea + ", ikasKop=" + ikasKop + ", liburua="
				+ liburutegi + "]";
	}
	
	public void liburuakGehitu(Liburuak liburu) {
		
		liburutegi.add(liburu);
	}
	
	
	public void liburuakEzabatu(Liburuak liburu) {
		liburua.remove(liburu);
	}

}