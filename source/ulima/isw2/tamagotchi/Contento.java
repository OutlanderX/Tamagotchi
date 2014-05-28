package ulima.isw2.tamagotchi;


public class Contento implements EstadoMascota{
	private Mascota mMascota;
	private int felicidad;

	public Contento(Mascota mMascota) {
		this.mMascota = mMascota;
		felicidad=mMascota.getFelicidad();
	}

	@Override
	public void Jugar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Comer() {
		// TODO Auto-generated method stub
		if(felicidad>2){
			mMascota.setmEstado(new Aburrido(mMascota));
		}else{
			mMascota.setFelicidad(felicidad+1);
		}		
	}


}
