package me.flyray.pay.api;

import java.util.List;
import java.util.Map;

import me.flyray.pay.model.PayOrder;

/** 
* @author: bolei
* @date：2017年3月18日 下午11:20:24 
* @description：支付订单
*/

public interface PayOrderService {

	List<PayOrder> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(PayOrder payOrder);
	
	void update(PayOrder payOrder);
	
	void deleteBatch(Long[] ids);
	
}
