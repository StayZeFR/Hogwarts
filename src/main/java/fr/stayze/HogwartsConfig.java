package fr.stayze;

public enum HogwartsConfig {

    DATABASE_PATH(Hogwarts.getInstance().getConfig().getString("database_path"));

    private final Object config;

    private HogwartsConfig(Object config) {
        this.config = config;
    }

    public Object getConfig() {
        return this.config;
    }

}
