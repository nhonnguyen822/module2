package study.repository;

import study.common.GioiTinh;
import study.common.LoaiKhachHang;
import study.common.ReadAndWriteDaTa;
import study.enity.KhachHang;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KhachHangRepository implements IKhachHangRepository {
    private static final String KHACH_HANG_FILE = "src/study/data/khach_hang.csv";
    private static final boolean APPEND = true;
    private static final boolean NOT_APPEND = false;

    public static List<String> convertToStringList(List<KhachHang> khachHangList) {
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < khachHangList.size(); i++) {
            stringList.add(khachHangList.get(i).convertToString());
        }
        return stringList;
    }


    @Override
    public List<KhachHang> findAll() {
        List<KhachHang> khachHangList = new ArrayList<>();
        List<String> stringList = ReadAndWriteDaTa.readFileCSV(KHACH_HANG_FILE);
        for (int i = 0; i < stringList.size(); i++) {
            String[] line = stringList.get(i).split(",");
            String ma = line[0];
            String ten = line[1];
            LocalDate ngaySinh = LocalDate.parse(line[2]);
            GioiTinh gioiTinh = GioiTinh.valueOf(line[3]);
            String soCMND = line[4];
            String soDT = line[5];
            String email = line[6];
            LoaiKhachHang loaiKH = LoaiKhachHang.valueOf(line[7]);
            String diaChi = line[8];
            khachHangList.add(new KhachHang(ma, ten, ngaySinh, gioiTinh, soCMND, soDT, email, loaiKH, diaChi));
        }
        return khachHangList;
    }

    @Override
    public void add(KhachHang khachHang) {
        List<KhachHang> khachHangList = findAll();
        khachHangList.add(khachHang);
        List<String> stringList = convertToStringList(khachHangList);
        ReadAndWriteDaTa.writeFileCSV(KHACH_HANG_FILE, stringList, APPEND);
    }

    @Override
    public void edit(KhachHang khachHang, String maKH) {
        List<KhachHang> khachHangList = findAll();
        for (int i = 0; i < khachHangList.size(); i++) {
            if (khachHangList.get(i).getMa().equals(maKH)) {
                khachHangList.get(i).setTen(khachHang.getTen());
                khachHangList.get(i).setNgaySinh(khachHang.getNgaySinh());
                khachHangList.get(i).setGioiTinh(khachHang.getGioiTinh());
                khachHangList.get(i).setSoCMND(khachHang.getSoCMND());
                khachHangList.get(i).setSoDT(khachHang.getSoDT());
                khachHangList.get(i).setEmail(khachHang.getEmail());
                khachHangList.get(i).setLoaiKH(khachHang.getLoaiKH());
                khachHangList.get(i).setDiaChi(khachHang.getDiaChi());
                break;
            }
        }
        List<String> stringList = convertToStringList(khachHangList);
        ReadAndWriteDaTa.writeFileCSV(KHACH_HANG_FILE, stringList, NOT_APPEND);
    }
}



