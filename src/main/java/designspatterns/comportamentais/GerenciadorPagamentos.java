package designspatterns.comportamentais;


public class GerenciadorPagamentos {
    private double value;


    public GerenciadorPagamentos(double value){
        this.value = value;
    }

    public double receber(FormaPagamento formaPagamento){
        return formaPagamento.receber(value);
    }
}
