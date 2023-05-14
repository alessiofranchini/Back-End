package mainProject;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Catalogo;
import model.Libri;
import model.Periodicita;
import model.Prestito;
import model.Riviste;
import model.Utente;

public class Archivio {

    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("catalogobibliotecario");
    static EntityManager em = emf.createEntityManager();

    public static void main(String[] args) {
	LocalDate data = LocalDate.of(2022, 02, 10);
	LocalDate data1 = LocalDate.of(1999, 02, 10);
	LocalDate data2 = LocalDate.of(2022, 02, 05);
	LocalDate data3 = LocalDate.of(2022, 04, 05);

	Libri l2 = new Libri();
	l2.setAutore("Alessandra D'Armetta");
	l2.setGenere("F");
	l2.setNumeroPagine(150);
	l2.setAnnoPubblicazione(data);
	l2.setTitolo("SPETTACOLO");
	System.out.println(l2);

	Utente u = new Utente();
	u.setNome("Marco");
	u.setCognome("Scalici");
	u.setDataNascita(data1);
	u.setNumeroTessera(1l);
	System.out.println(u);

	Prestito p = new Prestito();
	p.setDataInizioPrestito(data2);
	p.setDataRestituzioneEffettiva(data3);
	p.setNome("Benny");
	p.setCognome("Girgenti");
	p.setDataNascita(data1);
	p.setNumeroTessera(1l);
	System.out.println("Il libro: " + l2 + "è stato preso in prestito da" + p);

	Riviste r1 = new Riviste();
	r1.setPeriodicita(Periodicita.MENSILE);
	System.out.println(r1);
	try {
	    Catalogo libriLetti = findCatalogo(4l);
	    // addPrestito(p);
	    removeLibri((Libri) libriLetti);
	    // addUtente(u);
	    // addLibri(l2);
	    // addRiviste(r1);
	} catch (Exception e) {
	    // TODO: handle exception
	} finally {
	    em.close();
	    emf.close();
	}
    }

    public static void addPrestito(Prestito p) {
	em.getTransaction().begin();
	em.persist(p);
	em.getTransaction().commit();
	System.out.println("Prestito salvato nel DB!!!");
    }

    public static void addUtente(Utente u) {
	em.getTransaction().begin();
	em.persist(u);
	em.getTransaction().commit();
	System.out.println("Utente salvato nel DB!!!");
    }

    public static void addLibri(Libri l) {
	em.getTransaction().begin();
	em.persist(l);
	em.getTransaction().commit();
	System.out.println("Libro salvato nel DB!!!");
    }

    public static Catalogo findCatalogo(Long id) {
	em.getTransaction().begin();
	Catalogo c = em.find(Catalogo.class, id);
	em.getTransaction().commit();
	return c;
    }

    public static void removeLibri(Libri l) {
	em.getTransaction().begin();
	em.remove(l);
	em.getTransaction().commit();
	System.out.println("Libro salvato nel DB!!!");
    }

    public static void addRiviste(Riviste r) {
	em.getTransaction().begin();
	em.persist(r);
	em.getTransaction().commit();
	System.out.println("Rivista salvato nel DB!!!");
    }

}
