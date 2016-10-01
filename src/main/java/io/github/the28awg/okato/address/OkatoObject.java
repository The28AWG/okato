package io.github.the28awg.okato.address;

import java.util.List;

/**
 * Created by the28awg on 03.04.16.
 */
public class OkatoObject {

    /**
     * "id": "2900000100000",          // Код объекта
     *             "name": "Архангельск",          // Название объекта
     *             "zip": null,                    // Почтовый индекс объекта
     *             "type": "Город",                // Тип объекта полностью
     *             "typeShort": "г",               // Тип объекта коротко
     *             "okato": "11401000000",         // Код ОКАТО
     *             "parents": [                    // Массив родительских объектов (если был передан параметр withParent)
     *                 {
     *                     "id": "2900000000000",
     *                     "name": "Архангельская",
     *                     "zip": null,
     *                     "type": "Область",
     *                     "typeShort": "обл",
     *                     "okato": "11000000000",
     *             "contentType": "region"
     *                 }
     *             ]
     */

    private String id;
    private String name;
    private String type;
    private String typeShort;
    private String okato;
    private List<OkatoObject> parents;

    public OkatoObject() {
    }

    public OkatoObject(String id, String name, String type, String typeShort, String okato, List<OkatoObject> parents) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.typeShort = typeShort;
        this.okato = okato;
        this.parents = parents;
    }

    public String id() {
        return id;
    }

    public OkatoObject id(String id) {
        this.id = id;
        return this;
    }

    public String name() {
        return name;
    }

    public OkatoObject name(String name) {
        this.name = name;
        return this;
    }

    public String type() {
        return type;
    }

    public OkatoObject type(String type) {
        this.type = type;
        return this;
    }

    public String typeShort() {
        return typeShort;
    }

    public OkatoObject typeShort(String typeShort) {
        this.typeShort = typeShort;
        return this;
    }

    public String okato() {
        return okato;
    }

    public OkatoObject okato(String okato) {
        this.okato = okato;
        return this;
    }

    public List<OkatoObject> parents() {
        return parents;
    }

    public OkatoObject parents(List<OkatoObject> parents) {
        this.parents = parents;
        return this;
    }
}
