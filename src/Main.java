public class Main {
    public static void main(String[] args) {
        DatabaseManager dbManager = new DatabaseManager();

        // Adăugăm 10 persoane în baza de date
        for (int i = 1; i <= 10; i++) {
            Person person = new Person(i, "Nume" + i, "Prenume" + i, 2000 + i * 100, "2023-07-26");
            dbManager.insertPerson(person);
        }

        // Afișăm toate persoanele din baza de date
        dbManager.displayAllPeople();
    }
}
