package BaseClasses;

import Enums.VehicleType;

abstract public class Vehicle {
    private String  vehicleTypeString;
    private Integer healthValue;
    private Enum vehicleType;
    private Integer attackValue;

    public Vehicle(VehicleType vehicleType, Integer attackValue){
        this.vehicleTypeString = vehicleType.getVehicleTypeString();
        this.healthValue = vehicleType.getInitialHealth();
        this.vehicleType = vehicleType;
        this.attackValue = attackValue;
    }

    public Integer getAttackValue() {
        return attackValue;
    }

    public void setAttackValue(Integer attackValue) {
        this.attackValue = attackValue;
    }

    public Enum getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(Enum vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Integer getHealthValue() {
        return healthValue;
    }

    public void setHealthValue(Integer healthValue) {
        this.healthValue = healthValue;
    }

    public String getVehicleTypeString() {
        return vehicleTypeString;
    }

    public void setVehicleTypeString(String vehicleTypeString) {
        this.vehicleTypeString = vehicleTypeString;
    }
}
