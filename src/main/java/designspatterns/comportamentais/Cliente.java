package designspatterns.comportamentais;
public class Cliente {
    private double valorCompra;

    public double getValorNota()
    {
        return  valorCompra;
    }

    public void realizarPagamentoCredito(double value)
    {
        GerenciadorPagamentos gp = new GerenciadorPagamentos(value);
        this.valorCompra = gp.receber(new FormaPagamentoCredito());
    }

    public void realizarPagamentoDebito(double value)
    {
        GerenciadorPagamentos gp = new GerenciadorPagamentos(value);
        this.valorCompra = gp.receber(new FormaPagamentoDebito());
    }

    public void realizarPagamentoPix(double value)
    {
        GerenciadorPagamentos gp = new GerenciadorPagamentos(value);
        this.valorCompra = gp.receber(new FormaPagamentoPix());
    }
}
