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
@Table(name = "package_charges")
public class PackageCharges {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "package_weight_1kg")
    private int weightAmount1kg;

    @Column(name = "package_weight_2kg")
    private int weightAmount2kg;

    @Column(name = "package_weight_3kg")
    private int weightAmount3Kg;

    @Column(name = "package_weight_4kg")
    private int weightAmount4Kg;


    @Column(name = "`package_size_2*2`")
    private int sizeAmount2By2;

    @Column(name = "`package_size_4*4`")
    private int sizeAmount4By4;

    @Column(name = "`package_size_6*6`")
    private int sizeAmount6By6;

    @Column(name = "`package_size_8*8`")
    private int sizeAmount8By8;



}
