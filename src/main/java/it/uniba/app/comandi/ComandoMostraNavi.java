/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.uniba.app.comandi;

import it.uniba.app.entitaDiGioco.Partita;
/**
 *
 * @author leonardo
 */

/**
  * Classe ComandoMostraNavi
 */
public class ComandoMostraNavi implements Comando{
    public void esegui(){
        Partita.mostraNavi();
        }
}
