import java.util.Arrays;


public class Main {


    public static void main(String[] args) {
        Play play = new Play("Diótörő", "cukrok", 4, new String[]{"Feri", "Nagyapa", "Lujzi", "Diótörő herceg"});

        Actors actors = new Actors (new String[]{"Johnny Depp", "Robert Downey jr.", "Robert De Niro","Amber Heard"});

        Show show = new Show(play,actors);
        System.out.println(show.toString());


    }
}
