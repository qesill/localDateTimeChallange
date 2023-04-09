import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        /*
            1. Stwórz instancję LocalDateTime i wywołaj now() aby otrzymać aktualną datę i czas
            2. Zrób kolejną instancję i wywołaj of() aby przekazać dowolną datę i czas z przyszłości
            3. Wywołaj isAfter na drugiej instancji względem aktualnego czasu i jeśli zwróci
               true pokaż tekst w konsoli opisujący, że data jest z przyszłości
         */
        LocalDateTime localDateTime1 = LocalDateTime.now();
        System.out.println(localDateTime1);

        LocalDateTime localDateTime2 = LocalDateTime.of(2023,04,10,04,04,04);

        if (localDateTime2.isAfter(localDateTime1)) {
            System.out.println("localDateTime2 > localDateTime1");
            System.out.println(localDateTime2);
        }

    }
}
