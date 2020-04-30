package enums;

import interfaces.A;

public enum SearchEngines {

        GOOGLE("www.google.com"),
        FACEBOOK("www.facebook"),
        YAHOO("www.yahoo.com");

    private String way;
SearchEngines(String way){
    this.way=way;
}
public String way(){
    return way;
}
}