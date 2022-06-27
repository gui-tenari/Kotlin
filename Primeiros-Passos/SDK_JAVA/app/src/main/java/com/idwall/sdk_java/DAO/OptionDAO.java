package com.idwall.sdk_java.DAO;

import com.idwall.sdk_java.model.Option;

import java.util.ArrayList;
import java.util.List;


public class OptionDAO {

    private final static List<Option> options = new ArrayList<>();

    public void save(Option option) {
        options.add(option);
    }

    public List<Option> getAll() {
        return new ArrayList<>(options);
    }
}
