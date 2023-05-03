class Rettangolo {
    private double larghezza;
    private double altezza;

    public Rettangolo(double larghezza, double altezza) {
        this.larghezza = larghezza;
        this.altezza = altezza;
    }

    public double getLarghezza() {
        return larghezza;
    }

    public double getAltezza() {
        return altezza;
    }

    public double getPerimetro() {
        return 2 * (larghezza + altezza);
    }

    public double getArea() {
        return larghezza * altezza;
    }
}

class Main {
    public static void stampaRettangolo(Rettangolo r) {
        System.out.println("Rettangolo con larghezza " + r.getLarghezza() + " e altezza " + r.getAltezza());
        System.out.println("Area: " + r.getArea());
        System.out.println("Perimetro: " + r.getPerimetro());
    }

    public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2) {
        System.out.println("Rettangolo 1 con larghezza " + r1.getLarghezza() + " e altezza " + r1.getAltezza());
        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimetro: " + r1.getPerimetro());

        System.out.println("Rettangolo 2 con larghezza " + r2.getLarghezza() + " e altezza " + r2.getAltezza());
        System.out.println("Area: " + r2.getArea());
        System.out.println("Perimetro: " + r2.getPerimetro());

        double areaTotale = r1.getArea() + r2.getArea();
        double perimetroTotale = r1.getPerimetro() + r2.getPerimetro();
        System.out.println("Area totale: " + areaTotale);
        System.out.println("Perimetro totale: " + perimetroTotale);
    }

    public static void main(String[] args) {
        Rettangolo r1 = new Rettangolo(5, 3);
        Rettangolo r2 = new Rettangolo(2, 4);

        stampaRettangolo(r1);

        System.out.println();

        stampaDueRettangoli(r1, r2);
    }
}
