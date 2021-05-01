package jaidsonmda.com.sisseg.apiRest.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "sistema")
public class Sistema implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "sigla")
    private String sigla;

    @Column(name = "email")
    private String email;

    @Column(name = "url")
    private String url;

    public Sistema(Integer id) {
        this.id = id;
    }
    public Sistema() {

    }

    public Sistema(String descricao, String sigla, String email, String url) {
        this.descricao = descricao;
        this.sigla = sigla;
        this.email = email;
        this.url = url;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
