/**
 * Created with Netbeans IDE 6.5
 * Author: Arvind Kumar
 * Date:   7/9/12
 * Time:   15:18 PM
 * Description:
 *
 */

package hotel;

import javax.ejb.Local;

/**
 *
 * @author Arvind Kumar
 */
@Local
public interface customerinfoLocal {

    void create(Customers customers);

}

