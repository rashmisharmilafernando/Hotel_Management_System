package tm;

import javafx.scene.control.Button;

public class RommTM {
    private String  typeOfRoom;
    private int roomNumber;
    private String status;
    private  double price;

    public RommTM(String typeOfRoom,  int roomNumber,String status, double price) {
        this.typeOfRoom = typeOfRoom;
        this.roomNumber = roomNumber;
        this.status = status;
        this.price=price;

    }

    public String getTypeOfRoom() {
        return typeOfRoom;
    }

    public void setTypeOfRoom(String typeOfRoom) {
        this.typeOfRoom = typeOfRoom;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
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
