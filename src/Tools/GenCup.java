package Tools;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GenCup {

    public static void main(String[] args) {
        String parametro[] = new String[5];
        parametro[0] = "-destdir";
        parametro[1] = "src\\proyecto\\compiladores";
        parametro[2] = "-parser";
        parametro[3] = "CodigoCup";
        parametro[4] = "src\\Archivos\\Codigo.jcup";
        try {
            java_cup.Main.main(parametro);
        } catch (IOException ex) {
            Logger.getLogger(GenCup.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(GenCup.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
