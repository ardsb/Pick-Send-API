package api.picksend.springboot.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "package")
public class Package {

    public Package(String senderName, String senderAddress, String senderContact, String senderAvailability, String receiverName, String receiverContact, String receiverAddress, String weight, String size, String price, String type, String packageStatus, String dateCreated) {
        this.senderName = senderName;
        this.senderAddress = senderAddress;
        this.senderContact = senderContact;
        this.senderAvailability = senderAvailability;
        this.receiverName = receiverName;
        this.receiverContact = receiverContact;
        this.receiverAddress = receiverAddress;
        this.weight = weight;
        this.size = size;
        this.price = price;
        this.type = type;
        this.packageStatus = packageStatus;
        this.dateCreated = dateCreated;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "sender_name")
    private String senderName;

    @Column(name = "sender_address")
    private String senderAddress;

    @Column(name = "sender_contact")
    private String senderContact;

    @Column(name="sender_availability")
    private String senderAvailability;

    @Column(name = "receiver_name")
    private String receiverName;

    @Column(name = "receiver_contact")
    private String receiverContact;

    @Column(name = "receiver_address")
    private String receiverAddress;

    @Column(name = "weight")
    private String weight;

    @Column(name = "size")
    private String size;

    @Column(name = "price")
    private String price;


    @Column(name = "type")
    private String type;

    @Column(name = "package_status")
    private String packageStatus;

    @Column(name = "date_created")
    private String dateCreated;



}
