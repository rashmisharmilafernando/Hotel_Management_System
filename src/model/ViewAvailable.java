package model;

public class ViewAvailable {
    private  String  roomtype;
    private  int  roomNo;
    private String checkIndate;
    private  String chechoutdate;

    public ViewAvailable(String roomtype, int roomNo, String checkIndate, String chechoutdate) {
        this.roomtype = roomtype;
        this.roomNo = roomNo;
        this.checkIndate = checkIndate;
        this.chechoutdate = chechoutdate;
    }

    public String getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(String roomtype) {
        this.roomtype = roomtype;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public String getCheckIndate() {
        return checkIndate;
    }

    public void setCheckIndate(String checkIndate) {
        this.checkIndate = checkIndate;
    }

    public String getChechoutdate() {
        return chechoutdate;
    }

    public void setChechoutdate(String chechoutdate) {
        this.chechoutdate = chechoutdate;
    }
}
