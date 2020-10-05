
public class Passaro {
	public double x,y;
	public double vy;
	
	//Constants
	public static double G = 500;
	public static double FLAP = -300;
	
	// Bird position
	public Passaro (double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	
	
	//Bird fisics
	public void atualiza(double dt) {
		vy += G*dt;
		y += vy*dt;
	}
	
	//Bird
	public void desenhar(Tela t) {
		t.imagem("flappy.png", 528, 128, 34, 24, 0, x, y);
	}
	

}
