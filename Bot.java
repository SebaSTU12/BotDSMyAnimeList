
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

import javax.security.auth.login.LoginException;

public class Bot{
    public static void main(String[] args) throws LoginException {
        JDA jda = JDABuilder.createDefault("MTA0Mjg5NDc5NDc3NjY0OTgwOQ.GdppCC.OWVZ31QCnW_BTWER_TDP-tJArA9NLFPqb6C2MA")
                .setActivity(Activity.playing("ESTOY VIVO")).addEventListeners(new BotListener()).build();
    }



}
