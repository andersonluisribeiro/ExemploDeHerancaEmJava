
public class Programa {

	public static void main(String[] args) {
		
		//Nota fiscal comum - 15% de juros
		NotaFiscal notaFiscal = new NotaFiscal();
		notaFiscal.setNomeDoCliente("Anderson");
		notaFiscal.setValor(200f);
		
		System.out.println("O valor da nota �: " + notaFiscal.getValor());
		System.out.println("O valor com juros �: " + notaFiscal.valorComJuros());
		
		
		//Nota fiscal de uma pessoa f�sica - 10% de juros
		NotaFiscalPessoaFisica notaFiscalPessoaFisica = new NotaFiscalPessoaFisica();
		notaFiscalPessoaFisica.setNomeDoCliente("Anderson");
		notaFiscalPessoaFisica.setValor(200f);
		
		System.out.println("O valor da nota pf �: " + notaFiscalPessoaFisica.getValor());
		System.out.println("O valor com juros pf �: " + notaFiscalPessoaFisica.valorComJuros());
		
		//Nota fiscal de uma pessoa jur�dica - 20% de juros
		NotaFiscalPessoaJuridica notaFiscalPessoaJuridica = new NotaFiscalPessoaJuridica();
		notaFiscalPessoaJuridica.setNomeDoCliente("Jo�o");
		notaFiscalPessoaJuridica.setValor(200f);
		
		System.out.println("O valor da nota pj �: " + notaFiscalPessoaJuridica.getValor());
		System.out.println("O valor com juros pj �: " + notaFiscalPessoaJuridica.valorComJuros());
	
	}
	
}
