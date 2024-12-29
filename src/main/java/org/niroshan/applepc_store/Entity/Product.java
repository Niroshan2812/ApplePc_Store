package org.niroshan.applepc_store.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String pname;
    private String pDescription;
    private String qtyInstock;
    private Double price;

    public Product(Long id, String pname, String pDescription, String qtyInstock, Double price) {
        this.id = id;
        this.pname = pname;
        this.pDescription = pDescription;
        this.qtyInstock = qtyInstock;
        this.price = price;
    }

    public Product() {
    }

    public Long getId() {
        return this.id;
    }

    public String getPname() {
        return this.pname;
    }

    public String getPDescription() {
        return this.pDescription;
    }

    public String getQtyInstock() {
        return this.qtyInstock;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public void setPDescription(String pDescription) {
        this.pDescription = pDescription;
    }

    public void setQtyInstock(String qtyInstock) {
        this.qtyInstock = qtyInstock;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Product)) return false;
        final Product other = (Product) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$pname = this.getPname();
        final Object other$pname = other.getPname();
        if (this$pname == null ? other$pname != null : !this$pname.equals(other$pname)) return false;
        final Object this$pDescription = this.getPDescription();
        final Object other$pDescription = other.getPDescription();
        if (this$pDescription == null ? other$pDescription != null : !this$pDescription.equals(other$pDescription))
            return false;
        final Object this$qtyInstock = this.getQtyInstock();
        final Object other$qtyInstock = other.getQtyInstock();
        if (this$qtyInstock == null ? other$qtyInstock != null : !this$qtyInstock.equals(other$qtyInstock))
            return false;
        final Object this$price = this.getPrice();
        final Object other$price = other.getPrice();
        if (this$price == null ? other$price != null : !this$price.equals(other$price)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Product;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $pname = this.getPname();
        result = result * PRIME + ($pname == null ? 43 : $pname.hashCode());
        final Object $pDescription = this.getPDescription();
        result = result * PRIME + ($pDescription == null ? 43 : $pDescription.hashCode());
        final Object $qtyInstock = this.getQtyInstock();
        result = result * PRIME + ($qtyInstock == null ? 43 : $qtyInstock.hashCode());
        final Object $price = this.getPrice();
        result = result * PRIME + ($price == null ? 43 : $price.hashCode());
        return result;
    }

    public String toString() {
        return "Product(id=" + this.getId() + ", pname=" + this.getPname() + ", pDescription=" + this.getPDescription() + ", qtyInstock=" + this.getQtyInstock() + ", price=" + this.getPrice() + ")";
    }
}
