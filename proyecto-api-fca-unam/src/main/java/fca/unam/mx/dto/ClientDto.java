package fca.unam.mx.dto;

import org.jdbi.v3.core.mapper.reflect.ColumnName;

public class ClientDto {
    private int id;
    private String name;
    private String plastname;
    private String mlastname;
    private String RFC;

    @ColumnName("nombre") 
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @ColumnName("nombre")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ColumnName("apellido_paterno")
    public String getplastname() {
        return plastname;
    }

    public void setplastname(String plastname) {
        this.plastname = plastname;
    }

    @ColumnName("apellido_materno")
    public String getmlastname() {
        return this.mlastname;
    }

    public void setmlastname(String mlastname) {
        this.mlastname = mlastname;
    }

    @ColumnName("RFC")
    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

}
