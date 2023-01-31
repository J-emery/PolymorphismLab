public abstract class Media implements Interface {

    protected String title;
    protected String creator;
    protected boolean copyright;

    public Media(String title,String creator){
        this.title = title;
        this.creator = creator;
        this.copyright = false;
    }

    //implementing interface
    public String content(){
        return "This is what is in the bit of Media";
    }

    //CopyRight Method
    public void copyRightMedia(Media media,CopyRightLibrary lib){
        lib.addMedia(media);
        media.copyright = true;
    }

    //abstract class to publish
    public abstract String publish(String string);

    //Getters

    public String getCreator() {
        return creator;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCopyright() {
        return copyright;
    }
}
