public class Supervisor extends Manager {
    public Supervisor(String nama, String gaji) {
        super(nama, gaji);
    }
    
    public void naikkanGaji(){
        gaji += 1500000;
    }
}
