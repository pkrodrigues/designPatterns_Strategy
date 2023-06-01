package designspatterns.comportamentais;

import designspatterns.comportamentais.FormaPagamento;

public class FormaPagamentoCredito implements FormaPagamento {
    private float valorAjuste =  0.02f;
    public double receber(double value){
        return Math.round(value+(value*valorAjuste));
    }
}
