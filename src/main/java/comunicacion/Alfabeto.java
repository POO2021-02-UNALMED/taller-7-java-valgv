package comunicacion;

public class Alfabeto extends Pictograma{
	private String[] letras;
	private String interpretacion;
	
	public Alfabeto(String origen, String[] letras, String interpretacion) {
		super(origen);
		this.letras=letras;
		this.interpretacion=interpretacion;
	}
	
	public int cantidadLetras() {
		//numero de elementos que tiene el atributo letras
		return letras.length;
		
	}
	@Override
	public String interpretacion() {
		return interpretacion;
		
	}
	@Override
	public String toString() {
		String alfab = "";
		// letra por letra separada por comas
		for(int i=0; i<letras.length; i++) {
			alfab+= letras[i] + ", ";
		}
		return alfab;
	}
	public void setLetras(String[] letras) {
		this.letras=letras;
	}
	public String[] getLetras() {
		return letras;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion=interpretacion;
	}
	public String getInterpretacion() {
		return interpretacion;
	}
	/*public static void main(String[] args) {
		Alfabeto alfabeto = new Alfabeto("alfabeto griego, occidente", new String [] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"}, "Alfabeto latino");
		System.out.println(alfabeto);
		Fabula fabula = new Fabula("pensamiento", "La tortuga y la liebre", "Esopo", 2, "no se debe uno burlar de los demás, ni presumir o ser vanidoso", "Cuento corto");
		System.out.println(fabula);
		Tesis tesis = new Tesis("Pensamiento expansivo", "Recomendador", "Alejandro", 20, "Recomendar asignaturas", new String [] {"Primero", "Segundo"}, "Se hace trabajo futuro", "[1] Maquinaria",  "Escrito investigativo");
		System.out.println(tesis);
		System.out.println(alfabeto.cantidadLetras());
	}*/

}
