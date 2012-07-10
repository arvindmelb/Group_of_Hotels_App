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
import javax.ejb.Local;

/**
 *
 * @author Arvind Kumar
 */
@Local
public interface PaymentinfoFacadeLocal {

    void create(Paymentinfo paymentinfo);

    void edit(Paymentinfo paymentinfo);

    void remove(Paymentinfo paymentinfo);

    Paymentinfo find(Object id);

    List<Paymentinfo> findAll();

}
