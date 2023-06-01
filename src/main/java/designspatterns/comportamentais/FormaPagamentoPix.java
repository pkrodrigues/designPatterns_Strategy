package designspatterns.comportamentais;

public class FormaPagamentoPix implements FormaPagamento{
    private float valorAjuste = 0.05f;

    public double receber(double value){
        return Math.round(value-(value*valorAjuste));
    }
}
