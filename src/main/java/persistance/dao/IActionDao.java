package persistance.dao;

import modele.Action;

import java.util.List;

/**
 * Created by Pierre on 27/05/2015.
 */
public interface IActionDao {

    /**
     * r�cup�rer toutes les actions
     * @return liste des actions
     */
    public List<Action> getAllAction();

    /**
     * Ajoute une action � la base de donn�es
     * @param a Action � ajouter
     * @return retourne vrai si l'action s'est effectu�e correctement
     */
    public boolean addAction(Action a);
}
