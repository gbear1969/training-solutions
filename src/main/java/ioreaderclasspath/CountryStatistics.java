package ioreaderclasspath;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class CountryStatistics {
    private List<Country> countryList = new ArrayList<>();

    public void readFromFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(
                CountryStatistics.class.getResourceAsStream('/' + fileName)))) {
            String line;
            while((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                String name = parts[0];
                int borderCountries = Integer.parseInt(parts[1]);
                countryList.add(new Country(name, borderCountries));
            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    public int numberOFCountries() {
        return countryList.size();
    }

    public Country mostBorderCountries() {
        Country result = countryList.get(0);
        for (Country country: countryList) {
            if (result.getBorderCountries() < country.getBorderCountries()) result = country;
        }
        return result;
    }

    public List<Country> getCountryList() {
        return new ArrayList<>(List.copyOf(countryList));
    }
}
