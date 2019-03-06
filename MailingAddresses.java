class Address {
    String street;
    String city;
    String state;
    int zip;

    Address(String _street, String _city, String _state, int _zip){
        street = _street;
        city = _city;
        state = _state;
        zip = _zip;
    }

    void print(){
        System.out.println(street);
        System.out.println(city + ", " + state + " " + zip);
    }
}

public class MailingAddresses {
    public static void main( String[] args){
        Address uno, dos, tres;

        uno = new Address("191 Marigold Lane", "Miami", "FL", 33179);
        dos = new Address("3029 Losh Lane", "Crafton", "PA", 15205);
        tres = new Address("2693 Hanna Street", "Hickory", "NC", 28601);

        uno.print();
        System.out.println();
        dos.print();
        System.out.println();
        tres.print();
    }
}