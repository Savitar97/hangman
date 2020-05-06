package result;

import jpa.GenericJPADao;

import javax.persistence.Persistence;
import java.util.List;

public class GameResultDao extends GenericJPADao<GameResult>{
    private static GameResultDao instance;

    private GameResultDao() {
        super(GameResult.class);
    }

    public static GameResultDao getInstance() {
        if (instance == null) {
            instance = new GameResultDao();
            instance.setEntityManager(Persistence.createEntityManagerFactory("jpa-hangman-unit").createEntityManager());
        }
        return instance;
    }

    public List<GameResult> findAll() {
        return entityManager.createQuery("SELECT r FROM GameResult r  ORDER BY r.score desc , r.created DESC", GameResult.class)
                .getResultList();
    }
}
