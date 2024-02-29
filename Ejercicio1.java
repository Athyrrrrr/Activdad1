package actividad1;

public class Ejercicio1 {

    public static void main(String[] args) {
        int edadJuan = 9;
        int edadAna, edadAlberto, edadMama;
        edadAlberto = 2*(edadJuan/3);
        edadAna = 4*(edadJuan/3);
        edadMama = edadJuan + edadAlberto + edadAna;
        System.out.println("Las edades son: ");
        System.out.println("Juan: " + edadJuan);
        System.out.println("Alberto: " + edadAlberto);
        System.out.println("Ana: " + edadAna);
        System.out.println("Mamá: " + edadMama);
    }
}
