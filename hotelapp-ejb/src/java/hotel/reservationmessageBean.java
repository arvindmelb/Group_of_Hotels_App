/**
 * Created with Netbeans IDE 6.5
 * Author: Arvind Kumar
 * Date:   7/10/12
 * Time:   17:43 PM
 * Description:
 *
 */
package hotel;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.EJB;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;

/**
 *
 * @author Arvind Kumar
 */
@MessageDriven(mappedName = "jms/reservationmessage", activationConfig =  {
        @ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge"),
        @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue")
    })
public class reservationmessageBean implements MessageListener {
     @EJB
    private ReservationFacadeLocal reservationFacade;


    public reservationmessageBean() {
    }

    public void onMessage(Message message) {
        try {
            ObjectMessage msg = null;
            msg = (ObjectMessage) message;
            Reservation res = (Reservation) msg.getObject();
            reservationFacade.create(res);
        } catch (JMSException ex) {
            Logger.getLogger(reservationmessageBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
