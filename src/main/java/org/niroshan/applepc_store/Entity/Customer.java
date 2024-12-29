package org.niroshan.applepc_store.Entity;


import jakarta.persistence.*;

@Entity
@Table(name = "CustomerDetails")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;
    private String customerName;
    private String customerAddress;
    private String customerPhone;

    public Customer(Long customerId, String customerName, String customerAddress, String customerPhone) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerPhone = customerPhone;
    }

    public Customer() {
    }

    public Long getCustomerId() {
        return this.customerId;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getCustomerAddress() {
        return this.customerAddress;
    }

    public String getCustomerPhone() {
        return this.customerPhone;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Customer)) return false;
        final Customer other = (Customer) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$customerId = this.getCustomerId();
        final Object other$customerId = other.getCustomerId();
        if (this$customerId == null ? other$customerId != null : !this$customerId.equals(other$customerId))
            return false;
        final Object this$customerName = this.getCustomerName();
        final Object other$customerName = other.getCustomerName();
        if (this$customerName == null ? other$customerName != null : !this$customerName.equals(other$customerName))
            return false;
        final Object this$customerAddress = this.getCustomerAddress();
        final Object other$customerAddress = other.getCustomerAddress();
        if (this$customerAddress == null ? other$customerAddress != null : !this$customerAddress.equals(other$customerAddress))
            return false;
        final Object this$customerPhone = this.getCustomerPhone();
        final Object other$customerPhone = other.getCustomerPhone();
        if (this$customerPhone == null ? other$customerPhone != null : !this$customerPhone.equals(other$customerPhone))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Customer;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $customerId = this.getCustomerId();
        result = result * PRIME + ($customerId == null ? 43 : $customerId.hashCode());
        final Object $customerName = this.getCustomerName();
        result = result * PRIME + ($customerName == null ? 43 : $customerName.hashCode());
        final Object $customerAddress = this.getCustomerAddress();
        result = result * PRIME + ($customerAddress == null ? 43 : $customerAddress.hashCode());
        final Object $customerPhone = this.getCustomerPhone();
        result = result * PRIME + ($customerPhone == null ? 43 : $customerPhone.hashCode());
        return result;
    }

    public String toString() {
        return "Customer(customerId=" + this.getCustomerId() + ", customerName=" + this.getCustomerName() + ", customerAddress=" + this.getCustomerAddress() + ", customerPhone=" + this.getCustomerPhone() + ")";
    }
}
