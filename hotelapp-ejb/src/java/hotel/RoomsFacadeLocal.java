/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hotel;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Administrator
 */
@Local
public interface RoomsFacadeLocal {

    void create(Rooms rooms);

    void edit(Rooms rooms);

    void remove(Rooms rooms);

    Rooms find(Object id);

    List<Rooms> findAll();

}
