public class GeographicLocation {
    public static void main(Strings [] args) {
    String city;
    double longitude;
    double latitude;

    public GeographicLocation(String City, double Longitude, double Latitude)
    {
        this.city = city;
        this.longitude = longitude;
        this.latitude = latitude;
    }
    public void setLocation(String theCity)
    {
        city = theCity.trim();

    }
    public String getLocation()
    {
        return city;
    }

    void setLongitude(double long1)
    {
        this.longitude = longitude;

    }
    public double getLongitude()
    {
        return longitude;
    }

    public void setLatitude(double lat1)
    {
        this.latitude = latitude;
    }
    public String getlatitude()
    {
        return latitude;
    }
    public double getDistance(GeographicLocation location) {
        return Math.sqrt(
                Math.pow(longitude - location.longitude, 2) +
                    Math.pow(latitude - location.latitude, 2)
        );
    }
    public getDirection(GeographicLocation location)
    double dirLongitude = longitude - location.longitude;
    double dirLatitude = latitude - location.latitude;


}
}
