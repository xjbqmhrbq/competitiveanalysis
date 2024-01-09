package technology.cariad.app.competitiveanalysis.reptile;

import technology.cariad.app.competitiveanalysis.reptile.parser.DemoParser;
import org.apache.commons.lang.StringUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

public enum ReptileType {

    Unknown("unknown", null),
    DefaultType("demo", DemoParser.class);

    public final String type;

    public final Class<? extends BaseParser> clazz;


    ReptileType(String type, Class<? extends BaseParser> clazz) {
        this.type = type;
        this.clazz = clazz;
    }

    public IParser buildParser(String data) {
        if (StringUtils.isBlank(data)) {
            return null;
        }
        return newParser(data);
    }

    private IParser newParser(String data) {
        if (clazz == null) return null;
        try {
            BaseParser parser = clazz.getDeclaredConstructor().newInstance();
            parser.init(data);
            return parser;
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException |
                 NoSuchMethodException e) {
            return null;
        }
    }

    public static ReptileType getByType(String type) {
        if (StringUtils.isBlank(type)) {
            return Unknown;
        }
        ReptileType[] values = ReptileType.values();
        for (ReptileType value : values) {
            if (Objects.equals(type, value.type)) {
                return value;
            }
        }
        return Unknown;
    }
}
