package com.learn.notification.channel;

import com.learn.notification.channel.interf.Notifiable;

public class Sms implements Notifiable{
	public void send() {
	 System.out.println("SEND SMS TO CUSTOMER");
 }
}
