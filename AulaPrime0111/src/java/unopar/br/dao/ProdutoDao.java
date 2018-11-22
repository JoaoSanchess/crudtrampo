/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unopar.br.dao;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import unopar.br.pojo.Produto;
import unopar.br.util.HibernateUtil;

/**
 *
 * @author anderson5687
 */
public class ProdutoDao implements IDao<Produto> {

    @Override
    public List<Produto> listar() {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            Query query = session.createQuery("from Produto u");
            List<Produto> produtos = query.list();
            if (produtos.isEmpty() || produtos == null) {
                return null;
            } else {
                return produtos;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<Produto>();
        } finally {
            session.close();
        }
    }

    @Override
    public void inserir(Produto t) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(t);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{ session.close(); }
    }

    @Override
    public void alterar(Produto t) {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.saveOrUpdate(t);
            session.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{ session.close(); }
    }

    @Override
    public void deletar(Produto t) {
       Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            Transaction beginTransaction = session.beginTransaction();
            Query query = session.createQuery("delete from produto p where p.id = :id");
            query.setParameter("id", t.getId());
            query.executeUpdate();
            beginTransaction.commit();
        } catch (Exception e) {
        } finally {

            session.close();
        }    
    }

}
