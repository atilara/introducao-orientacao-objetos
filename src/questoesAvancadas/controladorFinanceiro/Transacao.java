package questoesAvancadas.controladorFinanceiro;

import java.time.LocalDate;

public interface Transacao {

    LocalDate getData();

    String getTipo();

    String getDescricao();

    String calcularTotal();

}
