package Paquete;
import Paquete.Vehiculos;

class Main {

	public static void main(String[] args) {
		double ax=0;
		double ax1=0;
		double ax2=0;
		double ax3=0;
		
		double men=0;
		double may =0;		
		String ax4="";
		String ax5="";
		
		Autos a;
		a = new Autos();
		a.MarcaAu();
		System.out.println(a.ModeloAu =("Modelo: 206"));
		System.out.println(a.Puerta=("Puertas: 4"));
		ax=200.000;
		System.out.println("Precio: $"+ax+"00,00");
		System.out.println("");

		Motos m;
		m = new Motos();
		System.out.println(m.Marca=("Marca: Honda"));
		System.out.println(m.Modelo=("Modelo: Titan"));
		System.out.println(m.Cilindrada =("Cilindrada: 125c"));
		ax1=60.000;
		System.out.println("Precio: $"+ax1+"00,00");
		System.out.println("");
		
		Autos a1;
		a1 = new Autos();
		a.MarcaAu();
		System.out.println(a1.Modelo =("Modelo: 208"));
		System.out.println(a1.Puerta=("Puertas: 5"));
		ax2=250.000;
		System.out.println("Precio: $"+ax2+"00,00");
		System.out.println("");

		Motos m1;
		m1=new Motos();
		System.out.println(m1.Marca=("Marca: Yamaha"));
		System.out.println(m1.Modelo=("Modelo: YBR"));
		System.out.println(m1.Cilindrada =("Cilindrada: 160c"));
		ax3=80.5;
		System.out.println("Precio: $"+ax3+"00,50");
		System.out.println("");
		
		/*Mayor y menor precio*/

		double x[]={ax,ax1,ax2,ax3};
		
		for(int i=0;i<x.length;i++)
		{
			if(i==0){
				may=x[i];
				ax1=i;
				
			ax4=("Peugeot 206");}
			else if(may<x[i]){
				may=x[i];
				ax=i;
				if(i==1){
				ax4="Honda Titan";
				ax1=i;
				};
				if(i==2){
					ax4="Peugeot 208";
					ax1=i;
				};
				if(i==3){
					ax4="Yamaha YBR";
					ax1=i;
				};
			}
		}
		for(int i=0;i<x.length;i++)
		{
			if(i==0){
				men=x[i];
				ax2=i;
				
			ax5=("Peugeot 206");}
			else if(men>x[i]){
				men=x[i];
				ax2=i;
				if(i==1){
				ax5="Honda Titan";
				ax2=i;
				};
				if(i==2){
					ax5="Peugeot 208";
					ax2=i;
				};
				if(i==3){
					ax5="Yamaha YBR";
					ax2=i;
				};
			}
		}
		
		System.out.println("Vehiculos mas caro: "+ax4);
		System.out.println("Vehiculos mas barato: "+ax5);
		
		/*Filtro de letra por Modelo*/
		
		char ax6;
		String vectModel[]={"206","Titan","208","YBR"};
		
		for(int r=0;r<vectModel.length;r++){
			ax6 =vectModel[r].charAt(0);
			if(ax6==89){
				if(r==0){
					System.out.println("Veh�culo que contiene en el modelo la letra �Y�: Peugeot "+vectModel[r]+"$200.000,00");
				}
				if(r==1){
					System.out.println("Veh�culo que contiene en el modelo la letra �Y�: Peugeot "+vectModel[r]+"$250.000,00");
				}
				if(r==2){
					System.out.println("Veh�culo que contiene en el modelo la letra �Y�: Honda "+vectModel[r]+"$60.000,00");
				}
				if(r==3){
					System.out.println("Veh�culo que contiene en el modelo la letra �Y�: Yamaha "+vectModel[r]+" $80.500,50");
				}
			}
		}
		System.out.println("");
		
		/*Vehiculos ordenados de menor a mayor*/
		
		boolean band=true;
		String aux="";
		String aux1="";
		String vectext[]={"Peugeot 206","Honda Titan","Peugeot 208","Yamaha YBR"};
		double vectext1[]={200.000,60.000,250.000,80.500};

		ax3=ax1+ax2;
		for(int s=0;s<vectext.length;s++){
			if (band){
				if (s!=ax1){
				if (s!=ax2){
					aux=vectext[s];
					band=false;
					men=vectext1[s];
				}
			}
		}
			if (s!=ax1){
				if (s!=ax2){
					aux1=vectext[s];
					may=vectext1[s];
					}
			}
	}
			System.out.println("Veh�culos ordenados por precio de mayor a menor:");

		if(may<men){
			System.out.println(ax4);
			System.out.println(aux);
			System.out.println(aux1);
			System.out.println(ax5);
		}
		if(may>men){
			System.out.println(ax4);
			System.out.println(aux1);
			System.out.println(aux);
			System.out.println(ax5);
		}
	}
}