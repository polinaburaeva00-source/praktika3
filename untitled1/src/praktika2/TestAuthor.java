package praktika2;

public class TestAuthor {
    public static void main(String[] args) {
            Author author1 = new Author("Достоевский", "DostoevsMPh@mail.ru", 'M');
            System.out.println(author1);

            Author author2 = new Author("Марк Твен", "MTven@gmail.com", 'M');
            System.out.println(author2);

            Author author3 = new Author("Сью Грант", "suGrant@somewhere.com", 'F');
            System.out.println(author3);

            Author author4 = new Author("Неизвестный", "unknown@somewhere.com", 'U');
            System.out.println(author4);
    }
}
