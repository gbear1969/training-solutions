package classstructureattributes;

import java.util.Scanner;

public class Music {
    public static void main(String[] args) {
        Song music = new Song();
        Scanner szkenner = new Scanner(System.in);
        System.out.println("Kérem, adja meg a kedvenc zeneszáma címét!");
        music.title = szkenner.nextLine();
        System.out.println("Kérem, adja meg a szám előadóját!");
        music.band = szkenner.nextLine();
        System.out.println("Kérem, adja meg a szám hosszát percben!");
        music.lenght = szkenner.nextInt();
        System.out.println("Kedvenc zeneszámának adatai:");
        System.out.println(music.band + " - " + music.title + " (" + music.lenght +" perc)");
    }

}
