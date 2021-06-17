public class Employee {
    //Properties or states
    private int id;
    private String fname;
    private String lname;
    private Department dep;
    private String pos;


    public Employee() {
    this("?","?");
    }

    public Employee(String fname, String lname) {
        this.fname = fname ;
        this.lname = lname ;
    }

    //Behaviors or methods

    void doSmt() {

    }

    public String getFullName() {
        return fname + " : " + lname;
    }

    String getPositionName() {
        return "";
    }
}
