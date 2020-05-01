package OCA.enumsForOCA;

public enum Environment {
    QA("http://qa.na.edu"),
    STAG("http://stag.na.edu"),
    PROD("http://na.edu");
    private String url;

    public String getUrl(){
        return this.url;
    }
    private Environment(String url){
        this.url=url;
    }
}
