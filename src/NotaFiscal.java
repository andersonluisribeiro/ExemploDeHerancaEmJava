
public class NotaFiscal {

	private String nomeDoCliente;
	private int anoDeEmissao;
	private float valor;
		
	public String getNomeDoCliente() {
		return nomeDoCliente;
	}
	public void setNomeDoCliente(String nomeDoCliente) {
		this.nomeDoCliente = nomeDoCliente;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public int getAnoDeEmissao() {
		return anoDeEmissao;
	}
	public void setAnoDeEmissao(int anoDeEmissao) {
		this.anoDeEmissao = anoDeEmissao;
	}
	
	public float valorComJuros(){
		return getValor() + (getValor() * 0.15f);
	}
	
	
	
		
	
}
