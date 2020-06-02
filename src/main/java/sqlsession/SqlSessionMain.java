package sqlsession;

import mapper.PeopleMapper;
import model.People;
import model.PeopleParam;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author admin
 * @date 2020/3/26 19:08
 */
public class SqlSessionMain {

    public static void main(String[] args) {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtil.openSqlSession();
            PeopleMapper mapper = sqlSession.getMapper(PeopleMapper.class);

            /*PeopleParam peopleParam = new PeopleParam();
            peopleParam.setId("1");
            peopleParam.setIdcardParam("");
            peopleParam.setNameParam("set更新name1");*/

            /*List<String> strings = Arrays.asList("name1", "name5",  "name9");
            Set<String> sets = new HashSet<>();
            sets.add("name1");
            sets.add("name5");
            String[] arrays = {"name7","name9"};*/

            List<People> people = mapper.queryPeople("me",new RowBounds(0,3));
            for (People person : people) {
                System.out.println(person.getId()+"\t"
                        +person.getIdentifyId()
                        +"\t"+person.getWeight()
                        +"\t"+person.getName());
            }
            //sqlSession.commit();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }

    }


}
