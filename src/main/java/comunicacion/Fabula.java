package comunicacion;

public class Fabula extends Escrito {
	private String ensenanza;
	private String interpretacion;

	public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.ensenanza=ensenanza;
		this.interpretacion=interpretacion;
	}
	@Override
	public int palabrasTotales(int palabrasPagina) {
		// multipliacion de las paginas por el parametro por un factor F=1
		return getPaginas()*palabrasPagina*1;
	}
	@Override
	public String interpretacion() {
		return interpretacion;
	}
	@Override
	public String toString() {
		return  getOrigen() + "\n"
				+ getTitulo()+ "\n"
				+ getAutor()+ "\n"
				+ getPaginas()+ "\n"
				+getEnsenanza() + "\n";
	}
	public void setEnsenanza(String ensenanza) {
		this.ensenanza=ensenanza;
	}
	public String getEnsenanza() {
		return ensenanza;
	}
		
	public void setInterpretacion(String interpretacion) {
		this.interpretacion=interpretacion;
	}
	/*public String getInterpretacion() {
		
	}*/
}
