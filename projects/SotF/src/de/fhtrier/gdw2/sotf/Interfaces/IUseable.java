package de.fhtrier.gdw2.sotf.Interfaces;

import java.util.List;

/**
 * Interface fuer die benutzbaren Items im Inventar.
 * 
 * @author Kevin Korte
 * @author Attila Djerdj
 * @author Stefan Probst
 */
public interface IUseable extends IEntity
{

    /**
     * Liefert eine Liste vom Typ IPowerups mit den Powerups die der Spieler
     * wirken kann.
     * 
     * @return List<IPowerups>
     */
    public List<IPowerups> getPowerups();

    /**
     * Gibt an ob der Gegenstand vom Spieler fallen gelassen werden kann.
     * 
     * @return boolean
     */
    public boolean isDropable();
}
