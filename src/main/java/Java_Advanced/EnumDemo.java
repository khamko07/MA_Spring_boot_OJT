package Java_Advanced;

enum Role {
    ADMIN,
    USER,
    GUEST
}

public class EnumDemo {
    public static void main(String[] args) {
        Role role = Role.ADMIN;
        System.out.println(role);

    }
}