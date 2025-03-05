public class LombokTest {
    public static void main(String[] args) {
        AddressDTO dto = new AddressDTO();
        dto.setName("John Doe");
        dto.setPhone("1234567890");
        dto.setEmail("john@example.com");

        System.out.println("Name: " + dto.getName());
        System.out.println("Phone: " + dto.getPhone());
        System.out.println("Email: " + dto.getEmail());
    }
}