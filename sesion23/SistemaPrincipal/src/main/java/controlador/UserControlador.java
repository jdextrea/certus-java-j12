/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import javax.persistence.EntityManager;
import conexion.Conexion;
import entidades.User;
import java.util.List;
import javax.persistence.Query;
/**
 *
 * @author jdextre
 */
public class UserControlador {
    //Crear un metodo para crear
        public void crear(User u) {
            EntityManager en = entityManager();
            try {
             //Iniciar la transaccion
            en.getTransaction().begin(); 
            en.persist(u);
            //Inserta la trasaccion
            en.getTransaction().commit();
            } catch (Exception e) {
                en.getTransaction().rollback();
            }
            
        }

        //Metodo para editar
        public void editar(User u) {
            EntityManager en = entityManager();
            try {
             //Iniciar la transaccion
            en.getTransaction().begin(); 
            en.merge(u);
            //Inserta la trasaccion
            en.getTransaction().commit();
            } catch (Exception e) {
                en.getTransaction().rollback();
            }
            
        }
        
        //Metodo para eliminar
        public void eliminar(User u) {
            EntityManager en = entityManager();
            try {
             //Iniciar la transaccion
            en.getTransaction().begin(); 
            en.remove(u);
            //Inserta la trasaccion
            en.getTransaction().commit();
            } catch (Exception e) {
                en.getTransaction().rollback();
                e.printStackTrace();
            }
            
        }
        //Metodo para Listar
        public List<User> todosLosUsuarios() {
            //u es el nombre de la variable que va asignar
            //User
            Query q = entityManager().createQuery("SELECT u FROM User u");
            return q.getResultList();
        }
        
        
        
    //Crear los metodos necesarios
    //Necesitamos un EntityManager no EntityManagerFactory, aca vamos a la clase conexion
    private EntityManager entityManager() {
        return Conexion.getInstancia().getFabrica().createEntityManager();
    }
}
