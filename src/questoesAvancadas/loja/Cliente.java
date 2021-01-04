package questoesAvancadas.loja;

import java.time.LocalDate;
import java.util.Objects;

public class Cliente extends Pessoa {

    private long codigo;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cliente)) return false;
        if (!super.equals(o)) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(codigo, cliente.codigo);
    }

    @Override
    public String toString() {
        return "\nCliente{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", dataNascimento=" + dataNascimento +
                "}";
    }
}
