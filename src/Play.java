import java.util.Arrays;

public class Play {

        private String stagePlay;
        private String actorCrew;
        private int Actors;
        private String[] szereplok;


public Play(String stagePlay, String actorCrew, int Actors, String[] szereplok){}


        public String[] getSzereplok() {
            return szereplok;
        }

        public void setSzereplok(String[] szereplok) {
            this.szereplok = szereplok;
        }

        public String getStagePlay() {
            return stagePlay;
        }

        public void setStagePlay(String stagePlay) {
            this.stagePlay = stagePlay;
        }

        public String getActorCrew() {
            return actorCrew;
        }

        public void setActorCrew(String actorCrew) {
            this.actorCrew = actorCrew;
        }


    @Override
    public String toString() {
        return "Play{" +
                "stagePlay='" + stagePlay + '\'' +
                ", actorCrew='" + actorCrew + '\'' +
                ", Actors=" + Actors+
                ", szereplok=" + Arrays.toString(szereplok) +
                '}';
    }
}





