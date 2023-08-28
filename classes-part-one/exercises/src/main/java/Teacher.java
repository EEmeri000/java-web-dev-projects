public class Teacher {
    private String firstName;
    private String LastName;
    private String subject;
    private Double yearsTeaching;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        LastName = lastName;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public void setYearsTeaching(Double yearsTeaching) {
        this.yearsTeaching = yearsTeaching;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return LastName;
    }
    public String getSubject() {
        return subject;
    }
    public Double getYearsTeaching() {
        return yearsTeaching;
    }
}
