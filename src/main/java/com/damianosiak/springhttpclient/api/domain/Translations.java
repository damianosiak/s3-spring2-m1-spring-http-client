
package com.damianosiak.springhttpclient.api.domain;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Translations implements Serializable
{

    public String de;
    public String es;
    public String fr;
    public String ja;
    public String it;
    public String br;
    public String pt;
    public String nl;
    public String hr;
    public String fa;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -2247719205447473799L;

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
