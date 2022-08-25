public class Hostel extends Home {

    public Hostel(String address) {
        super(address);
    }

    @Override
    public void living() {
        System.out.println("living in a hostel at "  + this.address);
    }

    @Override
    public String housingFee() {
        return "pays for rent";
    }
}
