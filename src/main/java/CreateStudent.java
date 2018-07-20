import entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class CreateStudent {
    public static void main(String[] args){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("org.hibernate.tutorial.jpa");

        Student student = new Student("Marcin","Bys","gmail.com");

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.persist(student);
        entityManager.getTransaction().commit();

        entityManagerFactory.close();
    }
}
