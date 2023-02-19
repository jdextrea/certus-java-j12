/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.certus.controlador;

import com.certus.conexion.Conexion;
import com.certus.entidades.Cliente;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author jdextre
 */
public class ClienteControlador {
    //Crear un metodo para crear
        public void crear(Cliente u) {
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
        public void editar(Cliente u) {
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
        public void eliminar(Cliente u) {
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
        public List<Cliente> todosLosUsuarios() {
            //u es el alistas de la tabla
            //Cliente es la clase entidad
            Query q = entityManager().createQuery("SELECT u FROM Cliente u");
            return q.getResultList(); //Metodo para obtener toda la lista.
        }
        
        
        
    //Crear los metodos necesarios
    //Necesitamos un EntityManager no EntityManagerFactory
    private EntityManager entityManager() {
        return Conexion.getInstancia().getFabrica().createEntityManager();
    }
}
