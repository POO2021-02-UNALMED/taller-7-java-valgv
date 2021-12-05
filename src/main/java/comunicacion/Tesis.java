package comunicacion;
import java.util.ArrayList;

public class Tesis extends Escrito {
	private String idea;
	private ArrayList<String> argumentos= new ArrayList<>();
	private String conclusion;
	private String referencias;
	private String interpretacion;

	public Tesis(String origen, String titulo, String autor, int paginas, String idea, ArrayList<String> argumentos, String conclusion, String referencias, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.idea=idea;
		this.argumentos=argumentos;
		this.conclusion=conclusion;
		this.referencias=referencias;
		this.interpretacion=interpretacion;

	}
	@Override
	public int palabrasTotales(int palabrasPagina) {
		//f=5
		return getPaginas()*palabrasPagina*5;
		
	}
	@Override
	public String interpretacion() {
		// valor del atributo interpretacion
		return interpretacion;
	}
	@Override
	public String toString() {
		return  getOrigen() + "\n"
				+ getTitulo()+ "\n"
				+ getAutor()+ "\n"
				+ getPaginas()+ "\n"
				+idea + "\n"
				+argumentos+"\n"
				+conclusion+"\n"
				+referencias+"\n"
				+interpretacion+"\n";
	}
	public void setIdea(String idea) {
		this.idea=idea;
		
	}
	public String getIdea() {
		return idea;
		
	}
	public void setArgumentos(ArrayList<String> argumentos) {
		this.argumentos=argumentos;
		
	}
	public int getArgumentos() {
		//cantidad de argumentos que tiene el objeto
		return argumentos.size();
		
	}
	public void setConclusion(String conclusion) {
		this.conclusion=conclusion;
		
	}
	public String getConclusion() {
		return conclusion;
		
	}
	public void setReferencias(String referencias) {
		this.referencias=referencias;
	}
	public String getReferencias() {
		return referencias;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion=interpretacion;
		
	}
	/*public String getInterpretacion() {
		return interpretacion;
		
	}*/

}
