package constructor;

public class Constructor {
    String name;
    String programStudy;
    String address;

    /*
     * kalau mau membuat sebuah constructor kita harus memberikan nama class di awal
     * seperti dibawah sini
     */
    public Constructor(String paramName, String paramProgramStudy, String paramAddress) {
        name = paramName;
        programStudy = paramProgramStudy;
        address = paramAddress;
    }

    public Constructor(String paramName, String paramProgramStudy) {
        this(paramName, paramProgramStudy, null);
    }

    public Constructor(String paramName) {
        this(paramName, null, null);
    }

    public void biodata() {
        System.out.println("\nIni biodata dari  : " + name);
    }

    public void showData() {
        System.out.println("Name                : " + name);
        System.out.println("Program Study       : " + programStudy);
        System.out.println("Negara              : " + address);
    }
}