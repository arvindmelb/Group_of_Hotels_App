/**
 * Created with Netbeans IDE 6.5
 * Author: Arvind Kumar
 * Date:   7/9/12
 * Time:   16:32 PM
 * Description:
 *
 */


package hotel;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Arvind Kumar
 */
@Entity
@Table(name = "customers")
@NamedQueries({@NamedQuery(name = "Customers.findAll", query = "SELECT c FROM Customers c"), @NamedQuery(name = "Customers.findByCustomerId", query = "SELECT c FROM Customers c WHERE c.customerId = :customerId"), @NamedQuery(name = "Customers.findByName", query = "SELECT c FROM Customers c WHERE c.name = :name"), @NamedQuery(name = "Customers.findByAddress1", query = "SELECT c FROM Customers c WHERE c.address1 = :address1"), @NamedQuery(name = "Customers.findByAddress2", query = "SELECT c FROM Customers c WHERE c.address2 = :address2"), @NamedQuery(name = "Customers.findByCity", query = "SELECT c FROM Customers c WHERE c.city = :city"), @NamedQuery(name = "Customers.findByCustState", query = "SELECT c FROM Customers c WHERE c.custState = :custState"), @NamedQuery(name = "Customers.findByZipcode", query = "SELECT c FROM Customers c WHERE c.zipcode = :zipcode"), @NamedQuery(name = "Customers.findByCountry", query = "SELECT c FROM Customers c WHERE c.country = :country"), @NamedQuery(name = "Customers.findByEmailId", query = "SELECT c FROM Customers c WHERE c.emailId = :emailId"), @NamedQuery(name = "Customers.findByContactNo", query = "SELECT c FROM Customers c WHERE c.contactNo = :contactNo"), @NamedQuery(name = "Customers.findByRoomType", query = "SELECT c FROM Customers c WHERE c.roomType = :roomType"), @NamedQuery(name = "Customers.findByRoomId", query = "SELECT c FROM Customers c WHERE c.roomId = :roomId"), @NamedQuery(name = "Customers.findByHotelName", query = "SELECT c FROM Customers c WHERE c.hotelName = :hotelName"), @NamedQuery(name = "Customers.findByHotelId", query = "SELECT c FROM Customers c WHERE c.hotelId = :hotelId"), @NamedQuery(name = "Customers.findByReservationDate", query = "SELECT c FROM Customers c WHERE c.reservationDate = :reservationDate")})
public class Customers implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "customer_id")
    private Integer customerId;
    @Column(name = "name")
    private String name;
    @Column(name = "address1")
    private String address1;
    @Column(name = "address2")
    private String address2;
    @Column(name = "city")
    private String city;
    @Column(name = "cust_state")
    private String custState;
    @Column(name = "zipcode")
    private String zipcode;
    @Column(name = "country")
    private String country;
    @Column(name = "email_id")
    private String emailId;
    @Column(name = "contact_no")
    private String contactNo;
    @Column(name = "room_type")
    private String roomType;
    @Column(name = "room_id")
    private Integer roomId;
    @Column(name = "hotel_name")
    private String hotelName;
    @Column(name = "hotel_id")
    private Integer hotelId;
    @Column(name = "reservation_date")
    @Temporal(TemporalType.DATE)
    private Date reservationDate;

    public Customers() {
    }

    public Customers(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCustState() {
        return custState;
    }

    public void setCustState(String custState) {
        this.custState = custState;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public Integer getHotelId() {
        return hotelId;
    }

    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (customerId != null ? customerId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Customers)) {
            return false;
        }
        Customers other = (Customers) object;
        if ((this.customerId == null && other.customerId != null) || (this.customerId != null && !this.customerId.equals(other.customerId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "hotel.Customers[customerId=" + customerId + "]";
    }

}
