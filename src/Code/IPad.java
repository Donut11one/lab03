/**
 * IPad class that keeps track of an IPad's functions
 * @author Alex He
 * @author Nikolay Makarenko
 * @version 1.0
 */
class IPad extends IDevice{

    final private boolean hasCase;
    final private String OSVersion ;

    final static String deviceType = "IPad";
    final static String purpose = "learning";

    /**
     * Constructor for Iad
     * @param hasCase Determines whether the Ipad has a case
     * @param OSVersion The OS version that this Ipad has
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
                "This device is used for " + purpose +
                "Currently using" + OSVersion + "." +
                "Does this have a case? " + hasCase);
        System.out.println(str.toString());
    }

    /**
     * Overrides the equals function
     * @param obj the object its comparing to
     * @return Returns true if its the same
     */
    @Override
    public boolean equals(final Object obj){
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
