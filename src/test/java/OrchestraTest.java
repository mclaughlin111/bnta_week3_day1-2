import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class OrchestraTest {
    Orchestra testorchestra;

    @BeforeEach
    void setUp() {testorchestra = new Orchestra("Test Orchestra", 50, false, "Test Conductor");}

    @Test
    void canIntroduce(){
        assertThat(testorchestra.introduce()).isEqualTo("We are an Orchestra called Test Orchestra and we have 50 members");
    }

@Test
    void canIntroduce__withArgument(){
    assertThat(testorchestra.introduce(testorchestra.getConductorName())).isEqualTo("We are an Orchestra called Test Orchestra and we have 50 members and the conductors name is Test Conductor");
}





}
