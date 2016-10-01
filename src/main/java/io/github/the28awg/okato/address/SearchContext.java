package io.github.the28awg.okato.address;

/**
 * Created by the28awg on 03.04.16.
 */
public class SearchContext {
    /*
    "query": "Арх",
        "contentType": "city",
        "withParent": 1,
        "limit": 2
     */
    private String query;
    private String contentType;
    private Integer withParent;
    private Integer limit;

    public SearchContext() {
    }

    public SearchContext(String query, String contentType, Integer withParent, Integer limit) {
        this.query = query;
        this.contentType = contentType;
        this.withParent = withParent;
        this.limit = limit;
    }

    public String query() {
        return query;
    }

    public SearchContext query(String query) {
        this.query = query;
        return this;
    }

    public String contentType() {
        return contentType;
    }

    public SearchContext contentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    public Integer withParent() {
        return withParent;
    }

    public SearchContext withParent(Integer withParent) {
        this.withParent = withParent;
        return this;
    }

    public Integer limit() {
        return limit;
    }

    public SearchContext limit(Integer limit) {
        this.limit = limit;
        return this;
    }
}
