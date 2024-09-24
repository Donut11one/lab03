import java.util.Objects;

public class IPhone16 extends IPhone{
    private final boolean highResolutionCamera;
    private final int gbsOfMemory;

    public IPhone16(final double minutesRemaining, final String phoneCarrier, final boolean highResolutionCamera,
                    final int gbsOfMemory) {
        super(minutesRemaining, phoneCarrier);
        this.highResolutionCamera = highResolutionCamera;
        this.gbsOfMemory = gbsOfMemory;
    }

    @Override
    public void printDetails(){
        final StringBuilder str;

        str = new StringBuilder();
        super.printDetails();
        str.append("This phone has " + gbsOfMemory + " GBs of memory and " +
                (highResolutionCamera ? "high resolution camera" : "no high resolution camera"));
        System.out.println(str);

    }

    @Override
    public int hashCode(){
        return Objects.hashCode(highResolutionCamera);
    }

    //We are missing hashCode() override and there is no hashCode in parent class. We need to implement them

    @Override
    public boolean equals(final Object obj) {
        if (super.equals(obj) && this.highResolutionCamera == ((IPhone16)obj).highResolutionCamera) {
            return true;
        }
        return false;
    }

    public boolean getHighResolutionCamera() {
        return highResolutionCamera;
    }

    public int getGbsOfMemory() {
        return gbsOfMemory;
    }
}
