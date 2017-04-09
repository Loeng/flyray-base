package me.flyray.pay.dao;

import java.util.List;
import java.util.Map;

import me.flyray.pay.model.RefundSerial;

/** 
* @author: bolei
* @date：2017年4月8日 下午10:43:53 
* @description：退款流水
*/

public interface RefundSerialDao {

	List<RefundSerial> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(RefundSerial refundSerial);
	
	void update(RefundSerial refundSerial);
	
}
