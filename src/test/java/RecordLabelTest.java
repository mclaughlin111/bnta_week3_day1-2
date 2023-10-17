import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class RecordLabelTest {

    RecordLabel tomsRecords;

    @BeforeEach
    void setUp() {
        tomsRecords = new RecordLabel();
    }

    // Test Array Size Count
    @Test
    void canCountEnsembles() {
        assertThat(tomsRecords.countEnsembles()).isEqualTo(0);
    }


    // Test Array Addition Method
    @Test
    void canAddEnsemble() {
        Ensemble tomsTestGroup = new Orchestra("Tom's People", 23, false, "Tom");
        tomsRecords.addEnsemble(tomsTestGroup);
        assertThat(tomsRecords.countEnsembles()).isEqualTo(1);
    }


}
