package modelo;

public class Ball extends Personaje implements Movible {
	
	public final static int  ANCHO = 25;
	public final static int ALTO = 25;
	public final static String RUTA = "./resources/Imagenes/balls/balon.png";
	public final static int X_INICIAL_BALON = 624;
	public final static int Y_INICIAL_BALON = 300;

	public Ball(int posicionX, int posicionY, String rutaImg) {
		super(posicionX, posicionY, rutaImg, 3);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void mover(int direccion) {

		if (direccion == 1) {
			moverIzquierda(DISTANCIA_QUE_SE_MUEVE_1);
			
			direccionActual(DISTANCIA_QUE_SE_MUEVE_1);
		}
		if (direccion == 2) {
			moverDerecha(DISTANCIA_QUE_SE_MUEVE_1);

			
			direccionActual(DISTANCIA_QUE_SE_MUEVE_1);
		}
		if (direccion == 3) {
			moverArriba(DISTANCIA_QUE_SE_MUEVE_1);
			direccionActual(DISTANCIA_QUE_SE_MUEVE_1);
		}
		if (direccion == 4) {
			moverAbajo(DISTANCIA_QUE_SE_MUEVE_1);
			direccionActual(DISTANCIA_QUE_SE_MUEVE_1);
		}
	}
	public void mover(int direccion, int distancia) {

		if (direccion == 1) {
			moverIzquierda(distancia);

			
			direccionActual(1);
		}
		if (direccion == 2) {
			moverDerecha(distancia);
			
			direccionActual(2);
		}
		if (direccion == 3) {
			moverArriba(distancia);
			direccionActual(3);
		}
		if (direccion == 4) {
			moverAbajo(distancia);
			direccionActual(4);
		}
	}



}
