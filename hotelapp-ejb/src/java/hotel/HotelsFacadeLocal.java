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
public interface HotelsFacadeLocal {

    void create(Hotels hotels);

    void edit(Hotels hotels);

    void remove(Hotels hotels);

    Hotels find(Object id);

    List<Hotels> findAll();

    Hotels findonname(Object name);

}
