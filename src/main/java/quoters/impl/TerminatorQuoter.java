package quoters.impl;

import lombok.Setter;
import quoters.Quoter;
import quoters.annotation.InjectRandomInt;
import quoters.annotation.Profiling;

import javax.annotation.PostConstruct;

@Profiling
public class TerminatorQuoter implements Quoter {

    @InjectRandomInt(min = 2, max = 7)
    private int repeat;

    @Setter  // when Spring configures via XML we definitely need setters
    private String message;

    @PostConstruct
    public void init() {
        System.out.println("PHASE 2 (init) : repeat = " + repeat);
    }

    public TerminatorQuoter() {
        System.out.println("PHASE 1 (constructor) : repeat = " + repeat);
    }

    @Override
    public void sayQuote() {
        for (int i = 0; i < repeat; i++) {
            System.out.println(message);
        }
    }
}
