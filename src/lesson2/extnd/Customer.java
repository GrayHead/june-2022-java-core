package lesson2.extnd;

public class Customer extends User {
    private String email;
    public Customer() {
    }

    public Customer(
            int id,
            String name,
            String surname,
            String email) {
        super(id, name, surname);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "email='" + email + '\'' +
                "} " + super.toString();
    }

    @Override
    public void greeting() {
        System.out.println("hi waszzzzzup");
    }

}
