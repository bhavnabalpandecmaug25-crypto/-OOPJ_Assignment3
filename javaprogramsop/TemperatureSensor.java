class TemperatureSensor {
    
    private int temperature;

    public void setTemperature(int t) {
        if (t >= 0 && t <= 100) {
            this.temperature = t;
        } else {
            System.out.println("Temperature out of range");
        }
    }

    
    public int getTemperature() {
        return temperature;
    }

    
    public static void main(String[] args) {
        TemperatureSensor sensor = new TemperatureSensor();

        sensor.setTemperature(-5); 
        System.out.println("Current Temperature = " + sensor.getTemperature());

        sensor.setTemperature(25);  
        System.out.println("Current Temperature = " + sensor.getTemperature());
    }
}