package local.instruments;

import java.lang.instrument.Instrumentation;
import java.util.UUID;

/*
 * Code taken from
 *
 * https://stackoverflow.com/questions/2681459/how-can-i-list-all-classes-loaded-in-a-specific-class-loader
 *
 * Credit goes to finnw, https://stackoverflow.com/users/12048/finnw
 */
public class InstrumentationHook {

    public static void premain(String agentArgs, Instrumentation inst) {
        if (agentArgs != null) {
            System.getProperties().put(AGENT_ARGS_KEY, agentArgs);
        }
        System.getProperties().put(INSTRUMENTATION_KEY, inst);
    }

    public static Instrumentation getInstrumentation() {
        return (Instrumentation) System.getProperties().get(INSTRUMENTATION_KEY);
    }

    private static final Object AGENT_ARGS_KEY =
        UUID.fromString("887b43f3-c742-4b87-978d-70d2db74e40e");

    private static final Object INSTRUMENTATION_KEY =
        UUID.fromString("214ac54a-60a5-417e-b3b8-772e80a16667");

}
