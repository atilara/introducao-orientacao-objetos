package questoesAvancadas.loja;

import java.time.LocalDate;

public class TesteLojaMain {

    public static void main(String[] args) {

        // Instancia do repositorioPessoas
        RepositorioPessoas repositorioPessoas = new RepositorioPessoas();

        // Instanciação dos Clientes
        Cliente cliente01 = new Cliente
                ("Fulano Gonçalves", LocalDate.of(1990, 1, 1), 345234345456L);

        Cliente cliente02 = new Cliente
                ("Gildo Leonardo", LocalDate.of(1980, 6, 20), 345222345456L);

        Cliente cliente03 = new Cliente
                ("Bernardo Bezerra", LocalDate.of(1986, 9, 13), 345234345856L);

        Cliente cliente04 = new Cliente
                ("Joana de Melo", LocalDate.of(1978, 3, 17), 345234345886L);

        Cliente cliente05 = new Cliente
                ("Carla Brito", LocalDate.of(1990, 2, 20), 34523434999L);

        Cliente clienteRepetido = new Cliente
                ("Carla Brito", LocalDate.of(1990, 2, 20), 34523434999L);

        // Cadastramentos dos clientes
        repositorioPessoas.cadastrarPesssoa(cliente01);
        repositorioPessoas.cadastrarPesssoa(cliente02);
        repositorioPessoas.cadastrarPesssoa(cliente03);
        repositorioPessoas.cadastrarPesssoa(cliente04);
        repositorioPessoas.cadastrarPesssoa(cliente05);
        repositorioPessoas.cadastrarPesssoa(clienteRepetido);

        // Instanciacao dos funcionários
        Funcionario funcionario01 = new Funcionario
                ("Geraldo Marivaldo", LocalDate.of(1991, 1, 1), 1100);

        Funcionario funcionario02 = new Funcionario
                ("Júlio César", LocalDate.of(1950, 5, 20), 1220.3);

        Funcionario funcionario03 = new Funcionario
                ("Fulano da Silva", LocalDate.of(1987, 9, 13), 1500);

        Funcionario funcionario04 = new Funcionario
                ("Walter White", LocalDate.of(1979, 3, 17), 2000);

        Funcionario funcionario05 = new Funcionario
                ("Jax Teller", LocalDate.of(1989, 2, 20), 1300);

        Funcionario funcionarioRepetido = new Funcionario
                ("Jax Teller", LocalDate.of(1989, 2, 20), 1300);

        // Cadastramentos dos funcionarios
        repositorioPessoas.cadastrarPesssoa(funcionario01);
        repositorioPessoas.cadastrarPesssoa(funcionario02);
        repositorioPessoas.cadastrarPesssoa(funcionario03);
        repositorioPessoas.cadastrarPesssoa(funcionario04);
        repositorioPessoas.cadastrarPesssoa(funcionario05);
        repositorioPessoas.cadastrarPesssoa(funcionarioRepetido);

        // Instanciacao dos gerentes
        Gerente gerente01 = new Gerente
                ("Maximus Decimus", LocalDate.of(1991, 1, 1), 1100, "vendas");

        Gerente gerente02 = new Gerente
                ("Cômodo", LocalDate.of(1950, 5, 20), 1220.3, "rh");

        Gerente gerente03 = new Gerente
                ("Robin Hood", LocalDate.of(1987, 9, 13), 1500, "vendas");

        Gerente gerente04 = new Gerente
                ("Walt Whitman", LocalDate.of(1979, 3, 17), 2000, "rh");

        Gerente gerente05 = new Gerente
                ("Gustavo", LocalDate.of(1989, 2, 20), 1300, "vendas");

        Gerente gerenteRepetido = new Gerente
                ("Gustavo", LocalDate.of(1989, 2, 20), 1300, "vendas");


        // Cadastramentos dos gerentes
        repositorioPessoas.cadastrarPesssoa(gerente01);
        repositorioPessoas.cadastrarPesssoa(gerente02);
        repositorioPessoas.cadastrarPesssoa(gerente03);
        repositorioPessoas.cadastrarPesssoa(gerente04);
        repositorioPessoas.cadastrarPesssoa(gerente05);
        repositorioPessoas.cadastrarPesssoa(gerenteRepetido);

        // Todas as listagens solicitadas

        System.out.println("\n\nPessoas maiores de idade:\n" + repositorioPessoas.listarPessoasMaioresIdade());

        System.out.println("\n\nClientes maiores de idade:\n" + repositorioPessoas.listarClientesMaioresIdade());

        System.out.println("\n\nFuncionários com salário maior que 1250:\n"
                + repositorioPessoas.listarFuncionariosComSalarioMaiorQue(1250));

        System.out.println("\n\nGerentes de vendas:\n" + repositorioPessoas.listarGerentesDaArea("vendas"));
    }

}
