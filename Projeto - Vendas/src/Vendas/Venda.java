package Vendas;

import java.util.ArrayList;
import java.util.List;

public class Venda {

	private int codigoVenda;
	
	/*exemplo de utiliza��o do m�todo generics
	 * onde nesta lista ser�o aceitos apenas elementos do tipo Produto
	 */
	private List<Produto> listaProdutos = new ArrayList<Produto>();
	
	protected Cliente cliente;
	protected Vendedor vendedor;
	protected Produto produto;
	
	Venda(){
		cliente = new Cliente();
		vendedor = new Vendedor();
		produto = new Produto();
	}

	//set e get
	public int getCodigoVenda() {
		return codigoVenda;
	}

	public void setCodigoVenda(int codigoVenda) {
		this.codigoVenda = codigoVenda;
	}

	public List<Produto> getListaProdutos() {
		return listaProdutos;
	}

	public void setListaProdutos(List<Produto> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	//adicionar produto � lista
	public void addProduto(Produto produto) {
		listaProdutos.add(produto);
	}
	
}
