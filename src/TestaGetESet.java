
public class TestaGetESet {
	public static void main(String[] args) {
		
		//Conta conta = new Conta(); //sem os parametros não compila,o construtor Conta exige os dois parâmetros
		Conta contaDoItalo = new Conta(2555, 1444); 
		Conta conta2 = new Conta(25, 55);	
		
		//conta.numero = 159; não compila, o atributo numero é privado
		
		contaDoItalo.setNumero(22); //compila pois usa o metodo setNumero
		
		System.out.println(contaDoItalo.getNumero());
		
		Cliente italo = new Cliente();
		
		//italo.nome = "italo felix"    não compila pois nome é privado.
		
		italo.setNome("Italo Felix"); //set o nome do cliente
		
	
		
		contaDoItalo.setTitular(italo); //set do Titular da classe Conta com a classe Cliente
		
		System.out.println(contaDoItalo.getTitular().getNome()); //é a forma para imprimir a referencia de outra referencia com getters 	
		
		System.out.println("O número de contas abertas é: " + Conta.getContadorDeContas());
	}

}
