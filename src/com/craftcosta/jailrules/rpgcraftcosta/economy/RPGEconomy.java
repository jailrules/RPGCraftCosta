/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.craftcosta.jailrules.rpgcraftcosta.economy;

/**
 *
 * @author jail
 */
public class RPGEconomy {

    long money;

    /**
     *
     */
    public RPGEconomy() {
        this.money = 0;
    }

    /**
     *
     * @param money
     */
    public RPGEconomy(long money) {
        this.money = money;
    }

    /**
     *
     * @param money
     */
    public void setMoney(long money) {
        this.money = money;
    }

    /**
     *
     * @return
     */
    public long getMoney() {
        return this.money;
    }

    /**
     *
     */
    public void resetMoney() {
        this.money = 0;
    }

    /**
     *
     * @param money
     */
    public void withdrawMoney(long money) {
        this.money -= money;
    }

    /**
     *
     * @param money
     */
    public void addMoney(long money) {
        this.money += money;
    }
}
