package inheritance.singleLevel;

public class Main {
    public static void main(String[] args) {
        FirstBicycle firstBicycle = new FirstBicycle("G-Series", "Jackson", "Aries X-Plus", "G-501",4, 3000);

        FirstBicycle secondBicycle = new FirstBicycle("M-Series", "Action", "Meta Adventurist", "M-333",4, 6500.50);

        System.out.println(firstBicycle.getInfo());
        System.out.println("\n"+secondBicycle.getInfo());
    }
}
