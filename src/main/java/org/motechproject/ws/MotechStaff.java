package org.motechproject.ws;

public class MotechStaff {

    private String staffId;
    private String firstName;
    private String familyName;

    public MotechStaff() { }

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
}
