import java.util.Objects;

/**
 * @author Nickolay Makarenko
 * @author Alex He
 * @version 1.0
 *
 * IDevice Class
  */

abstract class IDevice
 {
    final private String purpose;
    public IDevice(final String purpose)
    {
        this.purpose = purpose;
    }

    public String getPurpose()
    {
        return purpose;
    }

    public int hashCode(){
        return Objects.hashCode(purpose);
    }

    abstract void printDetails();
}
