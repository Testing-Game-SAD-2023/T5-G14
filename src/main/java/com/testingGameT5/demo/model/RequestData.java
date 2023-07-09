package com.testingGameT5.demo.model;

/* Tale classe è stata realizzata per poter incapsulare i dati ricevuti dal programma javascript
 *  "matchsettings.js" che si attiva  in corrispondenza della scelta della classe e del robot nella
 *  pagina html "matchsettings.html"
 */
public class RequestData {
	
    private String value1;
    private String value2;
    private String value3;
 
    public RequestData() {
    	super();
    }
    
    public String getValue1() {
        return value1;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }

    public String getValue2() {
        return value2;
    }

    public void setValue2(String value2) {
        this.value2 = value2;
    }

	public String getValue3() {
		return value3;
	}

	public void setValue3(String value3) {
		this.value3 = value3;
	}
}
