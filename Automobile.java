public class Automobile{
    private int modelYear;
    private String brand;
	
	public Automobile(int modelYear, String brand) {
        this.modelYear = modelYear;
        this.brand = brand;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void honk() {
        System.out.println("Honk! Honk!");
    }
    
	public int compareTo(Automobile other) {
        return Integer.compare(this.modelYear, other.modelYear);
    }

    @Override
    public String toString() {
        return "Automobile [Model Year=" + modelYear + ", Brand=" + brand + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Automobile that = (Automobile) obj;
        return modelYear == that.modelYear && brand.equals(that.brand);
    }
}
