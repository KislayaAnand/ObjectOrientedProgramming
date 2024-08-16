package inheritance.Hierarchial;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Professional {
    private String name;
    private String id;
    private int experience;
    private double Salary;

    public String getInfo() {
        return "Name: "+getName()+"\n"+
                "Id: "+getId()+"\n"+
                "Experience: "+getExperience()+" Years\n"+
                "Salary: "+getSalary();
    }
}
