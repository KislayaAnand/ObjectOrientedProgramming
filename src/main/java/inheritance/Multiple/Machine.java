package inheritance.Multiple;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Machine implements Scanner, Printer{
    private String document;

    @Override
    public void print() {
        System.out.println("Document Printed: "+document);
    }

    @Override
    public void scan() {
        System.out.println("Document Scanned: "+document);
    }
}
