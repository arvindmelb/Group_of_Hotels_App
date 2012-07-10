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
import javax.ejb.Local;

/**
 *
 * @author Arvind Kumar
 */
@Local
public interface HotelsFacadeLocal {

    void create(Hotels hotels);

    void edit(Hotels hotels);

    void remove(Hotels hotels);

    Hotels find(Object id);

    List<Hotels> findAll();

    Hotels findonname(Object name);

    Hotels findid(Object id);

    public Hotels findonid(Object hid);

}
