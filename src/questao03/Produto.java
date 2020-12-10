package questao03;

public class Produto {

    private String codigo;

    private String nome;

    // Construtor vazio
    Produto() {
        codigo = "0";
        nome = "padrão";
    }

    // Construtor com parametros
    Produto(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    // getCodigo
    public String pegarCodigo() {
        return codigo;
    }

    // getNome
    public String pegarNome() {
        return nome;
    }

    // setNome
    public void mudarNome(String nome) {
        this.nome = nome;
    }

}
