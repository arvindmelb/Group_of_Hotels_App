/**
 * Created with Netbeans IDE 6.5
 * Author: Arvind Kumar
 * Date:   7/9/12
 * Time:   16:32 PM
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
public class PaymentinfoFacade implements PaymentinfoFacadeLocal {
    @PersistenceContext
    private EntityManager em;

    public void create(Paymentinfo paymentinfo) {
        em.persist(paymentinfo);
    }

    public void edit(Paymentinfo paymentinfo) {
        em.merge(paymentinfo);
    }

    public void remove(Paymentinfo paymentinfo) {
        em.remove(em.merge(paymentinfo));
    }

    public Paymentinfo find(Object id) {
        return em.find(Paymentinfo.class, id);
    }

    public List<Paymentinfo> findAll() {
        return em.createQuery("select object(o) from Paymentinfo as o").getResultList();
    }

}
