public class Flat extends Home {

    public Flat(String address) {
        super(address);
    }

    @Override
    public void living() {
        System.out.println("living in a flat at " + this.address);
    }

    @Override
    public String housingFee() {
        return "pays for utilities";
    }
}
