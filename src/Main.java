/**
 *
 * @author
 * NAMA     : Arsy Opraza Akma
 * KELAS    : IF1
 * NIM      : 10119001
 * Deskripsi Program: program menampilkan teks barang antik
 * ke layar berbasis OOP dan implementasi pewarisan.
 */

public class Main {
    public static void main(String[] args) {
        Radio radio = new Radio(234);
        radio.setName("Radio AM");

        System.out.println("Nama barang Antik : " + radio.getName());
        radio.tampilUmur();
    }
}
