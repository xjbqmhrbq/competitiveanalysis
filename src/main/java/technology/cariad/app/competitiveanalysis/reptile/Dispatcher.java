package technology.cariad.app.competitiveanalysis.reptile;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Dispatcher implements Runnable {

    private static final ExecutorService EXECUTOR = Executors.newSingleThreadExecutor();

    private final IParser parser;

    private Dispatcher(IParser parser) {
        this.parser = parser;
    }

    @Override
    public void run() {
        parser.parse();
    }

    public static boolean dispatch(String type, String data) {
        ReptileType reptileType = ReptileType.getByType(type);
        if (reptileType == ReptileType.Unknown) {
            return false;
        }
        IParser parser = reptileType.buildParser(data);
        EXECUTOR.submit(new Dispatcher(parser));
        return true;
    }

}
