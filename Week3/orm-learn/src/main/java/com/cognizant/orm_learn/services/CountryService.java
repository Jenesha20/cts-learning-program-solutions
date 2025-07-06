package com.cognizant.ormlearn.service;

import java.util.List;
import java.util.Optional;

//import javax.transaction.Transactional;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.ormlearn.exception.CountryNotFoundException;
import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.repository.CountryRepository;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    @Transactional
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    @Transactional
    public Country findCountryByCode(String countryCode) throws CountryNotFoundException {
        Optional<Country> result = countryRepository.findById(countryCode);
        if (!result.isPresent()) {
            throw new CountryNotFoundException("Country not found");
        }
        return result.get();
    }

    @Transactional
    public void addCountry(Country country) {
        countryRepository.save(country);
    }

    @Transactional
    public void updateCountry(String countryCode, String countryName) throws CountryNotFoundException {
        Optional<Country> result = countryRepository.findById(countryCode);
        if (!result.isPresent()) {
            throw new CountryNotFoundException("Country not found");
        }
        Country country = result.get();
        country.setName(countryName);
        countryRepository.save(country);
    }

    @Transactional
    public void deleteCountry(String countryCode) {
        countryRepository.deleteById(countryCode);
    }

    @Transactional
    public List<Country> searchCountries(String name) {
        return countryRepository.findByNameContaining(name);
    }

    @Transactional
    public List<Country> searchCountriesStartingWith(String name) {
        return countryRepository.findByNameStartingWithOrderByNameAsc(name);
    }
}