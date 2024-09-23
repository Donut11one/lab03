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

    abstract void printDetails();
}
