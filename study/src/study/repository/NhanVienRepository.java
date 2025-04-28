package study.repository;

import study.common.GioiTinh;
import study.common.ReadAndWriteDaTa;
import study.common.TrinhDo;
import study.common.ViTri;
import study.enity.NhanVien;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class NhanVienRepository implements INhanVienRepository {
    private static final String NHAN_VIEN_FILE = "src/study/data/khach_hang.csv";
    private static final boolean APPEND = true;
    private static final boolean NOT_APPEND = false;

    public static List<String> convertToStringList(List<NhanVien> nhanVienList) {
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < nhanVienList.size(); i++) {
            stringList.add(nhanVienList.get(i).convertToString());
        }
        return stringList;
    }

    @Override
    public void edit(NhanVien nhanVien, String maNV) {
        List<NhanVien> nhanVienList = findAll();
        for (int i = 0; i < nhanVienList.size(); i++) {
            if (nhanVienList.get(i).getMa().equals(maNV)) {
                nhanVienList.get(i).setTen(nhanVien.getTen());
                nhanVienList.get(i).setNgaySinh(nhanVien.getNgaySinh());
                nhanVienList.get(i).setGioiTinh(nhanVien.getGioiTinh());
                nhanVienList.get(i).setSoCMND(nhanVien.getSoCMND());
                nhanVienList.get(i).setSoDT(nhanVien.getSoDT());
                nhanVienList.get(i).setEmail(nhanVien.getEmail());
                nhanVienList.get(i).setTrinhDo(nhanVien.getTrinhDo());
                nhanVienList.get(i).setViTri(nhanVien.getViTri());
                nhanVienList.get(i).setLuong(nhanVien.getLuong());
                break;
            }
        }
        List<String> stringList = convertToStringList(nhanVienList);
        ReadAndWriteDaTa.writeFileCSV(NHAN_VIEN_FILE, stringList, NOT_APPEND);
    }

    @Override
    public List<NhanVien> findAll() {
        List<NhanVien> nhanVienList = new ArrayList<>();
        List<String> stringList = ReadAndWriteDaTa.readFileCSV(NHAN_VIEN_FILE);
        for (int i = 0; i < stringList.size(); i++) {
            String[] line = stringList.get(i).split(",");
            String ma = line[0];
            String ten = line[1];
            LocalDate ngaySinh = LocalDate.parse(line[2]);
            GioiTinh gioiTinh = GioiTinh.valueOf(line[3]);
            String soCMND = line[4];
            String soDT = line[5];
            String email = line[6];
            TrinhDo trinhDo = TrinhDo.valueOf(line[7]);
            ViTri viTri = ViTri.valueOf(line[8]);
            int luong = Integer.parseInt(line[9]);
            nhanVienList.add(new NhanVien(ma, ten, ngaySinh, gioiTinh, soCMND, soDT, email, trinhDo, viTri, luong));
        }
        return nhanVienList;
    }

    @Override
    public void add(NhanVien nhanVien) {
        List<NhanVien> nhanVienList = findAll();
        nhanVienList.add(nhanVien);
        List<String> stringList = convertToStringList(nhanVienList);
        ReadAndWriteDaTa.writeFileCSV(NHAN_VIEN_FILE, stringList, APPEND);
    }
}
