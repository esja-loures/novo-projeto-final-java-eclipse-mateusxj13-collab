import java.util.ArrayList;

public class Videoteca {
	private String nome = "Os meus filmes";
	private ArrayList<Filme> filmes = new ArrayList<>();

	public String getNome() {
		return nome;
	}

	public int totalFilmes() {
		return filmes.size();
	}

	public void listarFilmes() {
		// mostra o nome da videoteca
		System.out.println("=== " + nome + " ===");
		
		// Testa primeiro se a videoteca tem filmes
		if(nome.isEmpty()){
			System.out.println("Não existem filmes");
		}
		
		else {
			
		   for (int i = 0; i < filmes.size(); i++) {
				System.out.println((i + 1) + ". " + filmes.get(i));
			}
			
		   System.out.println("======");
		}
	}
	
	
	public void adicionarFilme(Filme filme) {
		
		// Completa o método para adicionar o filme
		filmes.add(filme);
	}

	public void apagarFilme(int numero) {
		System.out.println("Método por desenvolver");
		
		// Completa o método para apagar o filme
		filmes.remove(numero - 1);
		
	}
	
	public void editarFilme(int numero, String novoTitulo, int ano) {
		// Falta acrescentar o atributo ano
		filmes.get(numero - 1).setFilme(novoTitulo, ano);
		
		
	}
}
