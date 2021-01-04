package questoesAvancadas.loja;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class RepositorioPessoas {

    ArrayList<Pessoa> pessoas;

    public RepositorioPessoas() {
        pessoas = new ArrayList<>();
    }

    public ArrayList<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(ArrayList<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    public void cadastrarPesssoa(Pessoa pessoa) {
        boolean existePessoaIgual = false;
        for (Pessoa p : pessoas) {
            if (pessoa.equals(p)) {
                existePessoaIgual = true;
                System.out.println("Impossível adicionar pessoas iguais");
            }
        }
        if (!existePessoaIgual) {
            System.out.println("Pessoa adicionada");
            pessoas.add(pessoa);
        }
    }

    public ArrayList<Pessoa> listarPessoasMaioresIdade() {
        ArrayList<Pessoa> retorno = new ArrayList<>();
        for (Pessoa p : pessoas) {
            if (p.getDataNascimento().until(LocalDate.now(), ChronoUnit.YEARS) >= 18) {
                retorno.add(p);
            }
        }
        return retorno;
    }

    public ArrayList<Cliente> listarClientesMaioresIdade() {
        ArrayList<Cliente> retorno = new ArrayList<>();

        for (Pessoa p : pessoas) {
            if (p instanceof Cliente && p.getDataNascimento().until(LocalDate.now(), ChronoUnit.YEARS) >= 18) {
                retorno.add((Cliente) p);
            }
        }
        return retorno;
    }

    public String listarFuncionariosComSalarioMaiorQue(double salario) {
        return "Funcionários: ";
    }

    public String listarGerentesDaArea(String area) {
        return "Gerentes: ";
    }

}
