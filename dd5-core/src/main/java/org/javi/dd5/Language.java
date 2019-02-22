package org.javi.dd5;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum Language {
    Common, Dwarven, Elvish, Halfling, Gnomish, Orc;

    public static List<Language> getLanguages() {        
        return Stream.of(Language.values()).collect(Collectors.toList());
    }
}