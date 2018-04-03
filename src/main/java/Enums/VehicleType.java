package Enums;

public enum VehicleType {
    TANK("Tank",250),
    JEEP("Jeep",75);

    private final Integer initialHealth;
    private final String vehicleTypeString;

    private VehicleType(String vehicleTypeString, Integer initialHealth) {
        this.vehicleTypeString = vehicleTypeString;
        this.initialHealth = initialHealth;
    }

    public String getVehicleTypeString(){
        return this.vehicleTypeString;
    }

    public Integer getInitialHealth(){
        return this.initialHealth;
    }

}
