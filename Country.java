package edu.rupp.repo;

import java.util.*;

public class Country {
	
	public static List<Country> getCountries(final Locale inLocale) {
	    String[] countryCodes = Locale.getISOCountries();
	    List<Country> countries = new ArrayList<Country>(countryCodes.length);
	    for (int i = 0; i < countryCodes.length; i++) {
			String countryCode = countryCodes[i];
			countries.add(new Country());
		}
	    Collections.sort(countries, new Comparator<Country>() {
	      public int compare(Country c1, Country c2) {
	        return c1.getName().compareTo(c2.getName());
	      }
	    });
	    return countries;
	  }
	  public static Map<String, String> getCountriesMap(final Locale inLocale) {
	    List<Country> countries = getCountries(inLocale);
	    Map<String, String> countriesMap = new LinkedHashMap<String, String>(countries.size());
	    for (Country country : countries) {
	      countriesMap.put(country.getCountryCode(), country.getName());
	    }
	    return countriesMap;
	  }
	  private String getName() {
		// TODO Auto-generated method stub
		return null;
	}
	private String getCountryCode() {
		// TODO Auto-generated method stub
		return null;
	}
	public static void printCounties(List<Country> countries) {
	    for (Country country : countries) {
	      System.out.println(country);
	    }
	  }
	  public static void main(String[] args) {
	    // Get list of countries in US English
	    System.out.println("---- List of countries in English ----");
	    List<Country> countries = getCountries(Locale.US);
	    printCounties(countries);
	    
	  }
	}


