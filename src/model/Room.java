package model;

import tm.RommTM;

public class Room  {
    private String  typeOfRoom;
    private int roomNumber;
    private String status;
    private  double price;

    public Room(String typeOfRoom, int roomNumber, String status,double price) {
        this.roomNumber = roomNumber;
        this.typeOfRoom = typeOfRoom;
        this.status = status;
        this.price=price;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getTypeOfRoom() {
        return typeOfRoom;
    }

    public void setTypeOfRoom(String typeOfRoom) {
        this.typeOfRoom = typeOfRoom;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
