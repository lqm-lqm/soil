package com.soil.mapper;

import java.util.List;

import com.soil.pojo.Message;
import com.soil.util.Pagination;

public interface MessageMapper{
	/**
	 * 添加信息
	 * @param info
	 */
	public void insert(Message t);
	/**
	 * 获取信息列表
	 * @param pagination 分页条件
	 * @return 信息 json 数据
	 */
	public List<Message> list(Pagination pagination);
	
	/**
	 * 获取信息条数的个数
	 * @param pagination 分页条件
	 * @return 条数
	 */
	public int count(Pagination pagination);
	/**
	 * 删除信息
	 * @param id
	 * @return
	 */
	public void delete(Message t);
	/**
	 * 根据Id查询信息
	 * @param id 
	 * @return 信息
	 */
	public Message findById(String id);
	/**
	 * 根据id修改信息
	 * @param 修改信息
	 */
	public void update(Message t);
}
