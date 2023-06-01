package designspatterns.comportamentais;

public class FormaPagamentoDebito implements FormaPagamento{
    private float valorAjuste = 0.01f;

     public double receber(double value){
         return Math.round(value+(value*valorAjuste));
     }
}
