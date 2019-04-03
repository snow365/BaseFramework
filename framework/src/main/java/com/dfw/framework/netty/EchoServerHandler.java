package com.dfw.framework.netty;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.CharsetUtil;

public class EchoServerHandler extends ChannelInboundHandlerAdapter {
	 @Override
	    public void channelRead(ChannelHandlerContext ctx,Object msg) {
	        ByteBuf in = (ByteBuf) msg;
	        System.out.println("Server received: " + in.toString(CharsetUtil.UTF_8));        //2
	        ctx.write(in);                            //3
	    }

}
