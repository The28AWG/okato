package io.github.the28awg.okato;

import java.util.List;

/**
 * Created by the28awg on 03.04.16.
 */
public class SimpleResponse {
    private List<SimpleOkato> result;
    private Integer found;

    public SimpleResponse() {
    }

    public SimpleResponse(List<SimpleOkato> result, Integer found) {
        this.result = result;
        this.found = found;
    }

    public List<SimpleOkato> result() {
        return result;
    }

    public SimpleResponse result(List<SimpleOkato> result) {
        this.result = result;
        return this;
    }

    public Integer found() {
        return found;
    }

    public SimpleResponse found(Integer found) {
        this.found = found;
        return this;
    }
}
