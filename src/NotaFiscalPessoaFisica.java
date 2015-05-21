
public class NotaFiscalPessoaFisica extends NotaFiscal {

	@Override
	public float valorComJuros() {
		return getValor() + (getValor() * 0.10f);
	}	
		
}
