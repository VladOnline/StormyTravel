package com.company;

import java.awt.*;


public class MenuState extends  State {

    private UIManager uiManager;


    public MenuState(Handler handler) {
        super(handler);
        uiManager = new UIManager(handler);
        handler.getMouseManager().setUIManager(uiManager);

       uiManager.addObject(new UIImageButton(140,275,128,64, Assets.btn_start, new ClickListener(){

            @Override
            public void onClick() {
                handler.getMouseManager().setUIManager(null);
                State.setState(handler.getGame().gameState);
            }
        }));
       uiManager.addObject(new UIImageButton(400,275,128,64, Assets.btn_exit, new ClickListener(){
            @Override
            public void onClick() {
                System.exit(0);
            }
        }));
        }

    @Override
    public void tick() {
        uiManager.tick();

//        // Temporarily just go directly to the GameState, skip the menu state!
//        handler.getMouseManager().setUIManager(null);
//        State.setState(handler.getGame().gameState);
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.GUI_fond, 0, 0, null);
        uiManager.render(g);
    }
}
