class Absensi {
    String name;
    String subject;
    boolean present;

    public Absensi(String name, String subject, boolean present) {
        this.name = name;
        this.subject = subject;
        this.present = present;
    }

    void checkAttendance() {
        String status;
        System.out.println("=== STATUS ABSENSI ===");
        if (this.present == true) {
            status = "Hadir Cuy!";
        } else {
            status = "Mangkir Nih!";
        }

        System.out.println("Student     : " + name);
        System.out.println("Subject     : " + subject);
        System.out.println("Status      : " + status);
    }
}
