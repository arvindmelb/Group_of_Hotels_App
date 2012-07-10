/**
 * Created with Netbeans IDE 6.5
 * Author: Arvind Kumar
 * Date:   7/10/12
 * Time:   17:43 PM
 * Description:
 *
 */

package hotelappwar;

import com.sun.rave.web.ui.appbase.AbstractFragmentBean;
import hotel.Hotels;
import hotel.HotelsFacadeLocal;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.FacesException;
import com.sun.webui.jsf.component.Button;

/**
 * <p>Fragment bean that corresponds to a similarly named JSP page
 * fragment.  This class contains component definitions (and initialization
 * code) for all components that you have defined on this fragment, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 *
 * @version menu.java
 * @version Created on Jul 10, 2012, 4:03:43 PM
 * @author Arvind Kumar
 */

public class menu extends AbstractFragmentBean {
     @EJB
    private HotelsFacadeLocal hotelsFacade;

    private List<Hotels> hlist = new ArrayList<Hotels>();



    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization. <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
    }
    private Button home = new Button();

    public Button getHome() {
        return home;
    }

    public void setHome(Button b) {
        this.home = b;
    }
    private Button listofhotels = new Button();

    public Button getListofhotels() {
        return listofhotels;
    }

    public void setListofhotels(Button b) {
        this.listofhotels = b;
    }
    private Button enqhotel = new Button();

    public Button getEnqhotel() {
        return enqhotel;
    }

    public void setEnqhotel(Button b) {
        this.enqhotel = b;
    }
    private Button tarifenq = new Button();

    public Button getTarifenq() {
        return tarifenq;
    }

    public void setTarifenq(Button b) {
        this.tarifenq = b;
    }
    private Button reserve = new Button();

    public Button getReserve() {
        return reserve;
    }

    public void setReserve(Button b) {
        this.reserve = b;
    }
    private Button contactus = new Button();

    public Button getContactus() {
        return contactus;
    }

    public void setContactus(Button b) {
        this.contactus = b;
    }
    // </editor-fold>

    public menu() {
    }

    /**
     * <p>Callback method that is called whenever a page containing
     * this page fragment is navigated to, either directly via a URL,
     * or indirectly via page navigation.  Override this method to acquire
     * resources that will be needed for event handlers and lifecycle methods.</p>
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void init() {
        // Perform initializations inherited from our superclass
        super.init();
        // Perform application initialization that must complete
        // *before* managed components are initialized
        // TODO - add your own initialiation code here


        // <editor-fold defaultstate="collapsed" desc="Visual-Web-managed Component Initialization">
        // Initialize automatically managed components
        // *Note* - this logic should NOT be modified
        try {
            _init();
        } catch (Exception e) {
            log("Page1 Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e: new FacesException(e);
        }

        // </editor-fold>
        // Perform application initialization that must complete
        // *after* managed components are initialized
        // TODO - add your own initialization code here
    }

    /**
     * <p>Callback method that is called after rendering is completed for
     * this request, if <code>init()</code> was called.  Override this
     * method to release resources acquired in the <code>init()</code>
     * resources that will be needed for event handlers and lifecycle methods.</p>
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void destroy() {
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected SessionBean1 getSessionBean1() {
        return (SessionBean1) getBean("SessionBean1");
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected ApplicationBean1 getApplicationBean1() {
        return (ApplicationBean1) getBean("ApplicationBean1");
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected RequestBean1 getRequestBean1() {
        return (RequestBean1) getBean("RequestBean1");
    }

    public String home_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return "home";
    }

    public String listofhotels_action() {
        hlist=hotelsFacade.findAll();
        getSessionBean1().setListofhotels(hlist);

        return "listofhotels";
    }

    public String enqhotel_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return "enqhotel";
    }

    public String tarifenq_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return "tarifenq";
    }

    public String reserve_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return "reserve";
    }

    public String contactus_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return "contactus";
    }

}