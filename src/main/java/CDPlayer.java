public class CDPlayer extends Component{

    private int numberOfCds;

    public CDPlayer(int volume, int numberofCds){
        super(volume);
        this.numberOfCds = numberofCds;
    }

    public int getNumberOfCds() {
        return this.numberOfCds;
    }

}
