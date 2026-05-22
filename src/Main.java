import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Videoteca v = new Videoteca();
		int opcao;

		do {
			System.out.println();
			System.out.println("1. Apresentar biblioteca");
			System.out.println("2. Adicionar filme");
			System.out.println("3. Apagar filme");
			System.out.println("4. Editar filme");
			System.out.println("0. Sair");
			System.out.print("Opcao: ");
			opcao = sc.nextInt();
			sc.nextLine();

			if (opcao == 1) {
				v.listarFilmes();

			} else if (opcao == 2) {
				System.out.println("Título: ");
				String titulo = sc.nextLine();

				// acrescentei pedido do ano
				System.out.println("Ano: ");
				int ano = sc.nextInt();
				sc.nextLine();

				// construtor vai passar a receber o atributo ano
				Filme f = new Filme(titulo, ano);

				v.adicionarFilme(f);

			} else if (opcao == 3) {
				
				// testar primeiro se há filmes para apagar
				if (v.totalFilmes() == 0) {
					System.out.println("Não há filmes para apagar.");
				} 
				
				else {
					System.out.println("Número do filme a apagar: ");
					int num = sc.nextInt();
					sc.nextLine();

					if (num >= 1 && num <= v.totalFilmes()) {
						v.apagarFilme(num);
					} 
					
					else {
						System.out.println("Numero inválido.");
					}
				}

			} else if (opcao == 4) {
				
				// vêr se há filmes para editar né professor
				if (v.totalFilmes() == 0) {
					System.out.println("Não há filmes para editar.");
				} 
				
				else {
					System.out.print("Número do filme a editar: ");
					int num = sc.nextInt();
					sc.nextLine();

					if (num >= 1 && num <= v.totalFilmes()) {
						System.out.println("Novo titulo: ");
						String novoTitulo = sc.nextLine();

						// pedido de cria para novo ano
						System.out.println("Novo ano: ");
						int ano = sc.nextInt();
						sc.nextLine();

						// Aquilo que tememos, um novo método para editar titulo e ano
						v.editarFilme(num, novoTitulo, ano);

					} else {
						System.out.println("Numero inválido.");
					}
				}
			}

		} while (opcao != 0);

		sc.close();
		System.out.println("Ate logo!");
	}
}
