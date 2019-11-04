class CaixaEletonico implements Hardware {

	static String saldo(ContaCorrente contaCorrente) {
		return ("O saldo é R$ " + contaCorrente.getSaldo());
	}

	static String sacar(ContaCorrente conta, double valorParaSaque) {
		double saldoAtual = conta.getSaldo();
		if (valorParaSaque <= saldoAtual) {
			conta.setSaldo(saldoAtual - valorParaSaque);
			return "Retire seu dinheiro.";
		} else {
			return "Saldo insuficiente.";
		}
	}

	static String depositar(ContaCorrente conta, double valorParaDeposito) {
		double saldoAtual = conta.getSaldo();
		conta.setSaldo(saldoAtual + valorParaDeposito);
		return "Depósito recebido com sucesso.";
	}

	@Override
	public String pegarNumeroDaContaCartao() {
		return null;
	}

		/*pegarNumeroDaContaCartao() para ler o número da conta do cartão para o login (retorna uma String com o número da conta),
	 entregarDinheiro() que entrega o dinheiro no caso do saque (retorna void) e
	 lerEnvelope() que recebe o envelope com dinheiro na operação de depósito (retorna void). */


	@Override
	public void entregarDinheiro() {

	}

	@Override
	public void lerEnvelope() {

	}
}
