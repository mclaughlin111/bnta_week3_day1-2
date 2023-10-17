public class Orchestra extends Ensemble {

    private Boolean chamber;
    private String conductorName;

    public Orchestra(String name, int members, Boolean chamber, String conductorName) {
        super(name, members);
        this.chamber = chamber;
        this.conductorName = conductorName;
    }

    public String introduce(){
        return "We are an Orchestra called " + this.name + " and we have " + this.members + " members";
    }

    public String introduce(String conductor){
        return "We are an Orchestra called " + this.name + " and we have " + this.members + " members " + "and the conductors name is " + conductor;
    }


    public Boolean getChamber() {
        return chamber;
    }

    public String getConductorName() {
        return conductorName;
    }

    @Override
    public String releaseAlbum(){
        return "We are " + this.name + "and this is our Orchestral Album";
    }
}
