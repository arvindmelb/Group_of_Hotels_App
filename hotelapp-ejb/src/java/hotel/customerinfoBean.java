/**
 * Created with Netbeans IDE 6.5
 * Author: Arvind Kumar
 * Date:   7/9/12
 * Time:   15:18 PM
 * Description:
 *
 */


package hotel;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
* @author Arvind Kumar
 */
@Stateless
public class customerinfoBean implements customerinfoLocal {

    @PersistenceContext
    private EntityManager em;

    public void create(Customers customers) {
         em.persist(customers);
    }


    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method" or "Web Service > Add Operation")

}
