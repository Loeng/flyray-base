package me.flyray.pay.service.manager;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.flyray.pay.api.PayChannelService;
import me.flyray.pay.dao.PayChannelDao;
import me.flyray.pay.model.PayChannel;

/** 
* @author: bolei
* @date：2017年4月6日 下午10:57:07 
* @description：付通道
*/

@Service("payChannelService")
public class PayChannelServiceImpl implements PayChannelService{
	
	@Autowired
	private PayChannelDao payChannelDao;
	
	@Override
	public List<PayChannel> queryList(Map<String, Object> map) {
		return payChannelDao.queryList(map);
	}

	@Override
	public int queryTotal(Map<String, Object> map) {
		return payChannelDao.queryTotal(map);
	}

	@Override
	public void save(PayChannel payChannel) {
		payChannelDao.save(payChannel);
	}

	@Override
	public void update(PayChannel payChannel) {
		payChannelDao.update(payChannel);
	}

	@Override
	public void deleteBatch(Long[] ids) {
		// TODO Auto-generated method stub
		
	}

}
