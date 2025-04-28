package study.service;


import study.enity.NhanVien;
import study.repository.INhanVienRepository;
import study.repository.NhanVienRepository;
import java.util.List;

public class NhanVienService implements INhanVienService {
    private static final INhanVienRepository nhanVienRepository = new NhanVienRepository();

    @Override
    public void edit(NhanVien nhanVien, String maNV) {
        List<NhanVien> nhanVienList = nhanVienRepository.findAll();
        boolean flag = false;
        for (int i = 0; i <nhanVienList.size(); i++) {
            if (nhanVienList.get(i).getMa().equals(maNV)) {
                nhanVienRepository.edit(nhanVien, maNV);
                System.out.println("đổi thành công ");
                flag = true;
                break;
            }
        }
        if(!flag){
            System.out.println("không tìm thấy mã khách hàng ");
        }
    }

    @Override
    public List<NhanVien> findAll() {
        return nhanVienRepository.findAll();
    }

    @Override
    public void add(NhanVien nhanVien) {
        nhanVienRepository.add(nhanVien);
    }
}
