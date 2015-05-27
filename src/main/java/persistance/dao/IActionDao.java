package persistance.dao;

import modele.Action;

import java.util.List;

/**
 * Created by Pierre on 27/05/2015.
 */
public interface IActionDao {

    /**
     * récupérer toutes les actions
     * @return liste des actions
     */
    public List<Action> getAllAction();

    /**
     * Ajoute une action à la base de données
     * @param a Action à ajouter
     * @return retourne vrai si l'action s'est effectuée correctement
     */
    public boolean addAction(Action a);
}
