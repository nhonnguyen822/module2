package study.enity;

import study.common.KieuThue;

import java.util.Objects;

public class Room extends Facility {
    private String dichVuMienPhi;

    public Room() {
    }

    public Room(String dichVuMienPhi) {
        this.dichVuMienPhi = dichVuMienPhi;
    }

    public Room(String maDV, String tenDV, double dienTichSuDung, int chiPhiThue, int soLuongNguoiToiDa, KieuThue kieuThue, String dichVuMienPhi) {
        super(maDV, tenDV, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue);
        this.dichVuMienPhi = dichVuMienPhi;
    }

    public String getDichVuMienPhi() {
        return dichVuMienPhi;
    }

    public void setDichVuMienPhi(String dichVuMienPhi) {
        this.dichVuMienPhi = dichVuMienPhi;
    }

    @Override
    public String toString() {
        return "Room{" +
                super.toString()+
                "dichVuMienPhi='" + dichVuMienPhi + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Room room = (Room) object;
        return Objects.equals(dichVuMienPhi, room.dichVuMienPhi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), dichVuMienPhi);
    }
}
