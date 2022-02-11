package Pojo;

import java.sql.Timestamp;

/**
 * @author liaoke
 * @create 2021-10-31-14:46
 */
public class ChengYu {
    private Integer id;
    private String name;
    private String pinyin="";
    private String jieshi="";
    private String chuchu="";
    private String startStr="";
    private String endStr="";




    public ChengYu() {

    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    public String getJieshi() {
        return jieshi;
    }

    public void setJieshi(String jieshi) {
        this.jieshi = jieshi;
    }

    public String getChuchu() {
        return chuchu;
    }

    public void setChuchu(String chuchu) {
        this.chuchu = chuchu;
    }

    public String getStartStr() {
        return startStr;
    }

    public void setStartStr(String startStr) {
        this.startStr = startStr;
    }

    public String getEndStr() {
        return endStr;
    }

    public void setEndStr(String endStr) {
        this.endStr = endStr;
    }

    @Override
    public String toString() {
        return "ChengYu{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pinyin='" + pinyin + '\'' +
                ", jieshi='" + jieshi + '\'' +
                ", chuchu='" + chuchu + '\'' +
                ", startStr='" + startStr + '\'' +
                ", endStr='" + endStr + '\'' +
                '}';
    }
}
