package Q5;

public class Dog extends Pet implements Boardable {
    private String size;
    public int startMonth, startDay, startYear, endMonth, endDay, endYear;

    public Dog(String name, String ownerName, String color, String size) {
        super(name, ownerName, color);
        this.size = size;
    }

    public String getSize() {
        return this.size;
    }

    public void setBoardStart(int month, int day, int year) {
        this.startMonth = month;
        this.startDay = day;
        this.startYear = year;
    }

    public void setBoardEnd(int month, int day, int year) {
        this.startMonth = month;
        this.startDay = day;
        this.startYear = year;
    }

    public boolean boarding(int month, int day, int year) {
        if (month >= this.startMonth && month <= this.endMonth && day >= this.startDay && day <= this.endDay && year >= this.startYear && year <= this.endYear)
            return true;
        else return false;
    }

    public String toString() {
        return "DOG:\n" + super.getPetName() + " owned by " + super.getOwnerName() + "\nColor: " + super.getColor()
                + "\nSex: " + super.getSex() + "\nSize: " + this.getSize();
    }
}