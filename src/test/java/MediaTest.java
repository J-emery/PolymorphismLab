import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MediaTest {
    CopyRightLibrary library = new CopyRightLibrary("Ealing Library");
    Film lordOfTheRings = new Film("The Lord Of The Rings","J.R.R.Tolkien",682,"Elijah Wood");
    Book theHobbit = new Book("The Hobbit","J.R.R.Tolkien",304,"Fantasy");

    @Test
    public void canPublishFilm(){
        assertThat(lordOfTheRings.getStudio()).isEqualTo(null);
        lordOfTheRings.publish("New Line Cinema");
        assertThat(lordOfTheRings.getStudio()).isEqualTo("New Line Cinema");
        assertThat(lordOfTheRings.publish("New Line Cinema")).isEqualTo("The Lord Of The Rings has been released in Cinemas near you!");
    }
    @Test
    public void canPublishBook(){
        assertThat(theHobbit.getPublisher()).isEqualTo(null);
        theHobbit.publish("whoever");
        assertThat(theHobbit.getPublisher()).isEqualTo("whoever");
        assertThat(theHobbit.publish("je")).isEqualTo("The Hobbit has been released in Book shops near you!");
    }

}
