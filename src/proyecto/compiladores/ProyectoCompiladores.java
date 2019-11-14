package proyecto.compiladores;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProyectoCompiladores {

    public static void main(String[] args) {
        String nombrearchivo = "src\\proyecto\\compiladores\\compis.txt";
        try {
            CodigoFlex codigoFlex = new CodigoFlex(new FileReader(nombrearchivo));
            codigoFlex.yylex();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ProyectoCompiladores.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ProyectoCompiladores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
