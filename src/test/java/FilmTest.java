import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FilmTest {
    Film lordOfTheRings = new Film("The Lord Of The Rings","J.R.R.Tolkien",682,"Elijah Wood");

    @Test
    void canGetOscar(){
        assertThat(lordOfTheRings.isWonOscar()).isEqualTo(false);
    }

    @Test
    void canWinOscar__noArgument(){
        lordOfTheRings.awardOscar();
        assertThat(lordOfTheRings.isWonOscar()).isEqualTo(true);
    }
    @Test
    void canWinOscar__wInt(){
        String actual = lordOfTheRings.awardOscar(17);
        assertThat(actual).isEqualTo(lordOfTheRings.getTitle()+" has won 17 Oscars!");
        assertThat(lordOfTheRings.isWonOscar()).isEqualTo(true);
    }
    @Test
    void canContent(){
        assertThat(lordOfTheRings.content()).isEqualTo("This is what is in the bit of Media");
    }
}
