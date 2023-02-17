package model;

public class QuadRoom {
    private  int  roomNo;
    private   String status;

    public QuadRoom(int roomNo, String status) {
        this.roomNo = roomNo;
        this.status = status;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
