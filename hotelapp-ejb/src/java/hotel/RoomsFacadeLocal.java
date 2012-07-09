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
public interface RoomsFacadeLocal {

    void create(Rooms rooms);

    void edit(Rooms rooms);

    void remove(Rooms rooms);

    Rooms find(Object id);

    List<Rooms> findAll();

    List<Rooms> findallrooms(Integer hid);

}
