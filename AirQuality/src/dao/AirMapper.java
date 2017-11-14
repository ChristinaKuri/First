package dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import pojo.Air;

public interface AirMapper {
	public List<Air> getAll(@Param("i") int index, @Param("s") int pagesize);
	
	public int count();
	
	public int addAir(Air air);
	
	public int delAir(int id);
}
