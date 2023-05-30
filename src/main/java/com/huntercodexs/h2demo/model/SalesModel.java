package com.huntercodexs.h2demo.model;

import lombok.*;

import javax.persistence.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "sales")
public class SalesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column
    String product;

    @Column
    String quantity;

    @Column
    String total;

}
