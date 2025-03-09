class Light {
    boolean isOn;

    void switchOn() {
        isOn = true;
        System.out.println("Light is switched on.");
    }

    void switchOff() {
        isOn = false;
        System.out.println("Light is switched off.");
    }

    void checkStatus() {
        System.out.println("Light is " + (isOn ? "on" : "off"));
    }

    public static void main(String[] args) {
        Light light = new Light();
        light.switchOn();
        light.checkStatus();
        light.switchOff();
        light.checkStatus();
    }
}