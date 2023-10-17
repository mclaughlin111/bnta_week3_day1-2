import java.util.ArrayList;

public class RecordLabel {

    private ArrayList<Ensemble> ensembles;

    public RecordLabel(){
        this.ensembles = new ArrayList<>();
    }

    public int countEnsembles(){return this.ensembles.size();}

    public void addEnsemble(Ensemble ensembleAdd) {
        this.ensembles.add(ensembleAdd);
    }




}
