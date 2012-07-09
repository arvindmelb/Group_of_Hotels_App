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
public class RoomsFacade implements RoomsFacadeLocal {
    @PersistenceContext
    private EntityManager em;

    public void create(Rooms rooms) {
        em.persist(rooms);
    }

    public void edit(Rooms rooms) {
        em.merge(rooms);
    }

    public void remove(Rooms rooms) {
        em.remove(em.merge(rooms));
    }

    public Rooms find(Object id) {
        return em.find(Rooms.class, id);
    }

    public List<Rooms> findAll() {
        return em.createQuery("select object(o) from Rooms as o").getResultList();
    }

    public List<Rooms> findallrooms(Integer hid) {
        return em.createQuery("select object(o) from Rooms as o where o.roomsPK.hotelId =" + hid).getResultList();

    }




}
