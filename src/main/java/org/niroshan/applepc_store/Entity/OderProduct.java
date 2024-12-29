package org.niroshan.applepc_store.Entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "OderDetais")
public class OderProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long oderId;
    private Date orderDate;
    private String oderStatus;

    public OderProduct(Long oderId, Date orderDate, String oderStatus) {
        this.oderId = oderId;
        this.orderDate = orderDate;
        this.oderStatus = oderStatus;
    }

    public OderProduct() {
    }

    public Long getOderId() {
        return this.oderId;
    }

    public Date getOrderDate() {
        return this.orderDate;
    }

    public String getOderStatus() {
        return this.oderStatus;
    }

    public void setOderId(Long oderId) {
        this.oderId = oderId;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public void setOderStatus(String oderStatus) {
        this.oderStatus = oderStatus;
    }


}
