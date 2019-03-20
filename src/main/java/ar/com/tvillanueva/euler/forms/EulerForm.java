package ar.com.tvillanueva.euler.forms;

public class EulerForm {

    private double inicio;
    private double fin;
    private double x0 = 0;
    private double fx0 = 0;
    private double intervalos;
    private String funcion;

    public double getInicio() {
        return inicio;
    }

    public void setInicio(double inicio) {
        this.inicio = inicio;
    }

    public double getFin() {
        return fin;
    }

    public void setFin(double fin) {
        this.fin = fin;
    }

    public double getX0() {
        return x0;
    }

    public void setX0(double x0) {
        this.x0 = x0;
    }

    public double getFx0() {
        return fx0;
    }

    public void setFx0(double fx0) {
        this.fx0 = fx0;
    }

    public double getIntervalos() {
        return intervalos;
    }

    public void setIntervalos(double intervalos) {
        this.intervalos = intervalos;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }
}
