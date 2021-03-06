package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.nio.Buffer;

public class Assets {

    private static final int width = 32, height = 32;

    public static Font font28;

    public static BufferedImage dirt, grass, stone, tree, rock;
    public static BufferedImage wood;
    public static BufferedImage[] player_down, player_up, player_left, player_right;
    public static BufferedImage[] zombie_down, zombie_up, zombie_left, zombie_right;
    public static BufferedImage[] btn_start;
    public static BufferedImage[] btn_exit;
    public static BufferedImage GUI_fond;
    public static BufferedImage Forest;

    public static BufferedImage inventoryScreen;

    public static void init() {
        font28 = FontLoader.loadFont("res/fonts/slkscr.ttf", 28);

        SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/texture/srdftgyнекваh.png"));
        SpriteSheet Button = new SpriteSheet(ImageLoader.loadImage("/texture/sheetbut_not_shit.png"));
        SpriteSheet GUIFond = new SpriteSheet(ImageLoader.loadImage("/GUI/ddos.png"));
        SpriteSheet Test = new SpriteSheet(ImageLoader.loadImage("/GUI/LostInTheForest_MenuButton_Start.png"));

        inventoryScreen = ImageLoader.loadImage("/texture/inventoryScreen.png");

        wood = sheet.crop(width, height, width, height);

        btn_start = new BufferedImage[2];
        btn_start[0] = Button.crop(width * 6, height * 4, width * 2, height);
        btn_start[1] = Button.crop(width * 6, height * 5, width * 2, height);

        btn_exit = new BufferedImage[2];
        btn_exit[0] = Button.crop(width * 6, height * 6, width * 2, height);
        btn_exit[1] = Button.crop(width * 6, height * 7, width * 2, height);

        GUI_fond = GUIFond.getSheet();

        Forest= Button.crop(width * 6, height * 6, width * 2, height);

        player_down = new BufferedImage[2];
        player_up = new BufferedImage[2];
        player_left = new BufferedImage[2];
        player_right = new BufferedImage[2];

        player_down[0] = sheet.crop(width * 4, 0, width, height);
        player_down[1] = sheet.crop(width * 5, 0, width, height);
        player_up[0] = sheet.crop(width * 6, 0, width, height);
        player_up[1] = sheet.crop(width * 7, 0, width, height);
        player_right[0] = sheet.crop(width * 4, height, width, height);
        player_right[1] = sheet.crop(width * 5, height, width, height);
        player_left[0] = sheet.crop(width * 6, height, width, height);
        player_left[1] = sheet.crop(width * 7, height, width, height);

        zombie_down = new BufferedImage[2];
        zombie_up = new BufferedImage[2];
        zombie_left = new BufferedImage[2];
        zombie_right = new BufferedImage[2];

        zombie_down[0] = sheet.crop(width * 4, height * 2, width, height);
        zombie_down[1] = sheet.crop(width * 5, height * 2, width, height);
        zombie_up[0] = sheet.crop(width * 6, height * 2, width, height);
        zombie_up[1] = sheet.crop(width * 7, height * 2, width, height);
        zombie_right[0] = sheet.crop(width * 4, height * 3, width, height);
        zombie_right[1] = sheet.crop(width * 5, height * 3, width, height);
        zombie_left[0] = sheet.crop(width * 6, height * 3, width, height);
        zombie_left[1] = sheet.crop(width * 7, height * 3, width, height);

        dirt = sheet.crop(width, 0, width, height);
        grass = sheet.crop(width * 2, 0, width, height);
        stone = sheet.crop(width * 3, 0, width, height);
        tree = sheet.crop(0, 0, width, height * 2);
        rock = sheet.crop(0, height * 2, width, height);
    }
}
