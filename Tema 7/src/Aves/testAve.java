package Aves;

public class testAve {
public static void main(String[] args) {
	AveVoladora[] aveV=new AveVoladora[100];
	AveVoladora av1=new AveVoladora("Hálcon Mexicano","Falco mexicanus",85,"Rapaz");
	AveVoladora av2=new AveVoladora("Águila Pescadora", "Pandion haliaetus", 105, "rapaz");
	AveVoladora av3=new AveVoladora("Tucán","Ramphastos toco", 60, "trepadora");
	AveVoladora av4=new AveVoladora("Pavo Real", "Pavo cristatus", 92, "gallinácea");
	AveVoladora av5=new AveVoladora("Garza", "Mesophoyx intermedia", 98, "zancuda");
	AveVoladora av6=new AveVoladora("Flamenco","Phoenicopterus", 56, "zancuda");
	aveV[0]=av1;
	aveV[1]=av2;
	aveV[2]=av3;
	aveV[3]=av4;
	aveV[4]=av5;
	aveV[5]=av6;
	for (int i = 0; i < aveV.length && aveV[i]!=null; i++) {
		if (aveV[i].peligroExtincion()==true) {
			aveV[i].incrementarNumeroIndividuos(10);
		}
		System.out.println(aveV[i].toString());
	}System.out.println();
	for (int i = 0; i < aveV.length && aveV[i]!=null; i++) {
	if(aveV[i].peligroExtincion()==false) {
		System.out.println(aveV[i]);
	}
	}
}
}
