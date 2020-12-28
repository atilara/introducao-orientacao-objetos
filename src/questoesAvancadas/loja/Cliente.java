package questoesAvancadas.loja;

import java.time.LocalDate;

public class Cliente extends Pessoa {

    private long codigo;

    public Cliente(String nome, LocalDate dataNascimento) {
        super(nome, dataNascimento);
    }

    public Cliente(String nome, LocalDate dataNascimento, long codigo) {
        super(nome, dataNascimento);
        this.codigo = codigo;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Cliente: " +
                " nome=" + getNome() +
                ", dataNascimento=" + getDataNascimento() +
                ", codigo=" + codigo;
    }
}
