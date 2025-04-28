package study.service;

import study.enity.KhachHang;
import study.repository.IKhachHangRepository;
import study.repository.KhachHangRepository;
import java.util.List;

public class KhachHangService implements IKhachHangService {
    private static final IKhachHangRepository khachHangRepository = new KhachHangRepository();

    @Override
    public void edit(KhachHang khachHang, String maKH) {
        List<KhachHang> khachHangList = khachHangRepository.findAll();
        boolean flag = false;
        for (int i = 0; i < khachHangList.size(); i++) {
            if (khachHangList.get(i).getMa().equals(maKH)) {
                khachHangRepository.edit(khachHang, maKH);
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
    public List<KhachHang> findAll() {
        return khachHangRepository.findAll();
    }

    @Override
    public void add(KhachHang khachHang) {
        khachHangRepository.add(khachHang);
    }
}
