package conexion;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conexion {

    private static Conexion instancia = new Conexion();
    private EntityManagerFactory fabrica;
    
    public static Conexion getInstancia() {
        return instancia;
    }

    public EntityManagerFactory getFabrica() {
        return fabrica;
    }
       
    private Conexion() {
        fabrica = Persistence.createEntityManagerFactory("com.certus_SistemaPrincipal_jar_1.0-SNAPSHOTPU");
    }
}
