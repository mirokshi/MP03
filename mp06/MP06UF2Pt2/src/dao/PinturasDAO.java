/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Pinturas;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

/**
 *
 * @author Mirokshi
 */
public class PinturasDAO {
        private SqlSessionFactory sqlSessionFactory;

    public PinturasDAO() {
        sqlSessionFactory = MyBatisConnectionFactory.getSqlSessionFactory();
    }

    /**
     * Returns the list of all Contact instances from the database.
     * @return the list of all Contact instances from the database.
     */
    @SuppressWarnings("unchecked")
    public List<Pinturas> selectAll() {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            List<Pinturas> list = session.selectList("Pinturas.getAll");
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
    public Pinturas selectById(int id) {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            Pinturas contact = (Pinturas) session.selectOne("Pinturas.getById", id);
            return contact;
        } finally {
            session.close();
        }
    }

    /**
     * Updates an instance of Contact in the database.
     * @param contact the instance to be updated.
     */
    public void update(Pinturas contact) {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            session.update("Pinturas.update", contact);
            session.commit();
        } finally {
            session.close();
        }
    }

    /**
     * Insert an instance of Contact into the database.
     * @param contact the instance to be persisted.
     */
    public void insert(Pinturas contact) {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            session.insert("Pinturas.insert", contact);
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
            session.delete("Pinturas.deleteById", id);
            session.commit();
        } finally {
            session.close();
        }
    }
}
