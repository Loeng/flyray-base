package me.flyray.pay.service.refund.alipay;

import org.springframework.stereotype.Service;

import me.flyray.pay.api.RefundHandleService;
import me.flyray.pay.dto.RefundHandleRequest;
import me.flyray.pay.dto.RefundHandleResponse;

/** 
* @author: bolei
* @date：2017年2月23日 下午1:41:25 
* @description：类说明 
*/

@Service("alipayRefundService")
public class AlipayRefundService implements RefundHandleService{

	@Override
	public RefundHandleResponse refund(RefundHandleRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

}