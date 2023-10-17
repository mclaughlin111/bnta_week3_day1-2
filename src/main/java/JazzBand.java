import interfaces.Perform;

public class JazzBand extends Ensemble implements Perform {

    private boolean smoothJazz;

    // constructor
    public JazzBand(String name, int members, boolean smoothJazz){
        super(name, members);
        // Super invokes the parent abstract class constructor
        this.smoothJazz = smoothJazz;
    }

    //smooth jazz method
    public String playSmooth() {
        if (this.smoothJazz == true) {
            return "🎷 Smooth Jazz...";
        } else {
            return "Sorry, this band isn't smooth enough...";
        }
    }

    //smooth jazz setter
    public void setSmoothJazz(boolean smoothJazz) {
        this.smoothJazz = smoothJazz;
    }

    public boolean getSmoothJazz() {
        return smoothJazz;
    }

    public String perform(String songTitle, double songLength){
        return this.name + " performed " + songTitle + " for " + songLength + " minutes";
    }

    @Override
    public String releaseAlbum(){
        return "We are " + this.name + "and this is our Jazz Album";
    }
}
