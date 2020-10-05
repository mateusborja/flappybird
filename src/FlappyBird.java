//main class the game

public class FlappyBird implements Jogo {

	public double ground_offset = 0;
	public double gvx = 85;

	// Bird
	public Passaro passaro;

	public FlappyBird() {
		passaro = new Passaro(95, getLargura()-112/2 + 24/2);
	}

	public String getTitulo() {
		return "Flappy Bird Game";
	}

	public int getLargura() {
		return 384;

	}

	public int getAltura() {
		return 512;

	}
	
	
	public void tecla(String tecla) {

	}

	//tique function time depends
	public void tique(java.util.Set<String> teclas, double dt) {

		ground_offset += dt * gvx;
		ground_offset = ground_offset % 308;

	}

	// Class all drawing on screen
	public void desenhar(Tela t) {
		// background
		t.imagem("flappy.png", 0, 0, 288, 512, 0, 0, -122);
		t.imagem("flappy.png", 0, 0, 288, 512, 0, 288, -122);
		// tela.imagem("flappy.png", 0, 0, 288, 512, 0, 288*2, -122);

		// Ground
		t.imagem("flappy.png", 292, 0, 308, 112, 0, -ground_offset, getAltura() - 198);
		t.imagem("flappy.png", 292, 0, 308, 112, 0, 308 - ground_offset, getAltura() - 198);
		t.imagem("flappy.png", 292, 0, 308, 112, 0, 308 * 2 - ground_offset, getAltura() - 198);
		// tela.imagem(arquivo, xa, ya, larg, alt, dir, x, y);

		// Bird in screen
		passaro.desenhar(t);

	}

	public static void main(String[] args) {
		new Motor(new FlappyBird());
	}

}
