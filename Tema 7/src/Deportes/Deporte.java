package Deportes;

public class Deporte {
private String depor;
private int numequipos;
private int jugadoresequipo;

public Deporte(String depor, int numequipos, int jugadoresequipo) {
	this.depor=depor;
	this.numequipos=numequipos;
	this.jugadoresequipo=jugadoresequipo;
}
public int getJugadoresEquipo() {
	return jugadoresequipo;
}
public void setJugadoresEquipo(int jugadoresequipo) {
	this.jugadoresequipo = jugadoresequipo;
}
public int getNumequipos() {
	return numequipos;
}
public void setNumEquipos(int numequipos) {
	this.numequipos = numequipos;
}
public int getNumEquipos() {
	return numequipos;
}
public String getDeporte() {
	return depor;
}
public void setDeporte(String depor) {
	this.depor=depor;
}
@Override
public String toString() {
	return "Deporte " + depor + ", el número de equipos es =" + numequipos
			+ " y los jugadores de cada equipo son=" + jugadoresequipo;
}

}
