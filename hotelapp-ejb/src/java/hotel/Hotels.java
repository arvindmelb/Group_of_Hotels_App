/**
 * Created with Netbeans IDE 6.5
 * Author: Arvind Kumar
 * Date:   7/9/12
 * Time:   15:18 PM
 * Description:
 *
 */

package hotel;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Administrator
 */
@Entity
@Table(name = "hotels")
@NamedQueries({@NamedQuery(name = "Hotels.findAll", query = "SELECT h FROM Hotels h"), @NamedQuery(name = "Hotels.findByHotelId", query = "SELECT h FROM Hotels h WHERE h.hotelId = :hotelId"), @NamedQuery(name = "Hotels.findByHotelName", query = "SELECT h FROM Hotels h WHERE h.hotelName = :hotelName"), @NamedQuery(name = "Hotels.findByAddress", query = "SELECT h FROM Hotels h WHERE h.address = :address"), @NamedQuery(name = "Hotels.findByCity", query = "SELECT h FROM Hotels h WHERE h.city = :city"), @NamedQuery(name = "Hotels.findByHotelState", query = "SELECT h FROM Hotels h WHERE h.hotelState = :hotelState"), @NamedQuery(name = "Hotels.findByCountry", query = "SELECT h FROM Hotels h WHERE h.country = :country"), @NamedQuery(name = "Hotels.findByNoOfRooms", query = "SELECT h FROM Hotels h WHERE h.noOfRooms = :noOfRooms")})
public class Hotels implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "hotel_id")
    private Integer hotelId;
    @Column(name = "hotel_name")
    private String hotelName;
    @Column(name = "address")
    private String address;
    @Column(name = "city")
    private String city;
    @Column(name = "hotel_state")
    private String hotelState;
    @Column(name = "country")
    private String country;
    @Column(name = "no_of_rooms")
    private Integer noOfRooms;

    public Hotels() {
    }

    public Hotels(Integer hotelId) {
        this.hotelId = hotelId;
    }

    public Integer getHotelId() {
        return hotelId;
    }

    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getHotelState() {
        return hotelState;
    }

    public void setHotelState(String hotelState) {
        this.hotelState = hotelState;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getNoOfRooms() {
        return noOfRooms;
    }

    public void setNoOfRooms(Integer noOfRooms) {
        this.noOfRooms = noOfRooms;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (hotelId != null ? hotelId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Hotels)) {
            return false;
        }
        Hotels other = (Hotels) object;
        if ((this.hotelId == null && other.hotelId != null) || (this.hotelId != null && !this.hotelId.equals(other.hotelId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "hotel.Hotels[hotelId=" + hotelId + "]";
    }

}
