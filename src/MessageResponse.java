
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

import java.util.Random;


public class MessageResponse extends ListenerAdapter {

//this method responds to a message that a user inputted for the bot.
    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        String message = event.getMessage().getContent();

        if(message.startsWith(".hello")) {
            String name = event.getAuthor().getName();
            String response = name + ", hello and welcome to the Discord Server!";

            event.getTextChannel().sendMessage(response).queue();
        }
        if(message.startsWith(".rng")) {
            Random rand = new Random();
            int rng = rand.nextInt(101);
            String response = event.getAuthor().getName() + ", the random number is " + rng;

            event.getTextChannel().sendMessage(response).queue();
        }
        if(message.startsWith(".roll")) {
            Random rand = new Random();
            int rng = rand.nextInt(7 - 1) + 1;
            String response = event.getAuthor().getName() + ", you rolled a " + rng;

            event.getTextChannel().sendMessage(response).queue();
        }
    }
}
