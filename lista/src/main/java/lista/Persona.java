package lista;

import java.util.HashMap;
import java.util.Map;

import io.github.cdimascio.dotenv.Dotenv;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.PersistenceException;

public class Persona {
    private static final Dotenv dotenv = Dotenv.configure().directory("lista").load();

    public static void main(String[] args) {

    }

    /*
     * private void testConn() {
     * Map<String, Object> prop = new HashMap<>();
     * prop.put("jakarta.persistence.jdbc.url",
     * "jdbc:mysql://localhost:" + dotenv.get("DB_PORT") + "/" +
     * dotenv.get("DB_NAME"));
     * prop.put("jakarta.persistence.jdbc.user", dotenv.get("DB_USER"));
     * prop.put("jakarta.persistence.jdbc.password", dotenv.get("DB_PASSWORD"));
     * prop.put("jakarta.persistence.jdbc.driver", "com.mysql.cj.jdbc.Driver");
     * 
     * try {
     * 
     * EntityManagerFactory emf =
     * Persistence.createEntityManagerFactory("persistence", prop);
     * EntityManager em = emf.createEntityManager();
     * 
     * em.createNativeQuery("SELECT 1").getResultList();
     * System.out.println("Database connection successful.");
     * 
     * em.close();
     * emf.close();
     * } catch (PersistenceException e) {
     * e.printStackTrace();
     * }
     * }
     */
}
