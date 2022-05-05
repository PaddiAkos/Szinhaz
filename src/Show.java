import java.util.Arrays;

public class Show {
        private Play play;
        private Actors actors;


        public Play getPlay() {
            return play;
        }

        public void setPlay(Play play) {
            this.play = play;
        }

        public Actors getActors() {
            return actors;
        }

        public void setActors(Actors actors) {
            this.actors = actors;
        }

        public Show(Play play, Actors actors) {
            this.play = play;
            this.actors = actors;

        }

        public String[] getRoleActor() {
            String[] roleActors = new String[play.getSzereplok().length];
            for (int i = 0; i < play.getSzereplok().length; i++) {
                roleActors[i] = play.getSzereplok()[i] + "---" + actors.getActors()[i];
            }
            return roleActors;
        }
    @Override
    public String toString() {
        return "Show{" +
                "play=" + play.toString() +
                ", actors=" + actors.toString() +
                '}';
    }
}






