package technology.cariad.app.competitiveanalysis.reptile;

public abstract class BaseParser implements IParser {

    private String data;

    void init(String data) {
        this.data = data;
    }

    @Override
    public void parse() {
        onParse(data);
    }

    protected abstract void onParse(String data);
}
