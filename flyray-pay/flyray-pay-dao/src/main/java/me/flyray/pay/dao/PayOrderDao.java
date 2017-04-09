package me.flyray.pay.dao;

import java.util.List;
import java.util.Map;

import me.flyray.pay.model.PayOrder;

/** 
* @author: bolei
* @date：2017年4月8日 下午10:42:17 
* @description：支付订单
*/

public interface PayOrderDao {

	List<PayOrder> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(PayOrder payOrder);
	
	void update(PayOrder payOrder);
	
	void deleteBatch(Long[] ids);
	
}
