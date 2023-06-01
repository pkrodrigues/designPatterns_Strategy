import designspatterns.comportamentais.Cliente;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClienteTest {
    @Test
    void deveReceberPagamentoCredito(){
        Cliente cliente = new Cliente();
        cliente.realizarPagamentoCredito(100.00);
        assertEquals(102.00, cliente.getValorNota());
    }

    @Test
    void deveReceberPagamentoDebito(){
        Cliente cliente = new Cliente();
        cliente.realizarPagamentoDebito(100.00);
        assertEquals(101.00, cliente.getValorNota());
    }

    @Test
    void deveReceberPagamentoPix(){
        Cliente cliente = new Cliente();
        cliente.realizarPagamentoPix(100.00);
        assertEquals(95.00, cliente.getValorNota());
    }
}
