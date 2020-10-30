
package com.damianosiak.springhttpclient.api.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Setter
@Getter
public class Country implements Serializable
{

    public String name;
    public List<String> topLevelDomain = null;
    public String alpha2Code;
    public String alpha3Code;
    public List<String> callingCodes = null;
    public String capital;
    public List<String> altSpellings = null;
    public String region;
    public String subregion;
    public Integer population;
    public List<Double> latlng = null;
    public String demonym;
    public Double area;
    public Object gini;
    public List<String> timezones = null;
    public List<Object> borders = null;
    public String nativeName;
    public String numericCode;
    public List<Currency> currencies = null;
    public List<Language> languages = null;
    public Translations translations;
    public String flag;
    public List<Object> regionalBlocs = null;
    public String cioc;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 8828495214835933267L;

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
