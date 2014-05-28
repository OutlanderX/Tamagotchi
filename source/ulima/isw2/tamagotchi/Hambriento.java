package ulima.isw2.tamagotchi;

public class Hambriento implements EstadoMascota {
	private Mascota mMascota;
	public Hambriento(Mascota mMascota) {
		this.mMascota = mMascota;
	}

	@Override
	public void Jugar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Comer() {
		// TODO Auto-generated method stub
		mMascota.setmEstado(new Contento(mMascota));
		
	}

}
