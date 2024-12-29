package org.niroshan.applepc_store.Dto;

import java.util.Date;

public class OderProductDto {
    private Long oderId;
    private Date orderDate;
    private String oderStatus;

    public OderProductDto(Long oderId, Date orderDate, String oderStatus) {
        this.oderId = oderId;
        this.orderDate = orderDate;
        this.oderStatus = oderStatus;
    }

    public OderProductDto() {
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

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof OderProductDto)) return false;
        final OderProductDto other = (OderProductDto) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$oderId = this.getOderId();
        final Object other$oderId = other.getOderId();
        if (this$oderId == null ? other$oderId != null : !this$oderId.equals(other$oderId)) return false;
        final Object this$orderDate = this.getOrderDate();
        final Object other$orderDate = other.getOrderDate();
        if (this$orderDate == null ? other$orderDate != null : !this$orderDate.equals(other$orderDate)) return false;
        final Object this$oderStatus = this.getOderStatus();
        final Object other$oderStatus = other.getOderStatus();
        if (this$oderStatus == null ? other$oderStatus != null : !this$oderStatus.equals(other$oderStatus))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof OderProductDto;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $oderId = this.getOderId();
        result = result * PRIME + ($oderId == null ? 43 : $oderId.hashCode());
        final Object $orderDate = this.getOrderDate();
        result = result * PRIME + ($orderDate == null ? 43 : $orderDate.hashCode());
        final Object $oderStatus = this.getOderStatus();
        result = result * PRIME + ($oderStatus == null ? 43 : $oderStatus.hashCode());
        return result;
    }

    public String toString() {
        return "OderProductDto(oderId=" + this.getOderId() + ", orderDate=" + this.getOrderDate() + ", oderStatus=" + this.getOderStatus() + ")";
    }
}
