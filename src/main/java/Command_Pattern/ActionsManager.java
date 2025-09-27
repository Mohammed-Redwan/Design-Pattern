/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command_Pattern;

import java.util.ArrayList;

/**
 *
 * @author abdullah
 */
public class ActionsManager {
    private ArrayList<Action> actions;
    public ActionsManager()
    {
        actions = new ArrayList<>();
    }
    public void addAction(Action action)
    {
        actions.add(action);
    }
    public void excuteAll()
    {
        for (int i =  actions.size() - 1; i >= 0; i--)
        {
            actions.get(i).excute();
        }
    }
}
