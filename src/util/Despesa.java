package src.util;

import java.util.Date;

import src.Main;

public class Despesa {
    String descricao;
    double valor;
    Date dataVencimento;
    Main tipoDespesa;

    public Despesa(String descricao, double valor, Date dataVencimento, Main tipoDespesa) {
        this.descricao = descricao;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
        this.tipoDespesa = tipoDespesa;
    }
}
