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
    private float price;


    @Column(name = "type")
    private int type;



}
