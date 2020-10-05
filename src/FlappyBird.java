//main class the game

public class FlappyBird implements Jogo {
	public String getTitulo() {
		return "Flappy Bird Game";
	}

	public int getLargura() {
		return 384;

	}

	public int getAltura() {
		return 512;

	}

	public void tique(java.util.Set<String> teclas, double dt) {

	}

	public void tecla(String tecla) {

	}
	

	//Class all drawing on screen
	public void desenhar(Tela tela) {
		//background
		tela.imagem("flappy.png", 0, 0, 288, 512, 0, 0, -122);
		tela.imagem("flappy.png", 0, 0, 288, 512, 0, 288, -122);
		tela.imagem("flappy.png", 0, 0, 288, 512, 0, 288*2, -122);
		
		//Ground
		tela.imagem("flappy.png", 292, 0, 308, 112, 0, 0, getAltura()-198);
		tela.imagem("flappy.png", 292, 0, 308, 112, 0, 308, getAltura()-198);
		//tela.imagem(arquivo, xa, ya, larg, alt, dir, x, y);

	}

	public static void main(String[] args) {
		new Motor(new FlappyBird());
	}

}
