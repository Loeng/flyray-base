package me.flyray.pay.service.manager;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.flyray.pay.api.PayChannelConfigService;
import me.flyray.pay.dao.PayChannelConfigDao;
import me.flyray.pay.model.PayChannelConfig;

/** 
* @author: bolei
* @date：2017年4月6日 下午10:53:36 
* @description：类说明 
*/

@Service("payChannelConfigService")
public class PayChannelConfigServiceImpl implements PayChannelConfigService{

	@Autowired
	private PayChannelConfigDao payChannelConfigDao;
	
	@Override
	public PayChannelConfig queryObject(Long id) {
		return payChannelConfigDao.queryObject(id);
	}

	@Override
	public List<PayChannelConfig> queryList(Map<String, Object> map) {
		return payChannelConfigDao.queryList(map);
	}

	@Override
	public int queryTotal(Map<String, Object> map) {
		return payChannelConfigDao.queryTotal(map);
	}

	@Override
	public void save(PayChannelConfig payChannelConfig) {
		payChannelConfigDao.save(payChannelConfig);
	}

	@Override
	public void update(PayChannelConfig payChannelConfig) {
		payChannelConfigDao.update(payChannelConfig);
	}

	@Override
	public void deleteBatch(Long[] ids) {
		// TODO Auto-generated method stub
	}

	
}
