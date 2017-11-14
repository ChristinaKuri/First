package controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import pojo.Air;

import service.AirService;

@Controller
public class AirController {

	@Autowired
	private AirService as;

	public AirService getAs() {
		return as;
	}

	public void setAs(AirService as) {
		this.as = as;
	}

	@RequestMapping("/getAll")
	public String getAll(@RequestParam(defaultValue = "1") int pageindex,
			HttpServletRequest request, HttpServletResponse response) {
		int count = as.count();
		int totalPageCount = count % 5 == 0 ? (count / 5) : (count / 5 + 1);
		if (pageindex < 1) {
			pageindex = 1;
		} else if (pageindex > totalPageCount) {
			pageindex = totalPageCount;
		}
		int index = (pageindex - 1) * 5;
		List<Air> airs = as.getAll(index, 5);
		request.getSession().setAttribute("airs", airs);
		request.getSession().setAttribute("pageindex", pageindex);
		request.getSession().setAttribute("totalPageCount", totalPageCount);
		return "index.jsp";
	}

	@RequestMapping("addAir")
	public String addAir(HttpServletRequest request) {
		int district_id = Integer.parseInt(request.getParameter("district_id"));
		String monitor_time = request.getParameter("monitor_time");
		int pm10 = Integer.parseInt(request.getParameter("pm10"));
		int pm25 = Integer.parseInt(request.getParameter("pm25"));
		String monitoring_station = request.getParameter("monitoring_station");
		Air air = new Air(district_id, monitor_time, pm10, pm25,
				monitoring_station);
		int add = as.addAir(air);
		if (add == 1) {
			System.out.println("Ìí¼Ó³É¹¦");
		} else {
			System.out.println("Ìí¼ÓÊ§°Ü");
		}
		return "getAll";
	}

	@RequestMapping("/delAir")
	public String delAir(int id) {
		int del = as.delAir(id);
		if (del == 1) {
			System.out.println("É¾³ý³É¹¦");
		} else {
			System.out.println("É¾³ýÊ§°Ü");
		}
		return "getAll";
	}
}
