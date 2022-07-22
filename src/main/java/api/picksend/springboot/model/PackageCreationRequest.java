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
public class PackageCreationRequest {

    private String senderName;

    private String senderAddress;

    private String senderContact;

    private String senderAvailability;

    private String receiverName;

    private String receiverContact;

    private String receiverAddress;

    private String weight;

    private String size;

    private String price;

    private String type;

    private String packageStatus;

}
