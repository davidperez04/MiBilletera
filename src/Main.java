public class Main {
    public static void main(String[] args) {
        Transaction transaction1 = new Transaction();
        Transaction transaction2 = new Transaction(100000, "esto es para el cumpleaños de la negra");
        Transaction transaction3 = new Transaction(5000, "idk", "8/12/2025", "save");

        transaction1.printDetail();
        transaction2.printDetail();
        transaction3.printDetail();
    }
}
