package comunicacion;
import java.util.ArrayList;

public class Alfabeto extends Pictograma{
	private ArrayList<String> letras= new ArrayList<>();
	private String interpretacion;
	
	public Alfabeto(String origen, ArrayList<String> letras, String interpretacion) {
		super(origen);
		this.letras=letras;
		this.interpretacion=interpretacion;
	}
	
	public int cantidadLetras() {
		//numero de elementos que tiene el atributo letras
		return letras.size();
		
	}
	@Override
	public String interpretacion() {
		return interpretacion;
		
	}
	@Override
	public String toString() {
		//todos los tributos con los del padre - interpretacion linea por linea
		String a = getOrigen() + "\n";
		a+=  this.letras + "\n";
		a+= this.interpretacion;
		return a;
	}
	public void setLetras(ArrayList<String> letras) {
		this.letras=letras;
	}
	public ArrayList<String> getLetras() {
		return letras;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion=interpretacion;
	}
	public String getInterpretacion() {
		return interpretacion;
	}

}
