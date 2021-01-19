package jenny.learn.mybatis;

import jenny.learn.mybatis.simple.Dao.DictDao;
import jenny.learn.mybatis.simple.entity.Dict;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class Hello {
    public static void main(String[] args) throws Exception {
        // MyBatis配置文件
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
            DictDao dictDao = sqlSession.getMapper(DictDao.class);
            Dict dict = dictDao.getById("1");
            System.out.println(dict);
        }
    }
}
