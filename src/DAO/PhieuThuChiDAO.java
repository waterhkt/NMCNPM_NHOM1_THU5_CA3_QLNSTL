package DAO;

import java.util.List;

import Model.PhieuThuChi;
import mapper.PhieuThuChiMapper;

public class PhieuThuChiDAO extends AbstractDAO implements GenericDAO<PhieuThuChi>{
	public List<PhieuThuChi>  findAll() {
		String sql ="select * from phieuthuchi";
		return query(sql, new PhieuThuChiMapper());
	}
	public PhieuThuChi findByMaPhieu(String maPhieu) {
		String sql ="select * from phieuthuchi where maPhieu=?" ;
		return query(sql, new PhieuThuChiMapper(),maPhieu).isEmpty()?null:query(sql, new PhieuThuChiMapper(),maPhieu).get(0);
	}
	@Override
	public boolean add(PhieuThuChi t) {
		String sql ="INSERT INTO `phieuthuchi`(`maPhieu`, `tenChuPhieu`, `loaiPhieu`, `diaChi`, `lyDo`, `thoiGian`, `tien`) VALUES (?,?,?,?,?,?,?)";
		return update(sql, t.getMaPhieu(),t.getTenChuPhieu(),t.getLoaiPhieu(),t.getDiaChi(),t.getLyDo(),t.getThoiGian(),t.getTien());
	}

	@Override
	public boolean delete(PhieuThuChi t) {
		String sql ="DELETE FROM `phieuthuchi` WHERE `maPhieu`=?";
		return update(sql, t.getMaPhieu());
	}

	@Override
	public boolean update(PhieuThuChi t) {
		String sql="UPDATE `phieuthuchi` SET `tenChuPhieu`=?,`loaiPhieu`=?,`diaChi`=?,`lyDo`=?,`thoiGian`=?,`tien`=? WHERE `maPhieu`=?";
		return 	update(sql,t.getTenChuPhieu(),t.getLoaiPhieu(),t.getDiaChi(),t.getLyDo(),t.getThoiGian(),t.getTien(),t.getMaPhieu());
	}
	
}
