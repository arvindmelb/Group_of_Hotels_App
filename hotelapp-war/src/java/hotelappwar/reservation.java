/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hotelappwar;

import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.webui.jsf.component.Button;
import com.sun.webui.jsf.component.DropDown;
import com.sun.webui.jsf.component.RadioButtonGroup;
import com.sun.webui.jsf.component.StaticText;
import com.sun.webui.jsf.component.TextField;
import com.sun.webui.jsf.model.SingleSelectOptionsList;
import hotel.Customers;
import hotel.Hotels;
import hotel.HotelsFacadeLocal;
import hotel.Paymentinfo;
import hotel.PaymentinfoFacadeLocal;
import hotel.Reservation;
import hotel.ReservationFacadeLocal;
import hotel.Rooms;
import hotel.RoomsFacadeLocal;
import hotel.customerinfoLocal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
 * @version reservation.java
 * @version Created on Jul 9, 2012, 6:19:37 PM
 * @author Administrator
 */

public class reservation extends AbstractPageBean {
    @EJB
    private customerinfoLocal customerinfoBean;
    @EJB
    private RoomsFacadeLocal roomsFacade;
    @EJB
    private ReservationFacadeLocal reservationFacade;
    @EJB
    private PaymentinfoFacadeLocal paymentinfoFacade;
    @EJB
    private HotelsFacadeLocal hotelsFacade;
    private List<Rooms> roomidlist = new ArrayList<Rooms>();
    private List<Rooms> roomidl = new ArrayList<Rooms>();

    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
        hotelnameDefaultOptions.setOptions(new com.sun.webui.jsf.model.Option[]{new com.sun.webui.jsf.model.Option("Chirag International", "Chirag International"), new com.sun.webui.jsf.model.Option("Chirag Continental", "Chirag Continental"), new com.sun.webui.jsf.model.Option("Chirag Residency", "Chirag Residency")});
        roomtypeDefaultOptions.setOptions(new com.sun.webui.jsf.model.Option[]{new com.sun.webui.jsf.model.Option("Suite", "Suite"), new com.sun.webui.jsf.model.Option("Luxary", "Luxary"), new com.sun.webui.jsf.model.Option("Ordinary", "Ordinary")});
        paymodeDefaultOptions.setOptions(new com.sun.webui.jsf.model.Option[]{new com.sun.webui.jsf.model.Option("Cheque", "Cheque"), new com.sun.webui.jsf.model.Option("Credit Card", "Credit Card")});
        credit_card_nameDefaultOptions.setOptions(new com.sun.webui.jsf.model.Option[]{new com.sun.webui.jsf.model.Option("Master Card", "Master Card"), new com.sun.webui.jsf.model.Option("Visa", "Visa"), new com.sun.webui.jsf.model.Option("ANZ Grindlay", "ANZ Grindlay")});
    }
    private SingleSelectOptionsList roomtypeDefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getRoomtypeDefaultOptions() {
        return roomtypeDefaultOptions;
    }

    public void setRoomtypeDefaultOptions(SingleSelectOptionsList ssol) {
        this.roomtypeDefaultOptions = ssol;
    }
    private SingleSelectOptionsList hotelnameDefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getHotelnameDefaultOptions() {
        return hotelnameDefaultOptions;
    }

    public void setHotelnameDefaultOptions(SingleSelectOptionsList ssol) {
        this.hotelnameDefaultOptions = ssol;
    }
    private SingleSelectOptionsList paymodeDefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getPaymodeDefaultOptions() {
        return paymodeDefaultOptions;
    }

    public void setPaymodeDefaultOptions(SingleSelectOptionsList ssol) {
        this.paymodeDefaultOptions = ssol;
    }
    private SingleSelectOptionsList credit_card_nameDefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getCredit_card_nameDefaultOptions() {
        return credit_card_nameDefaultOptions;
    }

    public void setCredit_card_nameDefaultOptions(SingleSelectOptionsList ssol) {
        this.credit_card_nameDefaultOptions = ssol;
    }
    private TextField name = new TextField();

    public TextField getName() {
        return name;
    }

    public void setName(TextField tf) {
        this.name = tf;
    }
    private TextField address1 = new TextField();

    public TextField getAddress1() {
        return address1;
    }

    public void setAddress1(TextField tf) {
        this.address1 = tf;
    }
    private TextField address2 = new TextField();

    public TextField getAddress2() {
        return address2;
    }

    public void setAddress2(TextField tf) {
        this.address2 = tf;
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
    private TextField zipcode = new TextField();

    public TextField getZipcode() {
        return zipcode;
    }

    public void setZipcode(TextField tf) {
        this.zipcode = tf;
    }
    private TextField country = new TextField();

    public TextField getCountry() {
        return country;
    }

    public void setCountry(TextField tf) {
        this.country = tf;
    }
    private TextField emailid = new TextField();

    public TextField getEmailid() {
        return emailid;
    }

    public void setEmailid(TextField tf) {
        this.emailid = tf;
    }
    private TextField contactno = new TextField();

    public TextField getContactno() {
        return contactno;
    }

    public void setContactno(TextField tf) {
        this.contactno = tf;
    }
    private DropDown hotelname = new DropDown();

    public DropDown getHotelname() {
        return hotelname;
    }

    public void setHotelname(DropDown dd) {
        this.hotelname = dd;
    }
    private DropDown roomtype = new DropDown();

    public DropDown getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(DropDown dd) {
        this.roomtype = dd;
    }
    private TextField reservdate = new TextField();

    public TextField getReservdate() {
        return reservdate;
    }

    public void setReservdate(TextField tf) {
        this.reservdate = tf;
    }
    private StaticText amount = new StaticText();

    public StaticText getAmount() {
        return amount;
    }

    public void setAmount(StaticText st) {
        this.amount = st;
    }
    private RadioButtonGroup paymode = new RadioButtonGroup();

    public RadioButtonGroup getPaymode() {
        return paymode;
    }

    public void setPaymode(RadioButtonGroup rbg) {
        this.paymode = rbg;
    }
    private TextField credit_cardno = new TextField();

    public TextField getCredit_cardno() {
        return credit_cardno;
    }

    public void setCredit_cardno(TextField tf) {
        this.credit_cardno = tf;
    }
    private TextField chequeno = new TextField();

    public TextField getChequeno() {
        return chequeno;
    }

    public void setChequeno(TextField tf) {
        this.chequeno = tf;
    }
    private RadioButtonGroup credit_card_name = new RadioButtonGroup();

    public RadioButtonGroup getCredit_card_name() {
        return credit_card_name;
    }

    public void setCredit_card_name(RadioButtonGroup rbg) {
        this.credit_card_name = rbg;
    }
    private TextField credit_card_expiry = new TextField();

    public TextField getCredit_card_expiry() {
        return credit_card_expiry;
    }

    public void setCredit_card_expiry(TextField tf) {
        this.credit_card_expiry = tf;
    }
    private Button reserving = new Button();

    public Button getReserving() {
        return reserving;
    }

    public void setReserving(Button b) {
        this.reserving = b;
    }
    private StaticText room_message = new StaticText();

    public StaticText getRoom_message() {
        return room_message;
    }

    public void setRoom_message(StaticText st) {
        this.room_message = st;
    }

    // </editor-fold>

    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public reservation() {
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
            log("reservation Initialization Failure", e);
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
        Date dt = new Date();
        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
        reservdate.setText(df.format(dt));

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

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected SessionBean1 getSessionBean1() {
        return (SessionBean1) getBean("SessionBean1");
    }

    public void roomtype_processValueChange(ValueChangeEvent event) {
        Hotels hotl = new Hotels();
        float roomt = 0;
        hotl = hotelsFacade.findid(hotelname.getSelected());
        roomidl = roomsFacade.findAllRoomids(hotl.getHotelId(), roomtype.getSelected());
        roomt = roomidl.get(0).getRoomRent();
        amount.setText(roomt);
    }

       public String reserving_action() {
        boolean roomfound = false;
        int roomidalloted = 0;
        Reservation reserv = new Reservation();
        Paymentinfo payinfo = new Paymentinfo();
        DateFormat dfmt = new SimpleDateFormat("MM/dd/yy");

		Customers cust = new Customers();
        cust.setName(name.getText().toString());
        cust.setAddress1(address1.getText().toString());
        if (address2.getText().toString().trim().length() >0) {
                   cust.setAddress2(address2.getText().toString());
        }

        cust.setCity(city.getText().toString());
        cust.setCustState(state.getText().toString());
        cust.setZipcode(zipcode.getText().toString());
        cust.setCountry(country.getText().toString());
        cust.setEmailId(emailid.getText().toString());
        cust.setContactNo(contactno.getText().toString());
        cust.setRoomType(roomtype.getSelected().toString());
        cust.setHotelName(hotelname.getSelected().toString());

		Hotels hotel = new Hotels();
        hotel = hotelsFacade.findid(hotelname.getSelected());
        cust.setHotelId(hotel.getHotelId());
        roomidlist = roomsFacade.findAllRoomids(hotel.getHotelId(), roomtype.getSelected());
        for (int i = 0; i < roomidlist.size(); i++) {
            try {
                Date dd = dfmt.parse(reservdate.getText().toString());
                cust.setReservationDate(dd);
                if (reservationFacade.findvacancy(roomidlist.get(i).getRoomsPK().getRoomId(), hotel.getHotelId(), dd) == null) {
                    roomidalloted = roomidlist.get(i).getRoomsPK().getRoomId();
                    cust.setRoomId(roomidalloted);
                    roomfound = true;
                    break;
                }
            } catch (ParseException e) {
            } catch (NullPointerException e) {
                cust.setRoomId(roomidlist.get(i).getRoomsPK().getRoomId());
            }
        }
        if (roomfound == false) {
            room_message.setText("Sorry no room in this room type is free");
        } else {
            room_message.setText("");
			customerinfoBean.create(cust);
			reserv.setCustomerId(cust.getCustomerId());
			try
			{	
					reserv.setDateOfReservation(dfmt.parse(reservdate.getText().toString()));
			} catch (ParseException e) {
			}

            reserv.setHotelId(hotel.getHotelId());
            reserv.setRoomId(roomidalloted);
			reservationFacade.create(reserv);

			payinfo.setCustomerId(cust.getCustomerId());
			payinfo.setAmount(Float.parseFloat(amount.getText().toString()));
            payinfo.setPaymode(paymode.getSelected().toString());

            if (paymode.getSelected().equals("Cheque")) {
                    payinfo.setChequeNumber(chequeno.getText().toString());
			}
            else {
                 payinfo.setCreditCardNo(credit_cardno.getText().toString());
                 payinfo.setCreditCardName(credit_card_name.getSelected().toString());

            try  {
                    Date dd = dfmt.parse(credit_card_expiry.getText().toString());
                    payinfo.setCreditCartExpirydate(dd);
                 } catch (ParseException ex) {
                    Logger.getLogger(reservation.class.getName()).log(Level.SEVERE, null, ex);
                 }
			}

            paymentinfoFacade.create(payinfo);
		}
	return null;
	}



}

