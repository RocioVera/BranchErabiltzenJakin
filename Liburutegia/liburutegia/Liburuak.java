package liburutegia;






//trjhklfydjdstg





public class Liburuak {
	private String izenburua, ISBN;
	private int orrialdeKopurua;
	
	//konstruktorea
	public Liburuak(String izenburua, String ISBN, int orrialdeKopurua) {
		this.izenburua = izenburua;
		this.ISBN = ISBN;
		this.orrialdeKopurua = orrialdeKopurua;
	}
	
	//get
	public String getIzenburua() {
		return izenburua;
	}
	public String getISBN() {
		return ISBN;
	}
	public int getOrrialdeKopurua() {
		return orrialdeKopurua;
	}

	//set
	public void setIzenburua(String izenburua) {
		this.izenburua = izenburua;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public void setOrrialdeKopurua(int orrialdeKopurua) {
		this.orrialdeKopurua = orrialdeKopurua;
	}

	//toString
	@Override
	public String toString() {
		return "Liburuak [izenburua=" + izenburua + ", ISBN=" + ISBN + ", orrialdeKopurua=" + orrialdeKopurua + "]";
	}
	
}
