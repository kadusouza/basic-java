public class ZipCode {
    public static void main(String[] args) {
        try {
            String zipcode = formatZipcode("12345678");
            System.out.println(zipcode);
        } catch (InvalidZipCodeException e) {
            System.out.println("Invalid Zipcode");
        }
    }

    static  String formatZipcode(String zipcode) throws InvalidZipCodeException {
        if(zipcode.length() != 8)
            throw new InvalidZipCodeException();
        return zipcode;
    }
}
