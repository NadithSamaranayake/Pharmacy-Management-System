/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.MLogin;

/**
 *
 * @author ASUS ZENBOOK
 */
public class CLogin 
{
      public void login(String UName, String PWD)
    {
        MLogin log = new MLogin();
        log.Login(UName, PWD);
    }
}
