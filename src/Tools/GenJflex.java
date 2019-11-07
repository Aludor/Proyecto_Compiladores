package Tools;

public class GenJflex {

    public static void main(String[] args) {        
        String[] opciones = new String[3];
        opciones[0] = "-d";
        opciones[1] = "src\\proyecto\\compiladores";
        opciones[2] = "src\\Archivos\\Codigo.jflex";
        jflex.Main.main(opciones);
    }
}
