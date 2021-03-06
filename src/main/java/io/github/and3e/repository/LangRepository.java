package io.github.and3e.repository;

import io.github.and3e.model.Lang;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class LangRepository {
    private List<Lang> languages;

    public LangRepository() {
        languages = new ArrayList<>();
        languages.add(new Lang(1L, "Hello", "en"));
        languages.add(new Lang(2L, "Cześć", "pl"));
    }

    public Optional<Lang> findById(Long id){
        return  languages.stream()
                .filter(l -> l.getId().equals(id))
                .findFirst();
    }
}
