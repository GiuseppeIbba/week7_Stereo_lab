public class CassetteDeck extends Component{

    private int numberOfDoors;

    public CassetteDeck(int volume, int numberOfDoors){
        super(volume);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return this.numberOfDoors;
    }
}
