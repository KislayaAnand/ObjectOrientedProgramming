package inheritance.Hierarchial;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Engineer extends Professional{
    private String field;

    public Engineer(String name, String id, int experience, double salary, String field) {
        super(name, id, experience, salary);
        this.field = field;
    }

    public String fetchDetails() {
        return getInfo()+"\n"+
                "Domain: "+getField();
    }
}
