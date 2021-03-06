/**
 * 
 */
package com.biticcf.ocean.sea.domain.support;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import com.biticcf.ocean.sea.domain.repository.DemoDomainRepository;
import com.github.biticcf.mountain.core.common.service.ReferContext;

/**
 * @Author: DanielCao
 * @Date:   2017年5月8日
 * @Time:   下午6:27:27
 *
 */
@Service("constantContext")
public class ConstantContext implements ReferContext {
	@Autowired
	private DemoDomainRepository demoDomainRepository;
	@Autowired
	private RedisTemplate<String, Object> redisTemplate;
	@Autowired
	private CommonAsyncService commonAsyncService;
	@Autowired
	private EffectAsyncService effectAsyncService;
	
	public DemoDomainRepository getDemoDomainRepository() {
		return demoDomainRepository;
	}
	
	public RedisTemplate<String, Object> getRedisTemplate() {
		return redisTemplate;
	}
	
	public CommonAsyncService getCommonAsyncService() {
		return commonAsyncService;
	}

	public EffectAsyncService getEffectAsyncService() {
		return effectAsyncService;
	}
}
