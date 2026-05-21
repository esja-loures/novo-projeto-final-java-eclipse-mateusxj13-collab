/*
  Adapta esta classe para aceitar o atributo ano
 */
public class Filme {
	private String titulo;
	// Falta um atributo para ano
	
	public Filme(String titulo) { // o construtor tem de aceitar o atributo ano
		this.titulo = titulo;
	}
	// Completa aqui o método Setter para alterar o título e o ano do filme
	public void setFilme(String titulo) {
		this.titulo = titulo;
	}
	// Completa aqui o método toString para apresentar o título e o ano do filme
	public String toString() {
		
		StringBuilder sb = new StringBuilder("");
		sb.append("Título: "+titulo);
		return sb.toString();
	}
}
