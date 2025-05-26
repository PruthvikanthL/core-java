class Rocket {
    String name;
    String manufacturer;
    String country;
    int launchYear;
    boolean isReusable;
    int stages;
    int height;
    int weight;
    float thrust;
    String fuelType;
    int maxPayload;
    boolean hasCrew;
    int maxSpeed;
    boolean usedForSatelliteLaunch;
    boolean usedForMission;
    boolean hasEscapeSystem;
    String launchSite;
    boolean successInLastLaunch;
    int totalLaunches;
    int successfulLaunches;

    public Rocket(String name,String manufacturer,String country,int launchYear,boolean isReusable,int stages,
                  int height,int weight,float thrust,String fuelType,int maxPayload,boolean hasCrew,int maxSpeed, 
                  boolean usedForSatelliteLaunch,boolean usedForMission,boolean hasEscapeSystem,String launchSite, 
                  boolean successInLastLaunch,int totalLaunches,int successfulLaunches) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.country = country;
        this.launchYear = launchYear;
        this.isReusable = isReusable;
        this.stages = stages;
        this.height = height;
        this.weight = weight;
        this.thrust = thrust;
        this.fuelType = fuelType;
        this.maxPayload = maxPayload;
        this.hasCrew = hasCrew;
        this.maxSpeed = maxSpeed;
        this.usedForSatelliteLaunch = usedForSatelliteLaunch;
        this.usedForMission = usedForMission;
        this.hasEscapeSystem = hasEscapeSystem;
        this.launchSite = launchSite;
        this.successInLastLaunch = successInLastLaunch;
        this.totalLaunches = totalLaunches;
        this.successfulLaunches = successfulLaunches;
    }    

    public void display() {
        System.out.println("Rocket Name is"+name);
        System.out.println("Manufacturer is"+manufacturer);
        System.out.println("Country is"+country);
        System.out.println("Launch Year is"+launchYear);
        System.out.println("Is Reusable is"+isReusable);
        System.out.println("Stages is"+stages);
        System.out.println("Height is"+height);
        System.out.println("Weight is"+weight);
        System.out.println("Thrust is"+thrust);
        System.out.println("Fuel Type is"+fuelType);
        System.out.println("Max Payload is"+ maxPayload);
        System.out.println("Has Crew is"+hasCrew);
        System.out.println("Max Speed is"+ maxSpeed);
        System.out.println("Used for Satellite Launch is"+usedForSatelliteLaunch);
        System.out.println("Used for Missions is"+usedForMission);
        System.out.println("Has Escape System is"+hasEscapeSystem);
        System.out.println("Launch Site is"+launchSite);
        System.out.println("Success in Last Launch is"+successInLastLaunch);
        System.out.println("Total Launches is"+totalLaunches);
        System.out.println("Successful Launches is"+successfulLaunches);
        System.out.println("\n");
    }
}
