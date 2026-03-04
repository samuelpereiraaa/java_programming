package entities;

public class CarroEsportivo extends Car {

	private boolean modoEsportivo;

	public CarroEsportivo(String marca, String cor, int ano) {
		super(marca, cor, ano);
		this.modoEsportivo = false; 
	}

	public void ativarModoEsportivo() {
	    this.modoEsportivo = true;
	    
	    for (int i = 0; i < 10; i++) {
	        super.acelerar();
	    }

	    System.out.println("MODO ESPORTIVO ATIVADO! Velocidade aumentada em 100 km/h.");
	}
	}

	public String toString() {
		return "Carro Esportivo [" + "Marca: " + getMarca() + ", Cor: " + getCor() + ", Ano: " + getAno()
				+ ", Velocidade: " + getVelocidade() + " km/h" + ", Modo Esportivo: "
				+ (modoEsportivo ? "Ativado" : "Desativado") + "]";
	}

	public boolean isModoEsportivo() {
		return modoEsportivo;
	}

	public void setModoEsportivo(boolean modoEsportivo) {
		this.modoEsportivo = modoEsportivo;
	}
}