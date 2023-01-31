import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class LibraryTest {
    CopyRightLibrary library = new CopyRightLibrary("Ealing Library");
    Film lordOfTheRings = new Film("The Lord Of The Rings","J.R.R.Tolkien",682,"Elijah Wood");
    Book theHobbit = new Book("The Hobbit","J.R.R.Tolkien",304,"Fantasy");

    @Test
    void canGetStock(){
        assertThat(library.getStock().size()).isEqualTo(0);
    }

    @Test
    void canAddStock(){
        assertThat(library.getStock().size()).isEqualTo(0);
        library.addMedia(lordOfTheRings);
        library.addMedia(theHobbit);
        assertThat(library.getStock().size()).isEqualTo(2);
    }

}
