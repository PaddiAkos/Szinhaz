import java.util.Arrays;

public class Actors {


    private String[] actors;

    public String[] getActors() {
        return actors;
    }

    public void setActors(String[] actors) {
        this.actors = actors;
    }

    public Actors(String[] strings) {
    }


    public class Actors1 {
        private String[] actors;

        public String[] getActors() {
            return actors;
        }

        public Actors1(String[] actors) {
            this.actors = actors;
        }

        public void setActors(String[] actors) {
            this.actors = actors;
        }
        }
    @Override
    public String toString() {
        return "Actors{" +
                "actors=" + Arrays.toString(actors) +
                '}';
    }
}




