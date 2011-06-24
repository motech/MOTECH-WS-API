package org.motechproject.ws;

public class MotechStaff {

    private String staffId;
    private String firstName;
    private String familyName;

    public MotechStaff() {
    }

    public MotechStaff(String staffId, String firstName, String familyName) {
        this.staffId = staffId;
        this.firstName = firstName;
        this.familyName = familyName;
    }

    public String getStaffId() {
        return staffId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }
}
