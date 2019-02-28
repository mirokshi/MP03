package abstractos;

public class Abstractos {

    public static void main(String arg[]) {
        Instrumento miGuitarra = new Guitarra();
        System.out.println("Instrumento : " + miGuitarra.tipo);
        miGuitarra.tocar();
        System.out.println();
        Instrumento miSaxofon = new Saxofon();
        System.out.println("Instrumento : " + miSaxofon.tipo);
        miSaxofon.tocar();
        System.out.println();
        Instrumento miViolin = new Violin();
        System.out.println("Instrumento : " + miViolin.tipo);
        miViolin.tocar();
    }
}
