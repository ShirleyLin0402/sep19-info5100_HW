package Q5;

public class Cat  extends Pet implements Boardable{
	private String hairLength;
    public int startMonth, startDay, startYear, endMonth, endDay, endYear;

    public Cat(String name, String ownerName, String color, String hairLength) {
        super(name, ownerName, color);
        this.hairLength = hairLength;
    }

    public String getHairLength() {
        return this.hairLength;
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
        return "CAT:\n" + super.getPetName() + " owned by " + super.getOwnerName() + "\nColor: " + super.getColor()
                + "\nSex: " + super.getSex() + "\nHair: " + this.getHairLength();
    }

}
