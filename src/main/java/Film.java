public class Film extends Media implements Interface {

    private int runTime;
    private String mainStar;
    private String studio;
    private boolean wonOscar;

    public Film(String title,String creator, int runTime, String mainStar){
        super(title,creator);
        this.runTime = runTime;
        this.mainStar = mainStar;
        this.wonOscar = false;
    }

    //Extending media with publishing

    public String publish(String studio){
        this.studio = studio;
        return this.title +" has been released in Cinemas near you!";
    }

    //Win oscar

    public String awardOscar(){
        this.wonOscar = true;
        return this.title + " has won an Oscar!";
    }

    public String awardOscar(int number){
        this.wonOscar = true;
        return this.title + " has won " + number + " Oscars!";
    }

    //Getters

    public boolean isWonOscar() {
        return wonOscar;
    }

    public int getRunTime() {
        return runTime;
    }

    public String getMainStar() {
        return mainStar;
    }

    public String getStudio() {
        return studio;
    }
}
