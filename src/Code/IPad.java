/**
 * IPod class that keeps track of an IPod's functions
 * @author Alex He
 * @author Nikolay Makarenko
 * @version 1.0
 */
public class IPad extends IDevice{

    final private boolean hasCase;
    final private String OSVersion ;

    final static String deviceType = "IPad";
    final static String purpose = "learning";

    /**
     * Constructor for Ipod
     * @param hasCase number of songs this device has as an int
     * @param OSVersion volume in db as an int
     */
    public IPad(final boolean hasCase,
                final String OSVersion){
        super(purpose);
        this.hasCase = hasCase;
        this.OSVersion = OSVersion;

    }

    /**
     * Prints out the details of the device
     */
    @Override
    public void printDetails() {
        final StringBuilder str;

        str = new StringBuilder();

        str.append("This device is an " + deviceType +
                "Currently using" + OSVersion + "." +
                "Does this have a case? " + hasCase);
    }

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
