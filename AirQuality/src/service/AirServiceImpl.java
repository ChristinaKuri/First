package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.AirMapper;

import pojo.Air;

@Service("asi")
public class AirServiceImpl implements AirService {

	@Autowired
	private AirMapper am;

	public AirMapper getAm() {
		return am;
	}

	public void setAm(AirMapper am) {
		this.am = am;
	}

	@Override
	public List<Air> getAll(int index, int pagesize) {
		return am.getAll(index, pagesize);
	}

	@Override
	public int count() {
		return am.count();
	}

	@Override
	public int addAir(Air air) {
		return am.addAir(air);
	}

	@Override
	public int delAir(int id) {
		return am.delAir(id);
	}

}
