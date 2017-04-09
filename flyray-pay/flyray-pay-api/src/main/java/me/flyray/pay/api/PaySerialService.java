package me.flyray.pay.api;

import java.util.List;
import java.util.Map;

import me.flyray.pay.model.PaySerial;

/** 
* @author: bolei
* @date：2017年3月18日 下午11:20:37 
* @description：支付流水
*/

public interface PaySerialService {

	List<PaySerial> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(PaySerial paySerial);
	
	void update(PaySerial paySerial);
	
	void deleteBatch(Long[] ids);
	
}
