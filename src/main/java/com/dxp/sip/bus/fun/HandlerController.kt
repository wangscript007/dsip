package com.dxp.sip.bus.`fun`

import com.dxp.sip.codec.sip.FullSipRequest
import com.dxp.sip.codec.sip.SipMethod
import io.netty.channel.Channel
import org.dom4j.DocumentException

/**
 * @author carzy
 * @date 2020/8/14
 */
interface HandlerController {

    fun method(): SipMethod

    /**
     * 处理具体的 sip 请求
     *
     * @param request 请求携带的信息.
     * @param channel 通道
     * @throws DocumentException 解析XML失败.
     */
    @Throws(DocumentException::class)
    fun handler(request: FullSipRequest, channel: Channel)
}