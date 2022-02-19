package desafio.passo.java;

//Desafio --> Total de Compras de cada cliente 

public class Sistema {

	public static void main(String[] args) {
		
		
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("Caneta", 1, 100);
		compra1.adicionarItem(new Produto ("Notebook", 2000), 2);
		
		Compra compra2 = new Compra();
		compra2.adicionarItem("Caderno", 10, 10);
		compra2.adicionarItem(new Produto("Impressora", 1000),1);
		
		Compra compra3 = new Compra();
		compra3.adicionarItem("Agenda", 30, 5);
		compra3.adicionarItem(new Produto("Impressora", 1000),1);
		
		Cliente cliente = new Cliente ("Maria Julia");
		cliente.adicionarCompra(compra1);
		cliente.adicionarCompra(compra2);
		
		Cliente cliente1 = new Cliente ("Carla Luiza");
		cliente1.adicionarCompra(compra3);
		cliente1.adicionarCompra(compra1);
		
		
		
		System.out.println("Cliente: " + cliente.nome + " -- " + "Total da Compra: " + cliente.obterValorTotal());
		
		System.out.println("Cliente: " + cliente1.nome + " -- " + "Total da Compra: " + cliente1.obterValorTotal());
		
		

	}

}
