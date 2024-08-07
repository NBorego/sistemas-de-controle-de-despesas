package src.util;

import java.util.Date;

public class Pagamento {
    Date dataPagamento;
    double valor;

    public Pagamento(Date dataPagamento, double valor) {
        this.dataPagamento = dataPagamento;
        this.valor = valor;
    }
}
