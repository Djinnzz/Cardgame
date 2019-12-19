/**
 * contains all required variables
 * */

public abstract class _GameInformation {

    /**
     * Vars
     * */

    public static String gameVersion = "game version not set";
    private static String gameName = "still no Name";

    /**
     * Getter and setter
     * */

    public static String getGameName() {
        return gameName;
    }

    public static void setGameName(String newgameName) {
        gameName = newgameName;
    }

    public static String getGameVersion() {
        return gameVersion;
    }

    public static void setGameVersion(String gameVersion) {
        _GameInformation.gameVersion = gameVersion;
    }
}
