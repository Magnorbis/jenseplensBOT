package com.gmail.jenseplensyt.DiscordBot;

import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;


public class App extends ListenerAdapter
{
    public static void main( String[] args ) throws Exception
    {
    	JDA jda = new JDABuilder(AccountType.BOT).setToken(Ref.token).buildBlocking();
    	jda.addEventListener(new App());
    }

    @Override
    public void onMessageReceived(MessageReceivedEvent evt)
    {
    	// Objects
    	MessageChannel objMsgCh = evt.getChannel();
    	Message objMsg = evt.getMessage();
    	
    	// Commands
    	
    	if(objMsg.getContentRaw().equalsIgnoreCase(Ref.prefix+"join"))
    	{
    		objMsgCh.sendMessage(" Bot is het kanaal binnengekomen!").queue();

    	}	
    } 
}
