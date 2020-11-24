package mapper;

import model.People;
import model.PeopleParam;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author admin
 * @date 2020/3/26 18:46
 */
@Mapper
public interface PeopleMapper {
    List<People> queryPeople(@Param("param") String param, RowBounds rowBounds);

    List<People> selectAll();

    int insertPeople(People people);

    int updatePeople(PeopleParam peopleParam);

    int deletePeople(@Param("id")long id);

    People countFirstName(@Param("mytable") String mytable);
}
