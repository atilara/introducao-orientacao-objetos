package questoesAvancadas.loja;

import java.time.LocalDate;

public class TesteLojaMain {

    public static void main(String[] args) {

        RepositorioPessoas repositorioPessoas = new RepositorioPessoas();

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

    }

}
