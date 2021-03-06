package juego;

import java.awt.*;
import entorno.*;

public class Disparo {
	private Rectangle rec;
    private int velocidad = 8;
    private double angulo;
    private Image bala = Herramientas.cargarImagen("bala.png");

    public Disparo(int x, int y, double angulo) {
        this.rec = new Rectangle(x, y, 30, 15);
        this.angulo = angulo;
    }
    
	public void dibujar(Entorno entorno) {
	    entorno.dibujarRectangulo(this.getX(), this.getY(), this.getAncho(), this.getAlto(), this.angulo, Color.CYAN);
        entorno.dibujarImagen(this.bala, this.getX(), this.getY(), this.angulo, 0.1);
	}
	
    public void mover() {
        this.setX(this.getX() + (int) (Math.cos(this.angulo) * this.velocidad));
        this.setY(this.getY() + (int) (Math.sin(this.angulo) * this.velocidad));
    }

    public Rectangle getRec() {
        return this.rec;
    }

    public int getX() {
        return this.rec.x;
    }

    public int getY() {
        return this.rec.y;
    }

    public int getAncho() {
        return this.rec.width;
    }

    public int getAlto() {
        return this.rec.height;
    }

    public double getAngulo() {
        return this.angulo;
    }

    public int getVelocidad() {
        return this.velocidad;
    }

    public void setX(int x) {
        this.rec.x = x;
    }

    public void setY(int y) {
        this.rec.y = y;
    }
}