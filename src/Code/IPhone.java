import java.util.Objects;

/**
 * IPad class that keeps track of an IPad's functions
 * @author Alex He
 * @author Nikolay Makarenko
 * @version 1.0
 */
class IPhone extends IDevice{

    final private double minutesRemaining;
    final private String phoneCarrier;

    final static String deviceType  = "IPhone";
    final static String purpose     = "talking";

    /**
     * Constructor for Iad
     * @param minutesRemaining Determines whether the Ipad has a case
     * @param phoneCarrier OS version that this Ipad has
     */
    public IPhone(final double minutesRemaining,
                  final String phoneCarrier) {
        super(purpose);
        this.minutesRemaining = minutesRemaining;
        this.phoneCarrier = phoneCarrier;
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
                "Remaining minutes: " + minutesRemaining + "." +
                "Carrier company this phone is with: " + phoneCarrier);
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

    public String getPhoneCarrier() {
        return phoneCarrier;
    }

    public double getMinutesRemaining() {
        return minutesRemaining;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public String getPurpose() {
        return purpose;
    }


}
