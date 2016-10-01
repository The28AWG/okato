package io.github.the28awg.okato;

import io.github.the28awg.okato.address.AddressResponse;
import io.github.the28awg.okato.address.OkatoObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by the28awg on 03.04.16.
 */
public class SimpleOkato {
    private String id;
    private String name;

    public SimpleOkato(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public SimpleOkato() {

    }

    public static SimpleResponse toSimpleResponse(AddressResponse response) {
        List<SimpleOkato> result = new ArrayList<>();
        if (response.result() != null) {
            for (OkatoObject object : response.result()) {
                result.add(new SimpleOkato(object.id(), String.format("%s. %s", object.typeShort(), object.name())));
            }
        }
        return new SimpleResponse(result, result.size());
    }

    public String id() {
        return id;
    }

    public SimpleOkato id(String id) {
        this.id = id;
        return this;
    }

    public String name() {
        return name;
    }

    public SimpleOkato name(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return name;
    }
}
