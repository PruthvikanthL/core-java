class Satellites {
    String name;
    String country;
    String type;
    int launchYear;
    boolean isOperational;
    int orbitHeight;
    String orbitType;
    boolean isMilitary;
    int weight;
    int lifespan;
    String manufacturer;
    boolean hasSolarPanels;
    int communicationBands;
    boolean isGeoStationary;
    boolean usedForWeatherMonitoring;
    boolean usedForNavigation;
    boolean usedForResearch;
    boolean usedForEarthObservation;
    String launchVehicle;
    String launchSite;

    public Satellites(String name, String country, String type, int launchYear, boolean isOperational, int orbitHeight, 
                     String orbitType, boolean isMilitary, int weight, int lifespan, String manufacturer, 
                     boolean hasSolarPanels, int communicationBands, boolean isGeoStationary, boolean usedForWeatherMonitoring, 
                     boolean usedForNavigation, boolean usedForResearch, boolean usedForEarthObservation, 
                     String launchVehicle, String launchSite) {
        this.name = name;
        this.country = country;
        this.type = type;
        this.launchYear = launchYear;
        this.isOperational = isOperational;
        this.orbitHeight = orbitHeight;
        this.orbitType = orbitType;
        this.isMilitary = isMilitary;
        this.weight = weight;
        this.lifespan = lifespan;
        this.manufacturer = manufacturer;
        this.hasSolarPanels = hasSolarPanels;
        this.communicationBands = communicationBands;
        this.isGeoStationary = isGeoStationary;
        this.usedForWeatherMonitoring = usedForWeatherMonitoring;
        this.usedForNavigation = usedForNavigation;
        this.usedForResearch = usedForResearch;
        this.usedForEarthObservation = usedForEarthObservation;
        this.launchVehicle = launchVehicle;
        this.launchSite = launchSite;
    }

    public void display() {
        System.out.println("Satellite Name is\t"+name);
        System.out.println("Country is\t"+country);
        System.out.println("Type is\t"+type);
        System.out.println("Launch Year is\t"+launchYear);
        System.out.println("Is Operational is\t"+isOperational);
        System.out.println("Orbit Height is\t"+orbitHeight);
        System.out.println("Orbit Type is\t"+orbitType);
        System.out.println("Is Military is\t"+isMilitary);
        System.out.println("Weight is\t"+weight);
        System.out.println("Lifespan is\t" +lifespan);
        System.out.println("Manufacturer is\t"+manufacturer);
        System.out.println("Has Solar Panels is\t"+hasSolarPanels);
        System.out.println("Communication Bands is\t"+communicationBands);
        System.out.println("Is Geostationary is\t"+isGeoStationary);
        System.out.println("Used for Weather Monitoring is\t"+usedForWeatherMonitoring);
        System.out.println("Used for Navigation is\t"+usedForNavigation);
        System.out.println("Used for Research is\t"+usedForResearch);
        System.out.println("Used for Earth Observation is\t"+usedForEarthObservation);
        System.out.println("Launch Vehicle is\t"+launchVehicle);
        System.out.println("Launch Site is\t"+launchSite);
        System.out.println("\n");
    }
}
