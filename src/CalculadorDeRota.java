

public class CalculadorDeRota {

	 public static void main(String[] args) {
		
		 Cidade casaBranca = new Cidade();
		 casaBranca.nome = "Casa Branca";
		 
		 Cidade vargem = new Cidade();
		 vargem.nome = "Casa Branca";
		 
		 Cidade palmeiras = new Cidade();
		 palmeiras.nome = "Casa Branca";
		 
		
		 casaBranca.cidadesVizinhas.add(vargem);
		 casaBranca.cidadesVizinhas.add(palmeiras);
		 
		 Cidade pocos = new Cidade();
		 pocos.nome = "Poços";
		 
		 casaBranca.tracarRotaPara(pocos);
		 
				 
		 
	}
	
}
