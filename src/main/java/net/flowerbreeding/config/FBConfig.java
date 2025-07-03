package net.flowerbreeding.config;

import net.fabricmc.loader.api.FabricLoader;
import net.flowerbreeding.FlowerBreeding;

import java.io.*;

public class FBConfig {

    private static final String SEPARATOR = " = ";
    private static final String FAST_RECOLOURING = "fastRecolouring";
    private static final String CRAFTABLE_BOTANY_TABLES = "craftableBotanyTables";
    private static final String CRAFTABLE_VIALS_AND_JARS = "craftableVialsAndJars";
    private static final String CRAFTABLE_TROWELS = "craftableTrowels";

    public boolean fastRecolouring = true;
    public boolean craftableBotanyTables = false;
    public boolean craftableVialsAndJars = false;
    public boolean craftableTrowels = false;

	public FBConfig() {
        if(!read()){
            write();
        }
    }

    public void write() {
        File file = getFile();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(FAST_RECOLOURING + SEPARATOR + fastRecolouring + System.lineSeparator());
            writer.write(CRAFTABLE_BOTANY_TABLES + SEPARATOR + craftableBotanyTables + System.lineSeparator());
            writer.write(CRAFTABLE_VIALS_AND_JARS + SEPARATOR + craftableVialsAndJars + System.lineSeparator());
            writer.write(CRAFTABLE_TROWELS + SEPARATOR + craftableTrowels + System.lineSeparator());
        } catch (IOException e) {
            FlowerBreeding.LOGGER.error("Failed to write config ({})", file.getPath());
        }
    }

    public boolean read() {
        File file = getFile();
        if (!file.exists()) {
            return false;
        }
        try (BufferedReader reader = new BufferedReader((new FileReader(file)))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] segments = line.split(SEPARATOR);
                if (segments.length != 2 || segments[0].isEmpty() || segments[1].isEmpty()) {
                    continue;
                }
                switch (segments[0]) {
                    case FAST_RECOLOURING -> fastRecolouring = segments[1].equals("true");
                    case CRAFTABLE_BOTANY_TABLES -> craftableBotanyTables = segments[1].equals("true");
                    case CRAFTABLE_VIALS_AND_JARS -> craftableVialsAndJars = segments[1].equals("true");
                    case CRAFTABLE_TROWELS -> craftableTrowels = segments[1].equals("true");
                }
            }
        } catch (IOException e) {
            FlowerBreeding.LOGGER.error("Failed to read config ({})", file.getPath());
        }
        return true;
    }

    private File getFile() {
        return FabricLoader.getInstance().getGameDir().resolve("config").resolve(FlowerBreeding.MOD_ID + ".ini").toFile();
    }

}