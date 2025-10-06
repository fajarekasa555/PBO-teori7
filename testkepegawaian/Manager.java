public class Manager {
    protected String nama;
    protected String gaji;

    public Manager(String nama, String gaji) {
        this.nama = nama;
        this.gaji = gaji;
    }

    public void naikkanGaji(){
        gaji += 1000000;
    }

    public void cetakStatus(){
        System.out.println("Nama\t: " + nama);
        System.out.println("Gaji\t: " + gaji);
    }
}
