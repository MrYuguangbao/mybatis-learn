package model;

import lombok.Data;

/**
 * @author admin
 * @date 2020/3/27 9:40
 */
@Data
public class PeopleParam {

    private String id;
    private String idcardParam;
    private String nameParam;

    @Override
    public String toString() {
        return "PeopleParam{" +
                "id='" + id + '\'' +
                ", idcardParam='" + idcardParam + '\'' +
                ", nameParam='" + nameParam + '\'' +
                '}';
    }
}
