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
@Table(name = "package_tracks")
public class PackageTracks {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "package_id")
    private String packageId;

    @Column(name = "package_status")
    private String packageStatus;

    @Column(name = "date_created")
    private String dateCreated;

}
