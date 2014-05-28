package ulima.isw2.tamagotchi;

public class Mascota {
	private EstadoMascota mEstado;
	private int Felicidad=0;
	
	
	
	public Mascota() {
		mEstado = new Hambriento(this);
	}
	
	public void setmEstado(EstadoMascota mEstado) {
		this.mEstado = mEstado;
	}

	public int getFelicidad() {
		return Felicidad;
	}

	public void setFelicidad(int felicidad) {
		Felicidad = felicidad;
	}

	public void alimentarMascota(){
		mEstado.Comer();
	}

	public void jugarMascota(){
		mEstado.Jugar();
	}
}
