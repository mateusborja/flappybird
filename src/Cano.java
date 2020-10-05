
public class Cano {
	
	public double x,y;
	public double vxcano;
	public static int HOLESIZE = 100;

	public Cano(double x, double y, double vx) {
		this.x = x;
		this.y = y;
		this.vxcano = vx;

	}

	public void atualiza(double dt) {
		x += vxcano*dt;
		
	}

	public void desenha(Tela t) {
		t.imagem("flappy.png", 604, 0, 52, 270, 0, x, y-270); // cano up
		t.imagem("flappy.png", 660, 0, 52, 242, 0, x, y + Cano.HOLESIZE); // cano down
		
		

	}

}
