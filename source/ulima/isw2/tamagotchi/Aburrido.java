package ulima.isw2.tamagotchi;

public class Aburrido implements EstadoMascota {
	private Mascota mMascota;


	public Aburrido(Mascota mMascota) {
		this.mMascota = mMascota;
		mMascota.setFelicidad(0);
		
	}

	@Override
	public void Jugar() {
		// TODO Auto-generated method stub
		mMascota.setmEstado(new Contento(mMascota));
	}

	@Override
	public void Comer() {
		// TODO Auto-generated method stub
		mMascota.setmEstado(new Contento(mMascota));		
	}


}
