package comunicacion;
public class Alfabeto extends Pictograma {

	private String[] letras;
	private String interpretacion;
	
	public Alfabeto(String origen, String[] letras, String interpretacion) {
		super(origen);
		this.letras = letras;
		this.interpretacion = interpretacion;
	}

	public int cantidadLetras() {
		return this.letras.length;
	}

	public String interpretacion() {
		return interpretacion;
	}

	@Override
	public String toString() {
		String alfabeto = "";
		for (int i = 0; i< this.getLetras().length; i++) {
				alfabeto += this.getLetras()[i];
				if (i != this.getLetras().length -1) {
					alfabeto += ", ";
				}
		}
		return alfabeto;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}

	public String[] getLetras() {
		return letras;
	}

	public void setLetras(String[] letras) {
		this.letras = letras;
	}
	
	

	
}
