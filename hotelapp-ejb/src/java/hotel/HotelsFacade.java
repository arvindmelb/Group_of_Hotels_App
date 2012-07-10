/**
 * Created with Netbeans IDE 6.5
 * Author: Arvind Kumar
 * Date:   7/9/12
 * Time:   15:18 PM
 * Description:
 *
 */
package hotel;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Arvind Kumar
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

    public Hotels findid(Object id) {
         return (Hotels) em.createNamedQuery("Hotels.findByHotelName").setParameter("hotelName", id).getSingleResult();

    }

     public Hotels findonid(Object hid) {
        return (Hotels) em.createNamedQuery("Hotels.findByHotelId").setParameter("hotelId", hid).getSingleResult();

    }

}
