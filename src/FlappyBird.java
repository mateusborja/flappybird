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

	public void desenhar(Tela tela) {

	}

	public static void main(String[] args) {
		new Motor(new FlappyBird());
	}

}
