package com.gausscode.competitiveanalysis.core.reptile.parser;

import com.gausscode.competitiveanalysis.core.reptile.IParser;

public abstract class BaseParser implements IParser {

    private final String data;

    public BaseParser(String data) {
        this.data = data;
    }

    @Override
    public void parse() {
        onParse(data);
    }

    protected abstract void onParse(String data);
}
