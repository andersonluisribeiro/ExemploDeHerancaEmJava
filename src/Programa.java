
public class Programa {

	public static void main(String[] args) {
		
		//Nota fiscal comum - 15% de juros
		NotaFiscal notaFiscal = new NotaFiscal();
		notaFiscal.setNomeDoCliente("Anderson");
		notaFiscal.setValor(200f);
		
		System.out.println("O valor da nota é: " + notaFiscal.getValor());
		System.out.println("O valor com juros é: " + notaFiscal.valorComJuros());
		
		
		//Nota fiscal de uma pessoa física - 10% de juros
		NotaFiscalPessoaFisica notaFiscalPessoaFisica = new NotaFiscalPessoaFisica();
		notaFiscalPessoaFisica.setNomeDoCliente("Anderson");
		notaFiscalPessoaFisica.setValor(200f);
		
		System.out.println("O valor da nota pf é: " + notaFiscalPessoaFisica.getValor());
		System.out.println("O valor com juros pf é: " + notaFiscalPessoaFisica.valorComJuros());
		
		//Nota fiscal de uma pessoa jurídica - 20% de juros
		NotaFiscalPessoaJuridica notaFiscalPessoaJuridica = new NotaFiscalPessoaJuridica();
		notaFiscalPessoaJuridica.setNomeDoCliente("João");
		notaFiscalPessoaJuridica.setValor(200f);
		
		System.out.println("O valor da nota pj é: " + notaFiscalPessoaJuridica.getValor());
		System.out.println("O valor com juros pj é: " + notaFiscalPessoaJuridica.valorComJuros());
	
	}
	
}
