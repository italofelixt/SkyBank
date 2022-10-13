
public class Conta {

	private static int contadorDeContas; //é static para funcionar na classe toda, e não apenas nas instancias
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;

	public Conta(int agencia, int numero) { //construtor que instancia atributos e
											//usa parametros para "obrigar" o new a colocar agencia e numero
		this.agencia = agencia;   //dizendo que a agencia que foi chamada pelo construtor é igual a do parametro
		this.numero = numero;
		
		
		System.out.println("Criando uma conta");
		contadorDeContas++; //a cada conta criada pelo construtor é iterado no contador 
	}
	
	public static int getContadorDeContas() { //getter para acessar o contador
		return Conta.contadorDeContas;
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valor) { // metodo que tem de entrada um valor (que sera o quanto saca)
		if (this.saldo >= valor) { // se o saldo for suficiente
			this.saldo -= valor; // executa o saque (subtrai o valor do saldo)
			return true;

		} else {
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			saca(valor); // usando o metodo saca p/ fazer a tranf.
			destino.deposita(valor); // usando o metodo deposita p/ atribuir o valor ao saldo
			return true;

			// poderia ser tmb

			// this.saldo -= valor;
			// destino.saldo += valor;

		} // tem um else "imaginario" pq caso o if for false,
			// o programa ja ira pular para a proxima linha que tem o return false
		return false;

	}

	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public boolean setNumero(int novoNumero) { // o nome da var novoNumero poderia ser apenas numero, já que é uma var local 
												// e não conflitaria com o atributo numero da classe conta. 
		if (novoNumero > 0) {
		this.numero = novoNumero;
		return true;
		} else {
			System.out.println("Número inválido.");
		} return false;
	}

	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Número de agencia não pode ser 0 nem negativo");
		}
		this.agencia = agencia;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
}
