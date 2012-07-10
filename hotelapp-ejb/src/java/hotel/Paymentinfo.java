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
@Table(name = "paymentinfo")
@NamedQueries({@NamedQuery(name = "Paymentinfo.findAll", query = "SELECT p FROM Paymentinfo p"), @NamedQuery(name = "Paymentinfo.findByCustomerId", query = "SELECT p FROM Paymentinfo p WHERE p.customerId = :customerId"), @NamedQuery(name = "Paymentinfo.findByAmount", query = "SELECT p FROM Paymentinfo p WHERE p.amount = :amount"), @NamedQuery(name = "Paymentinfo.findByPaymode", query = "SELECT p FROM Paymentinfo p WHERE p.paymode = :paymode"), @NamedQuery(name = "Paymentinfo.findByChequeNumber", query = "SELECT p FROM Paymentinfo p WHERE p.chequeNumber = :chequeNumber"), @NamedQuery(name = "Paymentinfo.findByCreditCardName", query = "SELECT p FROM Paymentinfo p WHERE p.creditCardName = :creditCardName"), @NamedQuery(name = "Paymentinfo.findByCreditCardNo", query = "SELECT p FROM Paymentinfo p WHERE p.creditCardNo = :creditCardNo"), @NamedQuery(name = "Paymentinfo.findByCreditCartExpirydate", query = "SELECT p FROM Paymentinfo p WHERE p.creditCartExpirydate = :creditCartExpirydate")})
public class Paymentinfo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "customer_id")
    private Integer customerId;
    @Column(name = "amount")
    private Float amount;
    @Column(name = "paymode")
    private String paymode;
    @Column(name = "cheque_number")
    private String chequeNumber;
    @Column(name = "credit_card_name")
    private String creditCardName;
    @Column(name = "credit_card_no")
    private String creditCardNo;
    @Column(name = "credit_cart_expirydate")
    @Temporal(TemporalType.DATE)
    private Date creditCartExpirydate;

    public Paymentinfo() {
    }

    public Paymentinfo(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public String getPaymode() {
        return paymode;
    }

    public void setPaymode(String paymode) {
        this.paymode = paymode;
    }

    public String getChequeNumber() {
        return chequeNumber;
    }

    public void setChequeNumber(String chequeNumber) {
        this.chequeNumber = chequeNumber;
    }

    public String getCreditCardName() {
        return creditCardName;
    }

    public void setCreditCardName(String creditCardName) {
        this.creditCardName = creditCardName;
    }

    public String getCreditCardNo() {
        return creditCardNo;
    }

    public void setCreditCardNo(String creditCardNo) {
        this.creditCardNo = creditCardNo;
    }

    public Date getCreditCartExpirydate() {
        return creditCartExpirydate;
    }

    public void setCreditCartExpirydate(Date creditCartExpirydate) {
        this.creditCartExpirydate = creditCartExpirydate;
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
        if (!(object instanceof Paymentinfo)) {
            return false;
        }
        Paymentinfo other = (Paymentinfo) object;
        if ((this.customerId == null && other.customerId != null) || (this.customerId != null && !this.customerId.equals(other.customerId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "hotel.Paymentinfo[customerId=" + customerId + "]";
    }

}
