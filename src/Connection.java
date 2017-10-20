import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.exceptions.RateLimitedException;

import javax.security.auth.login.LoginException;

public class Connection {

    public static void main (String[] args) {
        JDA discord = null;

        //created a new jda builder linked to the bot. surrounded with try/catch and no error exists
        try {
            discord = new JDABuilder(AccountType.BOT).setToken(Constants.token).buildBlocking();
        } catch (LoginException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (RateLimitedException e) {
            e.printStackTrace();
        }

        discord.addEventListener(new MessageResponse());//listens to a certain event


    }
}
