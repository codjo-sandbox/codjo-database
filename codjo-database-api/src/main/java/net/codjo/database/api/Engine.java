package net.codjo.database.api;
/**
 *
 */
public enum Engine {
    HSQLDB,
    MYSQL,
    ORACLE,
    SYBASE;


    public static Engine toEngine(String name) {
        if (name == null) {
            return null;
        }

        // TODO : Hack temporaire en attendant que le settings.xml soit unifi�.
        if ("${databaseType}".equalsIgnoreCase(name.trim())) {
            return SYBASE;
        }
        return valueOf(name.toUpperCase());
    }
}
