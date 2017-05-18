package org.game.netty;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.util.concurrent.GlobalEventExecutor;
import org.game.controller.DataController;
import org.game.controller.ReceiveDataController;
import org.game.controller.SendDataController;
import org.game.dto.GameData;

/**
 * 说明：处理器
 *
 * @author <a href="http://www.waylau.com">waylau.com</a> 2015年11月7日 
 */
public class ServerHandler extends SimpleChannelInboundHandler<Object> implements DataController.GameControllerFinish{

	ChannelGroup channels = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);

	private DataController dataController;

	@Override
	public void handlerAdded(ChannelHandlerContext ctx) throws Exception {
		Channel newComing = ctx.channel();
		channels.add(newComing);
	}

	@Override
	protected synchronized void channelRead0(ChannelHandlerContext ctx, Object obj)
			throws Exception {
		System.out.println("···········");
		System.out.println(obj);
		dataController = new DataController(this, ctx, obj);
		dataController.doAction();
		//ctx.writeAndFlush(dataController.returnData());
		/*
		System.out.println(obj);
		String jsonString = "";

		if (obj instanceof GameData) {
			GameData user = (GameData)obj;
			
			ctx.writeAndFlush(user);

			jsonString = JacksonMapper.getInstance().writeValueAsString(user); // 对象转为json字符串

		} else {
			ctx.writeAndFlush(obj);
			jsonString = JacksonMapper.getInstance().writeValueAsString(obj); // 对象转为json字符串
		}
		
		System.out.println("Server get msg form Client -" + jsonString);

		*/

		//分发数据，data的datatype为空则表示所有观察者都接收这个数据
		//ReceiveDataController.getReceiveDataContoller().distributeData(obj,new SendDataController(ctx));
	}
	
    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) { 
    	Channel incoming = ctx.channel();
		System.out.println("Client:"+incoming.remoteAddress()+"异常");
        // 当出现异常就关闭连接
        cause.printStackTrace();
        ctx.close();
    }

	@Override
	public void finish(GameData gameData, ChannelHandlerContext context) {
		context.writeAndFlush(gameData);
	}
}
