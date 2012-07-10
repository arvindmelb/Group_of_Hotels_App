/**
 * Created with Netbeans IDE 6.5
 * Author: Arvind Kumar
 * Date:   7/9/12
 * Time:   16:32 PM
 * Description:
 *
 */

package hotel;

import java.util.Date;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Arvind Kumar
 */
@Stateless
public class ReservationFacade implements ReservationFacadeLocal {
    @PersistenceContext
    private EntityManager em;

    public void create(Reservation reservation) {
        em.persist(reservation);
    }

    public void edit(Reservation reservation) {
        em.merge(reservation);
    }

    public void remove(Reservation reservation) {
        em.remove(em.merge(reservation));
    }

    public Reservation find(Object id) {
        return em.find(Reservation.class, id);
    }

    public List<Reservation> findAll() {
        return em.createQuery("select object(o) from Reservation as o").getResultList();
    }

    public Reservation findvacancy(Integer rid, Integer hid, Date dte) {
         try
        {
            Reservation res=(Reservation) em.createQuery("select o from Reservation  o where o.roomId = :roomid and o.hotelId= :hotelid and o.dateOfReservation = :dateofres").setParameter("roomid", rid).setParameter("hotelid", hid).setParameter("dateofres", dte).getSingleResult();
            return res;
        }
        catch(NoResultException e)
        {
            return null;
        }
    }

}
