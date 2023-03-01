
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Books books = new Books();
		Borrowing borrowing = new Borrowing();
		Employee employee = new Employee();
		User user = new User();
		Scanner scan = new Scanner(System.in);

        Random random = new Random();
		int protocol = random.nextInt();
		borrowing.setProtocol(protocol);

        System.out.println("Bem-vindo ao sistema de gerenciamento da biblioteca Ler Mais!\n");
		System.out.println("Iniciaremos o processo de cadastro de um novo emprestimo:\n");
		System.out.println("Informe o nome do usuario: \n");
		user.setName(scan.nextLine());

		System.out.println("\nInforme o Id do usuario: \n");
		user.setId(scan.nextLine());

		System.out.println("\nInforme o email do usuario: \n");
		user.setEmail(scan.nextLine());

		System.out.println("\nInforme o telefone do usuario: \n");
		user.setphoneNumber(scan.nextLine());
		user.finalize();

		System.out.println("Informe o nome do funcionario: \n");
		employee.setName(scan.nextLine());

		System.out.println("\nInforme o Id do funcionario: \n");
		employee.setId(scan.nextLine());

		System.out.println("\nInforme o email do funcionario: \n");
		employee.setEmail(scan.nextLine());

		System.out.println("\nInforme o turno do funcionario: \n");
		employee.setShift(scan.nextLine());
		employee.finalize();

		System.out.println("Selecione o livro para emprestimo: \n");
		books.choose();
		books.finalize();

		System.out.println("Informe a data de saida do livro: \n");
		borrowing.setOutDate(scan.nextLine());

		System.out.println("\nInforme a data de retorno para o livro: \n");
		borrowing.setDevolution(scan.nextLine());
		borrowing.finalize();
        scan.close();

		System.out.println("Emprestimo cadastrado!\n");
		System.out.println("Informacoes do emprestimo:\n");
		System.out.println("Sobre o usuario:");
		System.out.println("Nome do usuario: "+user.getName());
		System.out.println("Id do usuario: "+user.getId());
		System.out.println("Email do usuario: "+user.getEmail());
		System.out.println("Telefone do usuario: "+user.getphoneNumber());
		System.out.println("\nSobre o funcionario:");
		System.out.println("Nome do funcionario: "+employee.getName());
		System.out.println("Id do funcionario: "+employee.getId());
		System.out.println("Email do funcionario: "+employee.getEmail());
		System.out.println("Turno do funcionario: "+employee.getShift());
		System.out.println("\nSobre o livro:");
		System.out.println("Livro escolhido: "+books.getBook());
		System.out.println("\nSobre o emprestimo:");
		System.out.println("Protocolo do emprestimo: "+borrowing.getProtocol());
		System.out.println("Data de saida do livro: "+borrowing.getOutDate());
		System.out.println("Data de retorno do livro: "+borrowing.getDevolution());
		System.out.println("\nFinalizamos o processo de cadastro de um novo emprestimo");
    }
}
