package org.game.netty;

import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import org.game.dto.GameData;

/**
 * 说明：处理器初始化
 *
 * @author <a href="http://www.waylau.com">waylau.com</a> 2015年11月6日
 */
public class ClientHandlerInitializer extends
		ChannelInitializer<Channel> {
 

	@Override
	protected void initChannel(Channel ch) throws Exception {
		ChannelPipeline pipeline = ch.pipeline();
		pipeline.addLast(new JacksonDecoder<GameData>(GameData.class));
		pipeline.addLast(new JacksonEncoder());
		pipeline.addLast(new ClientHandler());
	}
}