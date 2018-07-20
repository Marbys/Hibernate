import entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PrimaryKey {
    public static void main(String[] args){

        // create session factory
        SessionFactory factory = new Configuration()
               // .configure("src/hibernate.cfg.xml")
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        // create session
        Session session = factory.getCurrentSession();

        try{
            //create 3 student object
            System.out.println("Creating new student object...");
            Student student1 = new Student("Marcin","Bys","marcin.bys12@gmail.com");
            Student student2 = new Student("Piotrek","Gebal","pg@gmail.com");
            Student student3 = new Student("Jakub","Swiderski","js@gmail.com");

            //start a transaction
            session.beginTransaction();

            //save the student object
            System.out.println("Saving the students");
            session.save(student1);
            session.save(student2);
            session.save(student3);

            //commit transaction
            session.getTransaction().commit();

            System.out.println("Done!");
        }
        finally{
            factory.close();
        }
    }
}
