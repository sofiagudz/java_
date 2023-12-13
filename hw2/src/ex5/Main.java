package ex5;

public class Main {
    public static void main(String[] args) {
        Violin violin = new Violin();
        violin.Show();
        violin.Sound();
        violin.Desc();
        violin.History();

        System.out.println();
        Trombone trombone = new Trombone();
        trombone.Show();
        trombone.Sound();
        trombone.Desc();
        trombone.History();

        System.out.println();
        Ukulele ukulele = new Ukulele();
        ukulele.Show();
        ukulele.Sound();
        ukulele.Desc();
        ukulele.History();

        System.out.println();
        Cello cello = new Cello();
        cello.Show();
        cello.Sound();
        cello.Desc();
        cello.History();
    }
}
