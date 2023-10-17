public class Choir extends Ensemble {

    public Choir(String name, int members) {
        super(name, members);
    }

    public String sing(){
        return "😮 aaaaaaah";
    }

    @Override
    public String releaseAlbum(){
            return "We are " + this.name + "and this is our Choral Album";
        }
    }



