package questoesAvancadas.loja;

import java.util.ArrayList;

public class RepositorioPessoas {

    ArrayList<Pessoa> pessoas;

    public ArrayList<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(ArrayList<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    public void cadastrarPesssoa(Pessoa pessoa) {

    }

    public String listarPessoasMaioresIdade() {
        return "Pessoas: ";
    }

    public String listarClientesMaioresIdade() {
        return "Clientes: ";
    }

    public String listarFuncionariosComSalarioMaiorQue(double salario) {
        return "Funcionários: ";
    }

    public String listarGerentesDaArea(String area) {
        return "Gerentes: ";
    }

}
