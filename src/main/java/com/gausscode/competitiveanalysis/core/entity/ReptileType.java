package com.gausscode.competitiveanalysis.core.entity;

import com.gausscode.competitiveanalysis.core.reptile.IParser;
import com.gausscode.competitiveanalysis.core.reptile.parser.BaseParser;
import com.gausscode.competitiveanalysis.core.reptile.parser.StringParser;
import com.gausscode.competitiveanalysis.core.reptile.parser.UnknownParser;
import org.apache.commons.lang.StringUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

public enum ReptileType {

    Unknown("unknown", UnknownParser.class),
    DefaultType("string", StringParser.class);

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
        try {
            return clazz.getDeclaredConstructor(String.class).newInstance(data);
        } catch (InstantiationException | IllegalAccessException e) {
            return null;
        } catch (InvocationTargetException | NoSuchMethodException e) {
            throw new RuntimeException(e);
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
