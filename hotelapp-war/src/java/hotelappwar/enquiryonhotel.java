/**
 * Created with Netbeans IDE 6.5
 * Author: Arvind Kumar
 * Date:   7/9/12
 * Time:   15:18 PM
 * Description:
 *
 */

package hotelappwar;

import com.sun.data.provider.impl.CachedRowSetDataProvider;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.webui.jsf.component.DropDown;
import com.sun.webui.jsf.component.TextField;
import hotel.Hotels;
import hotel.HotelsFacadeLocal;
import javax.ejb.EJB;
import javax.faces.FacesException;
import javax.faces.event.ValueChangeEvent;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 *
 * @version enquiryonhotel.java
 * @version Created on Jul 8, 2012, 10:50:27 PM
 * @author Administrator
 */

public class enquiryonhotel extends AbstractPageBean {
    @EJB
    private HotelsFacadeLocal hotelsFacade;
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
        hotelsDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.hotelsRowSet}"));
    }
    private DropDown hotelname = new DropDown();

    public DropDown getHotelname() {
        return hotelname;
    }

    public void setHotelname(DropDown dd) {
        this.hotelname = dd;
    }
    private TextField address = new TextField();

    public TextField getAddress() {
        return address;
    }

    public void setAddress(TextField tf) {
        this.address = tf;
    }
    private TextField city = new TextField();

    public TextField getCity() {
        return city;
    }

    public void setCity(TextField tf) {
        this.city = tf;
    }
    private TextField state = new TextField();

    public TextField getState() {
        return state;
    }

    public void setState(TextField tf) {
        this.state = tf;
    }
    private TextField country = new TextField();

    public TextField getCountry() {
        return country;
    }

    public void setCountry(TextField tf) {
        this.country = tf;
    }
    private TextField no_of_rooms = new TextField();

    public TextField getNo_of_rooms() {
        return no_of_rooms;
    }

    public void setNo_of_rooms(TextField tf) {
        this.no_of_rooms = tf;
    }
    private CachedRowSetDataProvider hotelsDataProvider = new CachedRowSetDataProvider();

    public CachedRowSetDataProvider getHotelsDataProvider() {
        return hotelsDataProvider;
    }

    public void setHotelsDataProvider(CachedRowSetDataProvider crsdp) {
        this.hotelsDataProvider = crsdp;
    }

    // </editor-fold>

    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public enquiryonhotel() {
    }

    /**
     * <p>Callback method that is called whenever a page is navigated to,
     * either directly via a URL, or indirectly via page navigation.
     * Customize this method to acquire resources that will be needed
     * for event handlers and lifecycle methods, whether or not this
     * page is performing post back processing.</p>
     * 
     * <p>Note that, if the current request is a postback, the property
     * values of the components do <strong>not</strong> represent any
     * values submitted with this request.  Instead, they represent the
     * property values that were saved for this view when it was rendered.</p>
     */
    @Override
    public void init() {
        // Perform initializations inherited from our superclass
        super.init();
        // Perform application initialization that must complete
        // *before* managed components are initialized
        // TODO - add your own initialiation code here
        
        // <editor-fold defaultstate="collapsed" desc="Managed Component Initialization">
        // Initialize automatically managed components
        // *Note* - this logic should NOT be modified
        try {
            _init();
        } catch (Exception e) {
            log("enquiryonhotel Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e: new FacesException(e);
        }
        
        // </editor-fold>
        // Perform application initialization that must complete
        // *after* managed components are initialized
        // TODO - add your own initialization code here
    }

    /**
     * <p>Callback method that is called after the component tree has been
     * restored, but before any event processing takes place.  This method
     * will <strong>only</strong> be called on a postback request that
     * is processing a form submit.  Customize this method to allocate
     * resources that will be required in your event handlers.</p>
     */
    @Override
    public void preprocess() {
    }

    /**
     * <p>Callback method that is called just before rendering takes place.
     * This method will <strong>only</strong> be called for the page that
     * will actually be rendered (and not, for example, on a page that
     * handled a postback and then navigated to a different page).  Customize
     * this method to allocate resources that will be required for rendering
     * this page.</p>
     */
    @Override
    public void prerender() {
    }

    /**
     * <p>Callback method that is called after rendering is completed for
     * this request, if <code>init()</code> was called (regardless of whether
     * or not this was the page that was actually rendered).  Customize this
     * method to release resources acquired in the <code>init()</code>,
     * <code>preprocess()</code>, or <code>prerender()</code> methods (or
     * acquired during execution of an event handler).</p>
     */
    @Override
    public void destroy() {
        hotelsDataProvider.close();
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

        public void hotelname_processValueChange(ValueChangeEvent event) {
        Hotels hotel = new Hotels();
        hotel = hotelsFacade.findonname(hotelname.getSelected());
        address.setText(hotel.getAddress());
        city.setText(hotel.getCity());
        state.setText(hotel.getHotelState());
        country.setText(hotel.getCountry());
        no_of_rooms.setText(hotel.getNoOfRooms());
    }
    
}

