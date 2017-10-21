import net.dv8tion.jda.core.events.user.UserGameUpdateEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;


public class GameChange extends ListenerAdapter{
    @Override
    public void onUserGameUpdate(UserGameUpdateEvent event) {
        String game = event.getPreviousGame().getName();
        String name = event.getUser().getName();

        String response = name + " previously played " + game + "and is now playing something else.";

    }
}
