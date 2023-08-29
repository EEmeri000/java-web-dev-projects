public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;
    private Double yearsTeaching;
    public Teacher(String firstName, String lastName, String subject, Double yearsTeaching) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
        this.yearsTeaching = yearsTeaching;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        lastName = lastName;
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
        return lastName;
    }
    public String getSubject() {
        return subject;
    }
    public Double getYearsTeaching() {
        return yearsTeaching;
    }
}
