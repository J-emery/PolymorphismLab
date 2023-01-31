public class Book extends Media implements Interface{

    private int pages;
    private String category;
    private String publisher;

    public Book(String title, String creator,int pages,String category) {
        super(title, creator);
        this.pages = pages;
        this.category = category;
    }

    //Extending media with publishing

    public String publish(String publisher){
        this.publisher = publisher;
        return this.title +" has been released in Book shops near you!";
    }


    //Getters

    public int getPages() {
        return pages;
    }

    public String getCategory() {
        return category;
    }

    public String getPublisher() {
        return publisher;
    }

}
