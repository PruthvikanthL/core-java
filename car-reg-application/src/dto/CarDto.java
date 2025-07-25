package dto;

public class CarDto {
    private String carname;
    private String regnumber;
    private String location;

    public void setCarname(String carname) {
        this.carname = carname;
    }

    public void setRegnumber(String regnumber) {
        this.regnumber = regnumber;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCarname() {
        return carname;
    }

    public String getRegnumber() {
        return regnumber;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "CarDto{" +
                "carname='" + carname + '\'' +
                ", regnumber='" + regnumber + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
