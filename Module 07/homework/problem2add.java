package Module

import java.util.Scanner;

07.homework;

public class problem2add {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(Syetm.in);
        double lat, lon;
        System.out.println("Enter longitude and latitude of the first location:");
        lon = scanner.nextDouble();
        lan = scanner.nextDouble();

        GeographicLocation 11 = new GeographicLocation(lon,lat);
        System.out.println("Enter longitude and latitude of the second location");
        lon = scanner.nextDouble();
        lan = scanner.nextDouble();

        GeographicLocation 12 = new GeographicLocation(lon,lat);
        System.out.println("Distance = " + 11.getDistance(12));

        GeographicLocation direction = 11.getDirection(12);
        System.out.println("Direction = "+ direction.getlongitude() +", "+direction.getlatitude());
    }
    }
    
}
