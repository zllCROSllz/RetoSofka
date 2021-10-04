package usuario;
import javax.swing.JOptionPane;



public class Persona {
    private String usuario;
    private double dinero;

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }
    
    public Persona(String usuario ) {
        this.usuario = usuario;
        
    }

    public Persona() {
    }
   
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
   public String ingresarUsuario(){
       usuario = JOptionPane.showInputDialog("Ingrese su nombre");
       return usuario;
   }

}
