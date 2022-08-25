public class Hotel extends Home {

    public Hotel(String address) {
        super(address);
    }

    @Override
    public void living() {
        System.out.println("living in a hotel at "  + this.address);
    }

    @Override
    public String housingFee() {
        return "pays for rent";
    }
}
