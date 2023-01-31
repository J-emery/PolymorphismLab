import java.util.ArrayList;

public class CopyRightLibrary {
    private String name;
    private ArrayList<Media> stock;

    public CopyRightLibrary(String name){
        this.name = name;
        this.stock = new ArrayList<>();
    }

    public void addMedia(Media media){
        stock.add(media);
    }



    //Getters

    public ArrayList<Media> getStock() {
        return stock;
    }

    public String getName() {
        return name;
    }
}
