/**
 * 
 */
package org.game.controller;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;

import org.game.dto.GameData;

/**
 * @author ZeHua
 *
 */
public class SendDataController {

	private ChannelHandlerContext channel;
	/**
	 * 
	 */
	public SendDataController(ChannelHandlerContext ctx) {
		this.channel = ctx;

	}
	public void sendData(GameData data){
		channel.writeAndFlush(data);
	}
	/**
	 * @return the channel
	 */
	public ChannelHandlerContext getChannel() {
		return channel;
	}
	/**
	 * @param channel the channel to set
	 */
	public void setChannel(ChannelHandlerContext channel) {
		this.channel = channel;
	}
	
	
	
	/**
	 * @return the controller
	 */
//	public static SendDataController getController() {
//		return controller;
//	}
//	
//	public static SendDataController initSendDataController(Channel channel) {
//		return new SendDataController(channel);
//	}
	
}
