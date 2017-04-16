package comm.sunbeam.pojos;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the CONSIGNMENT database table.
 * 
 */
@Entity
@NamedQuery(name="Consignment.findAll", query="SELECT c FROM Consignment c")
public class Consignment  {
	private static final long serialVersionUID = 1L;
	private Integer consignmentId;
	private String consigneeAddress;
	private Integer consigneeMobileno;
	private String consigneeName;
	private Date consignmentDate;
	private String deliveryBoy;
	private Date deliveryDate;
	private String destinationPlace;
	private String lastModified;
	private String originPlace;
	private Double rate;
	private String status;
	private Double weight;
	private Login login;

	public Consignment() {
	}
@Id
	@SequenceGenerator(name="seq_Consignment_ID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq_Consignment_ID")
	@Column(name="CONSIGNMENT_ID")
	public Integer getConsignmentId() {
		return this.consignmentId;
	}

	public void setConsignmentId(Integer consignmentId) {
		this.consignmentId = consignmentId;
	}


	@Column(name="CONSIGNEE_ADDRESS")
	public String getConsigneeAddress() {
		return this.consigneeAddress;
	}

	public void setConsigneeAddress(String consigneeAddress) {
		this.consigneeAddress = consigneeAddress;
	}


	@Column(name="CONSIGNEE_MOBILENO")
	public Integer getConsigneeMobileno() {
		return this.consigneeMobileno;
	}

	public void setConsigneeMobileno(Integer consigneeMobileno) {
		this.consigneeMobileno = consigneeMobileno;
	}


	@Column(name="CONSIGNEE_NAME")
	public String getConsigneeName() {
		return this.consigneeName;
	}

	public void setConsigneeName(String consigneeName) {
		this.consigneeName = consigneeName;
	}
	
	@Temporal(TemporalType.DATE)
	@Column(name="CONSIGNMENT_DATE")
	public Date getConsignmentDate() {
		return this.consignmentDate;
	}


	public void setConsignmentDate(Date consignmentDate) {
		this.consignmentDate = consignmentDate;
	}


	@Column(name="DELIVERY_BOY")
	public String getDeliveryBoy() {
		return this.deliveryBoy;
	}

	public void setDeliveryBoy(String deliveryBoy) {
		this.deliveryBoy = deliveryBoy;
	}


	@Temporal(TemporalType.DATE)
	@Column(name="DELIVERY_DATE")
	public Date getDeliveryDate() {
		return this.deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}


	@Column(name="DESTINATION_PLACE")
	public String getDestinationPlace() {
		return this.destinationPlace;
	}

	public void setDestinationPlace(String destinationPlace) {
		this.destinationPlace = destinationPlace;
	}


	@Column(name="LAST_MODIFIED")
	public String getLastModified() {
		return this.lastModified;
	}

	public void setLastModified(String lastModified) {
		this.lastModified = lastModified;
	}


	@Column(name="ORIGIN_PLACE")
	public String getOriginPlace() {
		return this.originPlace;
	}

	public void setOriginPlace(String originPlace) {
		this.originPlace = originPlace;
	}


	public Double getRate() {
		return this.rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}


	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


	public Double getWeight() {
		return this.weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}


/*	@Override
	public String toString() {
		return "Consignment [consignmentId=" + consignmentId
				+ ", consigneeAddress=" + consigneeAddress
				+ ", consigneeMobileno=" + consigneeMobileno
				+ ", consigneeName=" + consigneeName + ", consignmentDate="
				+ consignmentDate + ", deliveryBoy=" + deliveryBoy
				+ ", deliveryDate=" + deliveryDate + ", destinationPlace="
				+ destinationPlace + ", lastModified=" + lastModified
				+ ", originPlace=" + originPlace + ", rate=" + rate
				+ ", status=" + status + ", weight=" + weight + ", login="
				+ login + "]";
	}*/


	//bi-directional many-to-one association to Login
	@ManyToOne
	@JoinColumn(name="LOGIN_ID")
	public Login getLogin() {
		return this.login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}


	

}