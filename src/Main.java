import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author brand
 */
public class Main {


    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        Stuff s = new Stuff();
        s.setName("blubb");
        em.persist(s);
        em.getTransaction().commit();
        Stuff x = em.find(Stuff.class, 1);
        System.out.println(x);

    }

}
