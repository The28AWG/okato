package io.github.the28awg.okato.address;

import io.github.the28awg.okato.SimpleOkato;
import io.github.the28awg.okato.SimpleResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by the28awg on 03.04.16.
 */
public class AddressResponse {
    private SearchContext searchContext;
    private List<OkatoObject> result;

    public AddressResponse() {
    }

    public AddressResponse(SearchContext searchContext, List<OkatoObject> result) {
        this.searchContext = searchContext;
        this.result = result;
    }

    public SearchContext searchContext() {
        return searchContext;
    }

    public AddressResponse searchContext(SearchContext searchContext) {
        this.searchContext = searchContext;
        return this;
    }

    public List<OkatoObject> result() {
        return result;
    }

    public AddressResponse result(List<OkatoObject> result) {
        this.result = result;
        return this;
    }
}
