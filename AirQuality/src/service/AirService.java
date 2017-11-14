package service;

import java.util.List;

import pojo.Air;

public interface AirService {
	public List<Air> getAll(int index,int pagesize);
	
	public int count();
	
	public int addAir(Air air);
	
	public int delAir(int id);
}
