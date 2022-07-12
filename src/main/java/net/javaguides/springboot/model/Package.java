package net.javaguides.springboot.model;


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

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "sender_name")
    private String senderName;

    @Column(name = "sender_address")
    private String senderAddress;

    @Column(name = "sender_contact")
    private String senderContact;

    @Column(name = "receiver_name")
    private String receiverName;

    @Column(name = "receiver_contact")
    private String receiverContact;

    @Column(name = "receiver_address")
    private String receiverAddress;

    @Column(name = "driver_name")
    private String driverName;

    @Column(name = "driver_contact")
    private String driverContact;

    @Column(name = "from_operational_Centre")
    private String fromOperationalCentre;

    @Column(name = "to_operational_Centre")
    private String toOperationalCentre;

    @Column(name = "weight")
    private String weight;

    @Column(name = "height")
    private String height;

    @Column(name = "width")
    private String width;

    @Column(name = "length")
    private String length;

    @Column(name = "price")
    private float price;

    @Column(name = "status")
    private int status;

    @Column(name = "type")
    private int type;



}
