/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import java.util.List;
import model.Pintores;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

/**
 *
 * @author Mirokshi
 */
public class PintoresDAO {

    private SqlSessionFactory sqlSessionFactory;

    public PintoresDAO() {
        sqlSessionFactory = MyBatisConnectionFactory.getSqlSessionFactory();
    }

    /**
     * Returns the list of all Contact instances from the database.
     * @return the list of all Contact instances from the database.
     */
    @SuppressWarnings("unchecked")
    public List<Pintores> selectAll() {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            List<Pintores> list = session.selectList("Pintores.getAll");
            return list;
        } finally {
            session.close();
        }
    }

    /**
     * Returns a Contact instance from the database.
     * @param id primary key value used for lookup.
     * @return A Contact instance with a primary key value equals to pk. null if there is no matching row.
     */
    public Pintores selectById(int id) {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            Pintores contact = (Pintores) session.selectOne("Pintores.getById", id);
            return contact;
        } finally {
            session.close();
        }
    }

    /**
     * Updates an instance of Contact in the database.
     * @param contact the instance to be updated.
     */
    public void update(Pintores contact) {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            session.update("Pintores.update", contact);
            session.commit();
        } finally {
            session.close();
        }
    }

    /**
     * Insert an instance of Contact into the database.
     * @param contact the instance to be persisted.
     */
    public void insert(Pintores contact) {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            session.insert("Pintores.insert", contact);
            session.commit();
        } finally {
            session.close();
        }
    }

    /**
     * Delete an instance of Contact from the database.
     * @param id primary key value of the instance to be deleted.
     */
    public void delete(int id) {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            session.delete("Pintores.deleteById", id);
            session.commit();
        } finally {
            session.close();
        }
    }
}
