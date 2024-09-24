import java.util.Objects;

/**
 * IPod class that keeps track of an IPod's functions
 * @author Alex He
 * @author Nikolay Makarenko
 * @version 1.0
 */
class IPod extends IDevice{

    final private int numberOfSongs;
    final private double maxVolumeDB;

    final static String deviceType = "IPod";

    final static String purpose = "music";

    /**
     * Constructor for Ipod
     * @param numberOfSongs number of songs this device has as an int
     * @param maxVolume max volume in db as an int
     */
    public IPod(final int numberOfSongs,
                final double maxVolume){
        super(purpose);

        this.numberOfSongs  = numberOfSongs;
        this.maxVolumeDB = maxVolume;

    }

    /**
     * Prints out the details of the device
     */
    @Override
    public void printDetails() {
        final StringBuilder str;

        str = new StringBuilder();

        str.append("This device is an " + deviceType +
                    "This device is used for " + purpose +
                    "Has " + numberOfSongs +"number of songs."+
                    "A max volume of " + maxVolumeDB + "db.");
        System.out.println(str.toString());
    }

    @Override
    public int hashCode(){
        return Objects.hashCode(deviceType);
    }

    /**
     * Overrides the equals function
     * @param obj the object its comparing to
     * @return Returns true if its the same
     */
    @Override
    public boolean equals(Object obj){
        if(obj == null)
        {
            return false;
        }
        else if(!(obj.getClass().equals(this.getClass())))
        {
            return false;
        }
        else{
            return true;
        }
    }


}
