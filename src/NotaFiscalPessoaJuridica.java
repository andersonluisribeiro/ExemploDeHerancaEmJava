
public class NotaFiscalPessoaJuridica extends NotaFiscal {

	@Override
	public float valorComJuros() {
		return getValor() + (getValor() * 0.2f);	
	}
	
	
}
