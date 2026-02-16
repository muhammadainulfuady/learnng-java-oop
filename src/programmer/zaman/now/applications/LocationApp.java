package programmer.zaman.now.applications;

import programmer.zaman.now.data.*;

public class LocationApp {
    public static void main(String[] args) {
        // var location = new Location(); // eror
        var city = new City();
        city.name = "Gresik";
        System.out.println("City    : " + city.name);
    }
}