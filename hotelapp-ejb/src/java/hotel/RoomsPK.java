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
import javax.persistence.Embeddable;

/**
 *
 * @author Administrator
 */
@Embeddable
public class RoomsPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "room_id")
    private int roomId;
    @Basic(optional = false)
    @Column(name = "hotel_id")
    private int hotelId;

    public RoomsPK() {
    }

    public RoomsPK(int roomId, int hotelId) {
        this.roomId = roomId;
        this.hotelId = hotelId;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) roomId;
        hash += (int) hotelId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RoomsPK)) {
            return false;
        }
        RoomsPK other = (RoomsPK) object;
        if (this.roomId != other.roomId) {
            return false;
        }
        if (this.hotelId != other.hotelId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "hotel.RoomsPK[roomId=" + roomId + ", hotelId=" + hotelId + "]";
    }

}
