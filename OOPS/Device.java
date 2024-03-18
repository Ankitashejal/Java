
class Device {
    private String deviceName;

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceName() {
      
        return this.deviceName + " is a Device";
    }
}


class Bulb extends Device {
    public static void main(String[] args) {
        Device device = new Bulb();

        System.out.println("Device name is Bulb");
        device.setDeviceName("Bulb");
        System.out.println(device.getDeviceName());
    }
}
