package org.niroshan.applepc_store.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name ="OderDetais")
public class OderProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long oderId;
    private Date orderDate;
    private String oderStatus;

}