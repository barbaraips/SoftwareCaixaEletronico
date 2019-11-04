
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TesteCaixaEletronico {

	@Test
	void testeSaldo(){
		ContaCorrente c1 = new ContaCorrente(1, 10.00);
		Assertions.assertEquals("O saldo é R$ " + c1.getSaldo(), CaixaEletonico.saldo(c1));
	}

	@Test
	void testeSacarOk() {
		ContaCorrente c1 = new ContaCorrente(1, 50.00);
		Assertions.assertEquals("Retire seu dinheiro.", CaixaEletonico.sacar(c1, 20.00));
	}

	@Test
	void testeSacarErro() {
		ContaCorrente c1 = new ContaCorrente(1, 10.00);
		Assertions.assertEquals("Saldo insuficiente.", CaixaEletonico.sacar(c1, 30.00));
	}

	@Test
	void testeDepositarOk() {
		ContaCorrente c1 = new ContaCorrente(1, 5.00);
		Assertions.assertEquals("Depósito recebido com sucesso.", CaixaEletonico.depositar(c1, 20.00));
	}

}
