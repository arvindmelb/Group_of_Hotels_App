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
import javax.ejb.Local;

/**
 *
 * @author Arvind Kumar
 */
@Local
public interface ReservationFacadeLocal {

    void create(Reservation reservation);

    void edit(Reservation reservation);

    void remove(Reservation reservation);

    Reservation find(Object id);

    List<Reservation> findAll();

    Reservation findvacancy(Integer rid, Integer hid, Date dte);

}
