package session_10_java_OOP_concepts.challenge.challenge10_1_CollegeManagementSystem;

public class Address {
    private String street;
    private int streetNumber;
    private String county;
    private String city;


    public Address(String street, int streetNumber, String county, String city) {
        this.street = street;
        this.streetNumber = streetNumber;
        this.county = county;
        this.city = city;
    }

    public String toString() {
        String allAddressAttributes =
                "County: " + county + "\n" +
                "City: " + city + "\n" +
                "Street: " + street + "\n" +
                "Number: " + streetNumber;
        return allAddressAttributes;
    }
}
