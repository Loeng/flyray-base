package me.flyray.rbac.controller.pay;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import me.flyray.rbac.annotation.SysLog;
import me.flyray.rbac.controller.AbstractController;
import me.flyray.rbac.utils.PageUtils;
import me.flyray.rbac.utils.R;
import me.flyray.rest.api.ApiProvider;
import me.flyray.rest.model.Parameter;

/** 
* @author: bolei
* @date：Jun 15, 2017 9:37:08 PM 
* @description：支付通道接口
*/

@RestController
@RequestMapping("/pay/payChannelInterface")
public class PayChannelInterfaceController extends AbstractController{

	private static final Logger logger = LoggerFactory.getLogger(PayChannelInterfaceController.class);
	
	@Autowired
	private ApiProvider apiProvider;
	
	/**
	 * 所有支付通道配置列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("pay:payChannelInterface:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
		logger.info("flyray-operation请求查询支付通道接口列表---请求参数:{}",params);
		Parameter parameter = new Parameter("payChannelInterfaceService", "queryList");
		Map<String, Object> map = new HashMap<>();
		map.put("payChannelNo", params.get("payChannelNo"));
		parameter.setMap(map);
		List<?> list = apiProvider.execute(parameter).getList();
		int total = list.size();
		logger.info("flyray-operation请求查询支付通道接口列表---查询结果size:{}",total);
		PageUtils pageUtil = new PageUtils(list, total, 10, 1);
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 配置信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("pay:payChannelInterface:info")
	public R info(@PathVariable("id") Long id){
		logger.info("flyray-operation请求查询支付通道接口信息---请求参数:{}",id);
		Parameter parameter = new Parameter("payChannelInterfaceService", "queryById");
		parameter.setId(id);
		Map<?, ?> map = apiProvider.execute(parameter).getMap();
		logger.info("flyray-operation请求查询支付通道接口信息---返回参数:{}",map);
		return R.ok().put("payChannel", map);
	}
	
	/**
	 * 保存配置
	 */
	@SysLog("保存配置")
	@RequestMapping("/save")
	@RequiresPermissions("pay:payChannelInterface:save")
	public R save(@RequestBody Map<String, Object> params){
		
		logger.info("flyray-operation保存支付通道接口信息---请求参数：{}",params);
		Parameter parameter = new Parameter("payChannelInterfaceService", "save");
		Map<String, Object> map = new HashMap<>();
		map.put("payChannelNo", params.get("payChannelNo"));
		map.put("payCompanyNo", params.get("payCompanyNo"));
		map.put("feeRatio", params.get("feeRatio"));
		parameter.setMap(map);
		apiProvider.execute(parameter);
		return R.ok();
		
	}
	
	/**
	 * 修改配置
	 */
	@SysLog("修改配置")
	@RequestMapping("/update")
	@RequiresPermissions("pay:payChannelInterface:update")
	public R update(@RequestBody Map<String, Object> params){
		
		logger.info("flyray-operation修改支付通道接口信息---请求参数{}",params);
		Parameter parameter = new Parameter("payChannelInterfaceService", "update");
		Map<String, Object> map = new HashMap<>();
		map.put("payChannelNo", params.get("payChannelNo"));
		map.put("payCompanyNo", params.get("payCompanyNo"));
		map.put("feeRatio", params.get("feeRatio"));
		map.put("id", params.get("id"));
		parameter.setMap(map);
		apiProvider.execute(parameter);
		
		return R.ok();
	}
	
	/**
	 * 删除配置
	 */
	@SysLog("删除配置")
	@RequestMapping("/delete")
	@RequiresPermissions("pay:payChannelInterface:delete")
	public R delete(@RequestBody Long[] ids){
		logger.info("flyray-operation删除支付通道接口信息");
		Parameter parameter = new Parameter("payChannelInterfaceService", "deleteBatch");
		Map<String, Object> map = new HashMap<>();
		map.put("ids", ids);
		parameter.setMap(map);
		apiProvider.execute(parameter);
		return R.ok();
	}
}
