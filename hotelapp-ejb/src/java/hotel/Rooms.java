/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hotel;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Administrator
 */
@Entity
@Table(name = "rooms")
@NamedQueries({@NamedQuery(name = "Rooms.findAll", query = "SELECT r FROM Rooms r"), @NamedQuery(name = "Rooms.findByRoomId", query = "SELECT r FROM Rooms r WHERE r.roomsPK.roomId = :roomId"), @NamedQuery(name = "Rooms.findByHotelId", query = "SELECT r FROM Rooms r WHERE r.roomsPK.hotelId = :hotelId"), @NamedQuery(name = "Rooms.findByRoomType", query = "SELECT r FROM Rooms r WHERE r.roomType = :roomType"), @NamedQuery(name = "Rooms.findByRoomRent", query = "SELECT r FROM Rooms r WHERE r.roomRent = :roomRent")})
public class Rooms implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RoomsPK roomsPK;
    @Column(name = "room_type")
    private String roomType;
    @Column(name = "room_rent")
    private Float roomRent;

    public Rooms() {
    }

    public Rooms(RoomsPK roomsPK) {
        this.roomsPK = roomsPK;
    }

    public Rooms(int roomId, int hotelId) {
        this.roomsPK = new RoomsPK(roomId, hotelId);
    }

    public RoomsPK getRoomsPK() {
        return roomsPK;
    }

    public void setRoomsPK(RoomsPK roomsPK) {
        this.roomsPK = roomsPK;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public Float getRoomRent() {
        return roomRent;
    }

    public void setRoomRent(Float roomRent) {
        this.roomRent = roomRent;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (roomsPK != null ? roomsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rooms)) {
            return false;
        }
        Rooms other = (Rooms) object;
        if ((this.roomsPK == null && other.roomsPK != null) || (this.roomsPK != null && !this.roomsPK.equals(other.roomsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "hotel.Rooms[roomsPK=" + roomsPK + "]";
    }

}
