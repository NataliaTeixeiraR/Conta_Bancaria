package banco;

public class ContaBancaria {
	
	 private double saldo;
	
	 interface OperacaoBancaria {
		double calcular(double saldo, double valor);		
	 }
	 
	 private double realizarOperacao(double saldo, double valor, OperacaoBancaria operacao) {
	 return operacao.calcular(saldo, valor);
	 }

	public static void main(String[] args) {			
		
		ContaBancaria conta = new ContaBancaria();
		
		OperacaoBancaria creditar = (double a, double b) -> a + b;
		OperacaoBancaria debitar = (double a, double b) -> a - b;			
		
		System. out. println("Saldo pós crédito:  = " + conta.realizarOperacao(100,50, creditar));
		System. out. println("Saldo pós débito = " + conta.realizarOperacao(100,10, debitar));
	}	
}


