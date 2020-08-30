package com.lg.crbook.bean;

public class BookWithBLOBs extends Book {
    private String abstr;

    private String contentIntro;

    private String authorIntro;

    private String catalog;

    private String extract;

    public String getAbstr() {
        return abstr;
    }

    public void setAbstr(String abstr) {
        this.abstr = abstr == null ? null : abstr.trim();
    }

    public String getContentIntro() {
        return contentIntro;
    }

    public void setContentIntro(String contentIntro) {
        this.contentIntro = contentIntro == null ? null : contentIntro.trim();
    }

    public String getAuthorIntro() {
        return authorIntro;
    }

    public void setAuthorIntro(String authorIntro) {
        this.authorIntro = authorIntro == null ? null : authorIntro.trim();
    }

    public String getCatalog() {
        return catalog;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog == null ? null : catalog.trim();
    }

    public String getExtract() {
        return extract;
    }

    public void setExtract(String extract) {
        this.extract = extract == null ? null : extract.trim();
    }
}