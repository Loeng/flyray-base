package me.flyray.pay.api;

import java.util.List;
import java.util.Map;

import me.flyray.pay.model.PayChannelInterface;

/** 
* @author: bolei
* @date：2017年3月18日 下午11:19:51 
* @description：支付通道接口
*/

public interface PayChannelInterfaceService {

	PayChannelInterface queryObject(Long id);
	
	List<PayChannelInterface> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(PayChannelInterface payChannelInterface);
	
	void update(PayChannelInterface payChannelInterface);
	
	void deleteBatch(Long[] ids);
}
