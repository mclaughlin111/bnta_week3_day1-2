public abstract class Ensemble {

    public String name;
    public int members;

    public Ensemble(String name, int members){
        this.name = name;
        this.members = members;
    }

    public String introduce(){
        return "Our name is " + this.name + " and we are a group of " + this.members;
    }

    public String releaseAlbum(String albumName, int tracks){
        return albumName + " with " + tracks + " tracks";
    }

    public abstract String releaseAlbum();

}
