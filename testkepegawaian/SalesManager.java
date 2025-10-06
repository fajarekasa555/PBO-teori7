public class SalesManager extends Manager {

    private String departemen;

    public SalesManager(String nama, String gaji, String departemen) {
        super(nama, gaji);
        this.departemen = departemen;
    }
    
    public void naikkanGaji(){
        gaji += 1000000;
    }

    public void cetakStatus(){
        super.cetakStatus();
        System.out.println("Departemen\t: " + departemen);
    }
    
}
