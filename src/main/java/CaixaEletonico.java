class CaixaEletonico {

	static String saldo(ContaCorrente contaCorrente) {
		return ("O saldo é R$ " + contaCorrente.getSaldo());
	}

	static String sacar(ContaCorrente c1, double valorParaSaque) {
		double saldoAtual = c1.getSaldo();
		if (valorParaSaque <= saldoAtual) {
			c1.setSaldo(saldoAtual - valorParaSaque);
			return "Retire seu dinheiro.";
		} else {
			return "Saldo insuficiente.";
		}
	}
}
