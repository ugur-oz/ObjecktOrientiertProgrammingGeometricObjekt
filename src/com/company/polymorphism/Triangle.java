package com.company.polymorphism;

public class Triangle {

    protected final double a;
    protected final double b;
    protected final double c;
    String name;

    // bu bir initilizierung final yaptigimiz icin yapmak zorundayiz bu constructor u
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getArea() {
        double s = 0.5 * (a + b + c);
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }


    // sichtbarkeit i kücültemezsin ,,alt klasda üst model public vs olabilir ama mesela
    // alt klas ayni isimde metod iceriyorsa ve mesela bu private olsun , üst klasda bu public olsa olmaz,
    // yani gören sayisini daraltamazsin ama artirabilirsin alt klasta
    String getColor() {
        return "ddeeff";
    }

    protected final String getFillColor() {
        // kind klasse buna ulasabiir ama üzerine yazamaz cünkü final olaray yazdik!!
        // abstract desek de mecbur yazmak zrunda kalacakti
        return "#ee44ff";
    }

    public void setName(String name) {
        this.name = name;
    }

}
