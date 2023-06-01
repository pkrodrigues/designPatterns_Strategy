package designspatterns.comportamentais;

public interface FormaPagamento {
    float valorAjuste = 0;
    double receber(double valor);
}
