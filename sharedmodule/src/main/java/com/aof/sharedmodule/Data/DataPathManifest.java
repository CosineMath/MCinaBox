package com.aof.sharedmodule.Data;

//为避免循环依赖,且顾及到前后端适配的可扩展性
//需要copy一份adapt包保持对象的一致性

public class DataPathManifest {

    /**【全局目录清单】**/
    public static final String
            //MCinaBox
        MCINABOX_HOME = "/sdcard/Android/data/com.aof.mcinabox/files/MCinaBox",
        MCINABOX_TEMP = MCINABOX_HOME + "/temp",
        MCINABOX_KEYBOARD = MCINABOX_HOME + "/keyboard",
        MCINABOX_DATA_PUBLIC = "/sdcard/MCinaBox",
        MCINABOX_DATA_PRIVATE = "/sdcard/Android/data/com.aof.mcinabox/files/MCinaBox",
        MCINABOX_FILE_JSON = MCINABOX_HOME + "/mcinabox.json",
        MCINABOX_DATA_RUNTIME = MCINABOX_HOME + "/runtimepack",
            //Minecraft
        MINECRAFT_DATA_PUBLIC = MCINABOX_DATA_PUBLIC + "/.minecraft",
        MINECRAFT_DATA_PUBLIC_VERSION = MINECRAFT_DATA_PUBLIC + "/versions",
        MINECRAFT_DATA_PUBLIC_ASSETS = MINECRAFT_DATA_PUBLIC + "/assets",
        //MINECRAFT_DATA_PUBLIC_MODS = MINECRAFT_DATA_PUBLIC + "/mods",
        MINECRAFT_DATA_PUBLIC_SAVES = MINECRAFT_DATA_PUBLIC + "/saves",
        MINECRAFT_DATA_PUBLIC_LIBRARIES = MINECRAFT_DATA_PUBLIC + "/libraries",
        MINECRAFT_DATA_PUBLIC_LOGS = MINECRAFT_DATA_PUBLIC + "/crash-reports",
        MINECRAFT_DATA_PUBLIC_RESOURCEPACKS = MINECRAFT_DATA_PUBLIC + "/resourcepacks",

        MINECRAFT_DATA_PRIVATE = MCINABOX_DATA_PRIVATE + "/.minecraft",
        MINECRAFT_DATA_PRIVATE_VERSION = MINECRAFT_DATA_PRIVATE + "/versions",
        MINECRAFT_DATA_PRIVATE_ASSETS = MINECRAFT_DATA_PRIVATE + "/assets",
        //MINECRAFT_DATA_PRIVATE_MODS = MINECRAFT_DATA_PRIVATE + "/mods",
        MINECRAFT_DATA_PRIVATE_SAVES = MINECRAFT_DATA_PRIVATE + "/saves",
        MINECRAFT_DATA_PRIVATE_LIBRARIES = MINECRAFT_DATA_PRIVATE + "/libraries",
        MINECRAFT_DATA_PRIVATE_LOGS = MINECRAFT_DATA_PRIVATE + "/crash-reports",
        MINECRAFT_DATA_PRIVATE_RESOURCEPACKS = MINECRAFT_DATA_PRIVATE + "/resourcepacks",
                //Downloader
        DOWNLOAD_TEMP = "/Android/data/com.aof.mcinabox/files/MCinaBox/temp/",
                //BoatApp
        BOAT_HOME = "/sdcard/MCinaBox/BoatApp",
                //Runtime
        RUNTIME_HOME = "/data/data/com.aof.mcinabox/app_runtime",
                //版本信息
        MCINABOX_VERSION = "0.1.2-a";

    /**【一个全局目录的数组】**/
    public static final String[] MCINABOX_ALLPATH = {
            MCINABOX_HOME,
            MCINABOX_TEMP,
            MCINABOX_KEYBOARD,
            MCINABOX_DATA_PUBLIC,
            MCINABOX_DATA_PRIVATE,
            MINECRAFT_DATA_PUBLIC,
            MINECRAFT_DATA_PUBLIC_VERSION,
            MINECRAFT_DATA_PUBLIC_ASSETS,
            //MINECRAFT_DATA_PUBLIC_MODS,
            MINECRAFT_DATA_PUBLIC_SAVES,
            MINECRAFT_DATA_PUBLIC_LIBRARIES,
            MINECRAFT_DATA_PUBLIC_LOGS,
            MINECRAFT_DATA_PUBLIC_RESOURCEPACKS,
            MINECRAFT_DATA_PRIVATE,
            MINECRAFT_DATA_PRIVATE_VERSION,
            MINECRAFT_DATA_PRIVATE_ASSETS,
            //MINECRAFT_DATA_PRIVATE_MODS,
            MINECRAFT_DATA_PRIVATE_SAVES,
            MINECRAFT_DATA_PRIVATE_LIBRARIES,
            MINECRAFT_DATA_PRIVATE_LOGS,
            MINECRAFT_DATA_PRIVATE_RESOURCEPACKS,
            MCINABOX_DATA_RUNTIME,
            BOAT_HOME
    };

    /**【运行库列表索引】**/
    public static final String[] MCINABOX_RUNTIME_FILES = {
            RUNTIME_HOME + "/j2re-image/bin/java",
            RUNTIME_HOME + "/libopenal.so.1",
            RUNTIME_HOME + "/libGL.so.1",
            RUNTIME_HOME + "/lwjgl2/liblwjgl.so",
            RUNTIME_HOME + "/lwjgl3/liblwjgl.so"
    };
}
