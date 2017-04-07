package me.flyray.crm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.flyray.crm.api.CustomerBaseService;
import me.flyray.crm.dao.CustomerBaseDao;
import me.flyray.crm.model.CustomerBase;

/** 
* @author: bolei
* @date：2017年3月12日 下午5:11:03 
* @description：客户基础信息
*/

@Service("customerBaseService")
public class CustomerBaseServiceImpl implements CustomerBaseService{

	@Autowired
	private CustomerBaseDao customerBaseDao;
	
	@Override
	public CustomerBase queryObject(Long customerId) {
		for (int i = 0; i < 10; i++) {
			System.out.println("终于调通统一dubbo服务入口了");
		}
		return null;
	}

	@Override
	public List<CustomerBase> queryList(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int queryTotal(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void save(CustomerBase customerBase) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(CustomerBase customerBase) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBatch(Long[] customerIds) {
		// TODO Auto-generated method stub
		
	}

}