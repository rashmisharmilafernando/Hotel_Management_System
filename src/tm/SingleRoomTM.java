package tm;

import javafx.scene.control.Button;

public class SingleRoomTM {
    private  int  roomNo;
    private   String status;
    private Button  checkin;
    private  Button checkOut;

    public SingleRoomTM(int roomNo, String status, Button checkin, Button checkOut) {
        this.roomNo = roomNo;
        this.status = status;
        this.checkin = checkin;
        this.checkOut = checkOut;
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

    public Button getCheckin() {
        return checkin;
    }

    public void setCheckin(Button checkin) {
        this.checkin = checkin;
    }

    public Button getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Button checkOut) {
        this.checkOut = checkOut;
    }
}
