package com.xxx.seckill.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xxx.seckill.pojo.SeckillOrder;
import com.xxx.seckill.pojo.User;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ktx
 * @since 2022-03-12
 */
public interface ISeckillOrderService extends IService<SeckillOrder> {

    /**
     * 获取秒杀结果
     * @param user
     * @param goodsId
     * @return
     */
    Long getResult(User user, Long goodsId);
}
