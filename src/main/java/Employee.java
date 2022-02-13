import java.util.List;

public class Employee extends Reader{
    private String name;
    private String wage;
    private String position;
    private List<Employee> colleagues;
    public Employee(String name, String wage, String position) {
        this.name = name;
        this.wage = wage;
        this.position = position;
    }
    public Employee(){}

    public List<Employee> getColleagues() {
        return colleagues;
    }

    public void setColleagues(List<Employee> colleagues) {
        this.colleagues = colleagues;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWage() {
        return wage;
    }

    public void setWage(String wage) {
        this.wage = wage;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", wage=" + wage +
                ", position='" + position + '\'' +
                ", colleagues=" + colleagues +
                '}';
    }
}
