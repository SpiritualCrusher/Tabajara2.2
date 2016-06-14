package controleAereoFinal;

public class Aviao extends Aeronave{

		private int qtdTurbinas;
		private float capcCombustPorTurbina;
		
		public Aviao(){
			
		}

		public Aviao(String identificacao, String modelo, int capacPassageiros, 
				     double capacCarga, int qtdTurbinas, float capcCombustPorTurbina) {
			super(identificacao, modelo, capacPassageiros, capacCarga);
			this.qtdTurbinas = qtdTurbinas;
			this.capcCombustPorTurbina = capcCombustPorTurbina;
		}

		public int getQtdTurbinas() {
			return qtdTurbinas;
		}

		public void setQtdTurbinas(int qtdTurbinas) {
			this.qtdTurbinas = qtdTurbinas;
		}

		public float getCapcCombustPorTurbina() {
			return capcCombustPorTurbina;
		}

		public void setCapcCombustPorTurbina(float capcCombustPorTurbina) {
			this.capcCombustPorTurbina = capcCombustPorTurbina;
		}
		
}
