package org.niroshan.applepc_store.Dto;

public class EmployeeDto {
    private Long employee_id;
    private String lname;
    private String fname;
    private String email;

    public EmployeeDto(Long employee_id, String lname, String fname, String email) {
        this.employee_id = employee_id;
        this.lname = lname;
        this.fname = fname;
        this.email = email;
    }

    public Long getEmployee_id() {
        return this.employee_id;
    }

    public String getLname() {
        return this.lname;
    }

    public String getFname() {
        return this.fname;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmployee_id(Long employee_id) {
        this.employee_id = employee_id;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof EmployeeDto)) return false;
        final EmployeeDto other = (EmployeeDto) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$employee_id = this.getEmployee_id();
        final Object other$employee_id = other.getEmployee_id();
        if (this$employee_id == null ? other$employee_id != null : !this$employee_id.equals(other$employee_id))
            return false;
        final Object this$lname = this.getLname();
        final Object other$lname = other.getLname();
        if (this$lname == null ? other$lname != null : !this$lname.equals(other$lname)) return false;
        final Object this$fname = this.getFname();
        final Object other$fname = other.getFname();
        if (this$fname == null ? other$fname != null : !this$fname.equals(other$fname)) return false;
        final Object this$email = this.getEmail();
        final Object other$email = other.getEmail();
        if (this$email == null ? other$email != null : !this$email.equals(other$email)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof EmployeeDto;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $employee_id = this.getEmployee_id();
        result = result * PRIME + ($employee_id == null ? 43 : $employee_id.hashCode());
        final Object $lname = this.getLname();
        result = result * PRIME + ($lname == null ? 43 : $lname.hashCode());
        final Object $fname = this.getFname();
        result = result * PRIME + ($fname == null ? 43 : $fname.hashCode());
        final Object $email = this.getEmail();
        result = result * PRIME + ($email == null ? 43 : $email.hashCode());
        return result;
    }

    public String toString() {
        return "EmployeeDto(employee_id=" + this.getEmployee_id() + ", lname=" + this.getLname() + ", fname=" + this.getFname() + ", email=" + this.getEmail() + ")";
    }
}
