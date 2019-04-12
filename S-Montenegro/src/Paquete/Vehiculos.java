package Paquete;
public class Vehiculos {

	String Marca;
	String Modelo;
	
	}
	class Autos extends Vehiculos
	{
		String ModeloAu;
		String Puerta;

		public void MarcaAu()
		{
			System.out.println("Marca: Peugeot");
		}
	}
	class Motos extends Vehiculos
	{
		String Cilindrada;
	}