public class TestKepegawaian {

    public static void main(String[] args) {
        Manager manajer = new Manager("PBO", "5000000");
        Supervisor supervisor = new Supervisor("Sulis", "1000000");
        SalesManager salesManager = new SalesManager("Sulaimanan", "2000000", "IT");

        manajer.naikkanGaji();
        supervisor.naikkanGaji();
        salesManager.naikkanGaji();

        manajer.cetakStatus();
        System.out.println();
        supervisor.cetakStatus();
        System.out.println();
        salesManager.cetakStatus();
    }
}