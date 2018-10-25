package abstractos;

public abstract class Instrumento {

    public String tipo;

    abstract void tocar();
}

class Guitarra extends Instrumento {

    public Guitarra() {
        tipo = "Guitarra";
    }

    public void tocar() {
        System.out.println("Tocar La Guitarra");
    }
}

class Violin extends Instrumento {

    public Violin() {
        tipo = "Violin";
    }

    public void tocar() {
        System.out.println("Tocar El violin");
    }
}

class Saxofon extends Instrumento {

    public Saxofon() {
        tipo = "Saxofon";
    }

    public void tocar() {
        System.out.println("Tocar el Saxofon");
    }
}
