import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class JazzBandTest {

    JazzBand theBand;

    @BeforeEach
    public void setUp(){
        theBand = new JazzBand("the band", 6, false);
    }

    @Test
    public void canSmoothJazz(){
        //
        assertThat(theBand.playSmooth()).isEqualTo("Sorry, this band isn't smooth enough...");
        //Check Alternate Option
        theBand.setSmoothJazz(true);
        theBand.getSmoothJazz();
        assertThat(theBand.playSmooth()).isEqualTo("🎷 Smooth Jazz...");
    }

    @Test
    public void canReleaseAlbum(){
        String result = theBand.perform("Ornithology", 5.4);
        assertThat(result).isEqualTo("the band performed Ornithology for 5.4 minutes");
    }



}
