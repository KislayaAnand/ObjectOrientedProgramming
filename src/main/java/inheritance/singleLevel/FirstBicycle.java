package inheritance.singleLevel;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FirstBicycle extends Bicycle{
    private String modelName;
    private String modelNumber;
    private int height;
    private double price;

    public FirstBicycle(String series, String brand,String modelName, String modelNumber, int height, double price) {
        super(series, brand);
        this.modelName = modelName;
        this.modelNumber = modelNumber;
        this.height = height;
        this.price = price;
    }
    public String getInfo() {
        return "Series: "+ getSeries()+"\n"+
                "Brand: "+ getBrand()+"\n"+
                "Model Name: "+ getModelName()+"\n"+
                "Model Number: "+ getModelNumber()+"\n"+
                "Height: "+ getHeight()+"m\n"+
                "Price: Rs."+ getPrice();
    }
}
