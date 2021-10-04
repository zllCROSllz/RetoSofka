
package historial;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import usuario.Persona;

public class Historial {

    Persona p = new Persona();

    public void escribirRegistro(double d) {

        Persona p1 = new Persona();
        File f;
        FileWriter w;
        PrintWriter wr;
        f = new File("usuarios.txt");
        if (!f.exists()) {
            try {
                f.createNewFile();

                w = new FileWriter(f, true);
                wr = new PrintWriter(w);
                wr.print(p1.ingresarUsuario() + "\n");
                wr.print(d + "\n");
                wr.print("************************** \n");

                wr.close();
                w.close();

            } catch (IOException e) {
                System.out.println("error " + e.getMessage());
            }

        } else {
            try {
                p1.setUsuario(p1.getUsuario());
                w = new FileWriter(f, true);
                wr = new PrintWriter(w);
                wr.print(p1.ingresarUsuario() + "\n");
                wr.print(d + "\n");
                wr.print("************************** \n");

                wr.close();
                w.close();

            } catch (IOException e) {
                System.out.println("error " + e.getMessage());
            }

        }

    }
    
    public void leerArchivo(){
        File archivo;
        FileReader fr;
        BufferedReader br;
        
        try {
            archivo = new File("usuarios.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            
            String linea;
            while((linea = br.readLine())!= null){
                System.out.println(linea);
            }
            br.close();
            fr.close();
                
            } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error");
        }

}
}

