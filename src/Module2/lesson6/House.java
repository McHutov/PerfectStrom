package Module2.lesson6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class House {
    private int id;
    private int apartmentNumber;
    private int area;
    private int floor;
    private int numberOfRooms;
    private String street;
    private String buildingType;
    private int lifeTime;
    private static final Scanner s = new Scanner(System.in);

    public House(){}

    public House(int apartmentNumber, int area, int numberOfRooms){
        this.apartmentNumber = apartmentNumber;
        this.area = area;
        this.numberOfRooms = numberOfRooms;
    }

    public House(int id, int apartmentNumber, int area, int floor, int numberOfRooms, int lifeTime){
        this.id = id;
        this.apartmentNumber = apartmentNumber;
        this.area = area;
        this.floor = floor;
        this.numberOfRooms = numberOfRooms;
        this.lifeTime = lifeTime;
    }

    public House(int id, int apartmentNumber, int area, int floor, int numberOfRooms, String street, String buildingType, int lifeTime) {
        this.id = id;
        this.apartmentNumber = apartmentNumber;
        this.area = area;
        this.floor = floor;
        this.numberOfRooms = numberOfRooms;
        this.street = street;
        this.buildingType = buildingType;
        this.lifeTime = lifeTime;
    }

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", apartmentNumber=" + apartmentNumber +
                ", area=" + area +
                ", floor=" + floor +
                ", numberOfRooms=" + numberOfRooms +
                ", street='" + street + '\'' +
                ", buildingType='" + buildingType + '\'' +
                ", lifeTime=" + lifeTime +
                '}';
    }

    public static void sortByFloors(House[] houses){
        System.out.print("Enter floor:");
        int a = s.nextInt();
        int i = 0;
        System.out.println("All apartments on the " + a + "floor:");
        for (House house: houses) {
            if(a == house.floor){
                System.out.println(house);
                i++;
            }
        }
        if(i == 0){
            System.out.println("Sry, but all apartments on the " + a + "are occupied" );
        }
    }

    public static void sortByNumberOfRooms(House[] houses){
        Arrays.sort(houses, Comparator.comparing(House::getNumberOfRooms));
    }

    public static void listByGivenRooms(House[] houses){
        System.out.println("Enter number of rooms: ");
        int a = s.nextInt();
        int i = 0;
        System.out.println("List of apartments: ");
        for (House house: houses) {
            if(a == house.numberOfRooms){
                System.out.println(house);
                i++;
            }
        }
        if(i == 0){
            System.out.println("Sry, but there are no apartments with so many rooms!");
        }


    }

    public static  void listByNumberFloor(House[] houses){
        System.out.print("Enter the number of rooms: ");
        int rooms = s.nextInt();
        System.out.print("Enter the floor: ");
        int floor = s.nextInt();
        int i = 0;
        for (House h: houses) {
            if(rooms == h.numberOfRooms && floor == h.floor){
                System.out.println(h);
                i++;
            }
        }
        if(i == 0){
            System.out.println("Sry, but there are no apartments with this parameters");
        }

    }

    public static void listByArea(House[] houses){
        System.out.println("Enter area: ");
        int area = s.nextInt();
        int i = 0;
        for (House house: houses) {
            if(area < house.area){
                System.out.println(house);
                i++;
            }
        }

        if(i == 0){
            System.out.println("Sry, but there are no apartments with this kind of area!");
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(String buildingType) {
        this.buildingType = buildingType;
    }

    public int getLifeTime() {
        return lifeTime;
    }

    public void setLifeTime(int lifeTime) {
        this.lifeTime = lifeTime;
    }
}
