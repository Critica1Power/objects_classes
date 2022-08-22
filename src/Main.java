public class Main {
    public static void main(String[] args) {
        // Задание 1
        Author aPushkin = new Author("Aleksandr", "Pushkin");
        Author fDostoevskiy = new Author("Fedor", "Dostoevskiy");
        Book evgeniyOnegin = new Book("Evgeniy Onegin", 1833, aPushkin);
        Book crimeAndPunishment = new Book("Prestyplenie i nakazanie", 1866, fDostoevskiy);


        System.out.println(aPushkin);
        System.out.println(fDostoevskiy);
        System.out.println(evgeniyOnegin);
        System.out.println(crimeAndPunishment);

        crimeAndPunishment.setPublishDate(2022);
        System.out.println();
        System.out.println(crimeAndPunishment);
    }
}