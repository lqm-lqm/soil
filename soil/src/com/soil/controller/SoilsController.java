package com.soil.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.soil.pojo.Soil;
import com.soil.service.SoilService;
import com.soil.util.Pagination;

/**
 * 土地管理控制器
 * @author 
 *
 */
@Controller
@RequestMapping("/soils")
public class SoilsController {
	@Autowired
	@Qualifier("soilService")
	private SoilService soilService;
	
	/**
	 * 添加土地信息
	 * @param soil
	 * @return
	 */
	@RequestMapping("/add")
	@ResponseBody
	public String addAdmin(Soil soil) {
		soilService.insert(soil);
		return "ok";
	}
	
	/**
	 * 进入土地列表
	 * @return
	 */
	@RequestMapping("/toList")
	public String toList() {
		return "management/soil/list";
	};
	/**
	 * 返回管理员数据
	 * @param pagination
	 * @return data
	 */
	@RequestMapping("/list")
	@ResponseBody
	public String list(Pagination pagination){
		String data=soilService.list(pagination);
		return data;
	}
	
	/**
	 * 删除
	 * @param id
	 * @return
	 */
	@RequestMapping("/detele")
	@ResponseBody
	public String delete(Soil soil){
		soilService.delete(soil);
		return "ok";
	}

	/**
	 * 通过id查询数据
	 * @param id
	 * @return
	 */
	@RequestMapping("/findById")
	@ResponseBody
	public String findUserById(String id) {
		return soilService.findById(id);
	}

	/**
	 * 更新信息
	 * @param admin
	 * @return
	 */
	@RequestMapping("/update")
	@ResponseBody
	public String update(Soil soil) {
		soilService.update(soil);
		return "";
	}
	
}
