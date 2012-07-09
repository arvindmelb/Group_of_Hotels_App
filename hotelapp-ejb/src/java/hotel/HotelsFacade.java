/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hotel;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Administrator
 */
@Stateless
public class HotelsFacade implements HotelsFacadeLocal {
    @PersistenceContext
    private EntityManager em;

    public void create(Hotels hotels) {
        em.persist(hotels);
    }

    public void edit(Hotels hotels) {
        em.merge(hotels);
    }

    public void remove(Hotels hotels) {
        em.remove(em.merge(hotels));
    }

    public Hotels find(Object id) {
        return em.find(Hotels.class, id);
    }

    public List<Hotels> findAll() {
        return em.createQuery("select object(o) from Hotels as o").getResultList();
    }

    public Hotels findonname(Object name) {
        return (Hotels) em.createNamedQuery("Hotels.findByHotelName").setParameter("hotelName", name).getSingleResult();
    }

}
