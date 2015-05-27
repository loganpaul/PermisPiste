package persistance.dao.impl;

import modele.Action;
import org.hibernate.Query;
import org.hibernate.Session;
import persistance.dao.IActionDao;
import utils.SessionHibernate;

import java.util.List;

/**
 * Created by Pierre on 27/05/2015.
 */
public class ActionDaoImpl implements IActionDao {
    @Override
    public List<Action> getAllAction() {
        Session currentSession = SessionHibernate.openSession();
        Query query = currentSession.createQuery("from Action");
        List<Action> actions = query.list();
        SessionHibernate.closeSession();

        return actions;
    }

    @Override
    public boolean addAction(Action a) {
        //TODO
        return false;
    }
}
