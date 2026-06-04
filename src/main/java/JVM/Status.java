package JVM;
public enum Status {
    ACTIVE,
    INACTIVE,
    DELETED;

    public static void main(String[] args) {
        Status s = Status.ACTIVE;

        System.out.println("Trang thai: " + s.name());

        if (s == Status.ACTIVE) {
            System.out.println("Dang hoat dong");
        }

        switch (s) {
            case ACTIVE   -> System.out.println("-> Co the dang nhap");
            case INACTIVE -> System.out.println("-> Bi khoa tam thoi");
            case DELETED  -> System.out.println("-> Da xoa");
        }

        System.out.println("\nDanh sach tat ca trang thai:");
        for (Status st : Status.values()) {
            System.out.println("- " + st);
        }
    }
}
