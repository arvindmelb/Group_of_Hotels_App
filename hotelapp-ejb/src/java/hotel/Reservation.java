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
@Table(name = "reservation")
@NamedQueries({@NamedQuery(name = "Reservation.findAll", query = "SELECT r FROM Reservation r"), @NamedQuery(name = "Reservation.findByReservationId", query = "SELECT r FROM Reservation r WHERE r.reservationId = :reservationId"), @NamedQuery(name = "Reservation.findByCustomerId", query = "SELECT r FROM Reservation r WHERE r.customerId = :customerId"), @NamedQuery(name = "Reservation.findByRoomId", query = "SELECT r FROM Reservation r WHERE r.roomId = :roomId"), @NamedQuery(name = "Reservation.findByHotelId", query = "SELECT r FROM Reservation r WHERE r.hotelId = :hotelId"), @NamedQuery(name = "Reservation.findByDateOfReservation", query = "SELECT r FROM Reservation r WHERE r.dateOfReservation = :dateOfReservation")})
public class Reservation implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "reservation_id")
    private Integer reservationId;
    @Basic(optional = false)
    @Column(name = "customer_id")
    private int customerId;
    @Basic(optional = false)
    @Column(name = "room_id")
    private int roomId;
    @Basic(optional = false)
    @Column(name = "hotel_id")
    private int hotelId;
    @Column(name = "date_of_reservation")
    @Temporal(TemporalType.DATE)
    private Date dateOfReservation;

    public Reservation() {
    }

    public Reservation(Integer reservationId) {
        this.reservationId = reservationId;
    }

    public Reservation(Integer reservationId, int customerId, int roomId, int hotelId) {
        this.reservationId = reservationId;
        this.customerId = customerId;
        this.roomId = roomId;
        this.hotelId = hotelId;
    }

    public Integer getReservationId() {
        return reservationId;
    }

    public void setReservationId(Integer reservationId) {
        this.reservationId = reservationId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public Date getDateOfReservation() {
        return dateOfReservation;
    }

    public void setDateOfReservation(Date dateOfReservation) {
        this.dateOfReservation = dateOfReservation;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (reservationId != null ? reservationId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reservation)) {
            return false;
        }
        Reservation other = (Reservation) object;
        if ((this.reservationId == null && other.reservationId != null) || (this.reservationId != null && !this.reservationId.equals(other.reservationId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "hotel.Reservation[reservationId=" + reservationId + "]";
    }

}
