public class Soluciones {
    double a;
    double b;
    double c;
    double x1;
    double x2;
    double disc;
    String msg;

    public void setA(double a) {
        this.a = a;
    }
    public void setB(double b) {
        this.b = b;
    }
    public void setC(double c) {
        this.c = c;
    }
    public String getResult() {
        disc = Math.pow(b,2) - 4 * a * c;

        if (disc >= 0) {
            x1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 * a;
            x2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 * a;

            msg = "El valor de la solucion 1 es: "+ x1 + "\nEl valor de la solucion 2 es: " + x2;
        }
        else {
            msg = "La ecucacion cuadratica no tiene soluciones reales.";
        }
        return msg;
    }
}
